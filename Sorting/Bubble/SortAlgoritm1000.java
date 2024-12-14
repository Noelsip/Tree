package Bubble;
import java.util.Arrays;

public class SortAlgoritm1000 {

    public static int[] bubbleSort(int[] array){
        for (int i=0; i < array.length; i++){
            for (int j=0; j < array.length - i - 1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
    public static int[] bubbleSortDescending(int[] array){
        for (int i=0; i < array.length-1; i++){
            for (int j=0; j < array.length - i - 1; j++){
                if (array[j] <  array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] angka = {
            123, 149, 654, 50, 4, 784, 939, 267, 979, 911, 700, 590, 878, 814, 73, 324, 709, 224, 258, 302, 230, 500, 198, 181, 303, 225, 298, 842, 554, 406, 143, 80, 984, 759, 112, 12, 744, 797, 68, 211, 679, 892, 539, 353, 961, 749, 997, 669, 650, 970, 188, 376, 697, 735, 856, 333, 150, 176, 438, 932, 371, 964, 2, 327, 736, 179, 874, 209, 835, 416, 279, 335, 725, 713, 810, 414, 544, 210, 374, 218, 741, 231, 707, 800, 486, 599, 626, 169, 776, 162, 896, 320, 380, 37, 450, 825, 446, 203, 98, 761, 614, 41, 770, 346, 171, 243, 354, 748, 27, 760, 555, 451, 608, 944, 305, 403, 141, 38, 955, 846, 197, 641, 509, 205, 694, 22, 58, 307, 664, 3, 512, 270, 622, 880, 261, 837, 367, 652, 943, 915, 153, 928, 372, 570, 187, 750, 390, 491, 552, 21, 988, 336, 482, 334, 125, 375, 103, 443, 85, 696, 395, 860, 464, 392, 174, 616, 240, 363, 155, 52, 729, 567, 615, 114, 631, 357, 275, 64, 429, 831, 947, 870, 361, 546, 981, 387, 463, 91, 824, 161, 370, 511, 994, 186, 580, 573, 7, 956, 834, 560, 973, 975, 921, 437, 347, 121, 653, 710, 780, 583, 678, 519, 285, 845, 145, 954, 256, 159, 92, 182, 383, 672, 343, 195, 410, 965, 366, 904, 255, 665, 582, 674, 883, 461, 66, 268, 246, 910, 265, 983, 754, 745, 691, 259, 25, 791, 610, 172, 373, 97, 365, 527, 520, 768, 634, 163, 208, 483, 379, 51, 454, 840, 711, 677, 587, 476, 317, 9, 497, 342, 389, 478, 858, 235, 581, 458, 660, 553, 986, 682, 126, 281, 436, 101, 32, 344, 686, 299, 318, 250, 404, 156, 901, 473, 330, 808, 812, 306, 765, 730, 633, 868, 135, 566, 772, 345, 24, 938, 213, 670, 957, 277, 264, 777, 422, 467, 71, 657, 17, 785, 935, 847, 734, 844, 857, 340, 418, 755, 949, 136, 701, 227, 589, 924, 138, 790, 953, 550, 774, 457, 763, 191, 612, 207, 152, 200, 558, 385, 396, 479, 977, 585, 731, 147, 325, 88, 378, 630, 916, 576, 827, 866, 440, 819, 605, 45, 704, 253, 948, 611, 720, 487, 903, 309, 623, 289, 397, 563, 923, 1000, 102, 592, 481, 391, 292, 490, 656, 613, 946, 667, 329, 266, 472, 81, 989, 75, 148, 523, 828, 894, 526, 719, 284, 747, 184, 796, 465, 216, 933, 18, 680, 826, 332, 408, 427, 288, 524, 881, 74, 466, 36, 495, 100, 598, 178, 518, 913, 35, 504, 425, 871, 444, 452, 877, 805, 14, 803, 485, 60, 739, 226, 117, 643, 659, 502, 716, 577, 435, 517, 110, 276, 687, 809, 412, 769, 952, 296, 887, 360, 447, 890, 639, 733, 462, 902, 15, 499, 841, 793, 798, 368, 134, 223, 56, 394, 738, 685, 705, 190, 19, 578, 77, 108, 89, 535, 816, 287, 280, 571, 543, 53, 228, 401, 76, 514, 193, 175, 244, 494, 575, 488, 926, 919, 593, 33, 248, 836, 453, 201, 629, 875, 241, 852, 753, 727, 782, 843, 199, 48, 124, 607, 339, 649, 316, 409, 310, 44, 771, 468, 521, 31, 30, 448, 586, 604, 388, 927, 681, 384, 638, 405, 820, 818, 721, 63, 232, 127, 684, 530, 257, 579, 164, 936, 853, 942, 177, 311, 105, 459, 972, 706, 714, 206, 737, 503, 321, 128, 498, 84, 290, 549, 855, 93, 854, 507, 194, 884, 295, 801, 715, 698, 786, 522, 496, 813, 756, 833, 644, 456, 351, 78, 291, 728, 822, 96, 142, 637, 832, 873, 400, 640, 417, 861, 542, 794, 807, 506, 621, 962, 821, 675, 477, 202, 282, 914, 273, 645, 262, 992, 245, 703, 783, 118, 57, 40, 170, 131, 120, 547, 712, 516, 272, 54, 122, 996, 398, 252, 65, 328, 838, 625, 254, 647, 732, 906, 895, 717, 907, 474, 565, 183, 42, 778, 561, 982, 966, 978, 348, 595, 690, 889, 293, 968, 168, 540, 817, 99, 239, 534, 862, 492, 217, 355, 350, 90, 70, 352, 851, 899, 475, 663, 11, 130, 708, 315, 624, 718, 963, 775, 673, 934, 220, 538, 839, 897, 564, 893, 865, 531, 158, 722, 869, 692, 214, 319, 993, 584, 574, 909, 269, 67, 431, 591, 648, 430, 386, 221, 606, 455, 867, 724, 636, 180, 283, 951, 297, 449, 222, 233, 627, 528, 20, 849, 767, 493, 377, 661, 922, 559, 83, 137, 646, 364, 49, 912, 752, 802, 424, 489, 263, 601, 872, 154, 426, 10, 501, 445, 764, 23, 106, 115, 434, 668, 157, 242, 999, 69, 658, 111, 959, 260, 541, 655, 116, 742, 551, 815, 337, 945, 991, 43, 16, 104, 238, 918, 995, 929, 300, 236, 958, 86, 139, 314, 976, 484, 119, 322, 439, 313, 937, 545, 556, 618, 600, 249, 146, 859, 779, 196, 864, 358, 132, 609, 671, 133, 13, 628, 930, 301, 532, 381, 905, 204, 898, 676, 568, 886, 642, 59, 173, 356, 441, 47, 688, 113, 192, 787, 423, 917, 215, 529, 508, 557, 811, 419, 185, 562, 34, 773, 331, 689, 432, 850, 62, 876, 304, 413, 140, 863, 338, 274, 569, 635, 167, 726, 6, 471, 212, 107, 597, 402, 537, 415, 382, 237, 879, 189, 513, 420, 795, 762, 594, 109, 411, 940, 632, 234, 941, 603, 766, 286, 349, 602, 804, 341, 693, 950, 960, 129, 572, 974, 806, 740, 882, 160, 39, 72, 751, 746, 29, 94, 536, 278, 666, 920, 533, 251, 702, 247, 781, 757, 510, 323, 792, 969, 789, 271, 830, 469, 885, 428, 925, 433, 166, 480, 908, 165, 312, 460, 588, 95, 470, 79, 743, 683, 399, 8, 46, 723, 651, 985, 987, 393, 699, 362, 980, 619, 891, 525, 548, 758, 931, 55, 144, 87, 26, 369, 219, 998, 695, 662, 326, 1, 617, 82, 359, 848, 971, 294, 151, 515, 900, 967, 799, 596, 442, 829, 888, 505, 61, 28, 308, 421, 229, 788, 620, 823, 990, 407, 5
        };
        System.out.println();
        System.out.println("Sebelum Sorting: ");
        for(int i = 0; i < angka.length; i++){
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        long startTime = System.nanoTime();

        int[] angkaSorted = Arrays.copyOf(angka, angka.length);
        int[] angkaDescending = Arrays.copyOf(angka, angka.length);

        bubbleSort(angkaSorted);
        bubbleSortDescending(angkaDescending);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println();
        System.out.println();
        System.out.println("Setelah Sorting: ");
        for(int i = 0; i < angkaSorted.length; i++){
            System.out.print(angkaSorted[i] + " ");
        }
        
        System.out.println();
        System.out.println();
        System.out.println("Setelah Sorting terbalik: ");
        for(int i = 0; i < angkaDescending.length; i++){
            System.out.print(angkaDescending[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Waktu Sorting (nano): " + duration/1_000_000 + " nano");
    }
}