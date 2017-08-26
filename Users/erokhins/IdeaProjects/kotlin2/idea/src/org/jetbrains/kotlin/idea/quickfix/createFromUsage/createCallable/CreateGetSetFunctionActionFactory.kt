'CreateCallableMemberFromUsageFactory<KtArrayAccessExpression>' @ [27:80] ==> public constructor CreateCallableMemberFromUsageFactory<E : KtElement>(extensionsSupported: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtArrayAccessExpression

'when (diagnostic.factory) {
            Errors.NO_GET_METHOD -> if (isGet) Errors.NO_GET_METHOD.cast(diagnostic).psiElement else null
            Errors.NO_SET_METHOD -> if (!isGet) Errors.NO_SET_METHOD.cast(diagnostic).psiElement else null
            in Errors.TYPE_MISMATCH_ERRORS -> {
                val indicesNode = diagnostic.psiElement.parent as? KtContainerNode ?: return null
                if (indicesNode.node.elementType != KtNodeTypes.INDICES) return null
                val arrayAccess = indicesNode.parent as? KtArrayAccessExpression ?: return null
                val parent = arrayAccess.parent
                val isAssignmentLHS = KtPsiUtil.isAssignment(parent) && (parent as KtBinaryExpression).left == arrayAccess
                if (isAssignmentLHS == isGet) return null

                arrayAccess
            }
            else -> throw IllegalArgumentException("Unexpected diagnostic: ${diagnostic.factory.name}")
        }' @ [29:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtArrayAccessExpression?, entry1: KtArrayAccessExpression?, entry2: KtArrayAccessExpression?, entry3: KtArrayAccessExpression?): KtArrayAccessExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtArrayAccessExpression?

'diagnostic' @ [29:22] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateGetSetFunctionActionFactory.getElementOfInterest[ValueParameterDescriptorImpl]

