'SafeDeleteReferenceSimpleDeleteUsageInfo' @ [32:5] ==> public constructor SafeDeleteReferenceSimpleDeleteUsageInfo(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?), p2: Boolean) defined in com.intellij.refactoring.safeDelete.usageInfo.SafeDeleteReferenceSimpleDeleteUsageInfo[JavaClassConstructorDescriptor]

'importDirective' @ [32:46] ==> value-parameter importDirective: KtImportDirective defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteImportDirectiveUsageInfo.<init>[ValueParameterDescriptorImpl]

'declaration' @ [32:63] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteImportDirectiveUsageInfo.<init>[ValueParameterDescriptorImpl]

'importDirective' @ [32:76] ==> value-parameter importDirective: KtImportDirective defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteImportDirectiveUsageInfo.<init>[ValueParameterDescriptorImpl]

'isSafeToDelete' @ [32:92] ==> private fun KtImportDirective.isSafeToDelete(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.safeDelete in file SafeDeleteImportDirectiveUsageInfo.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [32:107] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteImportDirectiveUsageInfo.<init>[ValueParameterDescriptorImpl]

'targetDescriptors' @ [35:32] ==> public fun KtImportDirective.targetDescriptors(resolutionFacade: ResolutionFacade = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'singleOrNull' @ [35:52] ==> public fun <T> Iterable<DeclarationDescriptor>.singleOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'element' @ [36:28] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.isSafeToDelete[ValueParameterDescriptorImpl]

'unwrapped' @ [36:36] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'when (unwrappedElement) {
        is KtDeclaration -> unwrappedElement.resolveToDescriptorIfAny(BodyResolveMode.FULL)
        is PsiMember -> unwrappedElement.getJavaMemberDescriptor()
        else -> return false
    }' @ [37:33] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?, entry2: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'unwrappedElement' @ [37:39] ==> val unwrappedElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.isSafeToDelete[LocalVariableDescriptor]

'unwrappedElement' @ [38:29] ==> val unwrappedElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.isSafeToDelete[LocalVariableDescriptor]

'resolveToDescriptorIfAny' @ [38:46] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [38:87] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'unwrappedElement' @ [39:25] ==> val unwrappedElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.isSafeToDelete[LocalVariableDescriptor]

'getJavaMemberDescriptor' @ [39:42] ==> @JvmOverloads public fun PsiMember.getJavaMemberDescriptor(resolutionFacade: ResolutionFacade? = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'referencedDescriptor' @ [42:12] ==> val referencedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.isSafeToDelete[LocalVariableDescriptor]

'declarationDescriptor' @ [42:36] ==> val declarationDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.isSafeToDelete[LocalVariableDescriptor]

