'equalityBehavior' @ [22:5] ==> public fun <T> CompareContext<List<T>>.equalityBehavior(objectName: String = ...): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<T>

'collectionBehavior' @ [23:5] ==> public fun <T> CompareContext<Collection<T>>.collectionBehavior(objectName: String = ...): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'compareProperty' @ [24:5] ==> public final fun <P> compareProperty(getter: List<T>.() -> ListIterator<T>, block: CompareContext<ListIterator<T>>.() -> Unit): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> ListIterator<T>

'listIterator' @ [24:24] ==> public abstract fun listIterator(): ListIterator<T> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'listIteratorBehavior' @ [24:44] ==> public fun <T> CompareContext<ListIterator<T>>.listIteratorBehavior(): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'compareProperty' @ [25:5] ==> public final fun <P> compareProperty(getter: List<T>.() -> ListIterator<T>, block: CompareContext<ListIterator<T>>.() -> Unit): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> ListIterator<T>

'listIterator' @ [25:24] ==> public abstract fun listIterator(index: Int): ListIterator<T> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'listIteratorBehavior' @ [25:45] ==> public fun <T> CompareContext<ListIterator<T>>.listIteratorBehavior(): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'propertyFails' @ [27:5] ==> public final fun propertyFails(getter: List<T>.() -> Unit): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]

'listIterator' @ [27:21] ==> public abstract fun listIterator(index: Int): ListIterator<T> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'-' @ [27:34] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'propertyFails' @ [28:5] ==> public final fun propertyFails(getter: List<T>.() -> Unit): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]

'listIterator' @ [28:21] ==> public abstract fun listIterator(index: Int): ListIterator<T> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'size' @ [28:34] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'expected' @ [30:19] ==> public final val expected: List<T> defined in test.collections.CompareContext[PropertyDescriptorImpl]

'indices' @ [30:28] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'propertyEquals' @ [31:9] ==> public final fun <P> propertyEquals(message: String = ..., getter: List<T>.() -> T): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> T

'this' @ [31:26] ==> <this> defined in test.collections.behaviors.listBehavior.<anonymous>[ReceiverParameterDescriptorImpl]

'index' @ [31:31] ==> val index: Int defined in test.collections.behaviors.listBehavior[LocalVariableDescriptor]

'propertyFails' @ [33:5] ==> public final fun propertyFails(getter: List<T>.() -> Unit): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]

'this' @ [33:21] ==> <this> defined in test.collections.behaviors.listBehavior.<anonymous>[ReceiverParameterDescriptorImpl]

'size' @ [33:26] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'propertyEquals' @ [35:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: List<T>.() -> Int): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Int

'indexOf' @ [35:22] ==> public fun <@OnlyInputTypes T> List<T?>.indexOf(element: T?): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> T?

'elementAtOrNull' @ [35:30] ==> @InlineOnly public inline fun <T> List<T>.elementAtOrNull(index: Int): T? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'propertyEquals' @ [36:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: List<T>.() -> Int): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Int

'lastIndexOf' @ [36:22] ==> public fun <@OnlyInputTypes T> List<T?>.lastIndexOf(element: T?): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> T?

'elementAtOrNull' @ [36:34] ==> @InlineOnly public inline fun <T> List<T>.elementAtOrNull(index: Int): T? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'propertyFails' @ [38:5] ==> public final fun propertyFails(getter: List<T>.() -> Unit): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]

'subList' @ [38:21] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<T> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'size' @ [38:32] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'propertyFails' @ [39:5] ==> public final fun propertyFails(getter: List<T>.() -> Unit): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]

'subList' @ [39:21] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<T> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'-' @ [39:29] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'propertyEquals' @ [40:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: List<T>.() -> List<T>): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> List<T>

'subList' @ [40:22] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<T> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'size' @ [40:33] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'listIteratorProperties' @ [44:5] ==> public fun CompareContext<ListIterator<*>>.listIteratorProperties(): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]

'expected' @ [46:12] ==> public final val expected: ListIterator<T> defined in test.collections.CompareContext[PropertyDescriptorImpl]

'hasNext' @ [46:21] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.ListIterator[DeserializedSimpleFunctionDescriptor]

