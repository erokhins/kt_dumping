'AutomaticTestRenamerFactory' @ [32:43] ==> public constructor AutomaticTestRenamerFactory() defined in com.intellij.refactoring.rename.naming.AutomaticTestRenamerFactory[JavaClassConstructorDescriptor]

'when (element) {
            is KtLightClassForSourceDeclaration -> element
            is KtClassOrObject -> element.toLightClass()
            is KtFile -> element.findFacadeClass()
            else -> null
        }' @ [34:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiClass?, entry1: PsiClass?, entry2: PsiClass?, entry3: PsiClass?): PsiClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiClass?

'element' @ [34:22] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinAutomaticTestRenamerFactory.getPsiClass[ValueParameterDescriptorImpl]

'element' @ [35:52] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinAutomaticTestRenamerFactory.getPsiClass[ValueParameterDescriptorImpl]

'element' @ [36:35] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinAutomaticTestRenamerFactory.getPsiClass[ValueParameterDescriptorImpl]

'toLightClass' @ [36:43] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'element' @ [37:26] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinAutomaticTestRenamerFactory.getPsiClass[ValueParameterDescriptorImpl]

'findFacadeClass' @ [37:34] ==> public fun KtFile.findFacadeClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'getPsiClass' @ [43:24] ==> private final fun getPsiClass(element: PsiElement): PsiClass? defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinAutomaticTestRenamerFactory[SimpleFunctionDescriptorImpl]

'element' @ [43:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinAutomaticTestRenamerFactory.isApplicable[ValueParameterDescriptorImpl]

'super' @ [44:16] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinAutomaticTestRenamerFactory[LazyClassReceiverParameterDescriptor]

'isApplicable' @ [44:22] ==> public open fun isApplicable(@NotNull p0: PsiElement): Boolean defined in com.intellij.refactoring.rename.naming.AutomaticTestRenamerFactory[JavaMethodDescriptor]

'psiClass' @ [44:35] ==> val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinAutomaticTestRenamerFactory.isApplicable[LocalVariableDescriptor]

'getPsiClass' @ [48:24] ==> private final fun getPsiClass(element: PsiElement): PsiClass? defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinAutomaticTestRenamerFactory[SimpleFunctionDescriptorImpl]

'element' @ [48:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinAutomaticTestRenamerFactory.createRenamer[ValueParameterDescriptorImpl]

'if (psiClass is KtLightClassForFacade) PackagePartClassUtils.getFilePartShortName(newName) else newName' @ [49:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'psiClass' @ [49:35] ==> val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinAutomaticTestRenamerFactory.createRenamer[LocalVariableDescriptor]

'PackagePartClassUtils' @ [49:70] ==> public object PackagePartClassUtils defined in org.jetbrains.kotlin.load.kotlin[FakeCallableDescriptorForObject]

'getFilePartShortName' @ [49:92] ==> @JvmStatic public final fun getFilePartShortName(fileName: String): String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[DeserializedSimpleFunctionDescriptor]

'newName' @ [49:113] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinAutomaticTestRenamerFactory.createRenamer[ValueParameterDescriptorImpl]

'newName' @ [49:127] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinAutomaticTestRenamerFactory.createRenamer[ValueParameterDescriptorImpl]

'super' @ [50:16] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinAutomaticTestRenamerFactory[LazyClassReceiverParameterDescriptor]

'createRenamer' @ [50:22] ==> public open fun createRenamer(p0: (PsiElement..PsiElement?), p1: (String..String?), p2: (MutableCollection<(UsageInfo..UsageInfo?)>..Collection<(UsageInfo..UsageInfo?)>?)): AutomaticRenamer defined in com.intellij.refactoring.rename.naming.AutomaticTestRenamerFactory[JavaMethodDescriptor]

'psiClass' @ [50:36] ==> val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinAutomaticTestRenamerFactory.createRenamer[LocalVariableDescriptor]

'newPsiClassName' @ [50:46] ==> val newPsiClassName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinAutomaticTestRenamerFactory.createRenamer[LocalVariableDescriptor]

'usages' @ [50:63] ==> value-parameter usages: MutableCollection<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinAutomaticTestRenamerFactory.createRenamer[ValueParameterDescriptorImpl]

