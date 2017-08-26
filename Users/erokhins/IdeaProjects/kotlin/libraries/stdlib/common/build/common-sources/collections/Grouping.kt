'SinceKotlin' @ [18:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'SinceKotlin' @ [40:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'aggregateTo' @ [44:12] ==> @SinceKotlin public inline fun <T, K, R, M : MutableMap<in K, R>> Grouping<T, K>.aggregateTo(destination: MutableMap<K, R>, operation: (K, R?, T, first: Boolean) -> R): MutableMap<K, R> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T
    <K> -> K
    <R> -> R
    <M : MutableMap<in K, R>> -> MutableMap<K, R>

'mutableMapOf' @ [44:24] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<K, R> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> R

'operation' @ [44:46] ==> value-parameter operation: (key: K, accumulator: R?, element: T, first: Boolean) -> R defined in kotlin.collections.aggregate[ValueParameterDescriptorImpl]

'SinceKotlin' @ [65:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'this' @ [70:15] ==> <this> defined in kotlin.collections.aggregateTo[ReceiverParameterDescriptorImpl]

'sourceIterator' @ [70:20] ==> public abstract fun sourceIterator(): Iterator<T> defined in kotlin.collections.Grouping[SimpleFunctionDescriptorImpl]

'keyOf' @ [71:19] ==> public abstract fun keyOf(element: T): K defined in kotlin.collections.Grouping[SimpleFunctionDescriptorImpl]

'e' @ [71:25] ==> val e: T defined in kotlin.collections.aggregateTo[LocalVariableDescriptor]

'destination' @ [72:27] ==> value-parameter destination: M defined in kotlin.collections.aggregateTo[ValueParameterDescriptorImpl]

'key' @ [72:39] ==> val key: K defined in kotlin.collections.aggregateTo[LocalVariableDescriptor]

'destination' @ [73:9] ==> value-parameter destination: M defined in kotlin.collections.aggregateTo[ValueParameterDescriptorImpl]

'key' @ [73:21] ==> val key: K defined in kotlin.collections.aggregateTo[LocalVariableDescriptor]

'invoke' @ [73:28] ==> public abstract operator fun invoke(key: @ParameterName K, accumulator: @ParameterName R?, element: @ParameterName T, first: @ParameterName Boolean): R defined in kotlin.Function4[FunctionInvokeDescriptor]

'key' @ [73:38] ==> val key: K defined in kotlin.collections.aggregateTo[LocalVariableDescriptor]

'accumulator' @ [73:43] ==> val accumulator: R? defined in kotlin.collections.aggregateTo[LocalVariableDescriptor]

'e' @ [73:56] ==> val e: T defined in kotlin.collections.aggregateTo[LocalVariableDescriptor]

'accumulator' @ [73:59] ==> val accumulator: R? defined in kotlin.collections.aggregateTo[LocalVariableDescriptor]

'!' @ [73:82] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'destination' @ [73:83] ==> value-parameter destination: M defined in kotlin.collections.aggregateTo[ValueParameterDescriptorImpl]

'containsKey' @ [73:95] ==> public abstract fun containsKey(key: K): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'key' @ [73:107] ==> val key: K defined in kotlin.collections.aggregateTo[LocalVariableDescriptor]

'destination' @ [75:12] ==> value-parameter destination: M defined in kotlin.collections.aggregateTo[ValueParameterDescriptorImpl]

'SinceKotlin' @ [95:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'Suppress' @ [100:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'aggregate' @ [101:9] ==> @SinceKotlin public inline fun <T, K, R> Grouping<T, K>.aggregate(operation: (K, R?, T, first: Boolean) -> R): Map<K, R> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T
    <K> -> K
    <R> -> R

'invoke' @ [101:43] ==> public abstract operator fun invoke(key: @ParameterName K, accumulator: @ParameterName R, element: @ParameterName T): R defined in kotlin.Function3[FunctionInvokeDescriptor]

'key' @ [101:53] ==> value-parameter key: K defined in kotlin.collections.fold.<anonymous>[ValueParameterDescriptorImpl]

'if (first) initialValueSelector(key, e) else acc as R' @ [101:58] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: @ParameterName R, elseBranch: @ParameterName R): @ParameterName R[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> [@kotlin.ParameterName] R

'first' @ [101:62] ==> value-parameter first: Boolean defined in kotlin.collections.fold.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [101:69] ==> public abstract operator fun invoke(key: @ParameterName K, element: @ParameterName T): R defined in kotlin.Function2[FunctionInvokeDescriptor]

'key' @ [101:90] ==> value-parameter key: K defined in kotlin.collections.fold.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [101:95] ==> value-parameter e: T defined in kotlin.collections.fold.<anonymous>[ValueParameterDescriptorImpl]

'acc' @ [101:103] ==> value-parameter acc: R? defined in kotlin.collections.fold.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [101:113] ==> value-parameter e: T defined in kotlin.collections.fold.<anonymous>[ValueParameterDescriptorImpl]

'SinceKotlin' @ [124:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'Suppress' @ [130:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'aggregateTo' @ [131:9] ==> @SinceKotlin public inline fun <T, K, R, M : MutableMap<in K, R>> Grouping<T, K>.aggregateTo(destination: M, operation: (K, R?, T, first: Boolean) -> R): M defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T
    <K> -> K
    <R> -> R
    <M : MutableMap<in K, R>> -> M

'destination' @ [131:21] ==> value-parameter destination: M defined in kotlin.collections.foldTo[ValueParameterDescriptorImpl]

'invoke' @ [131:58] ==> public abstract operator fun invoke(key: @ParameterName K, accumulator: @ParameterName R, element: @ParameterName T): R defined in kotlin.Function3[FunctionInvokeDescriptor]

'key' @ [131:68] ==> value-parameter key: K defined in kotlin.collections.foldTo.<anonymous>[ValueParameterDescriptorImpl]

'if (first) initialValueSelector(key, e) else acc as R' @ [131:73] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: @ParameterName R, elseBranch: @ParameterName R): @ParameterName R[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> [@kotlin.ParameterName] R

'first' @ [131:77] ==> value-parameter first: Boolean defined in kotlin.collections.foldTo.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [131:84] ==> public abstract operator fun invoke(key: @ParameterName K, element: @ParameterName T): R defined in kotlin.Function2[FunctionInvokeDescriptor]

'key' @ [131:105] ==> value-parameter key: K defined in kotlin.collections.foldTo.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [131:110] ==> value-parameter e: T defined in kotlin.collections.foldTo.<anonymous>[ValueParameterDescriptorImpl]

'acc' @ [131:118] ==> value-parameter acc: R? defined in kotlin.collections.foldTo.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [131:128] ==> value-parameter e: T defined in kotlin.collections.foldTo.<anonymous>[ValueParameterDescriptorImpl]

'SinceKotlin' @ [145:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'Suppress' @ [150:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'aggregate' @ [151:9] ==> @SinceKotlin public inline fun <T, K, R> Grouping<T, K>.aggregate(operation: (K, R?, T, first: Boolean) -> R): Map<K, R> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T
    <K> -> K
    <R> -> R

'invoke' @ [151:41] ==> public abstract operator fun invoke(accumulator: @ParameterName R, element: @ParameterName T): R defined in kotlin.Function2[FunctionInvokeDescriptor]

'if (first) initialValue else acc as R' @ [151:51] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: @ParameterName R, elseBranch: @ParameterName R): @ParameterName R[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> [@kotlin.ParameterName] R

'first' @ [151:55] ==> value-parameter first: Boolean defined in kotlin.collections.fold.<anonymous>[ValueParameterDescriptorImpl]

'initialValue' @ [151:62] ==> value-parameter initialValue: R defined in kotlin.collections.fold[ValueParameterDescriptorImpl]

'acc' @ [151:80] ==> value-parameter acc: R? defined in kotlin.collections.fold.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [151:90] ==> value-parameter e: T defined in kotlin.collections.fold.<anonymous>[ValueParameterDescriptorImpl]

'SinceKotlin' @ [168:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'Suppress' @ [174:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'aggregateTo' @ [175:9] ==> @SinceKotlin public inline fun <T, K, R, M : MutableMap<in K, R>> Grouping<T, K>.aggregateTo(destination: M, operation: (K, R?, T, first: Boolean) -> R): M defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T
    <K> -> K
    <R> -> R
    <M : MutableMap<in K, R>> -> M

'destination' @ [175:21] ==> value-parameter destination: M defined in kotlin.collections.foldTo[ValueParameterDescriptorImpl]

'invoke' @ [175:56] ==> public abstract operator fun invoke(accumulator: @ParameterName R, element: @ParameterName T): R defined in kotlin.Function2[FunctionInvokeDescriptor]

'if (first) initialValue else acc as R' @ [175:66] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: @ParameterName R, elseBranch: @ParameterName R): @ParameterName R[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> [@kotlin.ParameterName] R

'first' @ [175:70] ==> value-parameter first: Boolean defined in kotlin.collections.foldTo.<anonymous>[ValueParameterDescriptorImpl]

'initialValue' @ [175:77] ==> value-parameter initialValue: R defined in kotlin.collections.foldTo[ValueParameterDescriptorImpl]

'acc' @ [175:95] ==> value-parameter acc: R? defined in kotlin.collections.foldTo.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [175:105] ==> value-parameter e: T defined in kotlin.collections.foldTo.<anonymous>[ValueParameterDescriptorImpl]

'SinceKotlin' @ [192:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'aggregate' @ [196:9] ==> @SinceKotlin public inline fun <T, K, R> Grouping<T, K>.aggregate(operation: (K, S?, T, first: Boolean) -> S): Map<K, S> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T
    <K> -> K
    <R> -> S

'Suppress' @ [197:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'if (first) e else operation(key, acc as S, e)' @ [198:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: S, elseBranch: S): S[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> S

'first' @ [198:17] ==> value-parameter first: Boolean defined in kotlin.collections.reduce.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [198:24] ==> value-parameter e: T defined in kotlin.collections.reduce.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [198:31] ==> public abstract operator fun invoke(key: @ParameterName K, accumulator: @ParameterName S, element: @ParameterName T): S defined in kotlin.Function3[FunctionInvokeDescriptor]

'key' @ [198:41] ==> value-parameter key: K defined in kotlin.collections.reduce.<anonymous>[ValueParameterDescriptorImpl]

'acc' @ [198:46] ==> value-parameter acc: S? defined in kotlin.collections.reduce.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [198:56] ==> value-parameter e: T defined in kotlin.collections.reduce.<anonymous>[ValueParameterDescriptorImpl]

'SinceKotlin' @ [218:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'aggregateTo' @ [223:9] ==> @SinceKotlin public inline fun <T, K, R, M : MutableMap<in K, S>> Grouping<T, K>.aggregateTo(destination: M, operation: (K, S?, T, first: Boolean) -> S): M defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T
    <K> -> K
    <R> -> S
    <M : MutableMap<in K, R>> -> M

'destination' @ [223:21] ==> value-parameter destination: M defined in kotlin.collections.reduceTo[ValueParameterDescriptorImpl]

'Suppress' @ [224:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'if (first) e else operation(key, acc as S, e)' @ [225:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: S, elseBranch: S): S[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> S

'first' @ [225:17] ==> value-parameter first: Boolean defined in kotlin.collections.reduceTo.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [225:24] ==> value-parameter e: T defined in kotlin.collections.reduceTo.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [225:31] ==> public abstract operator fun invoke(key: @ParameterName K, accumulator: @ParameterName S, element: @ParameterName T): S defined in kotlin.Function3[FunctionInvokeDescriptor]

'key' @ [225:41] ==> value-parameter key: K defined in kotlin.collections.reduceTo.<anonymous>[ValueParameterDescriptorImpl]

'acc' @ [225:46] ==> value-parameter acc: S? defined in kotlin.collections.reduceTo.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [225:56] ==> value-parameter e: T defined in kotlin.collections.reduceTo.<anonymous>[ValueParameterDescriptorImpl]

'SinceKotlin' @ [255:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'foldTo' @ [257:9] ==> @SinceKotlin public inline fun <T, K, R, M : MutableMap<in K, Int>> Grouping<T, K>.foldTo(destination: M, initialValue: Int, operation: (Int, T) -> Int): M defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T
    <K> -> K
    <R> -> Int
    <M : MutableMap<in K, R>> -> M

'destination' @ [257:16] ==> value-parameter destination: M defined in kotlin.collections.eachCountTo[ValueParameterDescriptorImpl]

'acc' @ [257:44] ==> value-parameter acc: Int defined in kotlin.collections.eachCountTo.<anonymous>[ValueParameterDescriptorImpl]

