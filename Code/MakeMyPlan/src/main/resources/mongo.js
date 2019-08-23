use dxl-gr-cachedb
db.configuration.drop();
db.createCollection("CMSAddons")

db.configuration.insert({
	internalTitle : 'k5',
    type : 'K_status',
    aiosCode : 'K5',
    greekDesc : "Οι υπηρεσίες τηλεφωνίας και internet ενεργοποιήθηκαν." ,
    enDesc : "Telephony and internet services have been activated.",
    step : '4',
    percentage : '100',
    color : '#00b0ca',
    status : 'Completed'
})

db.configuration.insert({
	internalTitle : 'k5',
    type : 'K_status',
    aiosCode : 'K5',
    greekDesc : "Οι υπηρεσίες τηλεφωνίας και internet ενεργοποιήθηκαν. Σε περίπτωση που έχεις κάνει αίτηση σε Vodafone home triple-play παρακαλούμε σύνδεσε το router της Vodafone για να ξεκινήσουν οι απαραίτητοι έλεγχοι για την ενεργοποίηση της υπηρεσίας τηλεόρασης. Θα λάβεις σχετικό μήνυμα στο κινητό σου αναφορικά με την παράδοση του εξοπλισμού της υπηρεσίας τηλεόρασης." ,
    enDesc : "Telephony and internet services have been activated. If you have ordered the Vodafone home triple-play pack, please install the Vodafone router and keep it switched on, in order for us to run the required TV service checks. Within the next days, you will be notified by sms for the free delivery of the Vodafone TV's STB to your premises by a courier.",
    step : '3',
    percentage : '90',
    color : '#00b0ca',
    status : 'Submited'
})

db.configuration.find().pretty()