'firstChild' @ [36:21] ==> public final val PsiElement.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (first != null) PsiChildRange(first, lastChild) else PsiChildRange.EMPTY' @ [37:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiChildRange, elseBranch: PsiChildRange): PsiChildRange[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiChildRange

'first' @ [37:20] ==> val first: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.<get-allChildren>[LocalVariableDescriptor]

'PsiChildRange' @ [37:35] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[ClassConstructorDescriptorImpl]

'first' @ [37:49] ==> val first: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.<get-allChildren>[LocalVariableDescriptor]

'lastChild' @ [37:56] ==> public final val PsiElement.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'EMPTY' @ [37:86] ==> public final val EMPTY: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange.Companion[PropertyDescriptorImpl]

'this@siblings' @ [43:37] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.siblings[ReceiverParameterDescriptorImpl]

'!' @ [46:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'withItself' @ [46:26] ==> value-parameter withItself: Boolean = ... defined in org.jetbrains.kotlin.psi.psiUtil.siblings[ValueParameterDescriptorImpl]

'next' @ [46:38] ==> public open fun next(): PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.siblings.<no name provided>.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'next' @ [49:51] ==> var next: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.siblings.<no name provided>.iterator[LocalVariableDescriptor]

'next' @ [51:34] ==> var next: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.siblings.<no name provided>.iterator[LocalVariableDescriptor]

'NoSuchElementException' @ [51:48] ==> public constructor NoSuchElementException() defined in java.util.NoSuchElementException[JavaClassConstructorDescriptor]

'next' @ [52:21] ==> var next: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.siblings.<no name provided>.iterator[LocalVariableDescriptor]

'if (forward) result.nextSibling else result.prevSibling' @ [52:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'forward' @ [52:32] ==> value-parameter forward: Boolean = ... defined in org.jetbrains.kotlin.psi.psiUtil.siblings[ValueParameterDescriptorImpl]

'result' @ [52:41] ==> val result: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.siblings.<no name provided>.iterator.<no name provided>.next[LocalVariableDescriptor]

'nextSibling' @ [52:48] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'result' @ [52:65] ==> val result: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.siblings.<no name provided>.iterator.<no name provided>.next[LocalVariableDescriptor]

'prevSibling' @ [52:72] ==> public final val PsiElement.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'result' @ [53:28] ==> val result: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.siblings.<no name provided>.iterator.<no name provided>.next[LocalVariableDescriptor]

'generateSequence' @ [61:13] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: PsiElement?, nextFunction: (PsiElement) -> PsiElement?): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiElement

'this' @ [61:30] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.parentsWithSelf[ReceiverParameterDescriptorImpl]

'if (it is PsiFile) null else it.parent' @ [61:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'it' @ [61:42] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.<get-parentsWithSelf>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [61:67] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.<get-parentsWithSelf>.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [61:70] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parentsWithSelf' @ [64:13] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'drop' @ [64:29] ==> public fun <T> Sequence<PsiElement>.drop(n: Int): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'prevLeaf' @ [67:23] ==> @Nullable public open fun prevLeaf(@NotNull p0: PsiElement, p1: Boolean): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'this' @ [67:32] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.prevLeaf[ReceiverParameterDescriptorImpl]

'skipEmptyElements' @ [67:38] ==> value-parameter skipEmptyElements: Boolean = ... defined in org.jetbrains.kotlin.psi.psiUtil.prevLeaf[ValueParameterDescriptorImpl]

'nextLeaf' @ [70:23] ==> @Nullable public open fun nextLeaf(p0: (PsiElement..PsiElement?), p1: Boolean): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'this' @ [70:32] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.nextLeaf[ReceiverParameterDescriptorImpl]

'skipEmptyElements' @ [70:38] ==> value-parameter skipEmptyElements: Boolean = ... defined in org.jetbrains.kotlin.psi.psiUtil.nextLeaf[ValueParameterDescriptorImpl]

'generateSequence' @ [73:13] ==> public fun <T : Any> generateSequence(seedFunction: () -> PsiElement?, nextFunction: (PsiElement) -> PsiElement?): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiElement

'prevLeaf' @ [73:32] ==> public fun PsiElement.prevLeaf(skipEmptyElements: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [73:48] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.<get-prevLeafs>.<anonymous>[ValueParameterDescriptorImpl]

'prevLeaf' @ [73:51] ==> public fun PsiElement.prevLeaf(skipEmptyElements: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'generateSequence' @ [76:13] ==> public fun <T : Any> generateSequence(seedFunction: () -> PsiElement?, nextFunction: (PsiElement) -> PsiElement?): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiElement

'nextLeaf' @ [76:32] ==> public fun PsiElement.nextLeaf(skipEmptyElements: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [76:48] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.<get-nextLeafs>.<anonymous>[ValueParameterDescriptorImpl]

'nextLeaf' @ [76:51] ==> public fun PsiElement.nextLeaf(skipEmptyElements: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'prevLeaf' @ [79:16] ==> public fun PsiElement.prevLeaf(skipEmptyElements: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'leaf' @ [80:12] ==> var leaf: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.prevLeaf[LocalVariableDescriptor]

'!' @ [80:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [80:29] ==> public abstract operator fun invoke(p1: PsiElement): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'leaf' @ [80:36] ==> var leaf: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.prevLeaf[LocalVariableDescriptor]

'leaf' @ [81:9] ==> var leaf: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.prevLeaf[LocalVariableDescriptor]

'leaf' @ [81:16] ==> var leaf: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.prevLeaf[LocalVariableDescriptor]

'prevLeaf' @ [81:21] ==> public fun PsiElement.prevLeaf(skipEmptyElements: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'leaf' @ [83:12] ==> var leaf: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.prevLeaf[LocalVariableDescriptor]

'nextLeaf' @ [87:16] ==> public fun PsiElement.nextLeaf(skipEmptyElements: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'leaf' @ [88:12] ==> var leaf: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.nextLeaf[LocalVariableDescriptor]

'!' @ [88:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [88:29] ==> public abstract operator fun invoke(p1: PsiElement): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'leaf' @ [88:36] ==> var leaf: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.nextLeaf[LocalVariableDescriptor]

'leaf' @ [89:9] ==> var leaf: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.nextLeaf[LocalVariableDescriptor]

'leaf' @ [89:16] ==> var leaf: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.nextLeaf[LocalVariableDescriptor]

'nextLeaf' @ [89:21] ==> public fun PsiElement.nextLeaf(skipEmptyElements: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'leaf' @ [91:12] ==> var leaf: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.nextLeaf[LocalVariableDescriptor]

'if (strict) parent else this' @ [97:19] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'strict' @ [97:23] ==> value-parameter strict: Boolean = ... defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypesAndPredicate[ValueParameterDescriptorImpl]

'parent' @ [97:31] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [97:43] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypesAndPredicate[ReceiverParameterDescriptorImpl]

'element' @ [98:12] ==> var element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypesAndPredicate[LocalVariableDescriptor]

'Suppress' @ [99:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when {
            (parentClasses.isEmpty() || parentClasses.any { parentClass -> parentClass.isInstance(element) }) && predicate(element as T) ->
                return element
            element is PsiFile ->
                return null
            else ->
                element = element.parent
        }' @ [100:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parentClasses' @ [101:14] ==> value-parameter vararg parentClasses: Class<T> defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypesAndPredicate[ValueParameterDescriptorImpl]

'isEmpty' @ [101:28] ==> @InlineOnly public inline fun <T> Array<out Class<T>>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<T>

'parentClasses' @ [101:41] ==> value-parameter vararg parentClasses: Class<T> defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypesAndPredicate[ValueParameterDescriptorImpl]

'any' @ [101:55] ==> public inline fun <T> Array<out Class<T>>.any(predicate: (Class<T>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<T>

'parentClass' @ [101:76] ==> value-parameter parentClass: Class<T> defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypesAndPredicate.<anonymous>[ValueParameterDescriptorImpl]

'isInstance' @ [101:88] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'element' @ [101:99] ==> var element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypesAndPredicate[LocalVariableDescriptor]

'invoke' @ [101:114] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [101:124] ==> var element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypesAndPredicate[LocalVariableDescriptor]

'element' @ [102:24] ==> var element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypesAndPredicate[LocalVariableDescriptor]

'element' @ [103:13] ==> var element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypesAndPredicate[LocalVariableDescriptor]

'element' @ [106:17] ==> var element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypesAndPredicate[LocalVariableDescriptor]

'element' @ [106:27] ==> var element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypesAndPredicate[LocalVariableDescriptor]

'parent' @ [106:35] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getParentOfType' @ [114:24] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(T..T?)>, p2: Boolean): T? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (T..T?)

'this' @ [114:40] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getNonStrictParentOfType[ReceiverParameterDescriptorImpl]

'parentClass' @ [114:46] ==> value-parameter parentClass: Class<T> defined in org.jetbrains.kotlin.psi.psiUtil.getNonStrictParentOfType[ValueParameterDescriptorImpl]

'getParentOfType' @ [118:24] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(T..T?)>, p2: Boolean): T? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (T..T?)

'this' @ [118:40] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfType[ReceiverParameterDescriptorImpl]

'java' @ [118:55] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'strict' @ [118:61] ==> value-parameter strict: Boolean defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfType[ValueParameterDescriptorImpl]

'getParentOfType' @ [122:24] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(T..T?)>, p2: Boolean): T? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (T..T?)

'this' @ [122:40] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getStrictParentOfType[ReceiverParameterDescriptorImpl]

'java' @ [122:55] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'getParentOfType' @ [126:24] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(T..T?)>, p2: Boolean): T? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (T..T?)

'this' @ [126:40] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getNonStrictParentOfType[ReceiverParameterDescriptorImpl]

'java' @ [126:55] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'getTopmostParentOfType' @ [130:24] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getTopmostParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(T..T?)>): T? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (T..T?)

'this' @ [130:47] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getTopmostParentOfType[ReceiverParameterDescriptorImpl]

'java' @ [130:62] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'getChildOfType' @ [134:24] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getChildOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(T..T?)>): T? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (T..T?)

'this' @ [134:39] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getChildOfType[ReceiverParameterDescriptorImpl]

'java' @ [134:54] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'?:' @ [138:12] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Array<T>?, right: Array<T>): Array<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Array<T>

'getChildrenOfType' @ [138:24] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getChildrenOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(T..T?)>): (Array<(T..T?)>?..Array<out (T..T?)>?) defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (T..T?)

'this' @ [138:42] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getChildrenOfType[ReceiverParameterDescriptorImpl]

'java' @ [138:57] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'arrayOf' @ [138:66] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: T): Array<T> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> T

'siblings' @ [142:12] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'withItself' @ [142:34] ==> value-parameter withItself: Boolean = ... defined in org.jetbrains.kotlin.psi.psiUtil.getNextSiblingIgnoringWhitespaceAndComments[ValueParameterDescriptorImpl]

'filter' @ [142:46] ==> public fun <T> Sequence<PsiElement>.filter(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [142:55] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getNextSiblingIgnoringWhitespaceAndComments.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [142:79] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getNextSiblingIgnoringWhitespaceAndComments.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [142:99] ==> public fun <T> Sequence<PsiElement>.firstOrNull(): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'siblings' @ [146:12] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'withItself' @ [146:34] ==> value-parameter withItself: Boolean = ... defined in org.jetbrains.kotlin.psi.psiUtil.getNextSiblingIgnoringWhitespace[ValueParameterDescriptorImpl]

'filter' @ [146:46] ==> public fun <T> Sequence<PsiElement>.filter(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [146:55] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getNextSiblingIgnoringWhitespace.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [146:78] ==> public fun <T> Sequence<PsiElement>.firstOrNull(): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'siblings' @ [150:12] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'withItself' @ [150:34] ==> value-parameter withItself: Boolean = ... defined in org.jetbrains.kotlin.psi.psiUtil.getPrevSiblingIgnoringWhitespaceAndComments[ValueParameterDescriptorImpl]

'filter' @ [150:63] ==> public fun <T> Sequence<PsiElement>.filter(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [150:72] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getPrevSiblingIgnoringWhitespaceAndComments.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [150:96] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getPrevSiblingIgnoringWhitespaceAndComments.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [150:116] ==> public fun <T> Sequence<PsiElement>.firstOrNull(): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'getNextSiblingOfType' @ [153:77] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getNextSiblingOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(T..T?)>): T? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (T..T?)

'this' @ [153:98] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.nextSiblingOfSameType[ReceiverParameterDescriptorImpl]

'java' @ [153:113] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'getPrevSiblingOfType' @ [155:77] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getPrevSiblingOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(T..T?)>): T? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (T..T?)

'this' @ [155:98] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.prevSiblingOfSameType[ReceiverParameterDescriptorImpl]

'java' @ [155:113] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'isAncestor' @ [158:24] ==> @Contract public open fun isAncestor(@Nullable p0: PsiElement?, @NotNull p1: PsiElement, p2: Boolean): Boolean defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'this' @ [158:35] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.isAncestor[ReceiverParameterDescriptorImpl]

'element' @ [158:41] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.isAncestor[ValueParameterDescriptorImpl]

'strict' @ [158:50] ==> value-parameter strict: Boolean = ... defined in org.jetbrains.kotlin.psi.psiUtil.isAncestor[ValueParameterDescriptorImpl]

'if (branch().isAncestor(element)) this else null' @ [162:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'invoke' @ [162:16] ==> public abstract operator fun T.invoke(): PsiElement? defined in kotlin.Function1[FunctionInvokeDescriptor]

'isAncestor' @ [162:25] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [162:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getIfChildIsInBranch[ValueParameterDescriptorImpl]

'this' @ [162:46] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getIfChildIsInBranch[ReceiverParameterDescriptorImpl]

'if (branches().any { it.isAncestor(element) }) this else null' @ [166:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'invoke' @ [166:16] ==> public abstract operator fun T.invoke(): Iterable<PsiElement?> defined in kotlin.Function1[FunctionInvokeDescriptor]

'any' @ [166:27] ==> public inline fun <T> Iterable<PsiElement?>.any(predicate: (PsiElement?) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement?

'it' @ [166:33] ==> value-parameter it: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.getIfChildIsInBranches.<anonymous>[ValueParameterDescriptorImpl]

'isAncestor' @ [166:36] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [166:47] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getIfChildIsInBranches[ValueParameterDescriptorImpl]

'this' @ [166:59] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getIfChildIsInBranches[ReceiverParameterDescriptorImpl]

'getParentOfType' @ [170:12] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): T? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> T

'strict' @ [170:31] ==> value-parameter strict: Boolean = ... defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypeAndBranch[ValueParameterDescriptorImpl]

'getIfChildIsInBranch' @ [170:40] ==> public fun <T : PsiElement> T.getIfChildIsInBranch(element: PsiElement, branch: T.() -> PsiElement?): T? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : PsiElement> -> T

'this' @ [170:61] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypeAndBranch[ReceiverParameterDescriptorImpl]

'branch' @ [170:67] ==> value-parameter noinline branch: T.() -> PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypeAndBranch[ValueParameterDescriptorImpl]

'getParentOfType' @ [174:12] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): T? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> T

'strict' @ [174:31] ==> value-parameter strict: Boolean = ... defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypeAndBranches[ValueParameterDescriptorImpl]

'getIfChildIsInBranches' @ [174:40] ==> public fun <T : PsiElement> T.getIfChildIsInBranches(element: PsiElement, branches: T.() -> Iterable<PsiElement?>): T? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : PsiElement> -> T

'this' @ [174:63] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypeAndBranches[ReceiverParameterDescriptorImpl]

'branches' @ [174:69] ==> value-parameter noinline branches: T.() -> Iterable<PsiElement?> defined in org.jetbrains.kotlin.psi.psiUtil.getParentOfTypeAndBranches[ValueParameterDescriptorImpl]

'parent' @ [178:18] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (parent == container) this else parent?.getOutermostParentContainedIn(container)' @ [179:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'parent' @ [179:16] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getOutermostParentContainedIn[LocalVariableDescriptor]

'container' @ [179:26] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getOutermostParentContainedIn[ValueParameterDescriptorImpl]

'this' @ [179:37] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getOutermostParentContainedIn[ReceiverParameterDescriptorImpl]

'parent' @ [179:47] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getOutermostParentContainedIn[LocalVariableDescriptor]

'getOutermostParentContainedIn' @ [179:55] ==> public tailrec fun PsiElement.getOutermostParentContainedIn(container: PsiElement): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'container' @ [179:85] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getOutermostParentContainedIn[ValueParameterDescriptorImpl]

'elements' @ [182:70] ==> value-parameter elements: Iterable<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil.isInsideOf[ValueParameterDescriptorImpl]

'any' @ [182:79] ==> public inline fun <T> Iterable<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [182:85] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.isInsideOf.<anonymous>[ValueParameterDescriptorImpl]

'isAncestor' @ [182:88] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [182:99] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.isInsideOf[ReceiverParameterDescriptorImpl]

'first' @ [185:9] ==> public final val first: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'this' @ [185:31] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.trimWhiteSpaces[ReceiverParameterDescriptorImpl]

'PsiChildRange' @ [186:12] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[ClassConstructorDescriptorImpl]

'first' @ [186:26] ==> public final val first: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'siblings' @ [186:32] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [186:43] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [186:57] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.trimWhiteSpaces.<anonymous>[ValueParameterDescriptorImpl]

'last' @ [186:81] ==> public final val last: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'siblings' @ [186:88] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [186:114] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [186:128] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.trimWhiteSpaces.<anonymous>[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [192:5] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(crossinline canGoInside: (PsiElement) -> Boolean, noinline action: (T) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> T

'action' @ [192:39] ==> value-parameter noinline action: (T) -> Unit defined in org.jetbrains.kotlin.psi.psiUtil.forEachDescendantOfType[ValueParameterDescriptorImpl]

'this' @ [196:5] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.forEachDescendantOfType[ReceiverParameterDescriptorImpl]

'accept' @ [196:10] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'PsiRecursiveElementVisitor' @ [196:26] ==> protected/*protected and package*/ constructor PsiRecursiveElementVisitor() defined in com.intellij.psi.PsiRecursiveElementVisitor[JavaClassConstructorDescriptor]

'invoke' @ [198:17] ==> public abstract operator fun invoke(p1: PsiElement): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [198:29] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.forEachDescendantOfType.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'super' @ [199:17] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.forEachDescendantOfType.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitElement' @ [199:23] ==> public open fun visitElement(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.PsiRecursiveElementVisitor[JavaMethodDescriptor]

'element' @ [199:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.forEachDescendantOfType.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'element' @ [202:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.forEachDescendantOfType.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'invoke' @ [203:17] ==> public abstract operator fun invoke(p1: T): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [203:24] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.forEachDescendantOfType.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'findDescendantOfType' @ [210:12] ==> public inline fun <reified T : PsiElement> PsiElement.findDescendantOfType(noinline predicate: (T) -> Boolean = ...): T? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> T

'predicate' @ [210:33] ==> value-parameter noinline predicate: (T) -> Boolean = ... defined in org.jetbrains.kotlin.psi.psiUtil.anyDescendantOfType[ValueParameterDescriptorImpl]

'findDescendantOfType' @ [214:12] ==> public inline fun <reified T : PsiElement> PsiElement.findDescendantOfType(crossinline canGoInside: (PsiElement) -> Boolean, noinline predicate: (T) -> Boolean = ...): T? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> T

'canGoInside' @ [214:33] ==> value-parameter crossinline canGoInside: (PsiElement) -> Boolean defined in org.jetbrains.kotlin.psi.psiUtil.anyDescendantOfType[ValueParameterDescriptorImpl]

'predicate' @ [214:46] ==> value-parameter noinline predicate: (T) -> Boolean = ... defined in org.jetbrains.kotlin.psi.psiUtil.anyDescendantOfType[ValueParameterDescriptorImpl]

'findDescendantOfType' @ [218:12] ==> public inline fun <reified T : PsiElement> PsiElement.findDescendantOfType(crossinline canGoInside: (PsiElement) -> Boolean, noinline predicate: (T) -> Boolean = ...): T? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> T

'predicate' @ [218:43] ==> value-parameter noinline predicate: (T) -> Boolean = ... defined in org.jetbrains.kotlin.psi.psiUtil.findDescendantOfType[ValueParameterDescriptorImpl]

'this' @ [223:5] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.findDescendantOfType[ReceiverParameterDescriptorImpl]

'accept' @ [223:10] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'PsiRecursiveElementWalkingVisitor' @ [223:26] ==> protected/*protected and package*/ constructor PsiRecursiveElementWalkingVisitor() defined in com.intellij.psi.PsiRecursiveElementWalkingVisitor[JavaClassConstructorDescriptor]

'element' @ [225:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.findDescendantOfType.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'invoke' @ [225:33] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [225:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.findDescendantOfType.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'result' @ [226:17] ==> var result: T? defined in org.jetbrains.kotlin.psi.psiUtil.findDescendantOfType[LocalVariableDescriptor]

'element' @ [226:26] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.findDescendantOfType.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'stopWalking' @ [227:17] ==> public open fun stopWalking(): Unit defined in org.jetbrains.kotlin.psi.psiUtil.findDescendantOfType.<no name provided>[JavaMethodDescriptor]

'invoke' @ [231:17] ==> public abstract operator fun invoke(p1: PsiElement): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [231:29] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.findDescendantOfType.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'super' @ [232:17] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.findDescendantOfType.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitElement' @ [232:23] ==> public open fun visitElement(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.PsiRecursiveElementWalkingVisitor[JavaMethodDescriptor]

'element' @ [232:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.findDescendantOfType.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'result' @ [236:12] ==> var result: T? defined in org.jetbrains.kotlin.psi.psiUtil.findDescendantOfType[LocalVariableDescriptor]

'collectDescendantsOfType' @ [240:12] ==> public inline fun <reified T : PsiElement> PsiElement.collectDescendantsOfType(crossinline canGoInside: (PsiElement) -> Boolean, noinline predicate: (T) -> Boolean = ...): List<T> defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> T

'predicate' @ [240:47] ==> value-parameter noinline predicate: (T) -> Boolean = ... defined in org.jetbrains.kotlin.psi.psiUtil.collectDescendantsOfType[ValueParameterDescriptorImpl]

'ArrayList' @ [244:18] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> T

'forEachDescendantOfType' @ [245:5] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(crossinline canGoInside: (PsiElement) -> Boolean, noinline action: (T) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> T

'canGoInside' @ [245:32] ==> value-parameter crossinline canGoInside: (PsiElement) -> Boolean defined in org.jetbrains.kotlin.psi.psiUtil.collectDescendantsOfType[ValueParameterDescriptorImpl]

'invoke' @ [246:13] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [246:23] ==> value-parameter it: T defined in org.jetbrains.kotlin.psi.psiUtil.collectDescendantsOfType.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [247:13] ==> val result: ArrayList<T> defined in org.jetbrains.kotlin.psi.psiUtil.collectDescendantsOfType[LocalVariableDescriptor]

'add' @ [247:20] ==> public open fun add(element: T): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [247:24] ==> value-parameter it: T defined in org.jetbrains.kotlin.psi.psiUtil.collectDescendantsOfType.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [250:12] ==> val result: ArrayList<T> defined in org.jetbrains.kotlin.psi.psiUtil.collectDescendantsOfType[LocalVariableDescriptor]

'textRange' @ [256:13] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [256:23] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'textRange' @ [259:13] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'endOffset' @ [259:23] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'this' @ [263:18] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getStartOffsetIn[ReceiverParameterDescriptorImpl]

'parent' @ [264:12] ==> var parent: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getStartOffsetIn[LocalVariableDescriptor]

'ancestor' @ [264:22] ==> value-parameter ancestor: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getStartOffsetIn[ValueParameterDescriptorImpl]

'offset' @ [265:9] ==> var offset: Int defined in org.jetbrains.kotlin.psi.psiUtil.getStartOffsetIn[LocalVariableDescriptor]

'parent' @ [265:19] ==> var parent: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getStartOffsetIn[LocalVariableDescriptor]

'startOffsetInParent' @ [265:26] ==> public final val PsiElement.startOffsetInParent: Int[MyPropertyDescriptor]

'parent' @ [266:9] ==> var parent: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getStartOffsetIn[LocalVariableDescriptor]

'parent' @ [266:18] ==> var parent: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getStartOffsetIn[LocalVariableDescriptor]

'parent' @ [266:25] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'offset' @ [268:12] ==> var offset: Int defined in org.jetbrains.kotlin.psi.psiUtil.getStartOffsetIn[LocalVariableDescriptor]

'startOffset' @ [271:54] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'offset' @ [271:68] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.psi.psiUtil.containsInside[ValueParameterDescriptorImpl]

'offset' @ [271:78] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.psi.psiUtil.containsInside[ValueParameterDescriptorImpl]

'endOffset' @ [271:87] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'isEmpty' @ [275:13] ==> public final val isEmpty: Boolean defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'TextRange' @ [276:16] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'first' @ [276:26] ==> public final val first: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'startOffset' @ [276:34] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'last' @ [276:47] ==> public final val last: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'endOffset' @ [276:54] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'isEmpty' @ [280:9] ==> public final val isEmpty: Boolean defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'this' @ [281:12] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getText[ReceiverParameterDescriptorImpl]

'map' @ [281:17] ==> public fun <T, R> Sequence<PsiElement>.map(transform: (PsiElement) -> (String..String?)): Sequence<(String..String?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [281:23] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getText.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [281:26] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'joinToString' @ [281:33] ==> public fun <T> Sequence<(String..String?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((String..String?)) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'range' @ [285:18] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.psi.psiUtil.elementsInRange[ValueParameterDescriptorImpl]

'startOffset' @ [285:24] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'ArrayList' @ [286:18] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'offset' @ [287:12] ==> var offset: Int defined in org.jetbrains.kotlin.psi.psiUtil.elementsInRange[LocalVariableDescriptor]

'range' @ [287:21] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.psi.psiUtil.elementsInRange[ValueParameterDescriptorImpl]

'endOffset' @ [287:27] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'TextRange' @ [288:28] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'offset' @ [288:38] ==> var offset: Int defined in org.jetbrains.kotlin.psi.psiUtil.elementsInRange[LocalVariableDescriptor]

'range' @ [288:46] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.psi.psiUtil.elementsInRange[ValueParameterDescriptorImpl]

'endOffset' @ [288:52] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'findFirstLeafWhollyInRange' @ [289:20] ==> private fun findFirstLeafWhollyInRange(file: PsiFile, range: TextRange): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [289:47] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.elementsInRange[ReceiverParameterDescriptorImpl]

'currentRange' @ [289:53] ==> val currentRange: TextRange defined in org.jetbrains.kotlin.psi.psiUtil.elementsInRange[LocalVariableDescriptor]

'leaf' @ [291:23] ==> val leaf: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.elementsInRange[LocalVariableDescriptor]

'parentsWithSelf' @ [292:18] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'first' @ [293:18] ==> public inline fun <T> Sequence<PsiElement>.first(predicate: (PsiElement) -> Boolean): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [294:34] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.elementsInRange.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [294:37] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'it' @ [295:21] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.elementsInRange.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [295:38] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.elementsInRange.<anonymous>[LocalVariableDescriptor]

'textRange' @ [295:45] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'currentRange' @ [295:59] ==> val currentRange: TextRange defined in org.jetbrains.kotlin.psi.psiUtil.elementsInRange[LocalVariableDescriptor]

'result' @ [297:9] ==> val result: ArrayList<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil.elementsInRange[LocalVariableDescriptor]

'add' @ [297:16] ==> public open fun add(element: PsiElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'element' @ [297:20] ==> val element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.elementsInRange[LocalVariableDescriptor]

'offset' @ [299:9] ==> var offset: Int defined in org.jetbrains.kotlin.psi.psiUtil.elementsInRange[LocalVariableDescriptor]

'element' @ [299:18] ==> val element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.elementsInRange[LocalVariableDescriptor]

'endOffset' @ [299:26] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'result' @ [301:12] ==> val result: ArrayList<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil.elementsInRange[LocalVariableDescriptor]

'file' @ [305:19] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.psi.psiUtil.findFirstLeafWhollyInRange[ValueParameterDescriptorImpl]

'findElementAt' @ [305:24] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'range' @ [305:38] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.psi.psiUtil.findFirstLeafWhollyInRange[ValueParameterDescriptorImpl]

'startOffset' @ [305:44] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'element' @ [306:24] ==> var element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.findFirstLeafWhollyInRange[LocalVariableDescriptor]

'textRange' @ [306:32] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'elementRange' @ [307:9] ==> var elementRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.psi.psiUtil.findFirstLeafWhollyInRange[LocalVariableDescriptor]

'startOffset' @ [307:22] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'range' @ [307:36] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.psi.psiUtil.findFirstLeafWhollyInRange[ValueParameterDescriptorImpl]

'startOffset' @ [307:42] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'element' @ [308:9] ==> var element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.findFirstLeafWhollyInRange[LocalVariableDescriptor]

'element' @ [308:19] ==> var element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.findFirstLeafWhollyInRange[LocalVariableDescriptor]

'nextLeaf' @ [308:27] ==> public fun PsiElement.nextLeaf(skipEmptyElements: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'elementRange' @ [309:9] ==> var elementRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.psi.psiUtil.findFirstLeafWhollyInRange[LocalVariableDescriptor]

'element' @ [309:24] ==> var element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.findFirstLeafWhollyInRange[LocalVariableDescriptor]

'textRange' @ [309:32] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'assert' @ [311:5] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'elementRange' @ [311:12] ==> var elementRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.psi.psiUtil.findFirstLeafWhollyInRange[LocalVariableDescriptor]

'startOffset' @ [311:25] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'range' @ [311:40] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.psi.psiUtil.findFirstLeafWhollyInRange[ValueParameterDescriptorImpl]

'startOffset' @ [311:46] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'if (elementRange.endOffset <= range.endOffset) element else null' @ [312:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'elementRange' @ [312:16] ==> var elementRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.psi.psiUtil.findFirstLeafWhollyInRange[LocalVariableDescriptor]

'endOffset' @ [312:29] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'range' @ [312:42] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.psi.psiUtil.findFirstLeafWhollyInRange[ValueParameterDescriptorImpl]

'endOffset' @ [312:48] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'element' @ [312:59] ==> var element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.findFirstLeafWhollyInRange[LocalVariableDescriptor]

'children' @ [317:36] ==> public final val PsiElement.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'firstOrNull' @ [317:45] ==> public inline fun <T> Array<out (PsiElement..PsiElement?)>.firstOrNull(predicate: ((PsiElement..PsiElement?)) -> Boolean): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [317:59] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.<get-textRangeWithoutComments>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [317:83] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.<get-textRangeWithoutComments>.<anonymous>[ValueParameterDescriptorImpl]

'textRange' @ [317:113] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'TextRange' @ [318:16] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'firstNonCommentChild' @ [318:26] ==> val firstNonCommentChild: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.<get-textRangeWithoutComments>[LocalVariableDescriptor]

'startOffset' @ [318:47] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'endOffset' @ [318:60] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'!' @ [324:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValid' @ [324:10] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'this' @ [324:45] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getElementTextWithContext[ReceiverParameterDescriptorImpl]

'this' @ [326:9] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getElementTextWithContext[ReceiverParameterDescriptorImpl]

'containingFile' @ [327:16] ==> public final val PsiFile.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'text' @ [327:31] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'?:' @ [331:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'findFirstParent' @ [331:39] ==> @Nullable public final fun findFirstParent(@Nullable p0: PsiElement?, p1: (((PsiElement..PsiElement?)) -> Boolean..(((PsiElement..PsiElement?)) -> Boolean)?)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[SamAdapterFunctionDescriptor]

'this' @ [331:55] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getElementTextWithContext[ReceiverParameterDescriptorImpl]

'it' @ [331:63] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getElementTextWithContext.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [331:66] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'AssertionError' @ [332:33] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'topLevelElement' @ [334:30] ==> val topLevelElement: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getElementTextWithContext[LocalVariableDescriptor]

'startOffset' @ [334:46] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'textRange' @ [335:32] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [335:42] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'elementContextOffset' @ [337:30] ==> val elementContextOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil.getElementTextWithContext[LocalVariableDescriptor]

'startContextOffset' @ [337:53] ==> val startContextOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil.getElementTextWithContext[LocalVariableDescriptor]

'containingFile' @ [340:22] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'StringBuilder' @ [341:12] ==> public final fun <init>(p0: (String..String?)): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'topLevelElement' @ [341:26] ==> val topLevelElement: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getElementTextWithContext[LocalVariableDescriptor]

'text' @ [341:42] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'insert' @ [342:14] ==> public open fun insert(p0: Int, p1: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'inFileParentOffset' @ [342:21] ==> val inFileParentOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil.getElementTextWithContext[LocalVariableDescriptor]

'insert' @ [343:14] ==> public open fun insert(p0: Int, p1: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'containingFile' @ [343:38] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'name' @ [343:53] ==> public final var PsiFile.name: String[MyPropertyDescriptor]

'containingFile' @ [343:71] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'isPhysical' @ [343:86] ==> public final val PsiFile.isPhysical: Boolean[MyPropertyDescriptor]

'isInjected' @ [343:109] ==> val isInjected: Boolean defined in org.jetbrains.kotlin.psi.psiUtil.getElementTextWithContext[LocalVariableDescriptor]

'toString' @ [344:14] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'this' @ [347:52] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getTextWithLocation[ReceiverParameterDescriptorImpl]

'text' @ [347:57] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'atLocation' @ [347:85] ==> public open fun atLocation(@NotNull element: PsiElement): (String..String?) defined in org.jetbrains.kotlin.diagnostics.DiagnosticUtils[JavaMethodDescriptor]

'this' @ [347:96] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getTextWithLocation[ReceiverParameterDescriptorImpl]

'file' @ [350:9] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[ValueParameterDescriptorImpl]

'fileAnnotationList' @ [350:14] ==> public final val KtFile.fileAnnotationList: KtFileAnnotationList?[MyPropertyDescriptor]

'file' @ [351:16] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[ValueParameterDescriptorImpl]

'fileAnnotationList' @ [351:21] ==> public final val KtFile.fileAnnotationList: KtFileAnnotationList?[MyPropertyDescriptor]

'replace' @ [351:42] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFileAnnotationList[JavaMethodDescriptor]

'annotationList' @ [351:50] ==> value-parameter annotationList: KtFileAnnotationList defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[ValueParameterDescriptorImpl]

'when {
        file.packageDirective?.packageKeyword != null -> file.packageDirective!!
        file.importList != null -> file.importList!!
        file.declarations.firstOrNull() != null -> file.declarations.first()
        else -> null
    }' @ [354:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?, entry3: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'file' @ [355:9] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[ValueParameterDescriptorImpl]

'packageDirective' @ [355:14] ==> public final val KtFile.packageDirective: KtPackageDirective?[MyPropertyDescriptor]

'packageKeyword' @ [355:32] ==> public final val KtPackageDirective.packageKeyword: PsiElement?[MyPropertyDescriptor]

'file' @ [355:58] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[ValueParameterDescriptorImpl]

'packageDirective' @ [355:63] ==> public final val KtFile.packageDirective: KtPackageDirective?[MyPropertyDescriptor]

'file' @ [356:9] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[ValueParameterDescriptorImpl]

'importList' @ [356:14] ==> public final val KtFile.importList: KtImportList?[MyPropertyDescriptor]

'file' @ [356:36] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[ValueParameterDescriptorImpl]

'importList' @ [356:41] ==> public final val KtFile.importList: KtImportList?[MyPropertyDescriptor]

'file' @ [357:9] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[ValueParameterDescriptorImpl]

'declarations' @ [357:14] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'firstOrNull' @ [357:27] ==> public fun <T> List<(KtDeclaration..KtDeclaration?)>.firstOrNull(): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'file' @ [357:52] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[ValueParameterDescriptorImpl]

'declarations' @ [357:57] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'first' @ [357:70] ==> public fun <T> List<(KtDeclaration..KtDeclaration?)>.first(): (KtDeclaration..KtDeclaration?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'beforeAnchor' @ [361:9] ==> val beforeAnchor: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[LocalVariableDescriptor]

'file' @ [362:16] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[ValueParameterDescriptorImpl]

'addBefore' @ [362:21] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'annotationList' @ [362:31] ==> value-parameter annotationList: KtFileAnnotationList defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[ValueParameterDescriptorImpl]

'beforeAnchor' @ [362:47] ==> val beforeAnchor: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[LocalVariableDescriptor]

'file' @ [365:9] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[ValueParameterDescriptorImpl]

'lastChild' @ [365:14] ==> public final val KtFile.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'file' @ [366:16] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[ValueParameterDescriptorImpl]

'add' @ [366:21] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'annotationList' @ [366:25] ==> value-parameter annotationList: KtFileAnnotationList defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[ValueParameterDescriptorImpl]

'file' @ [369:12] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[ValueParameterDescriptorImpl]

'addAfter' @ [369:17] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'annotationList' @ [369:26] ==> value-parameter annotationList: KtFileAnnotationList defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[ValueParameterDescriptorImpl]

'file' @ [369:42] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.psi.psiUtil.replaceFileAnnotationList[ValueParameterDescriptorImpl]

'lastChild' @ [369:47] ==> public final val KtFile.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'isInScope' @ [374:86] ==> public open fun isInScope(@NotNull p0: SearchScope, @NotNull p1: PsiElement): Boolean defined in com.intellij.psi.search.PsiSearchScopeUtil[JavaMethodDescriptor]

'this' @ [374:96] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.contains[ReceiverParameterDescriptorImpl]

'element' @ [374:102] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.contains[ValueParameterDescriptorImpl]

'getInstance' @ [377:29] ==> public open fun getInstance(p0: (Project..Project?)): (SmartPointerManager..SmartPointerManager?) defined in com.intellij.psi.SmartPointerManager[JavaMethodDescriptor]

'project' @ [377:41] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'createSmartPsiElementPointer' @ [377:50] ==> @NotNull public abstract fun <E : (PsiElement..PsiElement?)> createSmartPsiElementPointer(@NotNull p0: E): SmartPsiElementPointer<(E..E?)> defined in com.intellij.psi.SmartPointerManager[JavaMethodDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (E..E?)

'this' @ [377:79] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.createSmartPointer[ReceiverParameterDescriptorImpl]

'textRange' @ [379:46] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'endOffset' @ [379:56] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'element' @ [379:69] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.before[ValueParameterDescriptorImpl]

'textRange' @ [379:77] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [379:87] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'parents' @ [381:77] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'takeWhile' @ [381:85] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [381:97] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getLastParentOfTypeInRow.<anonymous>[ValueParameterDescriptorImpl]

'lastOrNull' @ [381:107] ==> public fun <T> Sequence<PsiElement>.lastOrNull(): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

