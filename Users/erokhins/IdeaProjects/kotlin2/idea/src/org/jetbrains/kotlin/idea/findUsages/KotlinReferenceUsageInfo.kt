'UsageInfo' @ [23:59] ==> public constructor UsageInfo(@NotNull p0: PsiReference) defined in com.intellij.usageView.UsageInfo[JavaClassConstructorDescriptor]

'reference' @ [23:69] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.findUsages.KotlinReferenceUsageInfo.<init>[ValueParameterDescriptorImpl]

'reference' @ [24:33] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.findUsages.KotlinReferenceUsageInfo.<init>[ValueParameterDescriptorImpl]

'java' @ [24:50] ==> public val <T> KClass<out PsiReference>.java: Class<out PsiReference> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out PsiReference)

'element' @ [27:23] ==> public final val KotlinReferenceUsageInfo.element: PsiElement?[MyPropertyDescriptor]

'element' @ [28:16] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.KotlinReferenceUsageInfo.getReference[LocalVariableDescriptor]

'references' @ [28:24] ==> public final val PsiElement.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'singleOrNull' @ [28:35] ==> public inline fun <T> Array<out (PsiReference..PsiReference?)>.singleOrNull(predicate: ((PsiReference..PsiReference?)) -> Boolean): PsiReference? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'it' @ [28:50] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.findUsages.KotlinReferenceUsageInfo.getReference.<anonymous>[ValueParameterDescriptorImpl]

'java' @ [28:60] ==> public val <T> KClass<out (PsiReference..PsiReference?)>.java: Class<out (PsiReference..PsiReference?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?))

'referenceType' @ [28:68] ==> private final val referenceType: Class<out PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.KotlinReferenceUsageInfo[PropertyDescriptorImpl]

