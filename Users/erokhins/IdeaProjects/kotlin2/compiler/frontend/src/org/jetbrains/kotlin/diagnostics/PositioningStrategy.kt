'mark' @ [30:16] ==> public open fun mark(element: E): List<TextRange> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'diagnostic' @ [30:21] ==> value-parameter diagnostic: ParametrizedDiagnostic<out E> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy.markDiagnostic[ValueParameterDescriptorImpl]

'psiElement' @ [30:32] ==> public final val <E : (PsiElement..PsiElement?)> ParametrizedDiagnostic<out E>.psiElement: E[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> E

'markElement' @ [34:16] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics[SimpleFunctionDescriptorImpl]

'element' @ [34:28] ==> value-parameter element: E defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy.mark[ValueParameterDescriptorImpl]

'!' @ [38:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasSyntaxErrors' @ [38:17] ==> public fun hasSyntaxErrors(psiElement: PsiElement): Boolean defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [38:33] ==> value-parameter element: E defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy.isValid[ValueParameterDescriptorImpl]

'listOf' @ [43:12] ==> public fun <T> listOf(element: TextRange): List<TextRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextRange

'TextRange' @ [43:19] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'getStartOffset' @ [43:29] ==> private fun getStartOffset(element: PsiElement): Int defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [43:44] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.markElement[ValueParameterDescriptorImpl]

'getEndOffset' @ [43:54] ==> private fun getEndOffset(element: PsiElement): Int defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [43:67] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.markElement[ValueParameterDescriptorImpl]

'markElement' @ [47:12] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics[SimpleFunctionDescriptorImpl]

'node' @ [47:24] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.diagnostics.markNode[ValueParameterDescriptorImpl]

'psi' @ [47:29] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'listOf' @ [51:12] ==> public fun <T> listOf(element: TextRange): List<TextRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextRange

'range' @ [51:19] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.diagnostics.markRange[ValueParameterDescriptorImpl]

'markRange' @ [55:12] ==> public fun markRange(range: TextRange): List<TextRange> defined in org.jetbrains.kotlin.diagnostics[SimpleFunctionDescriptorImpl]

'TextRange' @ [55:22] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'getStartOffset' @ [55:32] ==> private fun getStartOffset(element: PsiElement): Int defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'from' @ [55:47] ==> value-parameter from: PsiElement defined in org.jetbrains.kotlin.diagnostics.markRange[ValueParameterDescriptorImpl]

'getEndOffset' @ [55:54] ==> private fun getEndOffset(element: PsiElement): Int defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'to' @ [55:67] ==> value-parameter to: PsiElement defined in org.jetbrains.kotlin.diagnostics.markRange[ValueParameterDescriptorImpl]

'element' @ [59:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.getStartOffset[ValueParameterDescriptorImpl]

'firstChild' @ [59:25] ==> public final val PsiElement.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'child' @ [60:9] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.diagnostics.getStartOffset[LocalVariableDescriptor]

'child' @ [61:16] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.diagnostics.getStartOffset[LocalVariableDescriptor]

'child' @ [61:39] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.diagnostics.getStartOffset[LocalVariableDescriptor]

'child' @ [62:13] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.diagnostics.getStartOffset[LocalVariableDescriptor]

'child' @ [62:21] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.diagnostics.getStartOffset[LocalVariableDescriptor]

'nextSibling' @ [62:27] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'child' @ [64:13] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.diagnostics.getStartOffset[LocalVariableDescriptor]

'getStartOffset' @ [65:20] ==> private fun getStartOffset(element: PsiElement): Int defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'child' @ [65:35] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.diagnostics.getStartOffset[LocalVariableDescriptor]

'element' @ [68:12] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.getStartOffset[ValueParameterDescriptorImpl]

'startOffset' @ [68:20] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'element' @ [72:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.getEndOffset[ValueParameterDescriptorImpl]

'lastChild' @ [72:25] ==> public final val PsiElement.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'child' @ [73:9] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.diagnostics.getEndOffset[LocalVariableDescriptor]

'child' @ [74:16] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.diagnostics.getEndOffset[LocalVariableDescriptor]

'child' @ [74:39] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.diagnostics.getEndOffset[LocalVariableDescriptor]

'child' @ [75:13] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.diagnostics.getEndOffset[LocalVariableDescriptor]

'child' @ [75:21] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.diagnostics.getEndOffset[LocalVariableDescriptor]

'prevSibling' @ [75:27] ==> public final val PsiElement.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'child' @ [77:13] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.diagnostics.getEndOffset[LocalVariableDescriptor]

'getEndOffset' @ [78:20] ==> private fun getEndOffset(element: PsiElement): Int defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'child' @ [78:33] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.diagnostics.getEndOffset[LocalVariableDescriptor]

'element' @ [81:12] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.getEndOffset[ValueParameterDescriptorImpl]

'endOffset' @ [81:20] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'psiElement' @ [85:9] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.diagnostics.hasSyntaxErrors[ValueParameterDescriptorImpl]

'psiElement' @ [87:20] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.diagnostics.hasSyntaxErrors[ValueParameterDescriptorImpl]

'children' @ [87:31] ==> public final val PsiElement.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'children' @ [88:12] ==> val children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>) defined in org.jetbrains.kotlin.diagnostics.hasSyntaxErrors[LocalVariableDescriptor]

'isNotEmpty' @ [88:21] ==> @InlineOnly public inline fun <T> Array<out (PsiElement..PsiElement?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'hasSyntaxErrors' @ [88:37] ==> public fun hasSyntaxErrors(psiElement: PsiElement): Boolean defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'children' @ [88:53] ==> val children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>) defined in org.jetbrains.kotlin.diagnostics.hasSyntaxErrors[LocalVariableDescriptor]

'last' @ [88:62] ==> public fun <T> Array<out (PsiElement..PsiElement?)>.last(): (PsiElement..PsiElement?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

