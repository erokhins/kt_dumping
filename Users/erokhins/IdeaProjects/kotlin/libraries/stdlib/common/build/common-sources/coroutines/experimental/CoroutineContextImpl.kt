'SinceKotlin' @ [24:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'SinceKotlin' @ [30:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'initial' @ [33:81] ==> value-parameter initial: R defined in kotlin.coroutines.experimental.EmptyCoroutineContext.fold[ValueParameterDescriptorImpl]

'context' @ [34:77] ==> value-parameter context: CoroutineContext defined in kotlin.coroutines.experimental.EmptyCoroutineContext.plus[ValueParameterDescriptorImpl]

'this' @ [35:67] ==> <this> defined in kotlin.coroutines.experimental.EmptyCoroutineContext[LazyClassReceiverParameterDescriptor]

'this' @ [46:19] ==> <this> defined in kotlin.coroutines.experimental.CombinedContext[LazyClassReceiverParameterDescriptor]

'cur' @ [48:13] ==> var cur: CombinedContext defined in kotlin.coroutines.experimental.CombinedContext.get[LocalVariableDescriptor]

'element' @ [48:17] ==> public final val element: CoroutineContext.Element defined in kotlin.coroutines.experimental.CombinedContext[PropertyDescriptorImpl]

'key' @ [48:25] ==> value-parameter key: CoroutineContext.Key<E> defined in kotlin.coroutines.experimental.CombinedContext.get[ValueParameterDescriptorImpl]

'let' @ [48:31] ==> @InlineOnly public inline fun <T, R> E.let(block: (E) -> Nothing): Nothing defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> E
    <R> -> Nothing

'it' @ [48:44] ==> value-parameter it: E defined in kotlin.coroutines.experimental.CombinedContext.get.<anonymous>[ValueParameterDescriptorImpl]

'cur' @ [49:24] ==> var cur: CombinedContext defined in kotlin.coroutines.experimental.CombinedContext.get[LocalVariableDescriptor]

'left' @ [49:28] ==> public final val left: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext[PropertyDescriptorImpl]

'if (next is CombinedContext) {
                cur = next
            } else {
                return next[key]
            }' @ [50:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'next' @ [50:17] ==> val next: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext.get[LocalVariableDescriptor]

'cur' @ [51:17] ==> var cur: CombinedContext defined in kotlin.coroutines.experimental.CombinedContext.get[LocalVariableDescriptor]

'next' @ [51:23] ==> val next: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext.get[LocalVariableDescriptor]

'next' @ [53:24] ==> val next: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext.get[LocalVariableDescriptor]

'key' @ [53:29] ==> value-parameter key: CoroutineContext.Key<E> defined in kotlin.coroutines.experimental.CombinedContext.get[ValueParameterDescriptorImpl]

'invoke' @ [59:13] ==> public abstract operator fun invoke(p1: R, p2: CoroutineContext.Element): R defined in kotlin.Function2[FunctionInvokeDescriptor]

'left' @ [59:23] ==> public final val left: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext[PropertyDescriptorImpl]

'fold' @ [59:28] ==> public abstract fun <R> fold(initial: R, operation: (R, CoroutineContext.Element) -> R): R defined in kotlin.coroutines.experimental.CoroutineContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R

'initial' @ [59:33] ==> value-parameter initial: R defined in kotlin.coroutines.experimental.CombinedContext.fold[ValueParameterDescriptorImpl]

'operation' @ [59:42] ==> value-parameter operation: (R, CoroutineContext.Element) -> R defined in kotlin.coroutines.experimental.CombinedContext.fold[ValueParameterDescriptorImpl]

'element' @ [59:54] ==> public final val element: CoroutineContext.Element defined in kotlin.coroutines.experimental.CombinedContext[PropertyDescriptorImpl]

'element' @ [62:9] ==> public final val element: CoroutineContext.Element defined in kotlin.coroutines.experimental.CombinedContext[PropertyDescriptorImpl]

'key' @ [62:17] ==> value-parameter key: CoroutineContext.Key<*> defined in kotlin.coroutines.experimental.CombinedContext.minusKey[ValueParameterDescriptorImpl]

'let' @ [62:23] ==> @InlineOnly public inline fun <T, R> CoroutineContext.Element.let(block: (CoroutineContext.Element) -> Nothing): Nothing defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Element
    <R> -> Nothing

'left' @ [62:36] ==> public final val left: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext[PropertyDescriptorImpl]

'left' @ [63:23] ==> public final val left: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext[PropertyDescriptorImpl]

'minusKey' @ [63:28] ==> public abstract fun minusKey(key: CoroutineContext.Key<*>): CoroutineContext defined in kotlin.coroutines.experimental.CoroutineContext[SimpleFunctionDescriptorImpl]

'key' @ [63:37] ==> value-parameter key: CoroutineContext.Key<*> defined in kotlin.coroutines.experimental.CombinedContext.minusKey[ValueParameterDescriptorImpl]

'when {
            newLeft === left -> this
            newLeft === EmptyCoroutineContext -> element
            else -> CombinedContext(newLeft, element)
        }' @ [64:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CoroutineContext, entry1: CoroutineContext, entry2: CoroutineContext): CoroutineContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CoroutineContext

