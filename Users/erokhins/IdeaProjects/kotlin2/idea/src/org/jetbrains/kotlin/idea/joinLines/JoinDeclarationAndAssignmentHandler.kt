'file' @ [37:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.tryJoinRawLines[ValueParameterDescriptorImpl]

'-' @ [37:37] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'file' @ [39:23] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.tryJoinRawLines[ValueParameterDescriptorImpl]

'findElementAt' @ [39:28] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'start' @ [39:42] ==> value-parameter start: Int defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.tryJoinRawLines[ValueParameterDescriptorImpl]

'siblings' @ [40:33] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [41:33] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'!' @ [41:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isToSkip' @ [41:48] ==> private final fun isToSkip(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler[SimpleFunctionDescriptorImpl]

'it' @ [41:57] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.tryJoinRawLines.<anonymous>[ValueParameterDescriptorImpl]

'-' @ [41:74] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'element' @ [43:20] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.tryJoinRawLines[LocalVariableDescriptor]

'parentsWithSelf' @ [43:28] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'mapNotNull' @ [44:29] ==> public fun <T, R : Any> Sequence<PsiElement>.mapNotNull(transform: (PsiElement) -> Pair<KtProperty, KtBinaryExpression>?): Sequence<Pair<KtProperty, KtBinaryExpression>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R : Any> -> Pair<KtProperty, KtBinaryExpression>

'getPropertyAndAssignment' @ [44:42] ==> private final fun getPropertyAndAssignment(element: PsiElement): Pair<KtProperty, KtBinaryExpression>? defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler[SimpleFunctionDescriptorImpl]

'it' @ [44:67] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.tryJoinRawLines.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [45:29] ==> public fun <T> Sequence<Pair<KtProperty, KtBinaryExpression>>.firstOrNull(): Pair<KtProperty, KtBinaryExpression>? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtProperty, KtBinaryExpression>

'-' @ [45:53] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'component1' @ [46:14] ==> public final operator fun component1(): KtProperty defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [46:24] ==> public final operator fun component2(): KtBinaryExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'pair' @ [46:38] ==> val pair: Pair<KtProperty, KtBinaryExpression> defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.tryJoinRawLines[LocalVariableDescriptor]

'doJoin' @ [48:9] ==> private final fun doJoin(property: KtProperty, assignment: KtBinaryExpression): Unit defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler[SimpleFunctionDescriptorImpl]

'property' @ [48:16] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.tryJoinRawLines[LocalVariableDescriptor]

'assignment' @ [48:26] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.tryJoinRawLines[LocalVariableDescriptor]

'property' @ [49:16] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.tryJoinRawLines[LocalVariableDescriptor]

'textRange' @ [49:25] ==> public final val KtProperty.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [49:37] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'-' @ [53:15] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'element' @ [56:24] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.getPropertyAndAssignment[ValueParameterDescriptorImpl]

'property' @ [57:13] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.getPropertyAndAssignment[LocalVariableDescriptor]

'hasInitializer' @ [57:22] ==> public open fun hasInitializer(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'element' @ [59:26] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.getPropertyAndAssignment[ValueParameterDescriptorImpl]

'siblings' @ [59:34] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [60:35] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'!' @ [60:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isToSkip' @ [60:50] ==> private final fun isToSkip(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler[SimpleFunctionDescriptorImpl]

'it' @ [60:59] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.getPropertyAndAssignment.<anonymous>[ValueParameterDescriptorImpl]

'assignment' @ [61:13] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.getPropertyAndAssignment[LocalVariableDescriptor]

'operationToken' @ [61:24] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQ' @ [61:51] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'assignment' @ [63:20] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.getPropertyAndAssignment[LocalVariableDescriptor]

'left' @ [63:31] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'assignment' @ [64:13] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.getPropertyAndAssignment[LocalVariableDescriptor]

'right' @ [64:24] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'left' @ [65:13] ==> val left: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.getPropertyAndAssignment[LocalVariableDescriptor]

'getReferencedName' @ [65:18] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'property' @ [65:41] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.getPropertyAndAssignment[LocalVariableDescriptor]

'name' @ [65:50] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'property' @ [67:16] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.getPropertyAndAssignment[LocalVariableDescriptor]

'assignment' @ [67:28] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.getPropertyAndAssignment[LocalVariableDescriptor]

'property' @ [71:9] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.doJoin[ValueParameterDescriptorImpl]

'initializer' @ [71:18] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'assignment' @ [71:32] ==> value-parameter assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.doJoin[ValueParameterDescriptorImpl]

'right' @ [71:43] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'property' @ [72:9] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.doJoin[ValueParameterDescriptorImpl]

'parent' @ [72:18] ==> public final val KtProperty.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'deleteChildRange' @ [72:25] ==> public abstract fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'property' @ [72:42] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.doJoin[ValueParameterDescriptorImpl]

'nextSibling' @ [72:51] ==> public final val KtProperty.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'assignment' @ [72:64] ==> value-parameter assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.doJoin[ValueParameterDescriptorImpl]

'when (element) {
            is PsiWhiteSpace -> StringUtil.getLineBreakCount(element.getText()!!) <= 1 // do not skip blank line
            else -> element.node!!.elementType == KtTokens.SEMICOLON
        }' @ [76:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'element' @ [76:22] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.isToSkip[ValueParameterDescriptorImpl]

'<=' @ [77:33] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'getLineBreakCount' @ [77:44] ==> @Contract public open fun getLineBreakCount(@NotNull p0: CharSequence): Int defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'element' @ [77:62] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.isToSkip[ValueParameterDescriptorImpl]

'getText' @ [77:70] ==> @NonNls @Contract public abstract fun getText(): (String..String?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'element' @ [78:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.joinLines.JoinDeclarationAndAssignmentHandler.isToSkip[ValueParameterDescriptorImpl]

'node' @ [78:29] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [78:36] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'SEMICOLON' @ [78:60] ==> public final val SEMICOLON: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

