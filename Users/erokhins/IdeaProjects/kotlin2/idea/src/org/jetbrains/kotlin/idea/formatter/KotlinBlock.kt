'AbstractBlock' @ [40:63] ==> protected/*protected and package*/ constructor AbstractBlock(@NotNull p0: ASTNode, @Nullable p1: Wrap?, @Nullable p2: Alignment?) defined in com.intellij.psi.formatter.common.AbstractBlock[JavaClassConstructorDescriptor]

'node' @ [40:77] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.<init>[ValueParameterDescriptorImpl]

'wrap' @ [40:83] ==> value-parameter wrap: Wrap? defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.<init>[ValueParameterDescriptorImpl]

'myAlignmentStrategy' @ [40:89] ==> value-parameter myAlignmentStrategy: CommonAlignmentStrategy defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.<init>[ValueParameterDescriptorImpl]

'getAlignment' @ [40:109] ==> public abstract fun getAlignment(node: ASTNode): Alignment? defined in org.jetbrains.kotlin.idea.formatter.CommonAlignmentStrategy[DeserializedSimpleFunctionDescriptor]

'node' @ [40:122] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.<init>[ValueParameterDescriptorImpl]

'KotlinCommonBlock' @ [42:50] ==> public constructor KotlinCommonBlock(node: ASTNode, settings: CodeStyleSettings, spacingBuilder: KotlinSpacingBuilder, alignmentStrategy: CommonAlignmentStrategy) defined in org.jetbrains.kotlin.idea.formatter.KotlinCommonBlock[DeserializedClassConstructorDescriptor]

'node' @ [42:68] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.<init>[ValueParameterDescriptorImpl]

'mySettings' @ [42:74] ==> value-parameter mySettings: CodeStyleSettings defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.<init>[ValueParameterDescriptorImpl]

'mySpacingBuilder' @ [42:86] ==> private final val mySpacingBuilder: KotlinSpacingBuilder defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock[PropertyDescriptorImpl]

'myAlignmentStrategy' @ [42:104] ==> private final val myAlignmentStrategy: CommonAlignmentStrategy defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock[PropertyDescriptorImpl]

'getNullStrategy' @ [43:98] ==> public open fun getNullStrategy(): (NodeAlignmentStrategy..NodeAlignmentStrategy?) defined in org.jetbrains.kotlin.idea.formatter.NodeAlignmentStrategy[JavaMethodDescriptor]

'fromTypes' @ [46:42] ==> public open fun fromTypes(strategy: (AlignmentStrategy..AlignmentStrategy?)): (NodeAlignmentStrategy..NodeAlignmentStrategy?) defined in org.jetbrains.kotlin.idea.formatter.NodeAlignmentStrategy[JavaMethodDescriptor]

'wrap' @ [46:70] ==> public open fun wrap(@Nullable p0: Alignment?, vararg p1: (IElementType..IElementType?)): (AlignmentStrategy..AlignmentStrategy?) defined in com.intellij.formatting.alignment.AlignmentStrategy[JavaMethodDescriptor]

'createAlignment' @ [46:75] ==> private fun createAlignment(alignOption: Boolean, defaultAlignment: Alignment?): Alignment? defined in org.jetbrains.kotlin.idea.formatter in file KotlinBlock.kt[SimpleFunctionDescriptorImpl]

'alignOption' @ [46:91] ==> value-parameter alignOption: Boolean defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.kotlinDelegationBlock.<no name provided>.createAlignmentStrategy[ValueParameterDescriptorImpl]

'defaultAlignment' @ [46:104] ==> value-parameter defaultAlignment: Alignment? defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.kotlinDelegationBlock.<no name provided>.createAlignmentStrategy[ValueParameterDescriptorImpl]

'if (shouldAlignInColumns) {
                NodeAlignmentStrategy.fromTypes(
                        AlignmentStrategy.createAlignmentPerTypeStrategy(listOf(ARROW as IElementType), WHEN_ENTRY, true))
            }
            else {
                NodeAlignmentStrategy.getNullStrategy()
            }' @ [50:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CommonAlignmentStrategy, elseBranch: CommonAlignmentStrategy): CommonAlignmentStrategy[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CommonAlignmentStrategy

'shouldAlignInColumns' @ [50:24] ==> value-parameter shouldAlignInColumns: Boolean defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.kotlinDelegationBlock.<no name provided>.getAlignmentForCaseBranch[ValueParameterDescriptorImpl]

