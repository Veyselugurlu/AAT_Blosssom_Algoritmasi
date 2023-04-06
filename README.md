# AAT_Blosssom_Algoritmasi
java dilinde blossom algoritması


Matematiksel Analiz:
Blossom algoritması, döngülerin (cycles) bulunması ve alternatif yolların keşfi yoluyla eşleme problemini çözer.
Algoritmanın temel adımı, döngülerin bulunmasıdır.
Döngüleri bulmak için, grafların kenarlarının birleştirilmesi işlemi (contraction) kullanılır. Bu işlem, grafların birleştirilmesiyle
daha küçük bir graf oluşturur ve daha küçük graf için eşleme probleminin çözümüne devam edilir.
Her döngü, bir artırıcı yol (augmenting path) olarak adlandırılan bir yolu işaretler. Artırıcı yol, bir eşleme üzerindeki düğümler arasında 
geçer ve bir çift eşleştirilmemiş düğümü birleştirir. Daha sonra alternatif yollar bulunur ve bu yolların kullanılmasıyla mevcut eşleme güncellenir. 
Bu işlem, tüm düğümler eşleştirilene kadar tekrarlanır.

Blossom algoritmasının zaman karmaşıklığı, en kötü durumda O(n^4) olabilir. Ancak, birçok durumda, algoritma daha hızlı çalışır ve O(n^3) 
veya daha az bir zaman karmaşıklığına sahip olabilir.

Asimptotik Analiz:
Blossom algoritması, O(n^4) zaman karmaşıklığına sahip olabilir. Bu, algoritmanın veri kümesinin büyüklüğüne bağlı olarak büyüme hızının n^4 olduğu anlamına gelir.
Bu nedenle, büyük veri kümeleri için performansı düşük olabilir. Ancak, algoritmanın birçok varyasyonu bulunur ve bu varyasyonlar, algoritmanın performansını artırmak
için kullanılabilir.
Özetle, Blossom algoritması, graflardaki en büyük eşleme problemini çözmek için kullanılan bir algoritmadır. En kötü durumda O(n^4) 
zaman karmaşıklığına sahiptir, ancak birçok varyasyonu mevcut olduğu için performansı artırılabilir.
