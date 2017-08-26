'findRootExpressions' @ [41:55] ==> @NotNull public open fun findRootExpressions(@NotNull unreachableElements: (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>)): (MutableSet<(KtElement..KtElement?)>..Set<(KtElement..KtElement?)>) defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'unreachableElements' @ [41:75] ==> private final val unreachableElements: Set<KtElement> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl[PropertyDescriptorImpl]

'if (element.hasChildrenInSet(reachableElements)) {
            with (element.getLeavesOrReachableChildren().removeReachableElementsWithMeaninglessSiblings().mergeAdjacentTextRanges()) {
                if (isNotEmpty()) this
                // Specific case like condition in when:
                // element is dead but its only child is alive and has the same text range
                else listOf(element.textRange.endOffset.let { TextRange(it, it) })
            }
        }
        else {
            listOf(element.textRange!!)
        }' @ [44:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<TextRange>, elseBranch: List<TextRange>): List<TextRange>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<TextRange>

'element' @ [44:20] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.getUnreachableTextRanges[ValueParameterDescriptorImpl]

'hasChildrenInSet' @ [44:28] ==> private final fun KtElement.hasChildrenInSet(set: Set<KtElement>): Boolean defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl[SimpleFunctionDescriptorImpl]

'reachableElements' @ [44:45] ==> private final val reachableElements: Set<KtElement> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl[PropertyDescriptorImpl]

'with' @ [45:13] ==> @InlineOnly public inline fun <T, R> with(receiver: List<TextRange>, block: List<TextRange>.() -> List<TextRange>): List<TextRange> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<TextRange>
    <R> -> List<TextRange>

'element' @ [45:19] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.getUnreachableTextRanges[ValueParameterDescriptorImpl]

'getLeavesOrReachableChildren' @ [45:27] ==> private final fun KtElement.getLeavesOrReachableChildren(): List<PsiElement> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl[SimpleFunctionDescriptorImpl]

'removeReachableElementsWithMeaninglessSiblings' @ [45:58] ==> private final fun List<PsiElement>.removeReachableElementsWithMeaninglessSiblings(): List<PsiElement> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl[SimpleFunctionDescriptorImpl]

'mergeAdjacentTextRanges' @ [45:107] ==> private final fun List<PsiElement>.mergeAdjacentTextRanges(): List<TextRange> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl[SimpleFunctionDescriptorImpl]

'if (isNotEmpty()) this
                // Specific case like condition in when:
                // element is dead but its only child is alive and has the same text range
                else listOf(element.textRange.endOffset.let { TextRange(it, it) })' @ [46:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<TextRange>, elseBranch: List<TextRange>): List<TextRange>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<TextRange>

'isNotEmpty' @ [46:21] ==> @InlineOnly public inline fun <T> Collection<TextRange>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextRange

'this' @ [46:35] ==> <this> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.getUnreachableTextRanges.<anonymous>[ReceiverParameterDescriptorImpl]

'listOf' @ [49:22] ==> public fun <T> listOf(element: TextRange): List<TextRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextRange

'element' @ [49:29] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.getUnreachableTextRanges[ValueParameterDescriptorImpl]

'textRange' @ [49:37] ==> public final val KtElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'endOffset' @ [49:47] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'let' @ [49:57] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> TextRange): TextRange defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> TextRange

'TextRange' @ [49:63] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'it' @ [49:73] ==> value-parameter it: Int defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.getUnreachableTextRanges.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [49:77] ==> value-parameter it: Int defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.getUnreachableTextRanges.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [53:13] ==> public fun <T> listOf(element: TextRange): List<TextRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextRange

'element' @ [53:20] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.getUnreachableTextRanges[ValueParameterDescriptorImpl]

'textRange' @ [53:28] ==> public final val KtElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'collectElements' @ [58:25] ==> @NotNull public final fun collectElements(@Nullable p0: PsiElement?, @NotNull p1: ((PsiElement..PsiElement?)) -> Boolean): (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>) defined in com.intellij.psi.util.PsiTreeUtil[SamAdapterFunctionDescriptor]

'this' @ [58:41] ==> <this> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.hasChildrenInSet[ReceiverParameterDescriptorImpl]

'it' @ [58:49] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.hasChildrenInSet.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [58:55] ==> <this> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.hasChildrenInSet[ReceiverParameterDescriptorImpl]

