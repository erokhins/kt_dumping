'this' @ [31:90] ==> public constructor CommentSaver(originalElements: PsiChildRange, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[ClassConstructorDescriptorImpl]

'PsiChildRange' @ [31:95] ==> public companion object defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[FakeCallableDescriptorForObject]

'singleElement' @ [31:109] ==> public final fun singleElement(element: PsiElement): PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange.Companion[DeserializedSimpleFunctionDescriptor]

'originalElement' @ [31:123] ==> value-parameter originalElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.<init>[ValueParameterDescriptorImpl]

'saveLineBreaks' @ [31:141] ==> value-parameter saveLineBreaks: Boolean = ... defined in org.jetbrains.kotlin.idea.util.CommentSaver.<init>[ValueParameterDescriptorImpl]

'Key' @ [33:34] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TreeElement

'KtPsiFactory' @ [34:30] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'originalElements' @ [34:43] ==> value-parameter originalElements: PsiChildRange defined in org.jetbrains.kotlin.idea.util.CommentSaver.<init>[ValueParameterDescriptorImpl]

'first' @ [34:60] ==> public final val first: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedPropertyDescriptor]

'element' @ [39:33] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.Companion.create[ValueParameterDescriptorImpl]

'tokenType' @ [39:41] ==> public final val PsiElement.tokenType: KtToken? defined in org.jetbrains.kotlin.idea.util.CommentSaver.Companion[PropertyDescriptorImpl]

'when {
                    element is PsiWhiteSpace -> if (element.textContains('\n')) LineBreakTreeElement() else null
                    element is PsiComment -> CommentTreeElement.create(element)
                    tokenType != null -> TokenTreeElement(tokenType)
                    else -> if (element.textLength > 0) StandardTreeElement() else null // don't save empty elements
                }' @ [40:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CommentSaver.TreeElement?, entry1: CommentSaver.TreeElement?, entry2: CommentSaver.TreeElement?, entry3: CommentSaver.TreeElement?): CommentSaver.TreeElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TreeElement?

'element' @ [41:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.Companion.create[ValueParameterDescriptorImpl]

'if (element.textContains('\n')) LineBreakTreeElement() else null' @ [41:49] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CommentSaver.LineBreakTreeElement?, elseBranch: CommentSaver.LineBreakTreeElement?): CommentSaver.LineBreakTreeElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LineBreakTreeElement?

'element' @ [41:53] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.Companion.create[ValueParameterDescriptorImpl]

'textContains' @ [41:61] ==> @Contract public abstract fun textContains(p0: Char): Boolean defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'LineBreakTreeElement' @ [41:81] ==> public constructor LineBreakTreeElement() defined in org.jetbrains.kotlin.idea.util.CommentSaver.LineBreakTreeElement[ClassConstructorDescriptorImpl]

'element' @ [42:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.Companion.create[ValueParameterDescriptorImpl]

'CommentTreeElement' @ [42:46] ==> public companion object defined in org.jetbrains.kotlin.idea.util.CommentSaver.CommentTreeElement[FakeCallableDescriptorForObject]

'create' @ [42:65] ==> public final fun create(comment: PsiComment): CommentSaver.CommentTreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.CommentTreeElement.Companion[SimpleFunctionDescriptorImpl]

'element' @ [42:72] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.Companion.create[ValueParameterDescriptorImpl]

'tokenType' @ [43:21] ==> val tokenType: KtToken? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.Companion.create[LocalVariableDescriptor]

'TokenTreeElement' @ [43:42] ==> public constructor TokenTreeElement(tokenType: KtToken) defined in org.jetbrains.kotlin.idea.util.CommentSaver.TokenTreeElement[ClassConstructorDescriptorImpl]

'tokenType' @ [43:59] ==> val tokenType: KtToken? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.Companion.create[LocalVariableDescriptor]

'if (element.textLength > 0) StandardTreeElement() else null' @ [44:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CommentSaver.StandardTreeElement?, elseBranch: CommentSaver.StandardTreeElement?): CommentSaver.StandardTreeElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StandardTreeElement?

'element' @ [44:33] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.Companion.create[ValueParameterDescriptorImpl]

'textLength' @ [44:41] ==> public final val PsiElement.textLength: Int[MyPropertyDescriptor]

'StandardTreeElement' @ [44:57] ==> public constructor StandardTreeElement() defined in org.jetbrains.kotlin.idea.util.CommentSaver.StandardTreeElement[ClassConstructorDescriptorImpl]

'generateSequence' @ [56:21] ==> public fun <T : Any> generateSequence(seedFunction: () -> CommentSaver.TreeElement?, nextFunction: (CommentSaver.TreeElement) -> CommentSaver.TreeElement?): Sequence<CommentSaver.TreeElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TreeElement

'firstChild' @ [56:40] ==> public final var firstChild: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'it' @ [56:56] ==> value-parameter it: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.<get-children>.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [56:59] ==> public final var next: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'generateSequence' @ [59:21] ==> public fun <T : Any> generateSequence(seedFunction: () -> CommentSaver.TreeElement?, nextFunction: (CommentSaver.TreeElement) -> CommentSaver.TreeElement?): Sequence<CommentSaver.TreeElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TreeElement

'lastChild' @ [59:40] ==> public final var lastChild: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'it' @ [59:55] ==> value-parameter it: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.<get-reverseChildren>.<anonymous>[ValueParameterDescriptorImpl]

'prev' @ [59:58] ==> public final var prev: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'generateSequence' @ [62:21] ==> public fun <T : Any> generateSequence(seedFunction: () -> CommentSaver.TreeElement?, nextFunction: (CommentSaver.TreeElement) -> CommentSaver.TreeElement?): Sequence<CommentSaver.TreeElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TreeElement

'prev' @ [62:40] ==> public final var prev: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'it' @ [62:50] ==> value-parameter it: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.<get-prevSiblings>.<anonymous>[ValueParameterDescriptorImpl]

'prev' @ [62:53] ==> public final var prev: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'generateSequence' @ [65:21] ==> public fun <T : Any> generateSequence(seedFunction: () -> CommentSaver.TreeElement?, nextFunction: (CommentSaver.TreeElement) -> CommentSaver.TreeElement?): Sequence<CommentSaver.TreeElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TreeElement

'next' @ [65:40] ==> public final var next: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'it' @ [65:50] ==> value-parameter it: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.<get-nextSiblings>.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [65:53] ==> public final var next: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'generateSequence' @ [68:21] ==> public fun <T : Any> generateSequence(seedFunction: () -> CommentSaver.TreeElement?, nextFunction: (CommentSaver.TreeElement) -> CommentSaver.TreeElement?): Sequence<CommentSaver.TreeElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TreeElement

'parent' @ [68:40] ==> public final var parent: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'it' @ [68:52] ==> value-parameter it: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.<get-parents>.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [68:55] ==> public final var parent: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'generateSequence' @ [71:21] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: CommentSaver.TreeElement?, nextFunction: (CommentSaver.TreeElement) -> CommentSaver.TreeElement?): Sequence<CommentSaver.TreeElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TreeElement

'this' @ [71:38] ==> <this> defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[LazyClassReceiverParameterDescriptor]

'it' @ [71:46] ==> value-parameter it: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.<get-parentsWithSelf>.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [71:49] ==> public final var parent: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'this' @ [75:30] ==> <this> defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[LazyClassReceiverParameterDescriptor]

'result' @ [77:21] ==> var result: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.<get-firstLeafInside>[LocalVariableDescriptor]

'result' @ [77:30] ==> var result: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.<get-firstLeafInside>[LocalVariableDescriptor]

'firstChild' @ [77:37] ==> public final var firstChild: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'result' @ [79:24] ==> var result: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.<get-firstLeafInside>[LocalVariableDescriptor]

'this' @ [84:30] ==> <this> defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[LazyClassReceiverParameterDescriptor]

'result' @ [86:21] ==> var result: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.<get-lastLeafInside>[LocalVariableDescriptor]

'result' @ [86:30] ==> var result: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.<get-lastLeafInside>[LocalVariableDescriptor]

'lastChild' @ [86:37] ==> public final var lastChild: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'result' @ [88:24] ==> var result: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.<get-lastLeafInside>[LocalVariableDescriptor]

'prev' @ [93:25] ==> public final var prev: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'parent' @ [93:40] ==> public final var parent: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'prevLeaf' @ [93:48] ==> public final val prevLeaf: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'lastLeafInside' @ [93:58] ==> public final val lastLeafInside: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'next' @ [98:25] ==> public final var next: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'parent' @ [98:40] ==> public final var parent: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'nextLeaf' @ [98:48] ==> public final val nextLeaf: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'firstLeafInside' @ [98:58] ==> public final val firstLeafInside: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'generateSequence' @ [102:21] ==> public fun <T : Any> generateSequence(seedFunction: () -> CommentSaver.TreeElement?, nextFunction: (CommentSaver.TreeElement) -> CommentSaver.TreeElement?): Sequence<CommentSaver.TreeElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TreeElement

