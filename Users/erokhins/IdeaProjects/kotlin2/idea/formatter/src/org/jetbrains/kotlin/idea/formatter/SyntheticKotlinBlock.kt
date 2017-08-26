'TextRange' @ [39:29] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'subBlocks' @ [40:13] ==> private final val subBlocks: MutableList<Block> defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock[PropertyDescriptorImpl]

'first' @ [40:23] ==> public fun <T> List<Block>.first(): Block defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Block

'textRange' @ [40:31] ==> public final val Block.textRange: TextRange[MyPropertyDescriptor]

'startOffset' @ [40:41] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'subBlocks' @ [41:13] ==> private final val subBlocks: MutableList<Block> defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock[PropertyDescriptorImpl]

'last' @ [41:23] ==> public fun <T> List<Block>.last(): Block defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Block

'textRange' @ [41:30] ==> public final val Block.textRange: TextRange[MyPropertyDescriptor]

'endOffset' @ [41:40] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'textRange' @ [43:46] ==> private final val textRange: TextRange defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock[PropertyDescriptorImpl]

'subBlocks' @ [44:35] ==> private final val subBlocks: MutableList<Block> defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock[PropertyDescriptorImpl]

'wrap' @ [45:30] ==> private final val wrap: Wrap? defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock[PropertyDescriptorImpl]

'indent' @ [46:32] ==> private final val indent: Indent? defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock[PropertyDescriptorImpl]

'alignment' @ [47:35] ==> private final val alignment: Alignment? defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock[PropertyDescriptorImpl]

'ChildAttributes' @ [48:59] ==> public constructor ChildAttributes(@Nullable p0: Indent?, @Nullable p1: Alignment?) defined in com.intellij.formatting.ChildAttributes[JavaClassConstructorDescriptor]

'getIndent' @ [48:75] ==> public open fun getIndent(): Indent? defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock[SimpleFunctionDescriptorImpl]

'getSubBlocks' @ [49:35] ==> public open fun getSubBlocks(): MutableList<Block> defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock[SimpleFunctionDescriptorImpl]

'last' @ [49:50] ==> public fun <T> List<Block>.last(): Block defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Block

'isIncomplete' @ [49:57] ==> public final val Block.isIncomplete: Boolean[MyPropertyDescriptor]

'node' @ [51:30] ==> private final val node: ASTNode defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock[PropertyDescriptorImpl]

'spacingBuilder' @ [53:16] ==> private final val spacingBuilder: KotlinSpacingBuilder defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock[PropertyDescriptorImpl]

'getSpacing' @ [53:31] ==> public final fun getSpacing(parent: Block, child1: Block?, child2: Block): Spacing? defined in org.jetbrains.kotlin.idea.formatter.KotlinSpacingBuilder[SimpleFunctionDescriptorImpl]

'invoke' @ [53:42] ==> public abstract operator fun invoke(p1: ASTNode): ASTBlock defined in kotlin.Function1[FunctionInvokeDescriptor]

'node' @ [53:74] ==> private final val node: ASTNode defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock[PropertyDescriptorImpl]

'treeParent' @ [53:79] ==> public final val ASTNode.treeParent: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'child1' @ [53:94] ==> value-parameter child1: Block? defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.getSpacing[ValueParameterDescriptorImpl]

'child2' @ [53:102] ==> value-parameter child2: Block defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.getSpacing[ValueParameterDescriptorImpl]

'subBlocks' @ [58:21] ==> private final val subBlocks: MutableList<Block> defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock[PropertyDescriptorImpl]

'first' @ [58:31] ==> public fun <T> List<Block>.first(): Block defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Block

'treeNode' @ [62:16] ==> var treeNode: ASTNode? defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.toString[LocalVariableDescriptor]

'when (child) {
            is SyntheticKotlinBlock -> child = child.getSubBlocks().first()

            is ASTBlock -> treeNode = child.node

            else -> break@loop
        }' @ [62:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'child' @ [62:40] ==> var child: Block defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.toString[LocalVariableDescriptor]

'child' @ [63:40] ==> var child: Block defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.toString[LocalVariableDescriptor]

'child' @ [63:48] ==> var child: Block defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.toString[LocalVariableDescriptor]

'getSubBlocks' @ [63:54] ==> public open fun getSubBlocks(): MutableList<Block> defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock[SimpleFunctionDescriptorImpl]

'first' @ [63:69] ==> public fun <T> List<Block>.first(): Block defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Block

'treeNode' @ [65:28] ==> var treeNode: ASTNode? defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.toString[LocalVariableDescriptor]

'child' @ [65:39] ==> var child: Block defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.toString[LocalVariableDescriptor]

'node' @ [65:45] ==> public final val ASTBlock.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'getTextRange' @ [70:25] ==> public open fun getTextRange(): TextRange defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock[SimpleFunctionDescriptorImpl]

'treeNode' @ [71:13] ==> var treeNode: ASTNode? defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.toString[LocalVariableDescriptor]

'treeNode' @ [72:23] ==> var treeNode: ASTNode? defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.toString[LocalVariableDescriptor]

'psi' @ [72:32] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'psi' @ [73:17] ==> val psi: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.toString[LocalVariableDescriptor]

'psi' @ [74:28] ==> val psi: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.toString[LocalVariableDescriptor]

'containingFile' @ [74:32] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'file' @ [75:21] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.toString[LocalVariableDescriptor]

'file' @ [76:28] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.toString[LocalVariableDescriptor]

'text' @ [76:33] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'subSequence' @ [76:40] ==> public open fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'textRange' @ [76:52] ==> val textRange: TextRange defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.toString[LocalVariableDescriptor]

'startOffset' @ [76:62] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'textRange' @ [76:75] ==> val textRange: TextRange defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.toString[LocalVariableDescriptor]

'endOffset' @ [76:85] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'toString' @ [76:96] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'textRange' @ [76:115] ==> val textRange: TextRange defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.toString[LocalVariableDescriptor]

'this' @ [81:16] ==> <this> defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock[LazyClassReceiverParameterDescriptor]

'java' @ [81:28] ==> public val <T> KClass<out SyntheticKotlinBlock>.java: Class<out SyntheticKotlinBlock> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SyntheticKotlinBlock

'name' @ [81:33] ==> public final val <T : (Any..Any?)> Class<out SyntheticKotlinBlock>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SyntheticKotlinBlock

'textRange' @ [81:47] ==> val textRange: TextRange defined in org.jetbrains.kotlin.idea.formatter.SyntheticKotlinBlock.toString[LocalVariableDescriptor]

