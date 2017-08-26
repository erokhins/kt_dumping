'JavaTypeHierarchyProvider' @ [41:37] ==> public constructor JavaTypeHierarchyProvider() defined in com.intellij.ide.hierarchy.type.JavaTypeHierarchyProvider[JavaClassConstructorDescriptor]

'findTargetElement' @ [43:40] ==> @Nullable public open fun findTargetElement(p0: (Editor..Editor?), p1: Int): PsiElement? defined in com.intellij.codeInsight.TargetElementUtil[JavaMethodDescriptor]

'editor' @ [43:58] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByReference[ValueParameterDescriptorImpl]

'getInstance' @ [43:84] ==> public open fun getInstance(): (TargetElementUtil..TargetElementUtil?) defined in com.intellij.codeInsight.TargetElementUtil[JavaMethodDescriptor]

'allAccepted' @ [43:98] ==> public final val TargetElementUtil.allAccepted: Int[MyPropertyDescriptor]

'when (target) {
            is PsiClass -> target
            is KtClassOrObject -> SourceNavigationHelper.getOriginalPsiClassOrCreateLightClass(target)
            is KtNamedFunction -> { // Factory methods
                val functionName = target.name
                val functionDescriptor = target.analyze()[BindingContext.FUNCTION, target] ?: return null
                val type = functionDescriptor.returnType ?: return null
                val returnTypeText = DescriptorRenderer.FQ_NAMES_IN_TYPES.renderType(type)
                if (returnTypeText != functionName) return null
                val classOrObject = KotlinClassShortNameIndex.getInstance()[functionName, project, project.allScope()].singleOrNull()
                                    ?: return null
                SourceNavigationHelper.getOriginalPsiClassOrCreateLightClass(classOrObject)
            }
            else -> null
        }' @ [45:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?, entry3: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'target' @ [45:22] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByReference[LocalVariableDescriptor]

'target' @ [46:28] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByReference[LocalVariableDescriptor]

'getOriginalPsiClassOrCreateLightClass' @ [47:58] ==> public final fun getOriginalPsiClassOrCreateLightClass(classOrObject: KtClassOrObject): PsiClass? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[DeserializedSimpleFunctionDescriptor]

'target' @ [47:96] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByReference[LocalVariableDescriptor]

'target' @ [49:36] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByReference[LocalVariableDescriptor]

'name' @ [49:43] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'target' @ [50:42] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByReference[LocalVariableDescriptor]

'analyze' @ [50:49] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FUNCTION' @ [50:74] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'target' @ [50:84] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByReference[LocalVariableDescriptor]

'functionDescriptor' @ [51:28] ==> val functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByReference[LocalVariableDescriptor]

'returnType' @ [51:47] ==> public final val SimpleFunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'DescriptorRenderer' @ [52:38] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [52:57] ==> @field:JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'renderType' @ [52:75] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [52:86] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByReference[LocalVariableDescriptor]

'returnTypeText' @ [53:21] ==> val returnTypeText: String defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByReference[LocalVariableDescriptor]

'functionName' @ [53:39] ==> val functionName: String? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByReference[LocalVariableDescriptor]

'KotlinClassShortNameIndex.getInstance()[functionName, project, project.allScope()]' @ [54:37] ==> @NotNull public open fun get(@NotNull p0: String, @NotNull p1: Project, @NotNull p2: GlobalSearchScope): (MutableCollection<(KtClassOrObject..KtClassOrObject?)>..Collection<(KtClassOrObject..KtClassOrObject?)>) defined in org.jetbrains.kotlin.idea.stubindex.KotlinClassShortNameIndex[JavaMethodDescriptor]

'getInstance' @ [54:63] ==> @NotNull public open fun getInstance(): KotlinClassShortNameIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinClassShortNameIndex[JavaMethodDescriptor]

'functionName' @ [54:77] ==> val functionName: String? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByReference[LocalVariableDescriptor]

'project' @ [54:91] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByReference[ValueParameterDescriptorImpl]

'project' @ [54:100] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByReference[ValueParameterDescriptorImpl]

'allScope' @ [54:108] ==> public fun Project.allScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.search[DeserializedSimpleFunctionDescriptor]

'singleOrNull' @ [54:120] ==> public fun <T> Iterable<(KtClassOrObject..KtClassOrObject?)>.singleOrNull(): KtClassOrObject? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)

'getOriginalPsiClassOrCreateLightClass' @ [56:40] ==> public final fun getOriginalPsiClassOrCreateLightClass(classOrObject: KtClassOrObject): PsiClass? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [56:78] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByReference[LocalVariableDescriptor]