'fromTypes' @ [51:39] ==> public open fun fromTypes(strategy: (AlignmentStrategy..AlignmentStrategy?)): (NodeAlignmentStrategy..NodeAlignmentStrategy?) defined in org.jetbrains.kotlin.idea.formatter.NodeAlignmentStrategy[JavaMethodDescriptor]

'createAlignmentPerTypeStrategy' @ [52:43] ==> public open fun createAlignmentPerTypeStrategy(@NotNull p0: (MutableCollection<(IElementType..IElementType?)>..Collection<(IElementType..IElementType?)>), @Nullable p1: IElementType?, p2: Boolean): (AlignmentStrategy.AlignmentPerTypeStrategy..AlignmentStrategy.AlignmentPerTypeStrategy?) defined in com.intellij.formatting.alignment.AlignmentStrategy[JavaMethodDescriptor]

'listOf' @ [52:74] ==> public fun <T> listOf(element: IElementType): List<IElementType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IElementType

'ARROW' @ [52:81] ==> public final val ARROW: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'WHEN_ENTRY' @ [52:105] ==> public final val WHEN_ENTRY: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'getNullStrategy' @ [55:39] ==> public open fun getNullStrategy(): (NodeAlignmentStrategy..NodeAlignmentStrategy?) defined in org.jetbrains.kotlin.idea.formatter.NodeAlignmentStrategy[JavaMethodDescriptor]

'alignment' @ [59:51] ==> public final val KotlinBlock.alignment: Alignment?[MyPropertyDescriptor]

'this@KotlinBlock' @ [61:55] ==> <this> defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock[LazyClassReceiverParameterDescriptor]

'isIncomplete' @ [61:72] ==> public final val KotlinBlock.isIncomplete: Boolean[MyPropertyDescriptor]

'super@KotlinBlock' @ [63:85] ==> <this> defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock[LazyClassReceiverParameterDescriptor]

'getChildAttributes' @ [63:103] ==> @NotNull public open fun getChildAttributes(p0: Int): ChildAttributes defined in com.intellij.psi.formatter.common.AbstractBlock[JavaMethodDescriptor]

'newChildIndex' @ [63:122] ==> value-parameter newChildIndex: Int defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.kotlinDelegationBlock.<no name provided>.getSuperChildAttributes[ValueParameterDescriptorImpl]

'subBlocks' @ [65:52] ==> public final val KotlinBlock.subBlocks: (MutableList<(Block..Block?)>..List<(Block..Block?)>)[MyPropertyDescriptor]

'KotlinBlock' @ [68:20] ==> public constructor KotlinBlock(node: ASTNode, myAlignmentStrategy: CommonAlignmentStrategy, myIndent: Indent?, wrap: Wrap?, mySettings: CodeStyleSettings, mySpacingBuilder: KotlinSpacingBuilder) defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock[ClassConstructorDescriptorImpl]

'node' @ [69:21] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.kotlinDelegationBlock.<no name provided>.createBlock[ValueParameterDescriptorImpl]

'alignmentStrategy' @ [70:21] ==> value-parameter alignmentStrategy: CommonAlignmentStrategy defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.kotlinDelegationBlock.<no name provided>.createBlock[ValueParameterDescriptorImpl]

'indent' @ [71:21] ==> value-parameter indent: Indent? defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.kotlinDelegationBlock.<no name provided>.createBlock[ValueParameterDescriptorImpl]

'wrap' @ [72:21] ==> value-parameter wrap: Wrap? defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.kotlinDelegationBlock.<no name provided>.createBlock[ValueParameterDescriptorImpl]

'mySettings' @ [73:21] ==> value-parameter mySettings: CodeStyleSettings defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.<init>[ValueParameterDescriptorImpl]

'mySpacingBuilder' @ [74:21] ==> private final val mySpacingBuilder: KotlinSpacingBuilder defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock[PropertyDescriptorImpl]

'AbstractBlock' @ [78:29] ==> protected/*protected and package*/ constructor AbstractBlock(@NotNull p0: ASTNode, @Nullable p1: Wrap?, @Nullable p2: Alignment?) defined in com.intellij.psi.formatter.common.AbstractBlock[JavaClassConstructorDescriptor]

'node' @ [78:43] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.kotlinDelegationBlock.<no name provided>.createSyntheticSpacingNodeBlock[ValueParameterDescriptorImpl]

'emptyList' @ [81:61] ==> public fun <T> emptyList(): List<Block> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Block