'newLeft' @ [65:13] ==> val newLeft: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext.minusKey[LocalVariableDescriptor]

'left' @ [65:25] ==> public final val left: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext[PropertyDescriptorImpl]

'this' @ [65:33] ==> <this> defined in kotlin.coroutines.experimental.CombinedContext[LazyClassReceiverParameterDescriptor]

'newLeft' @ [66:13] ==> val newLeft: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext.minusKey[LocalVariableDescriptor]

'EmptyCoroutineContext' @ [66:25] ==> @SinceKotlin public object EmptyCoroutineContext : CoroutineContext defined in kotlin.coroutines.experimental in file CoroutineContextImpl.kt[FakeCallableDescriptorForObject]

'element' @ [66:50] ==> public final val element: CoroutineContext.Element defined in kotlin.coroutines.experimental.CombinedContext[PropertyDescriptorImpl]

'CombinedContext' @ [67:21] ==> public constructor CombinedContext(left: CoroutineContext, element: CoroutineContext.Element) defined in kotlin.coroutines.experimental.CombinedContext[ClassConstructorDescriptorImpl]

'newLeft' @ [67:37] ==> val newLeft: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext.minusKey[LocalVariableDescriptor]

'element' @ [67:46] ==> public final val element: CoroutineContext.Element defined in kotlin.coroutines.experimental.CombinedContext[PropertyDescriptorImpl]

