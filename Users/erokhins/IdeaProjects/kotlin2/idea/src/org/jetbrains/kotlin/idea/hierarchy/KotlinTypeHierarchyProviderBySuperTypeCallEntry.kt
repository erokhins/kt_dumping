'JavaTypeHierarchyProvider' @ [35:57] ==> public constructor JavaTypeHierarchyProvider() defined in com.intellij.ide.hierarchy.type.JavaTypeHierarchyProvider[JavaClassConstructorDescriptor]

'?:' @ [37:23] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Project?, right: Project): Project[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Project

'PROJECT' @ [37:40] ==> public final val PROJECT: (DataKey<(Project..Project?)>..DataKey<(Project..Project?)>?) defined in com.intellij.openapi.actionSystem.PlatformDataKeys[JavaPropertyDescriptor]

'getData' @ [37:48] ==> @Nullable public open fun getData(@NotNull p0: DataContext): Project? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'dataContext' @ [37:56] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[ValueParameterDescriptorImpl]

'?:' @ [38:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Editor?, right: Editor): Editor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Editor

'EDITOR' @ [38:39] ==> public final val EDITOR: (DataKey<(Editor..Editor?)>..DataKey<(Editor..Editor?)>?) defined in com.intellij.openapi.actionSystem.PlatformDataKeys[JavaPropertyDescriptor]

'getData' @ [38:46] ==> @Nullable public open fun getData(@NotNull p0: DataContext): Editor? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'dataContext' @ [38:54] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[ValueParameterDescriptorImpl]

'?:' @ [40:20] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiFile?, right: PsiFile): PsiFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiFile

'getInstance' @ [40:39] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [40:51] ==> val project: Project defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[LocalVariableDescriptor]

'getPsiFile' @ [40:60] ==> @Nullable public abstract fun getPsiFile(@NotNull p0: Document): PsiFile? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [40:71] ==> val editor: Editor defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[LocalVariableDescriptor]

'document' @ [40:78] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'editor' @ [42:22] ==> val editor: Editor defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[LocalVariableDescriptor]

'caretModel' @ [42:29] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [42:40] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'file' @ [43:30] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[LocalVariableDescriptor]

'findElementAt' @ [43:35] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'offset' @ [43:49] ==> val offset: Int defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[LocalVariableDescriptor]

'elementAtCaret' @ [44:13] ==> val elementAtCaret: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [44:28] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtSuperTypeCallEntry.() -> PsiElement?): KtSuperTypeCallEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSuperTypeCallEntry

'calleeExpression' @ [44:77] ==> public final val KtSuperTypeCallEntry.calleeExpression: KtConstructorCalleeExpression[MyPropertyDescriptor]

'PSI_ELEMENT' @ [46:44] ==> public final val PSI_ELEMENT: (DataKey<(PsiElement..PsiElement?)>..DataKey<(PsiElement..PsiElement?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'getData' @ [46:56] ==> @Nullable public open fun getData(@NotNull p0: DataContext): PsiElement? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'dataContext' @ [46:64] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[ValueParameterDescriptorImpl]

'unwrapped' @ [46:78] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'when {
            targetElement is KtConstructor<*> -> targetElement.containingClassOrObject?.toLightClass()
            targetElement is PsiMethod && targetElement.isConstructor -> targetElement.containingClass
            targetElement is KtClassOrObject -> targetElement.toLightClass()
            targetElement is PsiClass -> targetElement
            else -> null
        }' @ [47:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?, entry3: PsiElement?, entry4: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'targetElement' @ [48:13] ==> val targetElement: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[LocalVariableDescriptor]

'targetElement' @ [48:50] ==> val targetElement: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[LocalVariableDescriptor]

'containingClassOrObject' @ [48:64] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'toLightClass' @ [48:89] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'targetElement' @ [49:13] ==> val targetElement: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[LocalVariableDescriptor]

'targetElement' @ [49:43] ==> val targetElement: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[LocalVariableDescriptor]

'isConstructor' @ [49:57] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'targetElement' @ [49:74] ==> val targetElement: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[LocalVariableDescriptor]

'containingClass' @ [49:88] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'targetElement' @ [50:13] ==> val targetElement: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[LocalVariableDescriptor]

'targetElement' @ [50:49] ==> val targetElement: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[LocalVariableDescriptor]

'toLightClass' @ [50:63] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'targetElement' @ [51:13] ==> val targetElement: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[LocalVariableDescriptor]

'targetElement' @ [51:42] ==> val targetElement: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProviderBySuperTypeCallEntry.getTarget[LocalVariableDescriptor]

