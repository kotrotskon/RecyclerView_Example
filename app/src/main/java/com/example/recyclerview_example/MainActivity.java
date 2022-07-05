package com.example.recyclerview_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerVw);

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(12, "HP Envy x360 15 - eu0006nv Laptop 15.6 FHD IPS Αφής", "Ισχύς, ακρίβεια χρωμάτων που τροφοδοτεί την δημιουργικότητά σου και προστασία της ιδιωτικότητας! Το HP Envy x360 είναι ο ψηφιακός «καμβάς» που ξεχωρίζει για τον πολύπλευρο και ανθεκτικό χαρακτήρα του. Εξοπλισμένο με τον πανίσχυρο 8πύρηνο AMD Ryzen™ 5700U, με 16 threads και χρονισμό που μπορεί να πιάσει τα 4,3 Ghz (max boost). Διαθέτει ενσωματωμένα γραφικά AMD Radeon™ και 16 GB DDR4-3200 MHz RAM. Έτσι, θα τρέξεις όλες τις εφαρμογές δημιουργικότητας που χρειάζεσαι είτε επεξεργάζεσαι εικόνα είτε video ή ήχο χωρίς κανένα πρόβλημα! Με την οθόνη 15,6” FHD (1920 x 1080) IPS Πολλαπλής αφής, με γυάλινη επιφάνεια Corning® Gorilla® Glass NBT™ από άκρη σε άκρη, φωτεινότητα 250 nits, 45%ΝTSC και με την επαναφορτιζόμενη γραφίδα HP MPP 2.0 Tilt που περιλαμβάνεται, μπορείς να αφήσεις την δημιουργικότητά σου ελεύθερη. Με βάρος μόλις 1,86 kg, μπαταρία λιθίου 51Wh και HP FastCharge, μπορείς να μεγαλουργήσεις όπου κι αν βρίσκεσαι, οποιαδήποτε στιγμή!", 899.00));
        products.add(new Product(23, "Apple MacBook Air Retina MGN63GR/A (Late 2020) S.G. ", "Power. It’s in the Air. Ο λεπτότερος, ελαφρύτερος φορητός υπολογιστής της Apple - το δημοφιλές και αγαπημένο MacBook Air 13,3” - μεταμορφώθηκε πλήρως από τον πανίσχυρο 8πύρηνο επεξεργαστή M1.Στο σπίτι ή στο γραφείο, ο νέος επαναστατικός επεξεργαστής Apple M1 μεταμορφώνει την επιφάνεια εργασίας και σε μεταφέρει σε μία νέα διάσταση συναρπαστικών δυνατοτήτων, με έως και 3,5x υψηλότερη απόδοση CPU, έως και 5x ταχύτερη απόδοση γραφικών και την πιο εξελιγμένη νευρονική μηχανή (Neural Engine) για έως και 9x ταχύτερη, πιο αξιόπιστη, μηχανική εκμάθηση Η μεγαλύτερη διάρκεια ζωής της μπαταρίας σε MacBook Air. Μία εντελώς αθόρυβη - χωρίς ανεμιστήρα - σχεδίαση. Ποτέ άλλοτε μία τόσο μεγάλη δύναμη επεξεργαστικής ισχύος δεν υπήρξε σε μία τόσο ready-to-go υλοποίηση!", 1279.00));
        products.add(new Product(34, "HP 15s eq2017nv Laptop 15.6 IPS", "Ο φορητός υπολογιστής 15s-eq2017nv προσφέρει αξιόπιστη απόδοση για streaming, περιήγηση και άνετη εργασία, ώστε να έχεις απρόσκοπτη παραγωγικότητα και ψυχαγωγία, όπου κι αν βρίσκεσαι!Βασίζεται στον επεξεργαστή AMD Ryzen™ 5 5500U (με έξι πυρήνες, δώδεκα νήματα, συχνότητα λειτουργίας 2,1GHz έως 4,0 GHz και με ενσωματωμένα γραφικά AMD Radeon™) ο οποίος πλαισιώνεται από 16 GB μνήμης DDR4-3200 για αποδοτικό multitasking και από την αποθηκευτική μονάδα NVMe M.2 SSD με χωρητικότητα 512 GB, για ταχύτατη εκκίνηση και άμεση απόκριση σε ό,τι κι αν κάνεις.«Οδηγώντας» την αντιθαμβωτική οθόνη IPS Full HD (1.920 x 1.080 pixels) με πλαίσιο Micro-Edge, η ενσωματωμένη στον επεξεργαστή κάρτα γραφικών AMD Radeon™ Graphics είναι ικανή να ανταποκριθεί σε απαιτητικές εφαρμογές ενώ αποδίδει ικανοποιητικά και στο casual gaming. Με Windows 11 Home (S Mode) και βάρος 1,69 κιλά, μπορείς να τον μεταφέρεις παντού με ευκολία!", 639.00));
        products.add(new Product(49, "HP 15s-eq1022nv Laptop 15.6 Full HD", "Ο φορητός υπολογιστής 15s-eq1022nv προσφέρει αξιόπιστη απόδοση για streaming, περιήγηση και άνετη εργασία, ώστε να έχεις απρόσκοπτη παραγωγικότητα και ψυχαγωγία, όπου κι αν βρίσκεσαι!                Βασίζεται στον επεξεργαστή AMD Athlon™ Silver 3050U (δύο πυρήνες, δύο νήματα, έως 3,2 GHz και με ενσωματωμένα γραφικά AMD Radeon™) ο οποίος πλαισιώνεται από 8 GB μνήμης DDR4-2400 για αποδοτικό multitasking και από την αποθηκευτική μονάδα NVMe M.2 SSD με χωρητικότητα 256 GB, για ταχύτατη εκκίνηση και άμεση απόκριση σε ό,τι κι αν κάνεις.«Οδηγώντας» την αντιθαμβωτική οθόνη IPS Full HD (1.920 x 1.080 pixels) με πλαίσιο Micro-Edge, η ενσωματωμένη στον επεξεργαστή κάρτα γραφικών AMD Radeon™ Graphics είναι ικανή να ανταποκριθεί σε απαιτητικές εφαρμογές ενώ αποδίδει ικανοποιητικά και στο casual gaming. Με Windows 11 (S Mode) και βάρος 1,69 κιλά, μπορείς να τον μεταφέρεις παντού με ευκολία!", 349.00));
        products.add(new Product(51, "HP Pavilion Gaming 15-ec2003nv Laptop 15.6 Full HD IPS", "O λεπτός και ισχυρός φορητός υπολογιστής HP Pavilion Gaming 15-ec2003nv σχεδιάστηκε για να απολαμβάνεις κορυφαία γραφικά και επεξεργαστική ισχύ στα παιχνίδια και κορυφαία απόδοση στην εκτέλεση πολλαπλών εργασιών.Με συμπαγές σασί, μικρό πλαίσιο οθόνης, οπισθοφωτιζόμενο πληκτρολόγιο, «ταχύτατη» οθόνη 15,6 ιντσών (144Hz) και ισχυρό hardware, ο HP Pavilion Gaming 15-ec2003nv έχει όλα όσα χρειάζεσαι για να απολαμβάνεις το παιχνίδι χωρίς συμβιβασμούς.Στο εσωτερικό του βρίσκεται ο οκταπύρηνος επεξεργαστής AMD Ryzen™ 7 5800H στα 3,2 GHz (Max Boost Clock 4,4 GHz) σε συνδυασμό με την ανεξάρτητη κάρτα γραφικών NVIDIA® GeForce® RTX 3050 4GB GDDR6, 16GB μνήμης DDR4-3200 και το ταχύτατο PCIe® NVMe™ M.2 SSD χωρητικότητας 512 GB.Απόλαυσε υψηλά framerates και κορυφαία ποιότητα απεικόνισης χωρίς συμβιβασμούς με τον φορητό υπολογιστή HP Pavilion Gaming 15-ec2003nv.", 999.00));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ProductAdapter productAdapter = new ProductAdapter(MainActivity.this, products);
        recyclerView.setAdapter(productAdapter);

    }
}