'myIndent' @ [86:41] ==> private final val myIndent: Indent? defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock[PropertyDescriptorImpl]

'kotlinDelegationBlock' @ [88:49] ==> private final val kotlinDelegationBlock: <no name provided> defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock[PropertyDescriptorImpl]

'buildChildren' @ [88:71] ==> public final fun buildChildren(): List<Block> defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.kotlinDelegationBlock.<no name provided>[DeserializedSimpleFunctionDescriptor]

'mySpacingBuilder' @ [90:72] ==> private final val mySpacingBuilder: KotlinSpacingBuilder defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock[PropertyDescriptorImpl]

'getSpacing' @ [90:89] ==> public final fun getSpacing(parent: Block, child1: Block?, child2: Block): Spacing? defined in org.jetbrains.kotlin.idea.formatter.KotlinSpacingBuilder[DeserializedSimpleFunctionDescriptor]

'this' @ [90:100] ==> <this> defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock[LazyClassReceiverParameterDescriptor]

'child1' @ [90:106] ==> value-parameter child1: Block? defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.getSpacing[ValueParameterDescriptorImpl]

'child2' @ [90:114] ==> value-parameter child2: Block defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.getSpacing[ValueParameterDescriptorImpl]

'kotlinDelegationBlock' @ [92:76] ==> private final val kotlinDelegationBlock: <no name provided> defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock[PropertyDescriptorImpl]

'getChildAttributes' @ [92:98] ==> public final fun getChildAttributes(newChildIndex: Int): ChildAttributes defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.kotlinDelegationBlock.<no name provided>[DeserializedSimpleFunctionDescriptor]

'newChildIndex' @ [92:117] ==> value-parameter newChildIndex: Int defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.getChildAttributes[ValueParameterDescriptorImpl]

'kotlinDelegationBlock' @ [94:38] ==> private final val kotlinDelegationBlock: <no name provided> defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock[PropertyDescriptorImpl]

'isLeaf' @ [94:60] ==> public final fun isLeaf(): Boolean defined in org.jetbrains.kotlin.idea.formatter.KotlinBlock.kotlinDelegationBlock.<no name provided>[DeserializedSimpleFunctionDescriptor]

'INSTANCE' @ [96:49] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'getPreviousNonWhitespaceLeaf' @ [101:30] ==> @Nullable public open fun getPreviousNonWhitespaceLeaf(@Nullable p0: ASTNode?): ASTNode? defined in com.intellij.psi.formatter.FormatterUtil[JavaMethodDescriptor]

'node' @ [101:59] ==> value-parameter node: ASTNode? defined in org.jetbrains.kotlin.idea.formatter.KotlinSpacingBuilderUtilImpl.getPreviousNonWhitespaceLeaf[ValueParameterDescriptorImpl]

'isWhitespaceOrEmpty' @ [105:30] ==> public open fun isWhitespaceOrEmpty(@Nullable p0: ASTNode?): Boolean defined in com.intellij.psi.formatter.FormatterUtil[JavaMethodDescriptor]

'node' @ [105:50] ==> value-parameter node: ASTNode? defined in org.jetbrains.kotlin.idea.formatter.KotlinSpacingBuilderUtilImpl.isWhitespaceOrEmpty[ValueParameterDescriptorImpl]

'DependantSpacingImpl' @ [116:25] ==> public constructor DependantSpacingImpl(p0: Int, p1: Int, @NotNull p2: TextRange, p3: Boolean, p4: Int, @NotNull p5: DependentSpacingRule) defined in com.intellij.formatting.DependantSpacingImpl[JavaClassConstructorDescriptor]

'minSpaces' @ [116:46] ==> value-parameter minSpaces: Int defined in org.jetbrains.kotlin.idea.formatter.KotlinSpacingBuilderUtilImpl.createLineFeedDependentSpacing[ValueParameterDescriptorImpl]

'maxSpaces' @ [116:57] ==> value-parameter maxSpaces: Int defined in org.jetbrains.kotlin.idea.formatter.KotlinSpacingBuilderUtilImpl.createLineFeedDependentSpacing[ValueParameterDescriptorImpl]

'dependency' @ [116:68] ==> value-parameter dependency: TextRange defined in org.jetbrains.kotlin.idea.formatter.KotlinSpacingBuilderUtilImpl.createLineFeedDependentSpacing[ValueParameterDescriptorImpl]

