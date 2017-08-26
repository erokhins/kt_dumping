'compareValuesBy' @ [9:16] ==> public fun <T> compareValuesBy(a: Item, b: Item, vararg selectors: (Item) -> Comparable<*>?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'this' @ [9:32] ==> <this> defined in test.comparisons.Item[LazyClassReceiverParameterDescriptor]

'other' @ [9:38] ==> value-parameter other: Item defined in test.comparisons.Item.compareTo[ValueParameterDescriptorImpl]

'it' @ [9:47] ==> value-parameter it: Item defined in test.comparisons.Item.compareTo.<anonymous>[ValueParameterDescriptorImpl]

'rating' @ [9:50] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'it' @ [9:62] ==> value-parameter it: Item defined in test.comparisons.Item.compareTo.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [9:65] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'compareBy' @ [13:57] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (String) -> Comparable<*>?): Comparator<String> /* = Comparator<String> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [13:83] ==> value-parameter it: String defined in test.comparisons.STRING_CASE_INSENSITIVE_ORDER.<anonymous>[ValueParameterDescriptorImpl]

'toUpperCase' @ [13:86] ==> @InlineOnly public inline fun String.toUpperCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'thenBy' @ [13:102] ==> @InlineOnly public inline fun <T> Comparator<String> /* = Comparator<String> */.thenBy(crossinline selector: (String) -> Comparable<*>?): Comparator<String> /* = Comparator<String> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [13:111] ==> value-parameter it: String defined in test.comparisons.STRING_CASE_INSENSITIVE_ORDER.<anonymous>[ValueParameterDescriptorImpl]

'toLowerCase' @ [13:114] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'thenBy' @ [13:130] ==> @InlineOnly public inline fun <T> Comparator<String> /* = Comparator<String> */.thenBy(crossinline selector: (String) -> Comparable<*>?): Comparator<String> /* = Comparator<String> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [13:139] ==> value-parameter it: String defined in test.comparisons.STRING_CASE_INSENSITIVE_ORDER.<anonymous>[ValueParameterDescriptorImpl]

'Item' @ [16:14] ==> public constructor Item(name: String, rating: Int) defined in test.comparisons.Item[ClassConstructorDescriptorImpl]

'Item' @ [17:14] ==> public constructor Item(name: String, rating: Int) defined in test.comparisons.Item[ClassConstructorDescriptorImpl]

'Item' @ [18:14] ==> public constructor Item(name: String, rating: Int) defined in test.comparisons.Item[ClassConstructorDescriptorImpl]

'Test' @ [20:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'v1' @ [22:20] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'compareTo' @ [22:23] ==> public open fun compareTo(other: Item): Int defined in test.comparisons.Item[SimpleFunctionDescriptorImpl]

'v2' @ [22:33] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'assertTrue' @ [23:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'diff' @ [23:20] ==> val diff: Int defined in test.comparisons.OrderingTest.compareByCompareTo[LocalVariableDescriptor]

'Test' @ [26:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'compareValuesBy' @ [28:20] ==> public fun <T> compareValuesBy(a: Item, b: Item, vararg selectors: (Item) -> Comparable<*>?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'v1' @ [28:36] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [28:40] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'it' @ [28:46] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.compareByNameFirst.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [28:49] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'it' @ [28:59] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.compareByNameFirst.<anonymous>[ValueParameterDescriptorImpl]

'rating' @ [28:62] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'assertTrue' @ [29:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'diff' @ [29:20] ==> val diff: Int defined in test.comparisons.OrderingTest.compareByNameFirst[LocalVariableDescriptor]

'Test' @ [32:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'compareValuesBy' @ [34:20] ==> public fun <T> compareValuesBy(a: Item, b: Item, vararg selectors: (Item) -> Comparable<*>?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'v1' @ [34:36] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [34:40] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'it' @ [34:46] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.compareByRatingFirst.<anonymous>[ValueParameterDescriptorImpl]

'rating' @ [34:49] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'it' @ [34:61] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.compareByRatingFirst.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [34:64] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'assertTrue' @ [35:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'diff' @ [35:20] ==> val diff: Int defined in test.comparisons.OrderingTest.compareByRatingFirst[LocalVariableDescriptor]

'Test' @ [38:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'compareValuesBy' @ [40:20] ==> public fun <T> compareValuesBy(a: Item, b: Item, vararg selectors: (Item) -> Comparable<*>?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'v1' @ [40:36] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v1' @ [40:40] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'it' @ [40:46] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.compareSameObjectsByRatingFirst.<anonymous>[ValueParameterDescriptorImpl]

'rating' @ [40:49] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'it' @ [40:61] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.compareSameObjectsByRatingFirst.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [40:64] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'assertTrue' @ [41:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'diff' @ [41:20] ==> val diff: Int defined in test.comparisons.OrderingTest.compareSameObjectsByRatingFirst[LocalVariableDescriptor]

'Test' @ [44:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'this' @ [46:25] ==> <this> defined in test.comparisons.OrderingTest[LazyClassReceiverParameterDescriptor]

'v1' @ [46:30] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'compareValuesBy' @ [48:20] ==> @InlineOnly public inline fun <T> compareValuesBy(a: Item?, b: Item?, selector: (Item?) -> Comparable<*>?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item?

'v1' @ [48:36] ==> val v1: Item? defined in test.comparisons.OrderingTest.compareNullables[LocalVariableDescriptor]

'v2' @ [48:40] ==> val v2: Item? defined in test.comparisons.OrderingTest.compareNullables[LocalVariableDescriptor]

'it' @ [48:46] ==> value-parameter it: Item? defined in test.comparisons.OrderingTest.compareNullables.<anonymous>[ValueParameterDescriptorImpl]

'rating' @ [48:50] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'assertTrue' @ [49:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'diff' @ [49:20] ==> val diff: Int defined in test.comparisons.OrderingTest.compareNullables[LocalVariableDescriptor]

'nullsLast' @ [50:21] ==> public fun <T : Any> nullsLast(comparator: Comparator<in Item> /* = Comparator<in Item> */): Comparator<Item?> /* = Comparator<Item?> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Item

'compareBy' @ [50:31] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [50:49] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.compareNullables.<anonymous>[ValueParameterDescriptorImpl]

'rating' @ [50:52] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'thenBy' @ [50:61] ==> @InlineOnly public inline fun <T> Comparator<Item> /* = Comparator<Item> */.thenBy(crossinline selector: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [50:70] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.compareNullables.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [50:73] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'compare' @ [50:81] ==> public abstract fun compare(p0: Item?, p1: Item?): Int defined in java.util.Comparator[JavaMethodDescriptor]

'v1' @ [50:89] ==> val v1: Item? defined in test.comparisons.OrderingTest.compareNullables[LocalVariableDescriptor]

'v2' @ [50:93] ==> val v2: Item? defined in test.comparisons.OrderingTest.compareNullables[LocalVariableDescriptor]

'assertTrue' @ [51:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'diff2' @ [51:20] ==> val diff2: Int defined in test.comparisons.OrderingTest.compareNullables[LocalVariableDescriptor]

'Test' @ [54:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Comparator' @ [56:26] ==> public fun <T> Comparator(function: ((Item..Item?), (Item..Item?)) -> Int): Comparator<Item> defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Item

'a' @ [56:53] ==> value-parameter a: (Item..Item?) defined in test.comparisons.OrderingTest.sortComparatorThenComparator.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [56:55] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'compareTo' @ [56:60] ==> public open fun compareTo(other: String): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'b' @ [56:70] ==> value-parameter b: (Item..Item?) defined in test.comparisons.OrderingTest.sortComparatorThenComparator.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [56:72] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'thenComparator' @ [56:80] ==> @InlineOnly public inline fun <T> Comparator<Item> /* = Comparator<Item> */.thenComparator(crossinline comparison: (Item, Item) -> Int): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'a' @ [56:105] ==> value-parameter a: Item defined in test.comparisons.OrderingTest.sortComparatorThenComparator.<anonymous>[ValueParameterDescriptorImpl]

'rating' @ [56:107] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'compareTo' @ [56:114] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'b' @ [56:124] ==> value-parameter b: Item defined in test.comparisons.OrderingTest.sortComparatorThenComparator.<anonymous>[ValueParameterDescriptorImpl]

'rating' @ [56:126] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'comparator' @ [58:20] ==> val comparator: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.sortComparatorThenComparator[LocalVariableDescriptor]

'compare' @ [58:31] ==> public abstract fun compare(p0: (Item..Item?), p1: (Item..Item?)): Int defined in java.util.Comparator[JavaMethodDescriptor]

'v1' @ [58:39] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [58:43] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'assertTrue' @ [59:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'diff' @ [59:20] ==> val diff: Int defined in test.comparisons.OrderingTest.sortComparatorThenComparator[LocalVariableDescriptor]

'arrayListOf' @ [60:21] ==> public fun <T> arrayListOf(vararg elements: Item): ArrayList<Item> /* = ArrayList<Item> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'v1' @ [60:33] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [60:37] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'sortedWith' @ [60:41] ==> public fun <T> Iterable<Item>.sortedWith(comparator: Comparator<in Item> /* = Comparator<in Item> */): List<Item> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'comparator' @ [60:52] ==> val comparator: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.sortComparatorThenComparator[LocalVariableDescriptor]

'assertEquals' @ [61:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v2' @ [61:22] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'items' @ [61:26] ==> val items: List<Item> defined in test.comparisons.OrderingTest.sortComparatorThenComparator[LocalVariableDescriptor]

'assertEquals' @ [62:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v1' @ [62:22] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'items' @ [62:26] ==> val items: List<Item> defined in test.comparisons.OrderingTest.sortComparatorThenComparator[LocalVariableDescriptor]

'Test' @ [65:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'compareBy' @ [67:22] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [67:40] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.combineComparators.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [67:43] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'compareBy' @ [68:24] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [68:42] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.combineComparators.<anonymous>[ValueParameterDescriptorImpl]

'rating' @ [68:45] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'Item' @ [69:18] ==> public constructor Item(name: String, rating: Int) defined in test.comparisons.Item[ClassConstructorDescriptorImpl]

'v1' @ [69:23] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'name' @ [69:26] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'v1' @ [69:32] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'rating' @ [69:35] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'Item' @ [70:18] ==> public constructor Item(name: String, rating: Int) defined in test.comparisons.Item[ClassConstructorDescriptorImpl]

'v2' @ [70:23] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'name' @ [70:26] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'v2' @ [70:38] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'rating' @ [70:41] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'assertTrue' @ [71:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'>' @ [71:21] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'byName' @ [71:22] ==> val byName: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.combineComparators[LocalVariableDescriptor]

'byRating' @ [71:34] ==> val byRating: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.combineComparators[LocalVariableDescriptor]

'compare' @ [71:44] ==> public abstract fun compare(p0: (Item..Item?), p1: (Item..Item?)): Int defined in java.util.Comparator[JavaMethodDescriptor]

'v1' @ [71:52] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [71:56] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'assertTrue' @ [72:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'<' @ [72:21] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'byName' @ [72:22] ==> val byName: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.combineComparators[LocalVariableDescriptor]

'byRating' @ [72:34] ==> val byRating: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.combineComparators[LocalVariableDescriptor]

'compare' @ [72:44] ==> public abstract fun compare(p0: (Item..Item?), p1: (Item..Item?)): Int defined in java.util.Comparator[JavaMethodDescriptor]

'v1' @ [72:52] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v3' @ [72:56] ==> val v3: Item defined in test.comparisons.OrderingTest.combineComparators[LocalVariableDescriptor]

'assertTrue' @ [73:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'>' @ [73:21] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'byName' @ [73:22] ==> val byName: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.combineComparators[LocalVariableDescriptor]

'byRating' @ [73:44] ==> val byRating: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.combineComparators[LocalVariableDescriptor]

'compare' @ [73:54] ==> public abstract fun compare(p0: (Item..Item?), p1: (Item..Item?)): Int defined in java.util.Comparator[JavaMethodDescriptor]

'v1' @ [73:62] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v3' @ [73:66] ==> val v3: Item defined in test.comparisons.OrderingTest.combineComparators[LocalVariableDescriptor]

'assertTrue' @ [75:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'<' @ [75:21] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'byRating' @ [75:22] ==> val byRating: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.combineComparators[LocalVariableDescriptor]

'byName' @ [75:36] ==> val byName: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.combineComparators[LocalVariableDescriptor]

'compare' @ [75:44] ==> public abstract fun compare(p0: (Item..Item?), p1: (Item..Item?)): Int defined in java.util.Comparator[JavaMethodDescriptor]

'v1' @ [75:52] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [75:56] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'assertTrue' @ [76:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'>' @ [76:21] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'byRating' @ [76:22] ==> val byRating: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.combineComparators[LocalVariableDescriptor]

'byName' @ [76:36] ==> val byName: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.combineComparators[LocalVariableDescriptor]

'compare' @ [76:44] ==> public abstract fun compare(p0: (Item..Item?), p1: (Item..Item?)): Int defined in java.util.Comparator[JavaMethodDescriptor]

'v4' @ [76:52] ==> val v4: Item defined in test.comparisons.OrderingTest.combineComparators[LocalVariableDescriptor]

'v2' @ [76:56] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'assertTrue' @ [77:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'<' @ [77:21] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'byRating' @ [77:22] ==> val byRating: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.combineComparators[LocalVariableDescriptor]

'byName' @ [77:46] ==> val byName: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.combineComparators[LocalVariableDescriptor]

'compare' @ [77:54] ==> public abstract fun compare(p0: (Item..Item?), p1: (Item..Item?)): Int defined in java.util.Comparator[JavaMethodDescriptor]

'v4' @ [77:62] ==> val v4: Item defined in test.comparisons.OrderingTest.combineComparators[LocalVariableDescriptor]

'v2' @ [77:66] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'Test' @ [80:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'compareBy' @ [82:26] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [82:44] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.reversedComparator.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [82:47] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'comparator' @ [83:24] ==> val comparator: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.reversedComparator[LocalVariableDescriptor]

'reversed' @ [83:35] ==> public fun <T> Comparator<Item> /* = Comparator<Item> */.reversed(): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'assertEquals' @ [84:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'comparator' @ [84:22] ==> val comparator: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.reversedComparator[LocalVariableDescriptor]

'compare' @ [84:33] ==> public abstract fun compare(p0: (Item..Item?), p1: (Item..Item?)): Int defined in java.util.Comparator[JavaMethodDescriptor]

'v2' @ [84:41] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v1' @ [84:45] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'reversed' @ [84:50] ==> val reversed: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.reversedComparator[LocalVariableDescriptor]

'compare' @ [84:59] ==> public abstract fun compare(p0: (Item..Item?), p1: (Item..Item?)): Int defined in java.util.Comparator[JavaMethodDescriptor]

'v1' @ [84:67] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [84:71] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'assertEquals' @ [85:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Comparator<Item> /* = Comparator<Item> */, actual: Comparator<Item> /* = Comparator<Item> */, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Comparator<Item>

'comparator' @ [85:22] ==> val comparator: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.reversedComparator[LocalVariableDescriptor]

'reversed' @ [85:34] ==> val reversed: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.reversedComparator[LocalVariableDescriptor]

'reversed' @ [85:43] ==> public fun <T> Comparator<Item> /* = Comparator<Item> */.reversed(): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'Test' @ [88:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertTrue' @ [93:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'naturalOrder' @ [93:20] ==> public fun <T : Comparable<String>> naturalOrder(): Comparator<String> /* = Comparator<String> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'compare' @ [93:43] ==> public abstract fun compare(p0: (String..String?), p1: (String..String?)): Int defined in java.util.Comparator[JavaMethodDescriptor]

'v1' @ [93:51] ==> val v1: String defined in test.comparisons.OrderingTest.naturalOrderComparator[LocalVariableDescriptor]

'v2' @ [93:55] ==> val v2: String defined in test.comparisons.OrderingTest.naturalOrderComparator[LocalVariableDescriptor]

'assertTrue' @ [94:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'reverseOrder' @ [94:20] ==> public fun <T : Comparable<String>> reverseOrder(): Comparator<String> /* = Comparator<String> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'compare' @ [94:43] ==> public abstract fun compare(p0: (String..String?), p1: (String..String?)): Int defined in java.util.Comparator[JavaMethodDescriptor]

'v1' @ [94:51] ==> val v1: String defined in test.comparisons.OrderingTest.naturalOrderComparator[LocalVariableDescriptor]

'v2' @ [94:55] ==> val v2: String defined in test.comparisons.OrderingTest.naturalOrderComparator[LocalVariableDescriptor]

'assertTrue' @ [95:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'reverseOrder' @ [95:20] ==> public fun <T : Comparable<Int>> reverseOrder(): Comparator<Int> /* = Comparator<Int> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'naturalOrder' @ [95:44] ==> public fun <T : Comparable<Int>> naturalOrder(): Comparator<Int> /* = Comparator<Int> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'reversed' @ [95:64] ==> public fun <T> Comparator<Int> /* = Comparator<Int> */.reversed(): Comparator<Int> /* = Comparator<Int> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertTrue' @ [96:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'naturalOrder' @ [96:20] ==> public fun <T : Comparable<Int>> naturalOrder(): Comparator<Int> /* = Comparator<Int> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'reverseOrder' @ [96:44] ==> public fun <T : Comparable<Int>> reverseOrder(): Comparator<Int> /* = Comparator<Int> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'reversed' @ [96:64] ==> public fun <T> Comparator<Int> /* = Comparator<Int> */.reversed(): Comparator<Int> /* = Comparator<Int> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [99:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'compareBy' @ [101:26] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [101:44] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.sortByThenBy.<anonymous>[ValueParameterDescriptorImpl]

'rating' @ [101:47] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'thenBy' @ [101:56] ==> @InlineOnly public inline fun <T> Comparator<Item> /* = Comparator<Item> */.thenBy(crossinline selector: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [101:65] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.sortByThenBy.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [101:68] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'comparator' @ [103:20] ==> val comparator: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.sortByThenBy[LocalVariableDescriptor]

'compare' @ [103:31] ==> public abstract fun compare(p0: (Item..Item?), p1: (Item..Item?)): Int defined in java.util.Comparator[JavaMethodDescriptor]

'v1' @ [103:39] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [103:43] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'assertTrue' @ [104:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'diff' @ [104:20] ==> val diff: Int defined in test.comparisons.OrderingTest.sortByThenBy[LocalVariableDescriptor]

'arrayListOf' @ [105:21] ==> public fun <T> arrayListOf(vararg elements: Item): ArrayList<Item> /* = ArrayList<Item> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'v1' @ [105:33] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [105:37] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'sortedWith' @ [105:41] ==> public fun <T> Iterable<Item>.sortedWith(comparator: Comparator<in Item> /* = Comparator<in Item> */): List<Item> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'comparator' @ [105:52] ==> val comparator: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.sortByThenBy[LocalVariableDescriptor]

'assertEquals' @ [106:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v1' @ [106:22] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'items' @ [106:26] ==> val items: List<Item> defined in test.comparisons.OrderingTest.sortByThenBy[LocalVariableDescriptor]

'assertEquals' @ [107:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v2' @ [107:22] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'items' @ [107:26] ==> val items: List<Item> defined in test.comparisons.OrderingTest.sortByThenBy[LocalVariableDescriptor]

'Test' @ [110:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'compareBy' @ [112:26] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [112:44] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.sortByThenByDescending.<anonymous>[ValueParameterDescriptorImpl]

'rating' @ [112:47] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'thenByDescending' @ [112:56] ==> @InlineOnly public inline fun <T> Comparator<Item> /* = Comparator<Item> */.thenByDescending(crossinline selector: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [112:75] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.sortByThenByDescending.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [112:78] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'comparator' @ [114:20] ==> val comparator: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.sortByThenByDescending[LocalVariableDescriptor]

'compare' @ [114:31] ==> public abstract fun compare(p0: (Item..Item?), p1: (Item..Item?)): Int defined in java.util.Comparator[JavaMethodDescriptor]

'v1' @ [114:39] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [114:43] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'assertTrue' @ [115:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'diff' @ [115:20] ==> val diff: Int defined in test.comparisons.OrderingTest.sortByThenByDescending[LocalVariableDescriptor]

'arrayListOf' @ [116:21] ==> public fun <T> arrayListOf(vararg elements: Item): ArrayList<Item> /* = ArrayList<Item> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'v1' @ [116:33] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [116:37] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'sortedWith' @ [116:41] ==> public fun <T> Iterable<Item>.sortedWith(comparator: Comparator<in Item> /* = Comparator<in Item> */): List<Item> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'comparator' @ [116:52] ==> val comparator: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.sortByThenByDescending[LocalVariableDescriptor]

'assertEquals' @ [117:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v1' @ [117:22] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'items' @ [117:26] ==> val items: List<Item> defined in test.comparisons.OrderingTest.sortByThenByDescending[LocalVariableDescriptor]

'assertEquals' @ [118:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v2' @ [118:22] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'items' @ [118:26] ==> val items: List<Item> defined in test.comparisons.OrderingTest.sortByThenByDescending[LocalVariableDescriptor]

'Test' @ [121:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'compareBy' @ [123:26] ==> public fun <T> compareBy(vararg selectors: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [123:44] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.sortUsingFunctionalComparator.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [123:47] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'it' @ [123:57] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.sortUsingFunctionalComparator.<anonymous>[ValueParameterDescriptorImpl]

'rating' @ [123:60] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'comparator' @ [124:20] ==> val comparator: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.sortUsingFunctionalComparator[LocalVariableDescriptor]

'compare' @ [124:31] ==> public abstract fun compare(p0: (Item..Item?), p1: (Item..Item?)): Int defined in java.util.Comparator[JavaMethodDescriptor]

'v1' @ [124:39] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [124:43] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'assertTrue' @ [125:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'diff' @ [125:20] ==> val diff: Int defined in test.comparisons.OrderingTest.sortUsingFunctionalComparator[LocalVariableDescriptor]

'arrayListOf' @ [126:21] ==> public fun <T> arrayListOf(vararg elements: Item): ArrayList<Item> /* = ArrayList<Item> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'v1' @ [126:33] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [126:37] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'sortedWith' @ [126:41] ==> public fun <T> Iterable<Item>.sortedWith(comparator: Comparator<in Item> /* = Comparator<in Item> */): List<Item> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'comparator' @ [126:52] ==> val comparator: Comparator<Item> /* = Comparator<Item> */ defined in test.comparisons.OrderingTest.sortUsingFunctionalComparator[LocalVariableDescriptor]

'assertEquals' @ [127:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v2' @ [127:22] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'items' @ [127:26] ==> val items: List<Item> defined in test.comparisons.OrderingTest.sortUsingFunctionalComparator[LocalVariableDescriptor]

'assertEquals' @ [128:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v1' @ [128:22] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'items' @ [128:26] ==> val items: List<Item> defined in test.comparisons.OrderingTest.sortUsingFunctionalComparator[LocalVariableDescriptor]

'Test' @ [131:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'compareValuesBy' @ [135:24] ==> public fun <T> compareValuesBy(a: Item, b: Item, vararg selectors: (Item) -> Comparable<*>?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'o1' @ [135:40] ==> value-parameter o1: Item defined in test.comparisons.OrderingTest.sortUsingCustomComparator.<no name provided>.compare[ValueParameterDescriptorImpl]

'o2' @ [135:44] ==> value-parameter o2: Item defined in test.comparisons.OrderingTest.sortUsingCustomComparator.<no name provided>.compare[ValueParameterDescriptorImpl]

'it' @ [135:50] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.sortUsingCustomComparator.<no name provided>.compare.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [135:53] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'it' @ [135:63] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.sortUsingCustomComparator.<no name provided>.compare.<anonymous>[ValueParameterDescriptorImpl]

'rating' @ [135:66] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'this' @ [139:24] ==> <this> defined in test.comparisons.OrderingTest.sortUsingCustomComparator.<no name provided>[LazyClassReceiverParameterDescriptor]

'other' @ [139:32] ==> value-parameter other: Any? defined in test.comparisons.OrderingTest.sortUsingCustomComparator.<no name provided>.equals[ValueParameterDescriptorImpl]

'comparator' @ [142:20] ==> val comparator: <no name provided> defined in test.comparisons.OrderingTest.sortUsingCustomComparator[LocalVariableDescriptor]

'compare' @ [142:31] ==> public open fun compare(o1: Item, o2: Item): Int defined in test.comparisons.OrderingTest.sortUsingCustomComparator.<no name provided>[SimpleFunctionDescriptorImpl]

'v1' @ [142:39] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [142:43] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'assertTrue' @ [143:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'diff' @ [143:20] ==> val diff: Int defined in test.comparisons.OrderingTest.sortUsingCustomComparator[LocalVariableDescriptor]

'arrayListOf' @ [144:21] ==> public fun <T> arrayListOf(vararg elements: Item): ArrayList<Item> /* = ArrayList<Item> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'v1' @ [144:33] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [144:37] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'sortedWith' @ [144:41] ==> public fun <T> Iterable<Item>.sortedWith(comparator: Comparator<in Item> /* = Comparator<in Item> */): List<Item> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'comparator' @ [144:52] ==> val comparator: <no name provided> defined in test.comparisons.OrderingTest.sortUsingCustomComparator[LocalVariableDescriptor]

'assertEquals' @ [145:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v2' @ [145:22] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'items' @ [145:26] ==> val items: List<Item> defined in test.comparisons.OrderingTest.sortUsingCustomComparator[LocalVariableDescriptor]

'assertEquals' @ [146:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v1' @ [146:22] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'items' @ [146:26] ==> val items: List<Item> defined in test.comparisons.OrderingTest.sortUsingCustomComparator[LocalVariableDescriptor]

'Test' @ [149:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [150:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'Int' @ [150:22] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [150:26] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'maxOf' @ [150:37] ==> @SinceKotlin @InlineOnly public inline fun maxOf(a: Int, b: Int): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]

'Int' @ [150:43] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [150:47] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'Int' @ [150:58] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [150:62] ==> public const final val MIN_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'assertEquals' @ [151:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'Int' @ [151:22] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [151:26] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'maxOf' @ [151:37] ==> @SinceKotlin @InlineOnly public inline fun maxOf(a: Int, b: Int, c: Int): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]

'Int' @ [151:43] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [151:47] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'Int' @ [151:58] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [151:62] ==> public const final val MIN_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'assertEquals' @ [153:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Long, actual: Long, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Long

'Long' @ [153:22] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [153:27] ==> public const final val MAX_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'maxOf' @ [153:38] ==> @SinceKotlin @InlineOnly public inline fun maxOf(a: Long, b: Long): Long defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]

'Long' @ [153:44] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [153:49] ==> public const final val MAX_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'Long' @ [153:60] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [153:65] ==> public const final val MIN_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'assertEquals' @ [154:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Long, actual: Long, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Long

'Long' @ [154:22] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [154:27] ==> public const final val MAX_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'maxOf' @ [154:38] ==> @SinceKotlin @InlineOnly public inline fun maxOf(a: Long, b: Long, c: Long): Long defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]

'Long' @ [154:44] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [154:49] ==> public const final val MAX_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'Long' @ [154:60] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [154:65] ==> public const final val MIN_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'assertEquals' @ [156:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Double, actual: Double, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Double

'Double' @ [156:22] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'POSITIVE_INFINITY' @ [156:29] ==> public final val POSITIVE_INFINITY: Double defined in kotlin.Double.Companion[DeserializedPropertyDescriptor]

'maxOf' @ [156:48] ==> @SinceKotlin @InlineOnly public inline fun maxOf(a: Double, b: Double): Double defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]

'Double' @ [156:54] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'NEGATIVE_INFINITY' @ [156:61] ==> public final val NEGATIVE_INFINITY: Double defined in kotlin.Double.Companion[DeserializedPropertyDescriptor]

'Double' @ [156:80] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'POSITIVE_INFINITY' @ [156:87] ==> public final val POSITIVE_INFINITY: Double defined in kotlin.Double.Companion[DeserializedPropertyDescriptor]

'assertEquals' @ [157:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Double, actual: Double, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Double

'Double' @ [157:22] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'POSITIVE_INFINITY' @ [157:29] ==> public final val POSITIVE_INFINITY: Double defined in kotlin.Double.Companion[DeserializedPropertyDescriptor]

'maxOf' @ [157:48] ==> @SinceKotlin @InlineOnly public inline fun maxOf(a: Double, b: Double, c: Double): Double defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]

'Double' @ [157:54] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'POSITIVE_INFINITY' @ [157:61] ==> public final val POSITIVE_INFINITY: Double defined in kotlin.Double.Companion[DeserializedPropertyDescriptor]

'Double' @ [157:80] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [157:87] ==> public final val MAX_VALUE: Double defined in kotlin.Double.Companion[DeserializedPropertyDescriptor]

'Double' @ [157:98] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [157:105] ==> public final val MIN_VALUE: Double defined in kotlin.Double.Companion[DeserializedPropertyDescriptor]

'Test' @ [160:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [161:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v1' @ [161:22] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'maxOf' @ [161:26] ==> @SinceKotlin public fun <T> maxOf(a: Item, b: Item, comparator: Comparator<in Item> /* = Comparator<in Item> */): Item defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'v1' @ [161:32] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [161:36] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'compareBy' @ [161:40] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [161:52] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.maxOfWith.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [161:55] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'assertEquals' @ [162:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v1' @ [162:22] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'maxOf' @ [162:26] ==> @SinceKotlin public fun <T> maxOf(a: Item, b: Item, c: Item, comparator: Comparator<in Item> /* = Comparator<in Item> */): Item defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'v3' @ [162:32] ==> public final val v3: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [162:36] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v1' @ [162:40] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'compareBy' @ [162:44] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [162:56] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.maxOfWith.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [162:59] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'assertEquals' @ [163:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v2' @ [163:22] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'maxOf' @ [163:26] ==> @SinceKotlin public fun <T> maxOf(a: Item, b: Item, comparator: Comparator<in Item> /* = Comparator<in Item> */): Item defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'v1' @ [163:32] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [163:36] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'compareBy' @ [163:40] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [163:52] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.maxOfWith.<anonymous>[ValueParameterDescriptorImpl]

'rating' @ [163:55] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'assertEquals' @ [164:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v3' @ [164:22] ==> public final val v3: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'maxOf' @ [164:26] ==> @SinceKotlin public fun <T> maxOf(a: Item, b: Item, c: Item, comparator: Comparator<in Item> /* = Comparator<in Item> */): Item defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'v1' @ [164:32] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [164:36] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v3' @ [164:40] ==> public final val v3: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'compareBy' @ [164:44] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [164:56] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.maxOfWith.<anonymous>[ValueParameterDescriptorImpl]

'rating' @ [164:59] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'Test' @ [167:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [168:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'Int' @ [168:22] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [168:26] ==> public const final val MIN_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'minOf' @ [168:37] ==> @SinceKotlin @InlineOnly public inline fun minOf(a: Int, b: Int): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]

'Int' @ [168:43] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [168:47] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'Int' @ [168:58] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [168:62] ==> public const final val MIN_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'assertEquals' @ [169:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'Int' @ [169:22] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [169:26] ==> public const final val MIN_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'minOf' @ [169:37] ==> @SinceKotlin @InlineOnly public inline fun minOf(a: Int, b: Int, c: Int): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]

'Int' @ [169:43] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [169:47] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'Int' @ [169:58] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [169:62] ==> public const final val MIN_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'assertEquals' @ [171:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Long, actual: Long, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Long

'Long' @ [171:22] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [171:27] ==> public const final val MIN_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'minOf' @ [171:38] ==> @SinceKotlin @InlineOnly public inline fun minOf(a: Long, b: Long): Long defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]

'Long' @ [171:44] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [171:49] ==> public const final val MAX_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'Long' @ [171:60] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [171:65] ==> public const final val MIN_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'assertEquals' @ [172:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Long, actual: Long, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Long

'Long' @ [172:22] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [172:27] ==> public const final val MIN_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'minOf' @ [172:38] ==> @SinceKotlin @InlineOnly public inline fun minOf(a: Long, b: Long, c: Long): Long defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]

'Long' @ [172:44] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [172:49] ==> public const final val MAX_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'Long' @ [172:60] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [172:65] ==> public const final val MIN_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'assertEquals' @ [174:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Double, actual: Double, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Double

'Double' @ [174:22] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'NEGATIVE_INFINITY' @ [174:29] ==> public final val NEGATIVE_INFINITY: Double defined in kotlin.Double.Companion[DeserializedPropertyDescriptor]

'minOf' @ [174:48] ==> @SinceKotlin @InlineOnly public inline fun minOf(a: Double, b: Double): Double defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]

'Double' @ [174:54] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'NEGATIVE_INFINITY' @ [174:61] ==> public final val NEGATIVE_INFINITY: Double defined in kotlin.Double.Companion[DeserializedPropertyDescriptor]

'Double' @ [174:80] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'POSITIVE_INFINITY' @ [174:87] ==> public final val POSITIVE_INFINITY: Double defined in kotlin.Double.Companion[DeserializedPropertyDescriptor]

'assertEquals' @ [175:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Double, actual: Double, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Double

'Double' @ [175:22] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [175:29] ==> public final val MIN_VALUE: Double defined in kotlin.Double.Companion[DeserializedPropertyDescriptor]

'minOf' @ [175:40] ==> @SinceKotlin @InlineOnly public inline fun minOf(a: Double, b: Double, c: Double): Double defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]

'Double' @ [175:46] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'POSITIVE_INFINITY' @ [175:53] ==> public final val POSITIVE_INFINITY: Double defined in kotlin.Double.Companion[DeserializedPropertyDescriptor]

'Double' @ [175:72] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [175:79] ==> public final val MAX_VALUE: Double defined in kotlin.Double.Companion[DeserializedPropertyDescriptor]

'Double' @ [175:90] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [175:97] ==> public final val MIN_VALUE: Double defined in kotlin.Double.Companion[DeserializedPropertyDescriptor]

'Test' @ [178:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [179:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v2' @ [179:22] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'minOf' @ [179:26] ==> @SinceKotlin public fun <T> minOf(a: Item, b: Item, comparator: Comparator<in Item> /* = Comparator<in Item> */): Item defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'v1' @ [179:32] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [179:36] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'compareBy' @ [179:40] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [179:52] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.minOfWith.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [179:55] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'assertEquals' @ [180:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v3' @ [180:22] ==> public final val v3: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'minOf' @ [180:26] ==> @SinceKotlin public fun <T> minOf(a: Item, b: Item, c: Item, comparator: Comparator<in Item> /* = Comparator<in Item> */): Item defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'v3' @ [180:32] ==> public final val v3: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [180:36] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v1' @ [180:40] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'compareBy' @ [180:44] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [180:56] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.minOfWith.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [180:59] ==> public final val name: String defined in test.comparisons.Item[PropertyDescriptorImpl]

'assertEquals' @ [181:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v1' @ [181:22] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'minOf' @ [181:26] ==> @SinceKotlin public fun <T> minOf(a: Item, b: Item, comparator: Comparator<in Item> /* = Comparator<in Item> */): Item defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'v1' @ [181:32] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [181:36] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'compareBy' @ [181:40] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [181:52] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.minOfWith.<anonymous>[ValueParameterDescriptorImpl]

'rating' @ [181:55] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

'assertEquals' @ [182:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Item, actual: Item, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Item

'v1' @ [182:22] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'minOf' @ [182:26] ==> @SinceKotlin public fun <T> minOf(a: Item, b: Item, c: Item, comparator: Comparator<in Item> /* = Comparator<in Item> */): Item defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'v1' @ [182:32] ==> public final val v1: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v2' @ [182:36] ==> public final val v2: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'v3' @ [182:40] ==> public final val v3: Item defined in test.comparisons.OrderingTest[PropertyDescriptorImpl]

'compareBy' @ [182:44] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (Item) -> Comparable<*>?): Comparator<Item> /* = Comparator<Item> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Item

'it' @ [182:56] ==> value-parameter it: Item defined in test.comparisons.OrderingTest.minOfWith.<anonymous>[ValueParameterDescriptorImpl]

'rating' @ [182:59] ==> public final val rating: Int defined in test.comparisons.Item[PropertyDescriptorImpl]

