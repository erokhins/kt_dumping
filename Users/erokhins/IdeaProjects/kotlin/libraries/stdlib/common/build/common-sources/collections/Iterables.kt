'kotlin.jvm.JvmMultifileClass' @ [16:1] ==> public constructor JvmMultifileClass() defined in kotlin.jvm.JvmMultifileClass[ClassConstructorDescriptorImpl]

'kotlin.jvm.JvmName' @ [17:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[ClassConstructorDescriptorImpl]

'kotlin.internal.InlineOnly' @ [24:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'invoke' @ [26:44] ==> public abstract operator fun invoke(): Iterator<T> defined in kotlin.Function0[FunctionInvokeDescriptor]

'IndexingIterator' @ [34:58] ==> public constructor IndexingIterator<out T>(iterator: Iterator<T>) defined in kotlin.collections.IndexingIterator[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'invoke' @ [34:75] ==> public abstract operator fun invoke(): Iterator<T> defined in kotlin.Function0[FunctionInvokeDescriptor]

'PublishedApi' @ [41:1] ==> public constructor PublishedApi() defined in kotlin.PublishedApi[DeserializedClassConstructorDescriptor]

'if (this is Collection<*>) this.size else null' @ [42:61] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'this' @ [42:65] ==> <this> defined in kotlin.collections.collectionSizeOrNull[ReceiverParameterDescriptorImpl]

'this' @ [42:88] ==> <this> defined in kotlin.collections.collectionSizeOrNull[ReceiverParameterDescriptorImpl]

'size' @ [42:93] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'PublishedApi' @ [47:1] ==> public constructor PublishedApi() defined in kotlin.PublishedApi[DeserializedClassConstructorDescriptor]

'if (this is Collection<*>) this.size else default' @ [48:75] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'this' @ [48:79] ==> <this> defined in kotlin.collections.collectionSizeOrDefault[ReceiverParameterDescriptorImpl]

'this' @ [48:102] ==> <this> defined in kotlin.collections.collectionSizeOrDefault[ReceiverParameterDescriptorImpl]

'size' @ [48:107] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'default' @ [48:117] ==> value-parameter default: Int defined in kotlin.collections.collectionSizeOrDefault[ValueParameterDescriptorImpl]

'size' @ [51:54] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'this' @ [51:66] ==> <this> defined in kotlin.collections.safeToConvertToSet[ReceiverParameterDescriptorImpl]

'when(this) {
            is Set -> this
            is Collection ->
                when {
                    source is Collection && source.size < 2 -> this
                    else -> if (this.safeToConvertToSet()) toHashSet() else this
                }
            else -> toHashSet()
        }' @ [55:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<T>, entry1: Collection<T>, entry2: Collection<T>): Collection<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<T>

'this' @ [55:14] ==> <this> defined in kotlin.collections.convertToSetForSetOperationWith[ReceiverParameterDescriptorImpl]

'this' @ [56:23] ==> <this> defined in kotlin.collections.convertToSetForSetOperationWith[ReceiverParameterDescriptorImpl]

'when {
                    source is Collection && source.size < 2 -> this
                    else -> if (this.safeToConvertToSet()) toHashSet() else this
                }' @ [58:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<T>, entry1: Collection<T>): Collection<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<T>

'source' @ [59:21] ==> value-parameter source: Iterable<T> defined in kotlin.collections.convertToSetForSetOperationWith[ValueParameterDescriptorImpl]

'source' @ [59:45] ==> value-parameter source: Iterable<T> defined in kotlin.collections.convertToSetForSetOperationWith[ValueParameterDescriptorImpl]

'size' @ [59:52] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'this' @ [59:64] ==> <this> defined in kotlin.collections.convertToSetForSetOperationWith[ReceiverParameterDescriptorImpl]

'if (this.safeToConvertToSet()) toHashSet() else this' @ [60:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<T>, elseBranch: Collection<T>): Collection<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<T>

'this' @ [60:33] ==> <this> defined in kotlin.collections.convertToSetForSetOperationWith[ReceiverParameterDescriptorImpl]

'safeToConvertToSet' @ [60:38] ==> private fun <T> Collection<T>.safeToConvertToSet(): Boolean defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'toHashSet' @ [60:60] ==> public header fun <T> Iterable<T>.toHashSet(): HashSet<T> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'this' @ [60:77] ==> <this> defined in kotlin.collections.convertToSetForSetOperationWith[ReceiverParameterDescriptorImpl]

'toHashSet' @ [62:21] ==> public header fun <T> Iterable<T>.toHashSet(): HashSet<T> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'when(this) {
            is Set -> this
            is Collection -> if (this.safeToConvertToSet()) toHashSet() else this
            else -> toHashSet()
        }' @ [67:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<T>, entry1: Collection<T>, entry2: Collection<T>): Collection<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<T>