'keepLineBreaks' @ [116:80] ==> value-parameter keepLineBreaks: Boolean defined in org.jetbrains.kotlin.idea.formatter.KotlinSpacingBuilderUtilImpl.createLineFeedDependentSpacing[ValueParameterDescriptorImpl]

'keepBlankLines' @ [116:96] ==> value-parameter keepBlankLines: Int defined in org.jetbrains.kotlin.idea.formatter.KotlinSpacingBuilderUtilImpl.createLineFeedDependentSpacing[ValueParameterDescriptorImpl]

'rule' @ [116:112] ==> value-parameter rule: DependentSpacingRule defined in org.jetbrains.kotlin.idea.formatter.KotlinSpacingBuilderUtilImpl.createLineFeedDependentSpacing[ValueParameterDescriptorImpl]

'super' @ [118:32] ==> <this> defined in org.jetbrains.kotlin.idea.formatter.KotlinSpacingBuilderUtilImpl.createLineFeedDependentSpacing.<no name provided>[LazyClassReceiverParameterDescriptor]

'getMinLineFeeds' @ [118:38] ==> public open fun getMinLineFeeds(): Int defined in com.intellij.formatting.DependantSpacingImpl[JavaMethodDescriptor]

'if (superMin == 0) minimumLineFeeds else superMin' @ [119:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'superMin' @ [119:28] ==> val superMin: Int defined in org.jetbrains.kotlin.idea.formatter.KotlinSpacingBuilderUtilImpl.createLineFeedDependentSpacing.<no name provided>.getMinLineFeeds[LocalVariableDescriptor]

'minimumLineFeeds' @ [119:43] ==> value-parameter minimumLineFeeds: Int defined in org.jetbrains.kotlin.idea.formatter.KotlinSpacingBuilderUtilImpl.createLineFeedDependentSpacing[ValueParameterDescriptorImpl]

'superMin' @ [119:65] ==> val superMin: Int defined in org.jetbrains.kotlin.idea.formatter.KotlinSpacingBuilderUtilImpl.createLineFeedDependentSpacing.<no name provided>.getMinLineFeeds[LocalVariableDescriptor]

'if (alignOption) createAlignmentOrDefault(null, defaultAlignment) else defaultAlignment' @ [126:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Alignment?, elseBranch: Alignment?): Alignment?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Alignment?

'alignOption' @ [126:16] ==> value-parameter alignOption: Boolean defined in org.jetbrains.kotlin.idea.formatter.createAlignment[ValueParameterDescriptorImpl]

'createAlignmentOrDefault' @ [126:29] ==> private fun createAlignmentOrDefault(base: Alignment?, defaultAlignment: Alignment?): Alignment? defined in org.jetbrains.kotlin.idea.formatter in file KotlinBlock.kt[SimpleFunctionDescriptorImpl]

'defaultAlignment' @ [126:60] ==> value-parameter defaultAlignment: Alignment? defined in org.jetbrains.kotlin.idea.formatter.createAlignment[ValueParameterDescriptorImpl]

'defaultAlignment' @ [126:83] ==> value-parameter defaultAlignment: Alignment? defined in org.jetbrains.kotlin.idea.formatter.createAlignment[ValueParameterDescriptorImpl]

'defaultAlignment' @ [130:12] ==> value-parameter defaultAlignment: Alignment? defined in org.jetbrains.kotlin.idea.formatter.createAlignmentOrDefault[ValueParameterDescriptorImpl]

'if (base == null) Alignment.createAlignment() else Alignment.createChildAlignment(base)' @ [130:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Alignment..Alignment?), elseBranch: (Alignment..Alignment?)): (Alignment..Alignment?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.formatting.Alignment..com.intellij.formatting.Alignment?)

'base' @ [130:36] ==> value-parameter base: Alignment? defined in org.jetbrains.kotlin.idea.formatter.createAlignmentOrDefault[ValueParameterDescriptorImpl]

'createAlignment' @ [130:60] ==> public open fun createAlignment(): (Alignment..Alignment?) defined in com.intellij.formatting.Alignment[JavaMethodDescriptor]

'createChildAlignment' @ [130:93] ==> public open fun createChildAlignment(p0: (Alignment..Alignment?)): (Alignment..Alignment?) defined in com.intellij.formatting.Alignment[JavaMethodDescriptor]

'base' @ [130:114] ==> value-parameter base: Alignment? defined in org.jetbrains.kotlin.idea.formatter.createAlignmentOrDefault[ValueParameterDescriptorImpl]