'if (left is CombinedContext) left.size() + 1 else 2' @ [72:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'left' @ [72:17] ==> public final val left: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext[PropertyDescriptorImpl]

'left' @ [72:42] ==> public final val left: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext[PropertyDescriptorImpl]

'size' @ [72:47] ==> private final fun size(): Int defined in kotlin.coroutines.experimental.CombinedContext[SimpleFunctionDescriptorImpl]

'get' @ [75:13] ==> public open fun <E : CoroutineContext.Element> get(key: CoroutineContext.Key<out CoroutineContext.Element>): CoroutineContext.Element? defined in kotlin.coroutines.experimental.CombinedContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <E : CoroutineContext.Element> -> Captured(*)

'element' @ [75:17] ==> value-parameter element: CoroutineContext.Element defined in kotlin.coroutines.experimental.CombinedContext.contains[ValueParameterDescriptorImpl]

'key' @ [75:25] ==> public abstract val key: CoroutineContext.Key<*> defined in kotlin.coroutines.experimental.CoroutineContext.Element[PropertyDescriptorImpl]

'element' @ [75:33] ==> value-parameter element: CoroutineContext.Element defined in kotlin.coroutines.experimental.CombinedContext.contains[ValueParameterDescriptorImpl]

'context' @ [78:19] ==> value-parameter context: CombinedContext defined in kotlin.coroutines.experimental.CombinedContext.containsAll[ValueParameterDescriptorImpl]

'!' @ [80:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'contains' @ [80:18] ==> private final fun contains(element: CoroutineContext.Element): Boolean defined in kotlin.coroutines.experimental.CombinedContext[SimpleFunctionDescriptorImpl]

'cur' @ [80:27] ==> var cur: CombinedContext defined in kotlin.coroutines.experimental.CombinedContext.containsAll[LocalVariableDescriptor]

'element' @ [80:31] ==> public final val element: CoroutineContext.Element defined in kotlin.coroutines.experimental.CombinedContext[PropertyDescriptorImpl]

'cur' @ [81:24] ==> var cur: CombinedContext defined in kotlin.coroutines.experimental.CombinedContext.containsAll[LocalVariableDescriptor]

'left' @ [81:28] ==> public final val left: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext[PropertyDescriptorImpl]

'if (next is CombinedContext) {
                cur = next
            } else {
                return contains(next as Element)
            }' @ [82:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'next' @ [82:17] ==> val next: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext.containsAll[LocalVariableDescriptor]

'cur' @ [83:17] ==> var cur: CombinedContext defined in kotlin.coroutines.experimental.CombinedContext.containsAll[LocalVariableDescriptor]

'next' @ [83:23] ==> val next: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext.containsAll[LocalVariableDescriptor]

'contains' @ [85:24] ==> private final fun contains(element: CoroutineContext.Element): Boolean defined in kotlin.coroutines.experimental.CombinedContext[SimpleFunctionDescriptorImpl]

'next' @ [85:33] ==> val next: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext.containsAll[LocalVariableDescriptor]

'this' @ [91:13] ==> <this> defined in kotlin.coroutines.experimental.CombinedContext[LazyClassReceiverParameterDescriptor]

'other' @ [91:22] ==> value-parameter other: Any? defined in kotlin.coroutines.experimental.CombinedContext.equals[ValueParameterDescriptorImpl]

'other' @ [91:31] ==> value-parameter other: Any? defined in kotlin.coroutines.experimental.CombinedContext.equals[ValueParameterDescriptorImpl]

'other' @ [91:59] ==> value-parameter other: Any? defined in kotlin.coroutines.experimental.CombinedContext.equals[ValueParameterDescriptorImpl]

'size' @ [91:65] ==> private final fun size(): Int defined in kotlin.coroutines.experimental.CombinedContext[SimpleFunctionDescriptorImpl]

'size' @ [91:75] ==> private final fun size(): Int defined in kotlin.coroutines.experimental.CombinedContext[SimpleFunctionDescriptorImpl]

'other' @ [91:85] ==> value-parameter other: Any? defined in kotlin.coroutines.experimental.CombinedContext.equals[ValueParameterDescriptorImpl]

'containsAll' @ [91:91] ==> private final fun containsAll(context: CombinedContext): Boolean defined in kotlin.coroutines.experimental.CombinedContext[SimpleFunctionDescriptorImpl]

'this' @ [91:103] ==> <this> defined in kotlin.coroutines.experimental.CombinedContext[LazyClassReceiverParameterDescriptor]

'left' @ [93:36] ==> public final val left: CoroutineContext defined in kotlin.coroutines.experimental.CombinedContext[PropertyDescriptorImpl]

'hashCode' @ [93:41] ==> public open fun hashCode(): Int defined in kotlin.coroutines.experimental.CoroutineContext[DeserializedSimpleFunctionDescriptor]

'element' @ [93:54] ==> public final val element: CoroutineContext.Element defined in kotlin.coroutines.experimental.CombinedContext[PropertyDescriptorImpl]

'hashCode' @ [93:62] ==> public open fun hashCode(): Int defined in kotlin.coroutines.experimental.CoroutineContext.Element[DeserializedSimpleFunctionDescriptor]

'+' @ [96:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'fold' @ [96:19] ==> public open fun <R> fold(initial: String, operation: (String, CoroutineContext.Element) -> String): String defined in kotlin.coroutines.experimental.CombinedContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> String

'if (acc.isEmpty()) element.toString() else acc + ", " + element' @ [97:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'acc' @ [97:21] ==> value-parameter acc: String defined in kotlin.coroutines.experimental.CombinedContext.toString.<anonymous>[ValueParameterDescriptorImpl]

'isEmpty' @ [97:25] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'element' @ [97:36] ==> value-parameter element: CoroutineContext.Element defined in kotlin.coroutines.experimental.CombinedContext.toString.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [97:44] ==> public open fun toString(): String defined in kotlin.coroutines.experimental.CoroutineContext.Element[DeserializedSimpleFunctionDescriptor]

'acc' @ [97:60] ==> value-parameter acc: String defined in kotlin.coroutines.experimental.CombinedContext.toString.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [97:73] ==> value-parameter element: CoroutineContext.Element defined in kotlin.coroutines.experimental.CombinedContext.toString.<anonymous>[ValueParameterDescriptorImpl]