'this' @ [67:14] ==> <this> defined in kotlin.collections.convertToSetForSetOperation[ReceiverParameterDescriptorImpl]

'this' @ [68:23] ==> <this> defined in kotlin.collections.convertToSetForSetOperation[ReceiverParameterDescriptorImpl]

'if (this.safeToConvertToSet()) toHashSet() else this' @ [69:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<T>, elseBranch: Collection<T>): Collection<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<T>

'this' @ [69:34] ==> <this> defined in kotlin.collections.convertToSetForSetOperation[ReceiverParameterDescriptorImpl]

'safeToConvertToSet' @ [69:39] ==> private fun <T> Collection<T>.safeToConvertToSet(): Boolean defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'toHashSet' @ [69:61] ==> public header fun <T> Iterable<T>.toHashSet(): HashSet<T> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'this' @ [69:78] ==> <this> defined in kotlin.collections.convertToSetForSetOperation[ReceiverParameterDescriptorImpl]

'toHashSet' @ [70:21] ==> public header fun <T> Iterable<T>.toHashSet(): HashSet<T> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'ArrayList' @ [78:18] ==> public constructor ArrayList<E>() defined in kotlin.collections.ArrayList[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> T

'this' @ [79:21] ==> <this> defined in kotlin.collections.flatten[ReceiverParameterDescriptorImpl]

'result' @ [80:9] ==> val result: ArrayList<T> defined in kotlin.collections.flatten[LocalVariableDescriptor]

'addAll' @ [80:16] ==> public fun <T> MutableCollection<in T>.addAll(elements: Iterable<T>): Boolean defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'element' @ [80:23] ==> val element: Iterable<T> defined in kotlin.collections.flatten[LocalVariableDescriptor]

'result' @ [82:12] ==> val result: ArrayList<T> defined in kotlin.collections.flatten[LocalVariableDescriptor]

'collectionSizeOrDefault' @ [91:24] ==> @PublishedApi internal fun <T> Iterable<Pair<T, R>>.collectionSizeOrDefault(default: Int): Int defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Pair<T, R>

'ArrayList' @ [92:17] ==> public constructor ArrayList<E>(capacity: Int) defined in kotlin.collections.ArrayList[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> T

'expectedSize' @ [92:30] ==> val expectedSize: Int defined in kotlin.collections.unzip[LocalVariableDescriptor]

'ArrayList' @ [93:17] ==> public constructor ArrayList<E>(capacity: Int) defined in kotlin.collections.ArrayList[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> R

'expectedSize' @ [93:30] ==> val expectedSize: Int defined in kotlin.collections.unzip[LocalVariableDescriptor]

'this' @ [94:18] ==> <this> defined in kotlin.collections.unzip[ReceiverParameterDescriptorImpl]

'listT' @ [95:9] ==> val listT: ArrayList<T> defined in kotlin.collections.unzip[LocalVariableDescriptor]

'add' @ [95:15] ==> public open header fun add(element: T): Boolean defined in kotlin.collections.ArrayList[SimpleFunctionDescriptorImpl]

'pair' @ [95:19] ==> val pair: Pair<T, R> defined in kotlin.collections.unzip[LocalVariableDescriptor]

'first' @ [95:24] ==> public final val first: T defined in kotlin.Pair[PropertyDescriptorImpl]

'listR' @ [96:9] ==> val listR: ArrayList<R> defined in kotlin.collections.unzip[LocalVariableDescriptor]

'add' @ [96:15] ==> public open header fun add(element: R): Boolean defined in kotlin.collections.ArrayList[SimpleFunctionDescriptorImpl]

'pair' @ [96:19] ==> val pair: Pair<T, R> defined in kotlin.collections.unzip[LocalVariableDescriptor]

'second' @ [96:24] ==> public final val second: R defined in kotlin.Pair[PropertyDescriptorImpl]

'listT' @ [98:12] ==> val listT: ArrayList<T> defined in kotlin.collections.unzip[LocalVariableDescriptor]

'listR' @ [98:21] ==> val listR: ArrayList<R> defined in kotlin.collections.unzip[LocalVariableDescriptor]