'prevLeaf' @ [102:40] ==> public final val prevLeaf: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'it' @ [102:54] ==> value-parameter it: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.<get-prevLeafs>.<anonymous>[ValueParameterDescriptorImpl]

'prevLeaf' @ [102:57] ==> public final val prevLeaf: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'generateSequence' @ [105:21] ==> public fun <T : Any> generateSequence(seedFunction: () -> CommentSaver.TreeElement?, nextFunction: (CommentSaver.TreeElement) -> CommentSaver.TreeElement?): Sequence<CommentSaver.TreeElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TreeElement

'nextLeaf' @ [105:40] ==> public final val nextLeaf: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'it' @ [105:54] ==> value-parameter it: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.<get-nextLeafs>.<anonymous>[ValueParameterDescriptorImpl]

'nextLeaf' @ [105:57] ==> public final val nextLeaf: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'if (leftToRight) children else reverseChildren' @ [108:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<CommentSaver.TreeElement>, elseBranch: Sequence<CommentSaver.TreeElement>): Sequence<CommentSaver.TreeElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<TreeElement>

'leftToRight' @ [108:32] ==> value-parameter leftToRight: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.withDescendants[ValueParameterDescriptorImpl]

'children' @ [108:45] ==> public final val children: Sequence<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'reverseChildren' @ [108:59] ==> public final val reverseChildren: Sequence<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'sequenceOf' @ [109:20] ==> public fun <T> sequenceOf(vararg elements: CommentSaver.TreeElement): Sequence<CommentSaver.TreeElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeElement

'this' @ [109:31] ==> <this> defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[LazyClassReceiverParameterDescriptor]

'children' @ [109:39] ==> val children: Sequence<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.withDescendants[LocalVariableDescriptor]

'flatMap' @ [109:48] ==> public fun <T, R> Sequence<CommentSaver.TreeElement>.flatMap(transform: (CommentSaver.TreeElement) -> Sequence<CommentSaver.TreeElement>): Sequence<CommentSaver.TreeElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeElement
    <R> -> TreeElement

'it' @ [109:58] ==> value-parameter it: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.withDescendants.<anonymous>[ValueParameterDescriptorImpl]

'withDescendants' @ [109:61] ==> public final fun withDescendants(leftToRight: Boolean): Sequence<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[SimpleFunctionDescriptorImpl]

'leftToRight' @ [109:77] ==> value-parameter leftToRight: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.withDescendants[ValueParameterDescriptorImpl]

'prevSiblings' @ [113:21] ==> public final val prevSiblings: Sequence<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'flatMap' @ [113:34] ==> public fun <T, R> Sequence<CommentSaver.TreeElement>.flatMap(transform: (CommentSaver.TreeElement) -> Sequence<CommentSaver.TreeElement>): Sequence<CommentSaver.TreeElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeElement
    <R> -> TreeElement

'it' @ [113:44] ==> value-parameter it: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.<get-prevElements>.<anonymous>[ValueParameterDescriptorImpl]

'withDescendants' @ [113:47] ==> public final fun withDescendants(leftToRight: Boolean): Sequence<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[SimpleFunctionDescriptorImpl]

'nextSiblings' @ [116:21] ==> public final val nextSiblings: Sequence<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'flatMap' @ [116:34] ==> public fun <T, R> Sequence<CommentSaver.TreeElement>.flatMap(transform: (CommentSaver.TreeElement) -> Sequence<CommentSaver.TreeElement>): Sequence<CommentSaver.TreeElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeElement
    <R> -> TreeElement

'it' @ [116:44] ==> value-parameter it: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.<get-nextElements>.<anonymous>[ValueParameterDescriptorImpl]

'withDescendants' @ [116:47] ==> public final fun withDescendants(leftToRight: Boolean): Sequence<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[SimpleFunctionDescriptorImpl]

'TreeElement' @ [121:43] ==> public constructor TreeElement() defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[ClassConstructorDescriptorImpl]

'TreeElement' @ [122:62] ==> public constructor TreeElement() defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[ClassConstructorDescriptorImpl]

'TreeElement' @ [123:44] ==> public constructor TreeElement() defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[ClassConstructorDescriptorImpl]

'TreeElement' @ [129:9] ==> public constructor TreeElement() defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[ClassConstructorDescriptorImpl]

'?:' @ [132:35] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'comment' @ [132:36] ==> value-parameter comment: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.CommentTreeElement.Companion.create[ValueParameterDescriptorImpl]