'editor' @ [63:22] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByContainingElement[ValueParameterDescriptorImpl]

'caretModel' @ [63:29] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [63:40] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'file' @ [64:23] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByContainingElement[ValueParameterDescriptorImpl]

'findElementAt' @ [64:28] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'offset' @ [64:42] ==> val offset: Int defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByContainingElement[LocalVariableDescriptor]

'element' @ [65:29] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByContainingElement[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [65:37] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'SourceNavigationHelper' @ [66:16] ==> public object SourceNavigationHelper defined in org.jetbrains.kotlin.idea.decompiler.navigation[FakeCallableDescriptorForObject]

'getOriginalPsiClassOrCreateLightClass' @ [66:39] ==> public final fun getOriginalPsiClassOrCreateLightClass(classOrObject: KtClassOrObject): PsiClass? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [66:77] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTargetByContainingElement[LocalVariableDescriptor]

'?:' @ [70:23] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Project?, right: Project): Project[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Project

'PROJECT' @ [70:40] ==> public final val PROJECT: (DataKey<(Project..Project?)>..DataKey<(Project..Project?)>?) defined in com.intellij.openapi.actionSystem.PlatformDataKeys[JavaPropertyDescriptor]

'getData' @ [70:48] ==> @Nullable public open fun getData(@NotNull p0: DataContext): Project? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'dataContext' @ [70:56] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTarget[ValueParameterDescriptorImpl]

'EDITOR' @ [72:39] ==> public final val EDITOR: (DataKey<(Editor..Editor?)>..DataKey<(Editor..Editor?)>?) defined in com.intellij.openapi.actionSystem.PlatformDataKeys[JavaPropertyDescriptor]

'getData' @ [72:46] ==> @Nullable public open fun getData(@NotNull p0: DataContext): Editor? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'dataContext' @ [72:54] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTarget[ValueParameterDescriptorImpl]

'editor' @ [73:13] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTarget[LocalVariableDescriptor]

'?:' @ [74:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiFile?, right: PsiFile): PsiFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiFile

'getInstance' @ [74:43] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [74:55] ==> val project: Project defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTarget[LocalVariableDescriptor]

'getPsiFile' @ [74:64] ==> @Nullable public abstract fun getPsiFile(@NotNull p0: Document): PsiFile? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [74:75] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTarget[LocalVariableDescriptor]

'document' @ [74:82] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'!' @ [75:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ProjectRootsUtil' @ [75:18] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'isInProjectOrLibSource' @ [75:35] ==> @JvmStatic public final fun isInProjectOrLibSource(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[DeserializedSimpleFunctionDescriptor]

'file' @ [75:58] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTarget[LocalVariableDescriptor]

'getTargetByReference' @ [76:20] ==> private final fun getTargetByReference(project: Project, editor: Editor): PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider[SimpleFunctionDescriptorImpl]

'project' @ [76:41] ==> val project: Project defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTarget[LocalVariableDescriptor]

'editor' @ [76:50] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTarget[LocalVariableDescriptor]

'getTargetByContainingElement' @ [76:61] ==> private final fun getTargetByContainingElement(editor: Editor, file: PsiFile): PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider[SimpleFunctionDescriptorImpl]

'editor' @ [76:90] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTarget[LocalVariableDescriptor]

'file' @ [76:98] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTarget[LocalVariableDescriptor]

'PSI_ELEMENT' @ [79:36] ==> public final val PSI_ELEMENT: (DataKey<(PsiElement..PsiElement?)>..DataKey<(PsiElement..PsiElement?)>?) defined in com.intellij.openapi.actionSystem.LangDataKeys[JavaPropertyDescriptor]

'getData' @ [79:48] ==> @Nullable public open fun getData(@NotNull p0: DataContext): PsiElement? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'dataContext' @ [79:56] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTarget[ValueParameterDescriptorImpl]

'element' @ [80:13] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTarget[LocalVariableDescriptor]

'SourceNavigationHelper' @ [80:48] ==> public object SourceNavigationHelper defined in org.jetbrains.kotlin.idea.decompiler.navigation[FakeCallableDescriptorForObject]

'getOriginalPsiClassOrCreateLightClass' @ [80:71] ==> public final fun getOriginalPsiClassOrCreateLightClass(classOrObject: KtClassOrObject): PsiClass? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[DeserializedSimpleFunctionDescriptor]

'!!' @ [80:109] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtClassOrObject?): KtClassOrObject[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtClassOrObject

'element' @ [80:110] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.KotlinTypeHierarchyProvider.getTarget[LocalVariableDescriptor]

