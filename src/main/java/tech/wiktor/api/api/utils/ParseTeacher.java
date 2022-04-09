package tech.wiktor.api.api.utils;

public class ParseTeacher {
    public static String parse(String id){
        switch (id){
            case "Ni":
                return "Edyta Niemiec";
            case "Bu":
                return "E.Bury";
            case "Kn":
                return "Monika Konior-Oleszko";
            case "Bl":
                return "Ireneusz Balawender";
            case "Bc":
                return "M.Barciński";
            case "Bi":
                return "D.Bieniek";
            case "Zi":
                return "E.Chwała";
            case "xG":
                return "ks. Grzegorz Dąbrowski";
            case "Pd":
                return "P.Dąbrowski";
            case "Dł":
                return "A.Długosz-Tacik";
            case "Dr":
                return "M.Drąg";
            case "Fi":
                return "J.Ficek";
            case "Fg":
                return "A.Fugas";
            case "Ga":
                return "Barbara Gajewska";
            case "Gt":
                return "K.Gątarski";
            case "Ge":
                return "A.Gelleta";
            case "K.Guzik":
                return "Krzysztof Guzik";
            case "Hl":
                return "Joanna Haluk-Słapińska";
            case "He":
                return "M.Hebdzińska";
            case "Kl":
                return "Urszula Kalandyk";
            case "Km":
                return "L.Kamińska";
            case "Ka":
                return "A.Kapelewska-Barć";
            case "Kł":
                return "M.Kołodziej";
            case "KO":
                return "R.Kontek";
            case "Kz":
                return "J.Kozłowski";
            case "Kk":
                return "Piotr Kraska";
            case "xK":
                return "B.Kryk";
            case "Kr":
                return "Monika Krzywonos";
            case "Ks":
                return "Katarzyna Książek";
            case "Lj":
                return "Anna leja";
            case "Le":
                return "B.Leszczyk";
            case "Li":
                return "K.Litwin";
            case "Mh":
                return "M.Machowski";
            case "Ml":
                return "Teresa Malczewska";
            case "Mt":
                return "Katarzyna Matuła";
            case "Ma":
                return "E.Mazur";
            case "Mz":
                return "Bożena Mazurkow";
            case "Mn":
                return "U.Mentel";
            case "Mc":
                return "A.Milczanowska";
            case "Mo":
                return "R.Możdżeń";
            case "Ms":
                return "Grzegorz Musiał";
            case "Mł":
                return "M.Musiał";
            case "Na":
                return "W.Nabożny";
            case "Nd":
                return "L.Niedbała";
            case "Pa":
                return "P.Pawłowski";
            case "Pl":
                return "Wojciech Pilawski";
            case "Pt":
                return "A.Pitera";
            case "Po":
                return "Anna Poźniak";
            case "Pr":
                return "M.Prokop";
            case "Ra":
                return "W.Radecki";
            case "Pi":
                return "Iwona Skoczylas-Pilat";
            case "So":
                return "K.Sowa";
            case "St":
                return "Józef Stalec";
            case "Sz":
                return "D.Szalacha";
            case "JS":
                return "J.Szeliga";
            case "Sg":
                return "Joanna Szeliga";
            case "Św":
                return "Janusz Świeca";
            case "Te":
                return "A.Terszkiewicz";
            case "Tw":
                return "Dorota Twardowska";
            case "Ur":
                return "M.Urbanik";
            case "Wa":
                return "S.Warchoł";
            case "Wr":
                return "Jolanta Wilkos";
            case "Wo":
                return "E.Wolanin";
            default:
                return "invalid ID!";
        }
    }
}