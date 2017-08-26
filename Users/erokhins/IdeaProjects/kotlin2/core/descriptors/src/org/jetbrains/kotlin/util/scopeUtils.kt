'collection' @ [28:9] ==> value-parameter collection: Collection<T> defined in org.jetbrains.kotlin.util.collectionUtils.concat[ValueParameterDescriptorImpl]

'isEmpty' @ [28:20] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'this' @ [29:16] ==> <this> defined in org.jetbrains.kotlin.util.collectionUtils.concat[ReceiverParameterDescriptorImpl]

'this' @ [31:9] ==> <this> defined in org.jetbrains.kotlin.util.collectionUtils.concat[ReceiverParameterDescriptorImpl]

'collection' @ [32:16] ==> value-parameter collection: Collection<T> defined in org.jetbrains.kotlin.util.collectionUtils.concat[ValueParameterDescriptorImpl]

'this' @ [34:9] ==> <this> defined in org.jetbrains.kotlin.util.collectionUtils.concat[ReceiverParameterDescriptorImpl]

'addAll' @ [35:9] ==> public open fun addAll(elements: Collection<T>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'collection' @ [35:16] ==> value-parameter collection: Collection<T> defined in org.jetbrains.kotlin.util.collectionUtils.concat[ValueParameterDescriptorImpl]

'this' @ [36:16] ==> <this> defined in org.jetbrains.kotlin.util.collectionUtils.concat[ReceiverParameterDescriptorImpl]

'LinkedHashSet' @ [39:18] ==> public constructor LinkedHashSet<E : (Any..Any?)>(p0: (MutableCollection<out (T..T?)>..Collection<(T..T?)>?)) defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (T..T?)

'this' @ [39:32] ==> <this> defined in org.jetbrains.kotlin.util.collectionUtils.concat[ReceiverParameterDescriptorImpl]

'result' @ [40:5] ==> val result: LinkedHashSet<(T..T?)> defined in org.jetbrains.kotlin.util.collectionUtils.concat[LocalVariableDescriptor]

'addAll' @ [40:12] ==> public open fun addAll(elements: Collection<(T..T?)>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'collection' @ [40:19] ==> value-parameter collection: Collection<T> defined in org.jetbrains.kotlin.util.collectionUtils.concat[ValueParameterDescriptorImpl]

'result' @ [41:12] ==> val result: LinkedHashSet<(T..T?)> defined in org.jetbrains.kotlin.util.collectionUtils.concat[LocalVariableDescriptor]

'if (c1 == null || c1.isEmpty())
        c2
    else if (c2 == null || c2.isEmpty())
        c1
    else {
        val result = LinkedHashSet<T>()
        result.addAll(c1)
        result.addAll(c2)
        result
    }' @ [45:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<T>?, elseBranch: Collection<T>?): Collection<T>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<T>?

'c1' @ [45:22] ==> value-parameter c1: Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils.concatInOrder[ValueParameterDescriptorImpl]

'c1' @ [45:36] ==> value-parameter c1: Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils.concatInOrder[ValueParameterDescriptorImpl]

'isEmpty' @ [45:39] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'c2' @ [46:9] ==> value-parameter c2: Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils.concatInOrder[ValueParameterDescriptorImpl]

'if (c2 == null || c2.isEmpty())
        c1
    else {
        val result = LinkedHashSet<T>()
        result.addAll(c1)
        result.addAll(c2)
        result
    }' @ [47:10] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<T>, elseBranch: Collection<T>): Collection<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<T>

'c2' @ [47:14] ==> value-parameter c2: Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils.concatInOrder[ValueParameterDescriptorImpl]

'c2' @ [47:28] ==> value-parameter c2: Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils.concatInOrder[ValueParameterDescriptorImpl]

'isEmpty' @ [47:31] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'c1' @ [48:9] ==> value-parameter c1: Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils.concatInOrder[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [50:22] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> T

'result' @ [51:9] ==> val result: LinkedHashSet<T> defined in org.jetbrains.kotlin.util.collectionUtils.concatInOrder[LocalVariableDescriptor]

'addAll' @ [51:16] ==> public open fun addAll(elements: Collection<T>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'c1' @ [51:23] ==> value-parameter c1: Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils.concatInOrder[ValueParameterDescriptorImpl]

'result' @ [52:9] ==> val result: LinkedHashSet<T> defined in org.jetbrains.kotlin.util.collectionUtils.concatInOrder[LocalVariableDescriptor]

'addAll' @ [52:16] ==> public open fun addAll(elements: Collection<T>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'c2' @ [52:23] ==> value-parameter c2: Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils.concatInOrder[ValueParameterDescriptorImpl]

'result' @ [53:9] ==> val result: LinkedHashSet<T> defined in org.jetbrains.kotlin.util.collectionUtils.concatInOrder[LocalVariableDescriptor]

'result' @ [55:12] ==> val result: Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils.concatInOrder[LocalVariableDescriptor]

'emptySet' @ [55:22] ==> public fun <T> emptySet(): Set<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'scopes' @ [59:9] ==> value-parameter scopes: List<Scope> defined in org.jetbrains.kotlin.util.collectionUtils.getFromAllScopes[ValueParameterDescriptorImpl]

'isEmpty' @ [59:16] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'emptySet' @ [59:34] ==> public fun <T> emptySet(): Set<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'scopes' @ [61:19] ==> value-parameter scopes: List<Scope> defined in org.jetbrains.kotlin.util.collectionUtils.getFromAllScopes[ValueParameterDescriptorImpl]

'result' @ [62:9] ==> var result: Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils.getFromAllScopes[LocalVariableDescriptor]

'result' @ [62:18] ==> var result: Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils.getFromAllScopes[LocalVariableDescriptor]

'concat' @ [62:25] ==> public fun <T> Collection<T>?.concat(collection: Collection<T>): Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'invoke' @ [62:32] ==> public abstract operator fun invoke(p1: Scope): Collection<T> defined in kotlin.Function1[FunctionInvokeDescriptor]

'scope' @ [62:41] ==> val scope: Scope defined in org.jetbrains.kotlin.util.collectionUtils.getFromAllScopes[LocalVariableDescriptor]

'result' @ [64:12] ==> var result: Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils.getFromAllScopes[LocalVariableDescriptor]

'emptySet' @ [64:22] ==> public fun <T> emptySet(): Set<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'invoke' @ [68:34] ==> public abstract operator fun invoke(p1: Scope): Collection<T> defined in kotlin.Function1[FunctionInvokeDescriptor]

'firstScope' @ [68:43] ==> value-parameter firstScope: Scope defined in org.jetbrains.kotlin.util.collectionUtils.getFromAllScopes[ValueParameterDescriptorImpl]

'restScopes' @ [69:19] ==> value-parameter restScopes: List<Scope> defined in org.jetbrains.kotlin.util.collectionUtils.getFromAllScopes[ValueParameterDescriptorImpl]

'result' @ [70:9] ==> var result: Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils.getFromAllScopes[LocalVariableDescriptor]

'result' @ [70:18] ==> var result: Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils.getFromAllScopes[LocalVariableDescriptor]

'concat' @ [70:25] ==> public fun <T> Collection<T>?.concat(collection: Collection<T>): Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'invoke' @ [70:32] ==> public abstract operator fun invoke(p1: Scope): Collection<T> defined in kotlin.Function1[FunctionInvokeDescriptor]

'scope' @ [70:41] ==> val scope: Scope defined in org.jetbrains.kotlin.util.collectionUtils.getFromAllScopes[LocalVariableDescriptor]

'result' @ [72:12] ==> var result: Collection<T>? defined in org.jetbrains.kotlin.util.collectionUtils.getFromAllScopes[LocalVariableDescriptor]

'emptySet' @ [72:22] ==> public fun <T> emptySet(): Set<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'scopes' @ [78:19] ==> value-parameter scopes: List<Scope> defined in org.jetbrains.kotlin.util.collectionUtils.getFirstClassifierDiscriminateHeaders[ValueParameterDescriptorImpl]

'invoke' @ [79:25] ==> public abstract operator fun invoke(p1: Scope): T? defined in kotlin.Function1[FunctionInvokeDescriptor]

'scope' @ [79:34] ==> val scope: Scope defined in org.jetbrains.kotlin.util.collectionUtils.getFirstClassifierDiscriminateHeaders[LocalVariableDescriptor]

'newResult' @ [80:13] ==> val newResult: T? defined in org.jetbrains.kotlin.util.collectionUtils.getFirstClassifierDiscriminateHeaders[LocalVariableDescriptor]

'if (newResult is ClassifierDescriptorWithTypeParameters && newResult.isHeader) {
                if (result == null) result = newResult
            }
            // this class is Impl or usual class
            else {
                return newResult
            }' @ [81:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'newResult' @ [81:17] ==> val newResult: T? defined in org.jetbrains.kotlin.util.collectionUtils.getFirstClassifierDiscriminateHeaders[LocalVariableDescriptor]

'newResult' @ [81:72] ==> val newResult: T? defined in org.jetbrains.kotlin.util.collectionUtils.getFirstClassifierDiscriminateHeaders[LocalVariableDescriptor]

'isHeader' @ [81:82] ==> public final val ClassifierDescriptorWithTypeParameters.isHeader: Boolean[MyPropertyDescriptor]

'result' @ [82:21] ==> var result: T? defined in org.jetbrains.kotlin.util.collectionUtils.getFirstClassifierDiscriminateHeaders[LocalVariableDescriptor]

'result' @ [82:37] ==> var result: T? defined in org.jetbrains.kotlin.util.collectionUtils.getFirstClassifierDiscriminateHeaders[LocalVariableDescriptor]

'newResult' @ [82:46] ==> val newResult: T? defined in org.jetbrains.kotlin.util.collectionUtils.getFirstClassifierDiscriminateHeaders[LocalVariableDescriptor]

'newResult' @ [86:24] ==> val newResult: T? defined in org.jetbrains.kotlin.util.collectionUtils.getFirstClassifierDiscriminateHeaders[LocalVariableDescriptor]

'result' @ [90:12] ==> var result: T? defined in org.jetbrains.kotlin.util.collectionUtils.getFirstClassifierDiscriminateHeaders[LocalVariableDescriptor]

