public record Indirizzo(String via, String provincia, int numCivico, int cap, String city, String infoAggiuntive) {
    public void printIndirizzo(){
        System.out.println(via + " " + numCivico + ", " + city + "\n" +
                provincia + ", " +  cap + "\n" +
                infoAggiuntive);
    }
}