'factory' @ [29:33] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'NO_GET_METHOD' @ [30:20] ==> public final val NO_GET_METHOD: (DiagnosticFactory0<(KtArrayAccessExpression..KtArrayAccessExpression?)>..DiagnosticFactory0<(KtArrayAccessExpression..KtArrayAccessExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'if (isGet) Errors.NO_GET_METHOD.cast(diagnostic).psiElement else null' @ [30:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtArrayAccessExpression?, elseBranch: KtArrayAccessExpression?): KtArrayAccessExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtArrayAccessExpression?

'isGet' @ [30:41] ==> private final val isGet: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateGetSetFunctionActionFactory[PropertyDescriptorImpl]

'NO_GET_METHOD' @ [30:55] ==> public final val NO_GET_METHOD: (DiagnosticFactory0<(KtArrayAccessExpression..KtArrayAccessExpression?)>..DiagnosticFactory0<(KtArrayAccessExpression..KtArrayAccessExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [30:69] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): SimpleDiagnostic<(KtArrayAccessExpression..KtArrayAccessExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'diagnostic' @ [30:74] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateGetSetFunctionActionFactory.getElementOfInterest[ValueParameterDescriptorImpl]

'psiElement' @ [30:86] ==> public final val <E : (PsiElement..PsiElement?)> SimpleDiagnostic<(KtArrayAccessExpression..KtArrayAccessExpression?)>.psiElement: KtArrayAccessExpression[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtArrayAccessExpression..org.jetbrains.kotlin.psi.KtArrayAccessExpression?)

'NO_SET_METHOD' @ [31:20] ==> public final val NO_SET_METHOD: (DiagnosticFactory0<(KtArrayAccessExpression..KtArrayAccessExpression?)>..DiagnosticFactory0<(KtArrayAccessExpression..KtArrayAccessExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'if (!isGet) Errors.NO_SET_METHOD.cast(diagnostic).psiElement else null' @ [31:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtArrayAccessExpression?, elseBranch: KtArrayAccessExpression?): KtArrayAccessExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtArrayAccessExpression?

'!' @ [31:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isGet' @ [31:42] ==> private final val isGet: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateGetSetFunctionActionFactory[PropertyDescriptorImpl]

'NO_SET_METHOD' @ [31:56] ==> public final val NO_SET_METHOD: (DiagnosticFactory0<(KtArrayAccessExpression..KtArrayAccessExpression?)>..DiagnosticFactory0<(KtArrayAccessExpression..KtArrayAccessExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [31:70] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): SimpleDiagnostic<(KtArrayAccessExpression..KtArrayAccessExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'diagnostic' @ [31:75] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateGetSetFunctionActionFactory.getElementOfInterest[ValueParameterDescriptorImpl]

'psiElement' @ [31:87] ==> public final val <E : (PsiElement..PsiElement?)> SimpleDiagnostic<(KtArrayAccessExpression..KtArrayAccessExpression?)>.psiElement: KtArrayAccessExpression[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtArrayAccessExpression..org.jetbrains.kotlin.psi.KtArrayAccessExpression?)

'in' @ [32:13] ==> public operator fun <@OnlyInputTypes T> Iterable<(DiagnosticFactory<*>..DiagnosticFactory<*>?)>.contains(element: (DiagnosticFactory<*>..DiagnosticFactory<*>?)): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactory<*>..org.jetbrains.kotlin.diagnostics.DiagnosticFactory<*>?)

'TYPE_MISMATCH_ERRORS' @ [32:23] ==> public final val TYPE_MISMATCH_ERRORS: (ImmutableSet<out (DiagnosticFactory<*>..DiagnosticFactory<*>?)>..ImmutableSet<out (DiagnosticFactory<*>..DiagnosticFactory<*>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'diagnostic' @ [33:35] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateGetSetFunctionActionFactory.getElementOfInterest[ValueParameterDescriptorImpl]

'psiElement' @ [33:46] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'parent' @ [33:57] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'indicesNode' @ [34:21] ==> val indicesNode: KtContainerNode defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateGetSetFunctionActionFactory.getElementOfInterest[LocalVariableDescriptor]

'node' @ [34:33] ==> public final val KtContainerNode.node: ASTNode[MyPropertyDescriptor]

'elementType' @ [34:38] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'INDICES' @ [34:65] ==> public final val INDICES: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'indicesNode' @ [35:35] ==> val indicesNode: KtContainerNode defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateGetSetFunctionActionFactory.getElementOfInterest[LocalVariableDescriptor]

'parent' @ [35:47] ==> public final val KtContainerNode.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'arrayAccess' @ [36:30] ==> val arrayAccess: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateGetSetFunctionActionFactory.getElementOfInterest[LocalVariableDescriptor]

'parent' @ [36:42] ==> public final val KtArrayAccessExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'isAssignment' @ [37:49] ==> public open fun isAssignment(@NotNull p0: PsiElement): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'parent' @ [37:62] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateGetSetFunctionActionFactory.getElementOfInterest[LocalVariableDescriptor]

'==' @ [37:73] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtExpression[DeserializedSimpleFunctionDescriptor]

'parent' @ [37:74] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateGetSetFunctionActionFactory.getElementOfInterest[LocalVariableDescriptor]

'left' @ [37:104] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'arrayAccess' @ [37:112] ==> val arrayAccess: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateGetSetFunctionActionFactory.getElementOfInterest[LocalVariableDescriptor]

'isAssignmentLHS' @ [38:21] ==> val isAssignmentLHS: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateGetSetFunctionActionFactory.getElementOfInterest[LocalVariableDescriptor]

'isGet' @ [38:40] ==> private final val isGet: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateGetSetFunctionActionFactory[PropertyDescriptorImpl]

'arrayAccess' @ [40:17] ==> val arrayAccess: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateGetSetFunctionActionFactory.getElementOfInterest[LocalVariableDescriptor]

'IllegalArgumentException' @ [42:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'diagnostic' @ [42:78] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateGetSetFunctionActionFactory.getElementOfInterest[ValueParameterDescriptorImpl]

'factory' @ [42:89] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'name' @ [42:97] ==> public final var <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.name: String[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> Captured(*)

