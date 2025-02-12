const API_URL = "http://127.0.0.1:8000/api";

function generatRandomMedicines() {
    const names = [
        "Paracetamol",
        "Ibuprofeno",
        "Omeprazol",
        "Dipirona",
        "Aspirina"
    ];
    const manufacturers = [
        "Farmácia X",
        "Farmácia Y",
        "Laboratório Z",
        "Medicamentos A"
    ];
    const descriptions = [
        "Analgésico",
        "Anti-inflamatório",
        "Proteção gástrica",
        "Antitérmico"
    ];

    return {
        name: names[Math.floor(Math.random() * names.length)],
        manufacturer:
            manufacturers[Math.floor(Math.random() * manufacturers.length)],
        dosage: Math.floor(Math.random() * 500),
        description:
            descriptions[Math.floor(Math.random() * descriptions.length)]
    };
}

function additionMedicines() {
    const remedios = Array.from({ length: 5 }, generatRandomMedicines);

    remedios.forEach((remedio) => {
        fetch(API_URL, {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(remedio)
        })
            .then((response) => response.json())
            .then((data) => console.log("Adicionado:", data))
            .catch((error) =>
                console.error("Erro ao adicionar remédio:", error)
            );
    });
}

// Chama a função ao carregar a página
additionMedicines();