'propertyEquals' @ [47:9] ==> public final fun <P> propertyEquals(message: String = ..., getter: ListIterator<T>.() -> T): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> T

'next' @ [47:26] ==> public abstract fun next(): T defined in kotlin.collections.ListIterator[DeserializedSimpleFunctionDescriptor]

'listIteratorProperties' @ [48:9] ==> public fun CompareContext<ListIterator<*>>.listIteratorProperties(): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]

'propertyFails' @ [50:5] ==> public final fun propertyFails(getter: ListIterator<T>.() -> Unit): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]

'next' @ [50:21] ==> public abstract fun next(): T defined in kotlin.collections.ListIterator[DeserializedSimpleFunctionDescriptor]

'expected' @ [52:12] ==> public final val expected: ListIterator<T> defined in test.collections.CompareContext[PropertyDescriptorImpl]

'hasPrevious' @ [52:21] ==> public abstract fun hasPrevious(): Boolean defined in kotlin.collections.ListIterator[DeserializedSimpleFunctionDescriptor]

'propertyEquals' @ [53:9] ==> public final fun <P> propertyEquals(message: String = ..., getter: ListIterator<T>.() -> T): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> T

'previous' @ [53:26] ==> public abstract fun previous(): T defined in kotlin.collections.ListIterator[DeserializedSimpleFunctionDescriptor]

'listIteratorProperties' @ [54:9] ==> public fun CompareContext<ListIterator<*>>.listIteratorProperties(): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]

'propertyFails' @ [56:5] ==> public final fun propertyFails(getter: ListIterator<T>.() -> Unit): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]

'previous' @ [56:21] ==> public abstract fun previous(): T defined in kotlin.collections.ListIterator[DeserializedSimpleFunctionDescriptor]

'propertyEquals' @ [60:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: ListIterator<*>.() -> Boolean): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Boolean

'hasNext' @ [60:22] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.ListIterator[DeserializedSimpleFunctionDescriptor]

'propertyEquals' @ [61:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: ListIterator<*>.() -> Boolean): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Boolean

'hasPrevious' @ [61:22] ==> public abstract fun hasPrevious(): Boolean defined in kotlin.collections.ListIterator[DeserializedSimpleFunctionDescriptor]

'propertyEquals' @ [62:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: ListIterator<*>.() -> Int): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Int

'nextIndex' @ [62:22] ==> public abstract fun nextIndex(): Int defined in kotlin.collections.ListIterator[DeserializedSimpleFunctionDescriptor]

'propertyEquals' @ [63:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: ListIterator<*>.() -> Int): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Int

'previousIndex' @ [63:22] ==> public abstract fun previousIndex(): Int defined in kotlin.collections.ListIterator[DeserializedSimpleFunctionDescriptor]

'propertyEquals' @ [67:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: Iterator<T>.() -> Boolean): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Boolean

'hasNext' @ [67:22] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'expected' @ [69:12] ==> public final val expected: Iterator<T> defined in test.collections.CompareContext[PropertyDescriptorImpl]

'hasNext' @ [69:21] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'propertyEquals' @ [70:9] ==> public final fun <P> propertyEquals(message: String = ..., getter: Iterator<T>.() -> T): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> T

'next' @ [70:26] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'propertyEquals' @ [71:9] ==> public final fun <P> propertyEquals(message: String = ..., getter: Iterator<T>.() -> Boolean): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Boolean

'hasNext' @ [71:26] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'propertyFails' @ [73:5] ==> public final fun propertyFails(getter: Iterator<T>.() -> Unit): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]

'next' @ [73:21] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'equalityBehavior' @ [77:5] ==> public fun <T> CompareContext<Set<T>>.equalityBehavior(objectName: String = ...): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Set<T>

'objectName' @ [77:22] ==> value-parameter objectName: String = ... defined in test.collections.behaviors.setBehavior[ValueParameterDescriptorImpl]

'collectionBehavior' @ [78:5] ==> public fun <T> CompareContext<Collection<T>>.collectionBehavior(objectName: String = ...): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'objectName' @ [78:24] ==> value-parameter objectName: String = ... defined in test.collections.behaviors.setBehavior[ValueParameterDescriptorImpl]