'prevLeaf' @ [132:44] ==> public fun PsiElement.prevLeaf(skipEmptyElements: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'text' @ [132:99] ==> public final val PsiWhiteSpace.text: (String..String?)[MyPropertyDescriptor]

'?:' @ [133:34] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'comment' @ [133:35] ==> value-parameter comment: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.CommentTreeElement.Companion.create[ValueParameterDescriptorImpl]

'nextLeaf' @ [133:43] ==> public fun PsiElement.nextLeaf(skipEmptyElements: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'text' @ [133:98] ==> public final val PsiWhiteSpace.text: (String..String?)[MyPropertyDescriptor]

'CommentTreeElement' @ [134:24] ==> public constructor CommentTreeElement(commentText: String, spaceBefore: String, spaceAfter: String) defined in org.jetbrains.kotlin.idea.util.CommentSaver.CommentTreeElement[ClassConstructorDescriptorImpl]

'comment' @ [134:43] ==> value-parameter comment: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.CommentTreeElement.Companion.create[ValueParameterDescriptorImpl]

'text' @ [134:51] ==> public final val PsiComment.text: (String..String?)[MyPropertyDescriptor]

'spaceBefore' @ [134:57] ==> val spaceBefore: String defined in org.jetbrains.kotlin.idea.util.CommentSaver.CommentTreeElement.Companion.create[LocalVariableDescriptor]

'spaceAfter' @ [134:70] ==> val spaceAfter: String defined in org.jetbrains.kotlin.idea.util.CommentSaver.CommentTreeElement.Companion.create[LocalVariableDescriptor]

'ArrayList' @ [139:37] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CommentTreeElement

'ArrayList' @ [140:39] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LineBreakTreeElement

'Delegates' @ [141:39] ==> public object Delegates defined in kotlin.properties[FakeCallableDescriptorForObject]

'notNull' @ [141:49] ==> public final fun <T : Any> notNull(): ReadWriteProperty<Any?, MutableMap<CommentSaver.TreeElement, MutableCollection<PsiElement>>> defined in kotlin.properties.Delegates[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> MutableMap<TreeElement, MutableCollection<PsiElement>>

'saveLineBreaks' @ [145:13] ==> private final val saveLineBreaks: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'originalElements' @ [145:31] ==> value-parameter originalElements: PsiChildRange defined in org.jetbrains.kotlin.idea.util.CommentSaver.<init>[ValueParameterDescriptorImpl]

'any' @ [145:48] ==> public inline fun <T> Sequence<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [145:54] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.<init>.<anonymous>[ValueParameterDescriptorImpl]

'anyDescendantOfType' @ [145:57] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (PsiComment) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> PsiComment

'originalElements' @ [146:13] ==> value-parameter originalElements: PsiChildRange defined in org.jetbrains.kotlin.idea.util.CommentSaver.<init>[ValueParameterDescriptorImpl]

'save' @ [146:30] ==> private final fun PsiChildRange.save(parentTreeElement: CommentSaver.TreeElement?): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'this' @ [153:23] ==> <this> defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[ReceiverParameterDescriptorImpl]

'assert' @ [154:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'child' @ [154:20] ==> val child: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'savedTreeElement' @ [154:26] ==> private final var PsiElement.savedTreeElement: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'TreeElement' @ [156:30] ==> public companion object defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[FakeCallableDescriptorForObject]

'create' @ [156:42] ==> public final fun create(element: PsiElement): CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement.Companion[SimpleFunctionDescriptorImpl]

'child' @ [156:49] ==> val child: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'savedChild' @ [157:13] ==> val savedChild: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'parent' @ [157:24] ==> public final var parent: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'parentTreeElement' @ [157:33] ==> value-parameter parentTreeElement: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[ValueParameterDescriptorImpl]

'savedChild' @ [158:13] ==> val savedChild: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'prev' @ [158:24] ==> public final var prev: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'last' @ [158:31] ==> var last: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'child' @ [159:17] ==> val child: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'child' @ [160:17] ==> val child: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'savedTreeElement' @ [160:23] ==> private final var PsiElement.savedTreeElement: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'savedChild' @ [160:42] ==> val savedChild: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'last' @ [162:13] ==> var last: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'next' @ [162:19] ==> public final var next: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'savedChild' @ [162:26] ==> val savedChild: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'last' @ [163:13] ==> var last: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'savedChild' @ [163:20] ==> val savedChild: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'first' @ [165:17] ==> var first: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'first' @ [166:17] ==> var first: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'savedChild' @ [166:25] ==> val savedChild: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'when (savedChild) {
                is CommentTreeElement -> commentsToRestore.add(savedChild)
                is LineBreakTreeElement -> if (saveLineBreaks) lineBreaksToRestore.add(savedChild)
            }' @ [169:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'savedChild' @ [169:19] ==> val savedChild: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'commentsToRestore' @ [170:42] ==> private final val commentsToRestore: ArrayList<CommentSaver.CommentTreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'add' @ [170:60] ==> public open fun add(element: CommentSaver.CommentTreeElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'savedChild' @ [170:64] ==> val savedChild: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'saveLineBreaks' @ [171:48] ==> private final val saveLineBreaks: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'lineBreaksToRestore' @ [171:64] ==> private final val lineBreaksToRestore: ArrayList<CommentSaver.LineBreakTreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'add' @ [171:84] ==> public open fun add(element: CommentSaver.LineBreakTreeElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'savedChild' @ [171:88] ==> val savedChild: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'child' @ [174:13] ==> val child: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'allChildren' @ [174:19] ==> public val PsiElement.allChildren: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'save' @ [174:31] ==> private final fun PsiChildRange.save(parentTreeElement: CommentSaver.TreeElement?): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'savedChild' @ [174:36] ==> val savedChild: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'parentTreeElement' @ [177:9] ==> value-parameter parentTreeElement: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[ValueParameterDescriptorImpl]

'firstChild' @ [177:28] ==> public final var firstChild: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'first' @ [177:41] ==> var first: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'parentTreeElement' @ [178:9] ==> value-parameter parentTreeElement: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[ValueParameterDescriptorImpl]

'lastChild' @ [178:28] ==> public final var lastChild: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'last' @ [178:40] ==> var last: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.save[LocalVariableDescriptor]

'getCopyableUserData' @ [182:17] ==> @Nullable @Contract public abstract fun <T : (Any..Any?)> getCopyableUserData(p0: (Key<(CommentSaver.TreeElement..CommentSaver.TreeElement?)>..Key<(CommentSaver.TreeElement..CommentSaver.TreeElement?)>?)): CommentSaver.TreeElement? defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TreeElement

'SAVED_TREE_KEY' @ [182:37] ==> private final val SAVED_TREE_KEY: Key<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'putCopyableUserData' @ [183:22] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(CommentSaver.TreeElement..CommentSaver.TreeElement?)>..Key<(CommentSaver.TreeElement..CommentSaver.TreeElement?)>?), @Nullable p1: CommentSaver.TreeElement?): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TreeElement

'SAVED_TREE_KEY' @ [183:42] ==> private final val SAVED_TREE_KEY: Key<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'value' @ [183:58] ==> value-parameter value: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.<set-savedTreeElement>[ValueParameterDescriptorImpl]

'assert' @ [189:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [189:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isFinished' @ [189:17] ==> public final var isFinished: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'element' @ [191:9] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.deleteCommentsInside[ValueParameterDescriptorImpl]

'accept' @ [191:17] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'PsiRecursiveElementVisitor' @ [191:33] ==> protected/*protected and package*/ constructor PsiRecursiveElementVisitor() defined in com.intellij.psi.PsiRecursiveElementVisitor[JavaClassConstructorDescriptor]

'comment' @ [193:35] ==> value-parameter comment: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.deleteCommentsInside.<no name provided>.visitComment[ValueParameterDescriptorImpl]

'savedTreeElement' @ [193:43] ==> private final var PsiElement.savedTreeElement: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'treeElement' @ [194:21] ==> val treeElement: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.deleteCommentsInside.<no name provided>.visitComment[LocalVariableDescriptor]

'commentsToRestore' @ [195:21] ==> private final val commentsToRestore: ArrayList<CommentSaver.CommentTreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'remove' @ [195:39] ==> @InlineOnly public inline fun <@OnlyInputTypes T> MutableCollection<out CommentSaver.TreeElement>.remove(element: CommentSaver.TreeElement): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> TreeElement

'treeElement' @ [195:46] ==> val treeElement: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.deleteCommentsInside.<no name provided>.visitComment[LocalVariableDescriptor]

'assert' @ [202:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [202:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isFinished' @ [202:17] ==> public final var isFinished: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'assert' @ [203:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'createdElement' @ [203:16] ==> value-parameter createdElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText[ValueParameterDescriptorImpl]

'textLength' @ [203:31] ==> public final val PsiElement.textLength: Int[MyPropertyDescriptor]

'rangeInOriginal' @ [203:45] ==> value-parameter rangeInOriginal: TextRange defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText[ValueParameterDescriptorImpl]

'length' @ [203:61] ==> public final val TextRange.length: Int[MyPropertyDescriptor]

'assert' @ [204:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'createdElement' @ [204:16] ==> value-parameter createdElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText[ValueParameterDescriptorImpl]

'text' @ [204:31] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'original' @ [204:39] ==> value-parameter original: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText[ValueParameterDescriptorImpl]

'text' @ [204:48] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'substring' @ [204:53] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'rangeInOriginal' @ [204:63] ==> value-parameter rangeInOriginal: TextRange defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText[ValueParameterDescriptorImpl]

'startOffset' @ [204:79] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'rangeInOriginal' @ [204:92] ==> value-parameter rangeInOriginal: TextRange defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText[ValueParameterDescriptorImpl]

'endOffset' @ [204:108] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'createdElement' @ [206:9] ==> value-parameter createdElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText[ValueParameterDescriptorImpl]

'accept' @ [206:24] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'PsiRecursiveElementVisitor' @ [206:40] ==> protected/*protected and package*/ constructor PsiRecursiveElementVisitor() defined in com.intellij.psi.PsiRecursiveElementVisitor[JavaClassConstructorDescriptor]

'element' @ [208:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'original' @ [210:29] ==> value-parameter original: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText[ValueParameterDescriptorImpl]

'findElementAt' @ [210:38] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'element' @ [210:52] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'getStartOffsetIn' @ [210:60] ==> public fun PsiElement.getStartOffsetIn(ancestor: PsiElement): Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'createdElement' @ [210:77] ==> value-parameter createdElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText[ValueParameterDescriptorImpl]

'rangeInOriginal' @ [210:95] ==> value-parameter rangeInOriginal: TextRange defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText[ValueParameterDescriptorImpl]

'startOffset' @ [210:111] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'token' @ [211:21] ==> val token: PsiElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText.<no name provided>.visitElement[LocalVariableDescriptor]

'element' @ [212:41] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'textLength' @ [212:49] ==> public final val PsiElement.textLength: Int[MyPropertyDescriptor]

'token' @ [213:45] ==> val token: PsiElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText.<no name provided>.visitElement[LocalVariableDescriptor]

'parentsWithSelf' @ [213:51] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'originalElement' @ [214:38] ==> val originalElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText.<no name provided>.visitElement[LocalVariableDescriptor]

'textLength' @ [214:54] ==> public final val PsiElement.textLength: Int[MyPropertyDescriptor]

'length' @ [215:29] ==> val length: Int defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText.<no name provided>.visitElement[LocalVariableDescriptor]

'elementLength' @ [215:38] ==> val elementLength: Int defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText.<no name provided>.visitElement[LocalVariableDescriptor]

'length' @ [216:29] ==> val length: Int defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText.<no name provided>.visitElement[LocalVariableDescriptor]

'elementLength' @ [216:39] ==> val elementLength: Int defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText.<no name provided>.visitElement[LocalVariableDescriptor]

'element' @ [217:29] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'savedTreeElement' @ [217:37] ==> private final var PsiElement.savedTreeElement: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'originalElement' @ [217:56] ==> val originalElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText.<no name provided>.visitElement[LocalVariableDescriptor]

'savedTreeElement' @ [217:72] ==> private final var PsiElement.savedTreeElement: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'super' @ [223:17] ==> <this> defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitElement' @ [223:23] ==> public open fun visitElement(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.PsiRecursiveElementVisitor[JavaMethodDescriptor]

'element' @ [223:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.elementCreatedByText.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'toNewPsiElementMap' @ [229:9] ==> private final var toNewPsiElementMap: MutableMap<CommentSaver.TreeElement, MutableCollection<PsiElement>> defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'getOrPut' @ [229:28] ==> public inline fun <K, V> MutableMap<CommentSaver.TreeElement, MutableCollection<PsiElement>>.getOrPut(key: CommentSaver.TreeElement, defaultValue: () -> MutableCollection<PsiElement>): MutableCollection<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TreeElement
    <V> -> MutableCollection<PsiElement>

'treeElement' @ [229:37] ==> value-parameter treeElement: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.putNewElementIntoMap[ValueParameterDescriptorImpl]

'ArrayList' @ [229:52] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'add' @ [229:67] ==> public abstract fun add(element: PsiElement): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [229:71] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.putNewElementIntoMap[ValueParameterDescriptorImpl]

'newPsiElement' @ [233:9] ==> value-parameter newPsiElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.bindNewElement[ValueParameterDescriptorImpl]

'savedTreeElement' @ [233:23] ==> private final var PsiElement.savedTreeElement: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'treeElement' @ [233:42] ==> value-parameter treeElement: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.bindNewElement[ValueParameterDescriptorImpl]

'putNewElementIntoMap' @ [234:9] ==> private final fun putNewElementIntoMap(psiElement: PsiElement, treeElement: CommentSaver.TreeElement): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'newPsiElement' @ [234:30] ==> value-parameter newPsiElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.bindNewElement[ValueParameterDescriptorImpl]

'treeElement' @ [234:45] ==> value-parameter treeElement: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.bindNewElement[ValueParameterDescriptorImpl]

'restore' @ [238:9] ==> public final fun restore(resultElements: PsiChildRange, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'PsiChildRange' @ [238:17] ==> public companion object defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[FakeCallableDescriptorForObject]

'singleElement' @ [238:31] ==> public final fun singleElement(element: PsiElement): PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange.Companion[DeserializedSimpleFunctionDescriptor]

'resultElement' @ [238:45] ==> value-parameter resultElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[ValueParameterDescriptorImpl]

'forceAdjustIndent' @ [238:61] ==> value-parameter forceAdjustIndent: Boolean = ... defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[ValueParameterDescriptorImpl]

'assert' @ [242:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [242:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isFinished' @ [242:17] ==> public final var isFinished: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'assert' @ [243:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [243:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resultElements' @ [243:17] ==> value-parameter resultElements: PsiChildRange defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[ValueParameterDescriptorImpl]

'isEmpty' @ [243:32] ==> public final val isEmpty: Boolean defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedPropertyDescriptor]

'commentsToRestore' @ [245:13] ==> private final val commentsToRestore: ArrayList<CommentSaver.CommentTreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'isNotEmpty' @ [245:31] ==> @InlineOnly public inline fun <T> Collection<CommentSaver.CommentTreeElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CommentTreeElement

'lineBreaksToRestore' @ [245:47] ==> private final val lineBreaksToRestore: ArrayList<CommentSaver.LineBreakTreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'isNotEmpty' @ [245:67] ==> @InlineOnly public inline fun <T> Collection<CommentSaver.LineBreakTreeElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LineBreakTreeElement

'resultElements' @ [247:13] ==> value-parameter resultElements: PsiChildRange defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[ValueParameterDescriptorImpl]

'forEach' @ [247:28] ==> public inline fun <T> Sequence<PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'deleteCommentsInside' @ [247:38] ==> public final fun deleteCommentsInside(element: PsiElement): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'it' @ [247:59] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore.<anonymous>[ValueParameterDescriptorImpl]

'commentsToRestore' @ [249:17] ==> private final val commentsToRestore: ArrayList<CommentSaver.CommentTreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'isNotEmpty' @ [249:35] ==> @InlineOnly public inline fun <T> Collection<CommentSaver.CommentTreeElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CommentTreeElement

'lineBreaksToRestore' @ [249:51] ==> private final val lineBreaksToRestore: ArrayList<CommentSaver.LineBreakTreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'isNotEmpty' @ [249:71] ==> @InlineOnly public inline fun <T> Collection<CommentSaver.LineBreakTreeElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LineBreakTreeElement

'toNewPsiElementMap' @ [250:17] ==> private final var toNewPsiElementMap: MutableMap<CommentSaver.TreeElement, MutableCollection<PsiElement>> defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'HashMap' @ [250:38] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> TreeElement
    <V : (Any..Any?)> -> MutableCollection<PsiElement>

'resultElements' @ [251:33] ==> value-parameter resultElements: PsiChildRange defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[ValueParameterDescriptorImpl]

'element' @ [252:21] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[LocalVariableDescriptor]

'accept' @ [252:29] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'PsiRecursiveElementVisitor' @ [252:45] ==> protected/*protected and package*/ constructor PsiRecursiveElementVisitor() defined in com.intellij.psi.PsiRecursiveElementVisitor[JavaClassConstructorDescriptor]

'element' @ [254:47] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'savedTreeElement' @ [254:55] ==> private final var PsiElement.savedTreeElement: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'treeElement' @ [255:33] ==> val treeElement: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore.<no name provided>.visitElement[LocalVariableDescriptor]

'putNewElementIntoMap' @ [256:33] ==> private final fun putNewElementIntoMap(psiElement: PsiElement, treeElement: CommentSaver.TreeElement): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'element' @ [256:54] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'treeElement' @ [256:63] ==> val treeElement: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore.<no name provided>.visitElement[LocalVariableDescriptor]

'super' @ [258:29] ==> <this> defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitElement' @ [258:35] ==> public open fun visitElement(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.PsiRecursiveElementVisitor[JavaMethodDescriptor]

'element' @ [258:48] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'restoreComments' @ [263:17] ==> private final fun restoreComments(resultElements: PsiChildRange): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'resultElements' @ [263:33] ==> value-parameter resultElements: PsiChildRange defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[ValueParameterDescriptorImpl]

'restoreLineBreaks' @ [265:17] ==> private final fun restoreLineBreaks(): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'resultElements' @ [268:17] ==> value-parameter resultElements: PsiChildRange defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[ValueParameterDescriptorImpl]

'forEach' @ [268:32] ==> public inline fun <T> Sequence<PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [269:21] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [269:24] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'PsiRecursiveElementVisitor' @ [269:40] ==> protected/*protected and package*/ constructor PsiRecursiveElementVisitor() defined in com.intellij.psi.PsiRecursiveElementVisitor[JavaClassConstructorDescriptor]

'element' @ [271:29] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore.<anonymous>.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'savedTreeElement' @ [271:37] ==> private final var PsiElement.savedTreeElement: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'super' @ [272:29] ==> <this> defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitElement' @ [272:35] ==> public open fun visitElement(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.PsiRecursiveElementVisitor[JavaMethodDescriptor]

'element' @ [272:48] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore.<anonymous>.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'needAdjustIndentAfterRestore' @ [279:13] ==> private final var needAdjustIndentAfterRestore: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'forceAdjustIndent' @ [279:45] ==> value-parameter forceAdjustIndent: Boolean = ... defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[ValueParameterDescriptorImpl]

'resultElements' @ [280:24] ==> value-parameter resultElements: PsiChildRange defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[ValueParameterDescriptorImpl]

'first' @ [280:39] ==> public fun <T> Sequence<PsiElement>.first(): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'containingFile' @ [280:47] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'file' @ [281:27] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[LocalVariableDescriptor]

'project' @ [281:32] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'getInstance' @ [282:57] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [282:69] ==> val project: Project defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[LocalVariableDescriptor]

'psiDocumentManager' @ [283:28] ==> val psiDocumentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[LocalVariableDescriptor]

'getDocument' @ [283:47] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'file' @ [283:59] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[LocalVariableDescriptor]

'document' @ [284:17] ==> val document: Document? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[LocalVariableDescriptor]

'psiDocumentManager' @ [285:17] ==> val psiDocumentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[LocalVariableDescriptor]

'doPostponedOperationsAndUnblockDocument' @ [285:36] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'document' @ [285:76] ==> val document: Document? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[LocalVariableDescriptor]

'psiDocumentManager' @ [286:17] ==> val psiDocumentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[LocalVariableDescriptor]

'commitDocument' @ [286:36] ==> public abstract fun commitDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'document' @ [286:51] ==> val document: Document? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[LocalVariableDescriptor]

'getInstance' @ [288:30] ==> public open fun getInstance(@NotNull p0: Project): (CodeStyleManager..CodeStyleManager?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'project' @ [288:42] ==> val project: Project defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[LocalVariableDescriptor]

'adjustLineIndent' @ [288:51] ==> public abstract fun adjustLineIndent(@NotNull p0: PsiFile, p1: (TextRange..TextRange?)): Unit defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'file' @ [288:68] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[LocalVariableDescriptor]

'resultElements' @ [288:74] ==> value-parameter resultElements: PsiChildRange defined in org.jetbrains.kotlin.idea.util.CommentSaver.restore[ValueParameterDescriptorImpl]

'textRange' @ [288:89] ==> public val PsiChildRange.textRange: TextRange? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'isFinished' @ [291:9] ==> public final var isFinished: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'resultElements' @ [295:41] ==> value-parameter resultElements: PsiChildRange defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[ValueParameterDescriptorImpl]

'last' @ [295:56] ==> public final val last: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedPropertyDescriptor]

'commentsToRestore' @ [297:36] ==> private final val commentsToRestore: ArrayList<CommentSaver.CommentTreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'psiFactory' @ [298:27] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'createComment' @ [298:38] ==> public final fun createComment(text: String): PsiComment defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'commentTreeElement' @ [298:52] ==> val commentTreeElement: CommentSaver.CommentTreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'commentText' @ [298:71] ==> public final val commentText: String defined in org.jetbrains.kotlin.idea.util.CommentSaver.CommentTreeElement[PropertyDescriptorImpl]

'findAnchor' @ [300:32] ==> private final fun findAnchor(commentTreeElement: CommentSaver.CommentTreeElement, before: Boolean): CommentSaver.Anchor? defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'commentTreeElement' @ [300:43] ==> val commentTreeElement: CommentSaver.CommentTreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'findAnchor' @ [301:31] ==> private final fun findAnchor(commentTreeElement: CommentSaver.CommentTreeElement, before: Boolean): CommentSaver.Anchor? defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'commentTreeElement' @ [301:42] ==> val commentTreeElement: CommentSaver.CommentTreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'chooseAnchor' @ [302:26] ==> private final fun chooseAnchor(anchorBefore: CommentSaver.Anchor?, anchorAfter: CommentSaver.Anchor?): CommentSaver.Anchor? defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'anchorBefore' @ [302:39] ==> val anchorBefore: CommentSaver.Anchor? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'anchorAfter' @ [302:53] ==> val anchorAfter: CommentSaver.Anchor? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'if (anchor != null) {
                val anchorElement = findFinalAnchorElement(anchor, comment)
                val parent = anchorElement.parent
                if (anchor.before) {
                    restored = parent.addAfter(comment, anchorElement) as PsiComment
                    if (commentTreeElement.spaceBefore.isNotEmpty()) {
                        parent.addAfter(psiFactory.createWhiteSpace(commentTreeElement.spaceBefore), anchorElement)
                    }

                    // make sure that there is a line break after EOL_COMMENT
                    if (restored.tokenType == KtTokens.EOL_COMMENT) {
                        val whiteSpace = restored.nextLeaf(skipEmptyElements = true) as? PsiWhiteSpace
                        if (whiteSpace == null) {
                            parent.addAfter(psiFactory.createWhiteSpace("\n"), restored)
                        }
                        else if (!whiteSpace.textContains('\n')) {
                            val newWhiteSpace = psiFactory.createWhiteSpace("\n" + whiteSpace.text)
                            whiteSpace.replace(newWhiteSpace)
                        }
                    }
                }
                else {
                    restored = parent.addBefore(comment, anchorElement) as PsiComment
                    if (commentTreeElement.spaceAfter.isNotEmpty()) {
                        parent.addBefore(psiFactory.createWhiteSpace(commentTreeElement.spaceAfter), anchorElement)
                    }
                }
            }
            else {
                restored = putAbandonedCommentsAfter.parent.addBefore(comment, putAbandonedCommentsAfter) as PsiComment
                putAbandonedCommentsAfter = restored
            }' @ [305:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'anchor' @ [305:17] ==> val anchor: CommentSaver.Anchor? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'findFinalAnchorElement' @ [306:37] ==> private final fun findFinalAnchorElement(anchor: CommentSaver.Anchor, comment: PsiComment): PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'anchor' @ [306:60] ==> val anchor: CommentSaver.Anchor? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'comment' @ [306:68] ==> val comment: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'anchorElement' @ [307:30] ==> val anchorElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'parent' @ [307:44] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (anchor.before) {
                    restored = parent.addAfter(comment, anchorElement) as PsiComment
                    if (commentTreeElement.spaceBefore.isNotEmpty()) {
                        parent.addAfter(psiFactory.createWhiteSpace(commentTreeElement.spaceBefore), anchorElement)
                    }

                    // make sure that there is a line break after EOL_COMMENT
                    if (restored.tokenType == KtTokens.EOL_COMMENT) {
                        val whiteSpace = restored.nextLeaf(skipEmptyElements = true) as? PsiWhiteSpace
                        if (whiteSpace == null) {
                            parent.addAfter(psiFactory.createWhiteSpace("\n"), restored)
                        }
                        else if (!whiteSpace.textContains('\n')) {
                            val newWhiteSpace = psiFactory.createWhiteSpace("\n" + whiteSpace.text)
                            whiteSpace.replace(newWhiteSpace)
                        }
                    }
                }
                else {
                    restored = parent.addBefore(comment, anchorElement) as PsiComment
                    if (commentTreeElement.spaceAfter.isNotEmpty()) {
                        parent.addBefore(psiFactory.createWhiteSpace(commentTreeElement.spaceAfter), anchorElement)
                    }
                }' @ [308:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'anchor' @ [308:21] ==> val anchor: CommentSaver.Anchor? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'before' @ [308:28] ==> public final val before: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver.Anchor[PropertyDescriptorImpl]

'restored' @ [309:21] ==> val restored: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'parent' @ [309:32] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'addAfter' @ [309:39] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'comment' @ [309:48] ==> val comment: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'anchorElement' @ [309:57] ==> val anchorElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'commentTreeElement' @ [310:25] ==> val commentTreeElement: CommentSaver.CommentTreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'spaceBefore' @ [310:44] ==> public final val spaceBefore: String defined in org.jetbrains.kotlin.idea.util.CommentSaver.CommentTreeElement[PropertyDescriptorImpl]

'isNotEmpty' @ [310:56] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parent' @ [311:25] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'addAfter' @ [311:32] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'psiFactory' @ [311:41] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'createWhiteSpace' @ [311:52] ==> public final fun createWhiteSpace(text: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'commentTreeElement' @ [311:69] ==> val commentTreeElement: CommentSaver.CommentTreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'spaceBefore' @ [311:88] ==> public final val spaceBefore: String defined in org.jetbrains.kotlin.idea.util.CommentSaver.CommentTreeElement[PropertyDescriptorImpl]

'anchorElement' @ [311:102] ==> val anchorElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'restored' @ [315:25] ==> val restored: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'tokenType' @ [315:34] ==> public final val PsiComment.tokenType: (IElementType..IElementType?)[MyPropertyDescriptor]

'EOL_COMMENT' @ [315:56] ==> public final val EOL_COMMENT: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'restored' @ [316:42] ==> val restored: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'nextLeaf' @ [316:51] ==> public fun PsiElement.nextLeaf(skipEmptyElements: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'if (whiteSpace == null) {
                            parent.addAfter(psiFactory.createWhiteSpace("\n"), restored)
                        }
                        else if (!whiteSpace.textContains('\n')) {
                            val newWhiteSpace = psiFactory.createWhiteSpace("\n" + whiteSpace.text)
                            whiteSpace.replace(newWhiteSpace)
                        }' @ [317:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'whiteSpace' @ [317:29] ==> val whiteSpace: PsiWhiteSpace? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'parent' @ [318:29] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'addAfter' @ [318:36] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'psiFactory' @ [318:45] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'createWhiteSpace' @ [318:56] ==> public final fun createWhiteSpace(text: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'restored' @ [318:80] ==> val restored: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'!' @ [320:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'whiteSpace' @ [320:35] ==> val whiteSpace: PsiWhiteSpace? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'textContains' @ [320:46] ==> @Contract public abstract fun textContains(p0: Char): Boolean defined in com.intellij.psi.PsiWhiteSpace[JavaMethodDescriptor]

'psiFactory' @ [321:49] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'createWhiteSpace' @ [321:60] ==> public final fun createWhiteSpace(text: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'+' @ [321:77] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'whiteSpace' @ [321:84] ==> val whiteSpace: PsiWhiteSpace? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'text' @ [321:95] ==> public final val PsiWhiteSpace.text: (String..String?)[MyPropertyDescriptor]

'whiteSpace' @ [322:29] ==> val whiteSpace: PsiWhiteSpace? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'replace' @ [322:40] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiWhiteSpace[JavaMethodDescriptor]

'newWhiteSpace' @ [322:48] ==> val newWhiteSpace: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'restored' @ [327:21] ==> val restored: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'parent' @ [327:32] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'addBefore' @ [327:39] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'comment' @ [327:49] ==> val comment: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'anchorElement' @ [327:58] ==> val anchorElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'commentTreeElement' @ [328:25] ==> val commentTreeElement: CommentSaver.CommentTreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'spaceAfter' @ [328:44] ==> public final val spaceAfter: String defined in org.jetbrains.kotlin.idea.util.CommentSaver.CommentTreeElement[PropertyDescriptorImpl]

'isNotEmpty' @ [328:55] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parent' @ [329:25] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'addBefore' @ [329:32] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'psiFactory' @ [329:42] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'createWhiteSpace' @ [329:53] ==> public final fun createWhiteSpace(text: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'commentTreeElement' @ [329:70] ==> val commentTreeElement: CommentSaver.CommentTreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'spaceAfter' @ [329:89] ==> public final val spaceAfter: String defined in org.jetbrains.kotlin.idea.util.CommentSaver.CommentTreeElement[PropertyDescriptorImpl]

'anchorElement' @ [329:102] ==> val anchorElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'restored' @ [334:17] ==> val restored: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'putAbandonedCommentsAfter' @ [334:28] ==> var putAbandonedCommentsAfter: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'parent' @ [334:54] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addBefore' @ [334:61] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'comment' @ [334:71] ==> val comment: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'putAbandonedCommentsAfter' @ [334:80] ==> var putAbandonedCommentsAfter: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'putAbandonedCommentsAfter' @ [335:17] ==> var putAbandonedCommentsAfter: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'restored' @ [335:45] ==> val restored: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'bindNewElement' @ [338:13] ==> private final fun bindNewElement(newPsiElement: PsiElement, treeElement: CommentSaver.TreeElement): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'restored' @ [338:28] ==> val restored: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'commentTreeElement' @ [338:38] ==> val commentTreeElement: CommentSaver.CommentTreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'restored' @ [340:17] ==> val restored: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreComments[LocalVariableDescriptor]

'tokenType' @ [340:26] ==> public final val PsiComment.tokenType: (IElementType..IElementType?)[MyPropertyDescriptor]

'EOL_COMMENT' @ [340:48] ==> public final val EOL_COMMENT: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'needAdjustIndentAfterRestore' @ [341:17] ==> private final var needAdjustIndentAfterRestore: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'lineBreaksToRestore' @ [347:34] ==> private final val lineBreaksToRestore: ArrayList<CommentSaver.LineBreakTreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'toNewPsiElementMap' @ [348:17] ==> private final var toNewPsiElementMap: MutableMap<CommentSaver.TreeElement, MutableCollection<PsiElement>> defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'lineBreakElement' @ [348:36] ==> val lineBreakElement: CommentSaver.LineBreakTreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks[LocalVariableDescriptor]

'lineBreakElement' @ [350:35] ==> val lineBreakElement: CommentSaver.LineBreakTreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks[LocalVariableDescriptor]

'parent' @ [350:52] ==> public final var parent: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.LineBreakTreeElement[PropertyDescriptorImpl]

'leaf' @ [353:21] ==> value-parameter leaf: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks.findRestored[ValueParameterDescriptorImpl]

'leaf' @ [354:24] ==> value-parameter leaf: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks.findRestored[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [354:29] ==> public final val parentsWithSelf: Sequence<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'takeWhile' @ [355:26] ==> public fun <T> Sequence<CommentSaver.TreeElement>.takeWhile(predicate: (CommentSaver.TreeElement) -> Boolean): Sequence<CommentSaver.TreeElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeElement

'it' @ [355:38] ==> value-parameter it: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks.findRestored.<anonymous>[ValueParameterDescriptorImpl]

'lineBreakParent' @ [355:44] ==> val lineBreakParent: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks[LocalVariableDescriptor]

'mapNotNull' @ [356:26] ==> public fun <T, R : Any> Sequence<CommentSaver.TreeElement>.mapNotNull(transform: (CommentSaver.TreeElement) -> PsiElement?): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeElement
    <R : Any> -> PsiElement

'toNewPsiElementMap' @ [356:39] ==> private final var toNewPsiElementMap: MutableMap<CommentSaver.TreeElement, MutableCollection<PsiElement>> defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'it' @ [356:58] ==> value-parameter it: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks.findRestored.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [356:63] ==> public fun <T> Iterable<PsiElement>.first(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'firstOrNull' @ [357:26] ==> public fun <T> Sequence<PsiElement>.firstOrNull(): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'arrayListOf' @ [361:33] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<KtToken> /* = ArrayList<KtToken> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtToken

'lineBreakElement' @ [362:26] ==> val lineBreakElement: CommentSaver.LineBreakTreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks[LocalVariableDescriptor]

'prevLeafs' @ [362:43] ==> public final val prevLeafs: Sequence<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.LineBreakTreeElement[PropertyDescriptorImpl]

'findRestored' @ [363:34] ==> local final fun findRestored(leaf: CommentSaver.TreeElement): PsiElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks[SimpleFunctionDescriptorImpl]

'leaf' @ [363:47] ==> val leaf: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks[LocalVariableDescriptor]

'if (psiElement != null) {
                    psiElement = skipTokensForward(psiElement, tokensToMatch.asReversed())
                    psiElement?.restoreLineBreakAfter()
                    break
                }
                else {
                    if (leaf !is TokenTreeElement) break
                    tokensToMatch.add(leaf.tokenType)
                }' @ [364:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'psiElement' @ [364:21] ==> var psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks[LocalVariableDescriptor]

'psiElement' @ [365:21] ==> var psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks[LocalVariableDescriptor]

'skipTokensForward' @ [365:34] ==> private final fun skipTokensForward(psiElement: PsiElement, tokensToMatch: List<KtToken>): PsiElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'psiElement' @ [365:52] ==> var psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks[LocalVariableDescriptor]

'tokensToMatch' @ [365:64] ==> val tokensToMatch: ArrayList<KtToken> /* = ArrayList<KtToken> */ defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks[LocalVariableDescriptor]

'asReversed' @ [365:78] ==> @JvmName public fun <T> MutableList<KtToken>.asReversed(): MutableList<KtToken> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtToken

'psiElement' @ [366:21] ==> var psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks[LocalVariableDescriptor]

'restoreLineBreakAfter' @ [366:33] ==> private final fun PsiElement.restoreLineBreakAfter(): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'leaf' @ [370:25] ==> val leaf: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks[LocalVariableDescriptor]

'tokensToMatch' @ [371:21] ==> val tokensToMatch: ArrayList<KtToken> /* = ArrayList<KtToken> */ defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks[LocalVariableDescriptor]

'add' @ [371:35] ==> public open fun add(element: KtToken): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'leaf' @ [371:39] ==> val leaf: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreaks[LocalVariableDescriptor]

'tokenType' @ [371:44] ==> public final val tokenType: KtToken defined in org.jetbrains.kotlin.idea.util.CommentSaver.TokenTreeElement[PropertyDescriptorImpl]

'psiElement' @ [378:33] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.skipTokensForward[ValueParameterDescriptorImpl]

'tokensToMatch' @ [379:23] ==> value-parameter tokensToMatch: List<KtToken> defined in org.jetbrains.kotlin.idea.util.CommentSaver.skipTokensForward[ValueParameterDescriptorImpl]

'currentPsiElement' @ [380:13] ==> var currentPsiElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.skipTokensForward[LocalVariableDescriptor]

'currentPsiElement' @ [380:33] ==> var currentPsiElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.skipTokensForward[LocalVariableDescriptor]

'nextLeaf' @ [380:51] ==> public fun PsiElement.nextLeaf(filter: (PsiElement) -> Boolean): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'nonSpaceAndNonEmptyFilter' @ [380:60] ==> private final val nonSpaceAndNonEmptyFilter: (PsiElement) -> Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'currentPsiElement' @ [381:17] ==> var currentPsiElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.skipTokensForward[LocalVariableDescriptor]

'tokenType' @ [381:35] ==> public final val PsiElement.tokenType: KtToken? defined in org.jetbrains.kotlin.idea.util.CommentSaver.Companion[PropertyDescriptorImpl]

'token' @ [381:48] ==> val token: KtToken defined in org.jetbrains.kotlin.idea.util.CommentSaver.skipTokensForward[LocalVariableDescriptor]

'currentPsiElement' @ [383:16] ==> var currentPsiElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.skipTokensForward[LocalVariableDescriptor]

'shiftNewLineAnchor' @ [387:24] ==> private final fun shiftNewLineAnchor(putAfter: PsiElement): PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'this' @ [387:43] ==> <this> defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreakAfter[ReceiverParameterDescriptorImpl]

'anchorToAddCommentOrSpace' @ [387:49] ==> private final fun PsiElement.anchorToAddCommentOrSpace(before: Boolean): PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'addAfter' @ [388:26] ==> val addAfter: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreakAfter[LocalVariableDescriptor]

'nextSibling' @ [388:35] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'whitespace' @ [390:13] ==> var whitespace: PsiWhiteSpace? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreakAfter[LocalVariableDescriptor]

'whitespace' @ [390:35] ==> var whitespace: PsiWhiteSpace? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreakAfter[LocalVariableDescriptor]

'text' @ [390:46] ==> public final val PsiWhiteSpace.text: (String..String?)[MyPropertyDescriptor]

'contains' @ [390:51] ==> public operator fun CharSequence.contains(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (whitespace == null) {
            addAfter.parent.addAfter(psiFactory.createNewLine(), addAfter)
        }
        else {
            whitespace.replace(psiFactory.createWhiteSpace("\n" + whitespace.text))
        }' @ [392:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'whitespace' @ [392:13] ==> var whitespace: PsiWhiteSpace? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreakAfter[LocalVariableDescriptor]

'addAfter' @ [393:13] ==> val addAfter: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreakAfter[LocalVariableDescriptor]

'parent' @ [393:22] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addAfter' @ [393:29] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'psiFactory' @ [393:38] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'createNewLine' @ [393:49] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'addAfter' @ [393:66] ==> val addAfter: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreakAfter[LocalVariableDescriptor]

'whitespace' @ [396:13] ==> var whitespace: PsiWhiteSpace? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreakAfter[LocalVariableDescriptor]

'replace' @ [396:24] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiWhiteSpace[JavaMethodDescriptor]

'psiFactory' @ [396:32] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'createWhiteSpace' @ [396:43] ==> public final fun createWhiteSpace(text: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'+' @ [396:60] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'whitespace' @ [396:67] ==> var whitespace: PsiWhiteSpace? defined in org.jetbrains.kotlin.idea.util.CommentSaver.restoreLineBreakAfter[LocalVariableDescriptor]

'text' @ [396:78] ==> public final val PsiWhiteSpace.text: (String..String?)[MyPropertyDescriptor]

'needAdjustIndentAfterRestore' @ [399:9] ==> private final var needAdjustIndentAfterRestore: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'ArrayList' @ [405:35] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TreeElement

'if (before) commentTreeElement.prevElements else commentTreeElement.nextElements' @ [406:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<CommentSaver.TreeElement>, elseBranch: Sequence<CommentSaver.TreeElement>): Sequence<CommentSaver.TreeElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<TreeElement>

'before' @ [406:28] ==> value-parameter before: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver.findAnchor[ValueParameterDescriptorImpl]

'commentTreeElement' @ [406:36] ==> value-parameter commentTreeElement: CommentSaver.CommentTreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.findAnchor[ValueParameterDescriptorImpl]

'prevElements' @ [406:55] ==> public final val prevElements: Sequence<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.CommentTreeElement[PropertyDescriptorImpl]

'commentTreeElement' @ [406:73] ==> value-parameter commentTreeElement: CommentSaver.CommentTreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.findAnchor[ValueParameterDescriptorImpl]

'nextElements' @ [406:92] ==> public final val nextElements: Sequence<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.CommentTreeElement[PropertyDescriptorImpl]

'sequence' @ [407:29] ==> val sequence: Sequence<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.findAnchor[LocalVariableDescriptor]

'toNewPsiElementMap' @ [408:34] ==> private final var toNewPsiElementMap: MutableMap<CommentSaver.TreeElement, MutableCollection<PsiElement>> defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'treeElement' @ [408:53] ==> val treeElement: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.findAnchor[LocalVariableDescriptor]

'newPsiElements' @ [409:17] ==> val newPsiElements: MutableCollection<PsiElement>? defined in org.jetbrains.kotlin.idea.util.CommentSaver.findAnchor[LocalVariableDescriptor]

'newPsiElements' @ [410:34] ==> val newPsiElements: MutableCollection<PsiElement>? defined in org.jetbrains.kotlin.idea.util.CommentSaver.findAnchor[LocalVariableDescriptor]

'first' @ [410:49] ==> public fun <T> Iterable<PsiElement>.first(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'anchorToAddCommentOrSpace' @ [410:57] ==> private final fun PsiElement.anchorToAddCommentOrSpace(before: Boolean): PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'!' @ [410:83] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'before' @ [410:84] ==> value-parameter before: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver.findAnchor[ValueParameterDescriptorImpl]

'Anchor' @ [411:24] ==> public constructor Anchor(element: PsiElement, treeElementsBetween: Collection<CommentSaver.TreeElement>, before: Boolean) defined in org.jetbrains.kotlin.idea.util.CommentSaver.Anchor[ClassConstructorDescriptorImpl]

'psiElement' @ [411:31] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.findAnchor[LocalVariableDescriptor]

'treeElementsBetween' @ [411:43] ==> val treeElementsBetween: ArrayList<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.findAnchor[LocalVariableDescriptor]

'before' @ [411:64] ==> value-parameter before: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver.findAnchor[ValueParameterDescriptorImpl]

'treeElement' @ [413:17] ==> val treeElement: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.findAnchor[LocalVariableDescriptor]

'firstChild' @ [413:29] ==> public final var firstChild: CommentSaver.TreeElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.TreeElement[PropertyDescriptorImpl]

'treeElementsBetween' @ [414:17] ==> val treeElementsBetween: ArrayList<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.findAnchor[LocalVariableDescriptor]

'add' @ [414:37] ==> public open fun add(element: CommentSaver.TreeElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'treeElement' @ [414:41] ==> val treeElement: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.findAnchor[LocalVariableDescriptor]

'parentsWithSelf' @ [421:16] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'dropWhile' @ [422:18] ==> public fun <T> Sequence<PsiElement>.dropWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [422:30] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.anchorToAddCommentOrSpace.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [422:33] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'==' @ [422:55] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.psi.PsiElement[DeserializedSimpleFunctionDescriptor]

'if (before) it.prevSibling else it.nextSibling' @ [422:56] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'before' @ [422:60] ==> value-parameter before: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver.anchorToAddCommentOrSpace[ValueParameterDescriptorImpl]

'it' @ [422:68] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.anchorToAddCommentOrSpace.<anonymous>[ValueParameterDescriptorImpl]

'prevSibling' @ [422:71] ==> public final val PsiElement.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'it' @ [422:88] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.anchorToAddCommentOrSpace.<anonymous>[ValueParameterDescriptorImpl]

'nextSibling' @ [422:91] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'first' @ [423:18] ==> public fun <T> Sequence<PsiElement>.first(): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'anchorBefore' @ [427:13] ==> value-parameter anchorBefore: CommentSaver.Anchor? defined in org.jetbrains.kotlin.idea.util.CommentSaver.chooseAnchor[ValueParameterDescriptorImpl]

'anchorAfter' @ [427:42] ==> value-parameter anchorAfter: CommentSaver.Anchor? defined in org.jetbrains.kotlin.idea.util.CommentSaver.chooseAnchor[ValueParameterDescriptorImpl]

'anchorAfter' @ [428:13] ==> value-parameter anchorAfter: CommentSaver.Anchor? defined in org.jetbrains.kotlin.idea.util.CommentSaver.chooseAnchor[ValueParameterDescriptorImpl]

'anchorBefore' @ [428:41] ==> value-parameter anchorBefore: CommentSaver.Anchor? defined in org.jetbrains.kotlin.idea.util.CommentSaver.chooseAnchor[ValueParameterDescriptorImpl]

'anchorBefore' @ [430:30] ==> value-parameter anchorBefore: CommentSaver.Anchor? defined in org.jetbrains.kotlin.idea.util.CommentSaver.chooseAnchor[ValueParameterDescriptorImpl]

'treeElementsBetween' @ [430:43] ==> public final val treeElementsBetween: Collection<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.Anchor[PropertyDescriptorImpl]

'anchorAfter' @ [431:29] ==> value-parameter anchorAfter: CommentSaver.Anchor? defined in org.jetbrains.kotlin.idea.util.CommentSaver.chooseAnchor[ValueParameterDescriptorImpl]

'treeElementsBetween' @ [431:41] ==> public final val treeElementsBetween: Collection<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.Anchor[PropertyDescriptorImpl]

'elementsBefore' @ [433:31] ==> val elementsBefore: Collection<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.chooseAnchor[LocalVariableDescriptor]

'any' @ [433:46] ==> public inline fun <T> Iterable<CommentSaver.TreeElement>.any(predicate: (CommentSaver.TreeElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeElement

'it' @ [433:52] ==> value-parameter it: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.chooseAnchor.<anonymous>[ValueParameterDescriptorImpl]

'elementsAfter' @ [434:30] ==> val elementsAfter: Collection<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.chooseAnchor[LocalVariableDescriptor]

'any' @ [434:44] ==> public inline fun <T> Iterable<CommentSaver.TreeElement>.any(predicate: (CommentSaver.TreeElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeElement

'it' @ [434:50] ==> value-parameter it: CommentSaver.TreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.chooseAnchor.<anonymous>[ValueParameterDescriptorImpl]

'lineBreakBefore' @ [435:13] ==> val lineBreakBefore: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver.chooseAnchor[LocalVariableDescriptor]

'!' @ [435:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'lineBreakAfter' @ [435:33] ==> val lineBreakAfter: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver.chooseAnchor[LocalVariableDescriptor]

'anchorAfter' @ [435:56] ==> value-parameter anchorAfter: CommentSaver.Anchor? defined in org.jetbrains.kotlin.idea.util.CommentSaver.chooseAnchor[ValueParameterDescriptorImpl]

'elementsBefore' @ [437:13] ==> val elementsBefore: Collection<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.chooseAnchor[LocalVariableDescriptor]

'isNotEmpty' @ [437:28] ==> @InlineOnly public inline fun <T> Collection<CommentSaver.TreeElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeElement

'elementsAfter' @ [437:44] ==> val elementsAfter: Collection<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.chooseAnchor[LocalVariableDescriptor]

'isEmpty' @ [437:58] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'anchorAfter' @ [437:76] ==> value-parameter anchorAfter: CommentSaver.Anchor? defined in org.jetbrains.kotlin.idea.util.CommentSaver.chooseAnchor[ValueParameterDescriptorImpl]

'anchorBefore' @ [439:16] ==> value-parameter anchorBefore: CommentSaver.Anchor? defined in org.jetbrains.kotlin.idea.util.CommentSaver.chooseAnchor[ValueParameterDescriptorImpl]

'anchor' @ [443:29] ==> value-parameter anchor: CommentSaver.Anchor defined in org.jetbrains.kotlin.idea.util.CommentSaver.findFinalAnchorElement[ValueParameterDescriptorImpl]

'treeElementsBetween' @ [443:36] ==> public final val treeElementsBetween: Collection<CommentSaver.TreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.Anchor[PropertyDescriptorImpl]

'filterIsInstance' @ [443:56] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<CommentSaver.TokenTreeElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> TokenTreeElement

'if (anchor.before) nextLeaf(nonSpaceAndNonEmptyFilter) else prevLeaf(nonSpaceAndNonEmptyFilter)' @ [446:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'anchor' @ [446:24] ==> value-parameter anchor: CommentSaver.Anchor defined in org.jetbrains.kotlin.idea.util.CommentSaver.findFinalAnchorElement[ValueParameterDescriptorImpl]

'before' @ [446:31] ==> public final val before: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver.Anchor[PropertyDescriptorImpl]

'nextLeaf' @ [446:39] ==> public fun PsiElement.nextLeaf(filter: (PsiElement) -> Boolean): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'nonSpaceAndNonEmptyFilter' @ [446:48] ==> private final val nonSpaceAndNonEmptyFilter: (PsiElement) -> Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'prevLeaf' @ [446:80] ==> public fun PsiElement.prevLeaf(filter: (PsiElement) -> Boolean): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'nonSpaceAndNonEmptyFilter' @ [446:89] ==> private final val nonSpaceAndNonEmptyFilter: (PsiElement) -> Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'anchor' @ [449:26] ==> value-parameter anchor: CommentSaver.Anchor defined in org.jetbrains.kotlin.idea.util.CommentSaver.findFinalAnchorElement[ValueParameterDescriptorImpl]

'element' @ [449:33] ==> public final val element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.Anchor[PropertyDescriptorImpl]

'tokensBetween' @ [450:23] ==> val tokensBetween: List<CommentSaver.TokenTreeElement> defined in org.jetbrains.kotlin.idea.util.CommentSaver.findFinalAnchorElement[LocalVariableDescriptor]

'asReversed' @ [450:37] ==> public fun <T> List<CommentSaver.TokenTreeElement>.asReversed(): List<CommentSaver.TokenTreeElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TokenTreeElement

'psiElement' @ [451:24] ==> var psiElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.findFinalAnchorElement[LocalVariableDescriptor]

'next' @ [451:35] ==> local final fun PsiElement.next(): PsiElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.findFinalAnchorElement[SimpleFunctionDescriptorImpl]

'next' @ [452:17] ==> val next: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.findFinalAnchorElement[LocalVariableDescriptor]

'tokenType' @ [452:22] ==> public final val PsiElement.tokenType: KtToken? defined in org.jetbrains.kotlin.idea.util.CommentSaver.Companion[PropertyDescriptorImpl]

'token' @ [452:35] ==> val token: CommentSaver.TokenTreeElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.findFinalAnchorElement[LocalVariableDescriptor]

'tokenType' @ [452:41] ==> public final val tokenType: KtToken defined in org.jetbrains.kotlin.idea.util.CommentSaver.TokenTreeElement[PropertyDescriptorImpl]

'psiElement' @ [453:13] ==> var psiElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.findFinalAnchorElement[LocalVariableDescriptor]

'next' @ [453:26] ==> val next: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.findFinalAnchorElement[LocalVariableDescriptor]

'anchor' @ [457:13] ==> value-parameter anchor: CommentSaver.Anchor defined in org.jetbrains.kotlin.idea.util.CommentSaver.findFinalAnchorElement[ValueParameterDescriptorImpl]

'before' @ [457:20] ==> public final val before: Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver.Anchor[PropertyDescriptorImpl]

'comment' @ [457:30] ==> value-parameter comment: PsiComment defined in org.jetbrains.kotlin.idea.util.CommentSaver.findFinalAnchorElement[ValueParameterDescriptorImpl]

'tokenType' @ [457:38] ==> public final val PsiComment.tokenType: (IElementType..IElementType?)[MyPropertyDescriptor]

'EOL_COMMENT' @ [457:60] ==> public final val EOL_COMMENT: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'psiElement' @ [458:13] ==> var psiElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.findFinalAnchorElement[LocalVariableDescriptor]

'shiftNewLineAnchor' @ [458:26] ==> private final fun shiftNewLineAnchor(putAfter: PsiElement): PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'psiElement' @ [458:45] ==> var psiElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.findFinalAnchorElement[LocalVariableDescriptor]

'psiElement' @ [461:16] ==> var psiElement: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.findFinalAnchorElement[LocalVariableDescriptor]

'putAfter' @ [466:20] ==> value-parameter putAfter: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.shiftNewLineAnchor[ValueParameterDescriptorImpl]

'nextLeaf' @ [466:29] ==> public fun PsiElement.nextLeaf(filter: (PsiElement) -> Boolean): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'nonSpaceAndNonEmptyFilter' @ [466:38] ==> private final val nonSpaceAndNonEmptyFilter: (PsiElement) -> Boolean defined in org.jetbrains.kotlin.idea.util.CommentSaver[PropertyDescriptorImpl]

'if (next?.tokenType == KtTokens.COMMA) next!! else putAfter' @ [467:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'next' @ [467:20] ==> val next: PsiElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.shiftNewLineAnchor[LocalVariableDescriptor]

'tokenType' @ [467:26] ==> public final val PsiElement.tokenType: KtToken? defined in org.jetbrains.kotlin.idea.util.CommentSaver.Companion[PropertyDescriptorImpl]

'COMMA' @ [467:48] ==> public final val COMMA: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'next' @ [467:55] ==> val next: PsiElement? defined in org.jetbrains.kotlin.idea.util.CommentSaver.shiftNewLineAnchor[LocalVariableDescriptor]

'putAfter' @ [467:67] ==> value-parameter putAfter: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.shiftNewLineAnchor[ValueParameterDescriptorImpl]

'element' @ [470:70] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.nonSpaceAndNonEmptyFilter.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [470:99] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.CommentSaver.nonSpaceAndNonEmptyFilter.<anonymous>[ValueParameterDescriptorImpl]

'textLength' @ [470:107] ==> public final val PsiElement.textLength: Int[MyPropertyDescriptor]

'node' @ [475:21] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [475:26] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

