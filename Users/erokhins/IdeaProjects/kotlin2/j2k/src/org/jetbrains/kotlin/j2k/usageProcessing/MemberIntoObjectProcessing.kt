'member' @ [22:52] ==> private final val member: PsiMember defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing[PropertyDescriptorImpl]

'listOf' @ [26:39] ==> public fun <T> listOf(element: MemberIntoObjectProcessing.AppendObjectNameProcessor): List<MemberIntoObjectProcessing.AppendObjectNameProcessor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AppendObjectNameProcessor

'AppendObjectNameProcessor' @ [26:46] ==> public constructor AppendObjectNameProcessor() defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing.AppendObjectNameProcessor[ClassConstructorDescriptorImpl]

'emptyList' @ [28:41] ==> public fun <T> emptyList(): List<ExternalCodeProcessor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExternalCodeProcessor

'reference' @ [32:27] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing.AppendObjectNameProcessor.processUsage[ValueParameterDescriptorImpl]

'element' @ [32:37] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'refExpr' @ [33:29] ==> val refExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing.AppendObjectNameProcessor.processUsage[LocalVariableDescriptor]

'qualifierExpression' @ [33:37] ==> public final var PsiReferenceExpression.qualifierExpression: PsiExpression?[MyPropertyDescriptor]

'getInstance' @ [34:53] ==> public open fun getInstance(p0: (Project..Project?)): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.PsiElementFactory.SERVICE[JavaMethodDescriptor]

'member' @ [34:65] ==> private final val member: PsiMember defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing[PropertyDescriptorImpl]

'project' @ [34:72] ==> public final val PsiMember.project: Project[MyPropertyDescriptor]

'if (qualifier != null) {
                val newQualifier = factory.createExpressionFromText(qualifier.text + "." + objectName, null)
                qualifier.replace(newQualifier)
                arrayOf(reference)
            }
            else {
                var qualifiedExpr = factory.createExpressionFromText(objectName + "." + refExpr.text, null) as PsiReferenceExpression
                qualifiedExpr = refExpr.replace(qualifiedExpr) as PsiReferenceExpression
                arrayOf(qualifiedExpr)
            }' @ [35:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<PsiReference>?, elseBranch: Array<PsiReference>?): Array<PsiReference>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<PsiReference>?

'qualifier' @ [35:24] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing.AppendObjectNameProcessor.processUsage[LocalVariableDescriptor]

'factory' @ [36:36] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing.AppendObjectNameProcessor.processUsage[LocalVariableDescriptor]

'createExpressionFromText' @ [36:44] ==> @NotNull public abstract fun createExpressionFromText(@NotNull p0: String, @Nullable p1: PsiElement?): PsiExpression defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'qualifier' @ [36:69] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing.AppendObjectNameProcessor.processUsage[LocalVariableDescriptor]

'text' @ [36:79] ==> public final val PsiExpression.text: (String..String?)[MyPropertyDescriptor]

'objectName' @ [36:92] ==> private final val objectName: String defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing[PropertyDescriptorImpl]

'qualifier' @ [37:17] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing.AppendObjectNameProcessor.processUsage[LocalVariableDescriptor]

'replace' @ [37:27] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiExpression[JavaMethodDescriptor]

'newQualifier' @ [37:35] ==> val newQualifier: PsiExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing.AppendObjectNameProcessor.processUsage[LocalVariableDescriptor]

'arrayOf' @ [38:17] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiReference): Array<PsiReference> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiReference

'reference' @ [38:25] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing.AppendObjectNameProcessor.processUsage[ValueParameterDescriptorImpl]

'factory' @ [41:37] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing.AppendObjectNameProcessor.processUsage[LocalVariableDescriptor]

'createExpressionFromText' @ [41:45] ==> @NotNull public abstract fun createExpressionFromText(@NotNull p0: String, @Nullable p1: PsiElement?): PsiExpression defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'objectName' @ [41:70] ==> private final val objectName: String defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing[PropertyDescriptorImpl]

'refExpr' @ [41:89] ==> val refExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing.AppendObjectNameProcessor.processUsage[LocalVariableDescriptor]

'text' @ [41:97] ==> public final val PsiReferenceExpression.text: (String..String?)[MyPropertyDescriptor]

'qualifiedExpr' @ [42:17] ==> var qualifiedExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing.AppendObjectNameProcessor.processUsage[LocalVariableDescriptor]

'refExpr' @ [42:33] ==> val refExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing.AppendObjectNameProcessor.processUsage[LocalVariableDescriptor]

'replace' @ [42:41] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'qualifiedExpr' @ [42:49] ==> var qualifiedExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing.AppendObjectNameProcessor.processUsage[LocalVariableDescriptor]

'arrayOf' @ [43:17] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiReference): Array<PsiReference> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiReference

'qualifiedExpr' @ [43:25] ==> var qualifiedExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.MemberIntoObjectProcessing.AppendObjectNameProcessor.processUsage[LocalVariableDescriptor]