'compareProperty' @ [79:5] ==> public final fun <P> compareProperty(getter: Set<T>.() -> Iterator<T>, block: CompareContext<Iterator<T>>.() -> Unit): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Iterator<T>

'iterator' @ [79:23] ==> public abstract fun iterator(): Iterator<T> defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'iteratorBehavior' @ [79:39] ==> public fun <T> CompareContext<Iterator<T>>.iteratorBehavior(): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'equalityBehavior' @ [83:5] ==> public fun <T> CompareContext<Map<K, V>>.equalityBehavior(objectName: String = ...): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Map<K, V>

'propertyEquals' @ [84:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: Map<K, V>.() -> Int): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Int

'size' @ [84:22] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'propertyEquals' @ [85:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: Map<K, V>.() -> Boolean): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Boolean

'isEmpty' @ [85:22] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'let' @ [87:17] ==> @InlineOnly public inline fun <T, R> <no name provided><K, V>.let(block: (<no name provided><K, V>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> <no name provided><K, V>
    <R> -> Unit

'propertyEquals' @ [87:23] ==> public final fun <P> propertyEquals(message: String = ..., getter: Map<K, V>.() -> Boolean): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Boolean

'containsKey' @ [87:40] ==> @InlineOnly public inline fun <@OnlyInputTypes K> Map<out Any?, *>.containsKey(key: Any?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes K> -> Any?

'it' @ [87:52] ==> value-parameter it: <no name provided><K, V> defined in test.collections.behaviors.mapBehavior.<anonymous>[ValueParameterDescriptorImpl]

'expected' @ [89:9] ==> public final val expected: Map<K, V> defined in test.collections.CompareContext[PropertyDescriptorImpl]

'isEmpty' @ [89:18] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'not' @ [89:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'propertyEquals' @ [90:9] ==> public final fun <P> propertyEquals(message: String = ..., getter: Map<K, V>.() -> Boolean): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Boolean

'contains' @ [90:26] ==> @InlineOnly public operator inline fun <@OnlyInputTypes K, V> Map<out K, V>.contains(key: K): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes K> -> K
    <V> -> V

'keys' @ [90:35] ==> public abstract val keys: Set<K> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'first' @ [90:40] ==> public fun <T> Iterable<K>.first(): K defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K

'propertyEquals' @ [92:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: Map<K, V>.() -> Boolean): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Boolean

'containsKey' @ [92:22] ==> @InlineOnly public inline fun <@OnlyInputTypes K> Map<out K?, *>.containsKey(key: K?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes K> -> K?

'keys' @ [92:34] ==> public abstract val keys: Set<K> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'firstOrNull' @ [92:39] ==> public fun <T> Iterable<K>.firstOrNull(): K? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K

'propertyEquals' @ [93:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: Map<K, V>.() -> Boolean): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Boolean

'containsValue' @ [93:22] ==> @InlineOnly public inline fun <K, @OnlyInputTypes V> Map<K, V?>.containsValue(value: V?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <@OnlyInputTypes V> -> V?

'values' @ [93:36] ==> public abstract val values: Collection<V> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'firstOrNull' @ [93:43] ==> public fun <T> Iterable<V>.firstOrNull(): V? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> V

'propertyEquals' @ [94:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: Map<K, V>.() -> V?): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> V?

'get' @ [94:22] ==> @InlineOnly public operator inline fun <@OnlyInputTypes K, V> Map<out Any?, V>.get(key: Any?): V? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes K> -> Any?
    <V> -> V

'compareProperty' @ [96:5] ==> public final fun <P> compareProperty(getter: Map<K, V>.() -> Set<K>, block: CompareContext<Set<K>>.() -> Unit): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Set<K>

'keys' @ [96:24] ==> public abstract val keys: Set<K> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'setBehavior' @ [96:34] ==> public fun <T> CompareContext<Set<K>>.setBehavior(objectName: String = ...): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> K

'compareProperty' @ [97:5] ==> public final fun <P> compareProperty(getter: Map<K, V>.() -> Set<Map.Entry<K, V>>, block: CompareContext<Set<Map.Entry<K, V>>>.() -> Unit): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Set<Entry<K, V>>

'entries' @ [97:24] ==> public abstract val entries: Set<Map.Entry<K, V>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'setBehavior' @ [97:37] ==> public fun <T> CompareContext<Set<Map.Entry<K, V>>>.setBehavior(objectName: String = ...): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Entry<K, V>

'compareProperty' @ [98:5] ==> public final fun <P> compareProperty(getter: Map<K, V>.() -> Collection<V>, block: CompareContext<Collection<V>>.() -> Unit): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Collection<V>

'values' @ [98:24] ==> public abstract val values: Collection<V> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'collectionBehavior' @ [98:36] ==> public fun <T> CompareContext<Collection<V>>.collectionBehavior(objectName: String = ...): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> V

'objectName' @ [102:18] ==> value-parameter objectName: String = ... defined in test.collections.behaviors.equalityBehavior[ValueParameterDescriptorImpl]

'if (objectName.isNotEmpty()) "." else ""' @ [102:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'objectName' @ [102:36] ==> value-parameter objectName: String = ... defined in test.collections.behaviors.equalityBehavior[ValueParameterDescriptorImpl]

'isNotEmpty' @ [102:47] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'equals' @ [103:5] ==> public final fun equals(message: String = ...): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]

'objectName' @ [103:12] ==> value-parameter objectName: String = ... defined in test.collections.behaviors.equalityBehavior[ValueParameterDescriptorImpl]

'propertyEquals' @ [104:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: T.() -> Int): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Int

'prefix' @ [104:20] ==> val prefix: String defined in test.collections.behaviors.equalityBehavior[LocalVariableDescriptor]

'hashCode' @ [104:43] ==> public open fun hashCode(): Int defined in test.collections.CompareContext[DeserializedSimpleFunctionDescriptor]

'propertyEquals' @ [105:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: T.() -> String): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> String

'prefix' @ [105:20] ==> val prefix: String defined in test.collections.behaviors.equalityBehavior[LocalVariableDescriptor]

'toString' @ [105:43] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'objectName' @ [110:18] ==> value-parameter objectName: String = ... defined in test.collections.behaviors.collectionBehavior[ValueParameterDescriptorImpl]

'if (objectName.isNotEmpty()) "." else ""' @ [110:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'objectName' @ [110:36] ==> value-parameter objectName: String = ... defined in test.collections.behaviors.collectionBehavior[ValueParameterDescriptorImpl]

'isNotEmpty' @ [110:47] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'propertyEquals' @ [111:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: Collection<T>.() -> Int): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Int

'prefix' @ [111:21] ==> val prefix: String defined in test.collections.behaviors.collectionBehavior[LocalVariableDescriptor]

'size' @ [111:40] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'propertyEquals' @ [112:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: Collection<T>.() -> Boolean): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Boolean

'prefix' @ [112:21] ==> val prefix: String defined in test.collections.behaviors.collectionBehavior[LocalVariableDescriptor]

'isEmpty' @ [112:43] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'let' @ [114:17] ==> @InlineOnly public inline fun <T, R> <no name provided><T>.let(block: (<no name provided><T>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> <no name provided><T>
    <R> -> Unit

'propertyEquals' @ [114:23] ==> public final fun <P> propertyEquals(message: String = ..., getter: Collection<T>.() -> Boolean): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Boolean

'contains' @ [114:40] ==> public operator fun <@OnlyInputTypes T> Iterable<Any?>.contains(element: Any?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Any?

'it' @ [114:49] ==> value-parameter it: <no name provided><T> defined in test.collections.behaviors.collectionBehavior.<anonymous>[ValueParameterDescriptorImpl]

'propertyEquals' @ [115:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: Collection<T>.() -> Boolean): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Boolean

'contains' @ [115:22] ==> public operator fun <@OnlyInputTypes T> Iterable<T?>.contains(element: T?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> T?

'firstOrNull' @ [115:31] ==> public fun <T> Iterable<T>.firstOrNull(): T? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'propertyEquals' @ [116:5] ==> public final fun <P> propertyEquals(message: String = ..., getter: Collection<T>.() -> Boolean): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <P> -> Boolean

'containsAll' @ [116:22] ==> public abstract fun containsAll(elements: Collection<T>): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'this' @ [116:34] ==> <this> defined in test.collections.behaviors.collectionBehavior.<anonymous>[ReceiverParameterDescriptorImpl]