'any' @ [58:62] ==> public inline fun <T> Array<out (PsiElement..PsiElement?)>.any(predicate: ((PsiElement..PsiElement?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [58:68] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.hasChildrenInSet.<anonymous>[ValueParameterDescriptorImpl]

'set' @ [58:74] ==> value-parameter set: Set<KtElement> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.hasChildrenInSet[ValueParameterDescriptorImpl]

'ArrayList' @ [61:24] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'acceptChildren' @ [62:9] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'PsiElementVisitor' @ [62:33] ==> public constructor PsiElementVisitor() defined in com.intellij.psi.PsiElementVisitor[JavaClassConstructorDescriptor]

'element' @ [64:35] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.getLeavesOrReachableChildren.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'reachableElements' @ [64:59] ==> private final val reachableElements: Set<KtElement> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl[PropertyDescriptorImpl]

'contains' @ [64:77] ==> public abstract fun contains(element: KtElement): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'element' @ [64:86] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.getLeavesOrReachableChildren.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'!' @ [64:98] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [64:99] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.getLeavesOrReachableChildren.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'hasChildrenInSet' @ [64:107] ==> private final fun KtElement.hasChildrenInSet(set: Set<KtElement>): Boolean defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl[SimpleFunctionDescriptorImpl]

'unreachableElements' @ [64:124] ==> private final val unreachableElements: Set<KtElement> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl[PropertyDescriptorImpl]

'if (isReachable || element.children.isEmpty()) {
                    children.add(element)
                }
                else {
                    element.acceptChildren(this)
                }' @ [65:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'isReachable' @ [65:21] ==> val isReachable: Boolean defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.getLeavesOrReachableChildren.<no name provided>.visitElement[LocalVariableDescriptor]

'element' @ [65:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.getLeavesOrReachableChildren.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'children' @ [65:44] ==> public final val PsiElement.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'isEmpty' @ [65:53] ==> @InlineOnly public inline fun <T> Array<out (PsiElement..PsiElement?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'children' @ [66:21] ==> val children: ArrayList<PsiElement> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.getLeavesOrReachableChildren[LocalVariableDescriptor]

'add' @ [66:30] ==> public open fun add(element: PsiElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'element' @ [66:34] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.getLeavesOrReachableChildren.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'element' @ [69:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.getLeavesOrReachableChildren.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [69:29] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'this' @ [69:44] ==> <this> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.getLeavesOrReachableChildren.<no name provided>[LazyClassReceiverParameterDescriptor]

'children' @ [73:16] ==> val children: ArrayList<PsiElement> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.getLeavesOrReachableChildren[LocalVariableDescriptor]

'this' @ [77:42] ==> <this> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings.isMeaningless[ReceiverParameterDescriptorImpl]

'this' @ [78:20] ==> <this> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings.isMeaningless[ReceiverParameterDescriptorImpl]

'node' @ [78:25] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [78:31] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'COMMA' @ [78:55] ==> public final val COMMA: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'this' @ [79:20] ==> <this> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings.isMeaningless[ReceiverParameterDescriptorImpl]

'HashSet' @ [81:32] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'elementIndex' @ [83:25] ==> value-parameter elementIndex: Int defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings.collectSiblingsIfMeaningless[ValueParameterDescriptorImpl]

'direction' @ [83:40] ==> value-parameter direction: Int defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings.collectSiblingsIfMeaningless[ValueParameterDescriptorImpl]

'index' @ [84:17] ==> val index: Int defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings.collectSiblingsIfMeaningless[LocalVariableDescriptor]

'..' @ [84:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'size' @ [84:31] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'this' @ [86:27] ==> <this> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings[ReceiverParameterDescriptorImpl]

'index' @ [86:32] ==> val index: Int defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings.collectSiblingsIfMeaningless[LocalVariableDescriptor]

'element' @ [87:17] ==> val element: PsiElement defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings.collectSiblingsIfMeaningless[LocalVariableDescriptor]

'isMeaningless' @ [87:25] ==> local final fun PsiElement.isMeaningless(): Boolean defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings[SimpleFunctionDescriptorImpl]

'childrenToRemove' @ [88:17] ==> val childrenToRemove: HashSet<PsiElement> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings[LocalVariableDescriptor]

'add' @ [88:34] ==> public open fun add(element: PsiElement): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'element' @ [88:38] ==> val element: PsiElement defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings.collectSiblingsIfMeaningless[LocalVariableDescriptor]

'collectSiblingsIfMeaningless' @ [89:17] ==> local final fun collectSiblingsIfMeaningless(elementIndex: Int, direction: Int): Unit defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings[SimpleFunctionDescriptorImpl]

'index' @ [89:46] ==> val index: Int defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings.collectSiblingsIfMeaningless[LocalVariableDescriptor]

'direction' @ [89:53] ==> value-parameter direction: Int defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings.collectSiblingsIfMeaningless[ValueParameterDescriptorImpl]

'component1' @ [92:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [92:22] ==> public final operator fun component2(): PsiElement defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'this' @ [92:34] ==> <this> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings[ReceiverParameterDescriptorImpl]

'withIndex' @ [92:39] ==> public fun <T> Iterable<PsiElement>.withIndex(): Iterable<IndexedValue<PsiElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'reachableElements' @ [93:17] ==> private final val reachableElements: Set<KtElement> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl[PropertyDescriptorImpl]

'contains' @ [93:35] ==> public operator fun <@OnlyInputTypes T> Iterable<PsiElement>.contains(element: PsiElement): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PsiElement

'element' @ [93:44] ==> val element: PsiElement defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings[LocalVariableDescriptor]

'childrenToRemove' @ [94:17] ==> val childrenToRemove: HashSet<PsiElement> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings[LocalVariableDescriptor]

'add' @ [94:34] ==> public open fun add(element: PsiElement): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'element' @ [94:38] ==> val element: PsiElement defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings[LocalVariableDescriptor]

'collectSiblingsIfMeaningless' @ [95:17] ==> local final fun collectSiblingsIfMeaningless(elementIndex: Int, direction: Int): Unit defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings[SimpleFunctionDescriptorImpl]

'index' @ [95:46] ==> val index: Int defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings[LocalVariableDescriptor]

'-' @ [95:53] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'collectSiblingsIfMeaningless' @ [96:17] ==> local final fun collectSiblingsIfMeaningless(elementIndex: Int, direction: Int): Unit defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings[SimpleFunctionDescriptorImpl]

'index' @ [96:46] ==> val index: Int defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings[LocalVariableDescriptor]

'this' @ [99:16] ==> <this> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings[ReceiverParameterDescriptorImpl]

'filter' @ [99:21] ==> public inline fun <T> Iterable<PsiElement>.filter(predicate: (PsiElement) -> Boolean): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [99:30] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings.<anonymous>[ValueParameterDescriptorImpl]

'childrenToRemove' @ [99:37] ==> val childrenToRemove: HashSet<PsiElement> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.removeReachableElementsWithMeaninglessSiblings[LocalVariableDescriptor]

'ArrayList' @ [104:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TextRange

'fold' @ [105:25] ==> public inline fun <T, R> Iterable<PsiElement>.fold(initial: TextRange?, operation: (TextRange?, PsiElement) -> TextRange?): TextRange? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> TextRange?

'element' @ [108:32] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.mergeAdjacentTextRanges.<anonymous>[ValueParameterDescriptorImpl]

'textRange' @ [108:40] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'when {
                currentTextRange == null -> {
                    elementRange
                }
                currentTextRange.endOffset == elementRange.startOffset -> {
                    currentTextRange.union(elementRange)
                }
                else -> {
                    result.add(currentTextRange)
                    elementRange
                }
            }' @ [109:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TextRange?, entry1: TextRange?, entry2: TextRange?): TextRange?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TextRange?

'currentTextRange' @ [110:17] ==> value-parameter currentTextRange: TextRange? defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.mergeAdjacentTextRanges.<anonymous>[ValueParameterDescriptorImpl]

'elementRange' @ [111:21] ==> val elementRange: TextRange defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.mergeAdjacentTextRanges.<anonymous>[LocalVariableDescriptor]

'currentTextRange' @ [113:17] ==> value-parameter currentTextRange: TextRange? defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.mergeAdjacentTextRanges.<anonymous>[ValueParameterDescriptorImpl]

'endOffset' @ [113:34] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'elementRange' @ [113:47] ==> val elementRange: TextRange defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.mergeAdjacentTextRanges.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [113:60] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'currentTextRange' @ [114:21] ==> value-parameter currentTextRange: TextRange? defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.mergeAdjacentTextRanges.<anonymous>[ValueParameterDescriptorImpl]

'union' @ [114:38] ==> @NotNull public open fun union(@NotNull p0: TextRange): TextRange defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'elementRange' @ [114:44] ==> val elementRange: TextRange defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.mergeAdjacentTextRanges.<anonymous>[LocalVariableDescriptor]

'result' @ [117:21] ==> val result: ArrayList<TextRange> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.mergeAdjacentTextRanges[LocalVariableDescriptor]

'add' @ [117:28] ==> public open fun add(element: TextRange): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'currentTextRange' @ [117:32] ==> value-parameter currentTextRange: TextRange? defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.mergeAdjacentTextRanges.<anonymous>[ValueParameterDescriptorImpl]

'elementRange' @ [118:21] ==> val elementRange: TextRange defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.mergeAdjacentTextRanges.<anonymous>[LocalVariableDescriptor]

'lastRange' @ [122:13] ==> val lastRange: TextRange? defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.mergeAdjacentTextRanges[LocalVariableDescriptor]

'result' @ [123:13] ==> val result: ArrayList<TextRange> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.mergeAdjacentTextRanges[LocalVariableDescriptor]

'add' @ [123:20] ==> public open fun add(element: TextRange): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'lastRange' @ [123:24] ==> val lastRange: TextRange? defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.mergeAdjacentTextRanges[LocalVariableDescriptor]

'result' @ [125:16] ==> val result: ArrayList<TextRange> defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl.mergeAdjacentTextRanges[LocalVariableDescriptor]

