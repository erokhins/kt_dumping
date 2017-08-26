'HierarchyTreeStructure' @ [47:5] ==> protected/*protected and package*/ constructor HierarchyTreeStructure(@NotNull p0: Project, p1: (HierarchyNodeDescriptor..HierarchyNodeDescriptor?)) defined in com.intellij.ide.hierarchy.HierarchyTreeStructure[JavaClassConstructorDescriptor]

'element' @ [47:28] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.<init>[ValueParameterDescriptorImpl]

'project' @ [47:36] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'KotlinCallHierarchyNodeDescriptor' @ [48:28] ==> public constructor KotlinCallHierarchyNodeDescriptor(@Nullable parentDescriptor: HierarchyNodeDescriptor?, @NotNull element: KtElement, isBase: Boolean, navigateToReference: Boolean) defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallHierarchyNodeDescriptor[JavaClassConstructorDescriptor]

'element' @ [48:68] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.<init>[ValueParameterDescriptorImpl]

'when (refElement) {
                is KtElement -> getCallHierarchyElement(refElement)
                else -> {
                    val psiMember = refElement.getNonStrictParentOfType<PsiMember>()
                    psiMember as? PsiMethod ?: psiMember?.containingClass
                }
            }' @ [57:46] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'refElement' @ [57:52] ==> value-parameter refElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.Companion.processReference[ValueParameterDescriptorImpl]

'getCallHierarchyElement' @ [58:33] ==> public fun getCallHierarchyElement(element: PsiElement): KtElement? defined in org.jetbrains.kotlin.idea.hierarchy.calls[SimpleFunctionDescriptorImpl]

'refElement' @ [58:57] ==> value-parameter refElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.Companion.processReference[ValueParameterDescriptorImpl]

'refElement' @ [60:37] ==> value-parameter refElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.Companion.processReference[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [60:48] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): PsiMember? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> PsiMember

'psiMember' @ [61:21] ==> val psiMember: PsiMember? defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.Companion.processReference[LocalVariableDescriptor]

'psiMember' @ [61:48] ==> val psiMember: PsiMember? defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.Companion.processReference[LocalVariableDescriptor]

'containingClass' @ [61:59] ==> public final val PsiMember.containingClass: PsiClass?[MyPropertyDescriptor]

'callerElement' @ [64:17] ==> var callerElement: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.Companion.processReference[LocalVariableDescriptor]

'isAncestor' @ [65:33] ==> @Contract public open fun isAncestor(@Nullable p0: PsiElement?, @NotNull p1: PsiElement, p2: Boolean): Boolean defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'callerElement' @ [65:44] ==> var callerElement: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.Companion.processReference[LocalVariableDescriptor]

'initializer' @ [65:58] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'refElement' @ [65:71] ==> value-parameter refElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.Companion.processReference[ValueParameterDescriptorImpl]

'callerElement' @ [66:21] ==> var callerElement: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.Companion.processReference[LocalVariableDescriptor]

'getCallHierarchyElement' @ [66:37] ==> public fun getCallHierarchyElement(element: PsiElement): KtElement? defined in org.jetbrains.kotlin.idea.hierarchy.calls[SimpleFunctionDescriptorImpl]

'callerElement' @ [66:61] ==> var callerElement: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.Companion.processReference[LocalVariableDescriptor]

'parent' @ [66:75] ==> public final val KtProperty.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callerElement' @ [69:17] ==> var callerElement: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.Companion.processReference[LocalVariableDescriptor]

'getOrCreateNodeDescriptor' @ [71:13] ==> internal fun getOrCreateNodeDescriptor(parent: HierarchyNodeDescriptor, originalElement: PsiElement, reference: PsiReference?, navigateToReference: Boolean, elementToDescriptorMap: MutableMap<PsiElement, NodeDescriptor<*>>, isJavaMap: Boolean): HierarchyNodeDescriptor? defined in org.jetbrains.kotlin.idea.hierarchy.calls[SimpleFunctionDescriptorImpl]

'nodeDescriptor' @ [71:39] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.Companion.processReference[ValueParameterDescriptorImpl]

'callerElement' @ [71:55] ==> var callerElement: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.Companion.processReference[LocalVariableDescriptor]

'reference' @ [71:70] ==> value-parameter reference: PsiReference? defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.Companion.processReference[ValueParameterDescriptorImpl]

'callerToDescriptorMap' @ [71:87] ==> value-parameter callerToDescriptorMap: MutableMap<PsiElement, NodeDescriptor<*>> defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.Companion.processReference[ValueParameterDescriptorImpl]

'isJavaMap' @ [71:110] ==> value-parameter isJavaMap: Boolean defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.Companion.processReference[ValueParameterDescriptorImpl]

'nodeDescriptor' @ [80:13] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'nodeDescriptor' @ [81:29] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'enclosingElement' @ [81:44] ==> public final val CallHierarchyNodeDescriptor.enclosingElement: (PsiMember..PsiMember?)[MyPropertyDescriptor]

'emptyList' @ [81:85] ==> public fun <T> emptyList(): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'CallerMethodsTreeStructure' @ [82:20] ==> public constructor CallerMethodsTreeStructure(@NotNull p0: Project, @NotNull p1: PsiMethod, p2: (String..String?)) defined in com.intellij.ide.hierarchy.call.CallerMethodsTreeStructure[JavaClassConstructorDescriptor]

'myProject' @ [82:47] ==> @NotNull protected/*protected and package*/ final val myProject: Project defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure[JavaPropertyDescriptor]

'psiMethod' @ [82:58] ==> val psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[LocalVariableDescriptor]

'scopeType' @ [82:69] ==> private final val scopeType: String defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure[PropertyDescriptorImpl]

'getChildElements' @ [82:80] ==> public final fun getChildElements(p0: (Any..Any?)): (Array<(Any..Any?)>..Array<out (Any..Any?)>?) defined in com.intellij.ide.hierarchy.call.CallerMethodsTreeStructure[JavaMethodDescriptor]

'nodeDescriptor' @ [82:97] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'toList' @ [82:113] ==> public fun <T> Array<out (Any..Any?)>.toList(): List<(Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'element' @ [85:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'emptyList' @ [85:47] ==> public fun <T> emptyList(): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'element' @ [87:26] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [87:54] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'getSearchScope' @ [88:27] ==> protected/*protected and package*/ open fun getSearchScope(p0: (String..String?), p1: (PsiElement..PsiElement?)): (SearchScope..SearchScope?) defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure[JavaMethodDescriptor]

'scopeType' @ [88:42] ==> private final val scopeType: String defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure[PropertyDescriptorImpl]

'baseClass' @ [88:53] ==> val baseClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[LocalVariableDescriptor]

'when (element) {
            is KtNamedFunction, is KtConstructor<*> -> KotlinFunctionFindUsagesOptions(myProject)
            is KtProperty -> KotlinPropertyFindUsagesOptions(myProject)
            is KtPropertyAccessor -> KotlinPropertyFindUsagesOptions(myProject).apply {
                isReadAccess = element.isGetter
                isWriteAccess = element.isSetter
            }
            is KtClass -> KotlinClassFindUsagesOptions(myProject).apply {
                isUsages = false
            }
            else -> return emptyList()
        }' @ [90:50] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JavaFindUsagesOptions, entry1: JavaFindUsagesOptions, entry2: JavaFindUsagesOptions, entry3: JavaFindUsagesOptions, entry4: JavaFindUsagesOptions): JavaFindUsagesOptions[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JavaFindUsagesOptions

'element' @ [90:56] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'KotlinFunctionFindUsagesOptions' @ [91:56] ==> public constructor KotlinFunctionFindUsagesOptions(project: Project) defined in org.jetbrains.kotlin.idea.findUsages.KotlinFunctionFindUsagesOptions[ClassConstructorDescriptorImpl]

'myProject' @ [91:88] ==> @NotNull protected/*protected and package*/ final val myProject: Project defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure[JavaPropertyDescriptor]

'KotlinPropertyFindUsagesOptions' @ [92:30] ==> public constructor KotlinPropertyFindUsagesOptions(project: Project) defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[ClassConstructorDescriptorImpl]

'myProject' @ [92:62] ==> @NotNull protected/*protected and package*/ final val myProject: Project defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure[JavaPropertyDescriptor]

'KotlinPropertyFindUsagesOptions' @ [93:38] ==> public constructor KotlinPropertyFindUsagesOptions(project: Project) defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[ClassConstructorDescriptorImpl]

'myProject' @ [93:70] ==> @NotNull protected/*protected and package*/ final val myProject: Project defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure[JavaPropertyDescriptor]

'apply' @ [93:81] ==> @InlineOnly public inline fun <T> KotlinPropertyFindUsagesOptions.apply(block: KotlinPropertyFindUsagesOptions.() -> Unit): KotlinPropertyFindUsagesOptions defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPropertyFindUsagesOptions

'isReadAccess' @ [94:17] ==> public final var isReadAccess: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[JavaPropertyDescriptor]

'element' @ [94:32] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'isGetter' @ [94:40] ==> public final val KtPropertyAccessor.isGetter: Boolean[MyPropertyDescriptor]

'isWriteAccess' @ [95:17] ==> public final var isWriteAccess: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[JavaPropertyDescriptor]

'element' @ [95:33] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'isSetter' @ [95:41] ==> public final val KtPropertyAccessor.isSetter: Boolean[MyPropertyDescriptor]

'KotlinClassFindUsagesOptions' @ [97:27] ==> public constructor KotlinClassFindUsagesOptions(project: Project) defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[ClassConstructorDescriptorImpl]

'myProject' @ [97:56] ==> @NotNull protected/*protected and package*/ final val myProject: Project defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure[JavaPropertyDescriptor]

'apply' @ [97:67] ==> @InlineOnly public inline fun <T> KotlinClassFindUsagesOptions.apply(block: KotlinClassFindUsagesOptions.() -> Unit): KotlinClassFindUsagesOptions defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinClassFindUsagesOptions

'isUsages' @ [98:17] ==> public final var isUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'emptyList' @ [100:28] ==> public fun <T> emptyList(): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'findOptions' @ [102:9] ==> val findOptions: JavaFindUsagesOptions defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[LocalVariableDescriptor]

'isSkipImportStatements' @ [102:21] ==> public final var isSkipImportStatements: Boolean defined in com.intellij.find.findUsages.JavaFindUsagesOptions[JavaPropertyDescriptor]

'findOptions' @ [103:9] ==> val findOptions: JavaFindUsagesOptions defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[LocalVariableDescriptor]

'searchScope' @ [103:21] ==> @NotNull public final var searchScope: SearchScope defined in com.intellij.find.findUsages.JavaFindUsagesOptions[JavaPropertyDescriptor]

'searchScope' @ [103:35] ==> val searchScope: (SearchScope..SearchScope?) defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[LocalVariableDescriptor]

'findOptions' @ [104:9] ==> val findOptions: JavaFindUsagesOptions defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[LocalVariableDescriptor]

'isSearchForTextOccurrences' @ [104:21] ==> public final var isSearchForTextOccurrences: Boolean defined in com.intellij.find.findUsages.JavaFindUsagesOptions[JavaPropertyDescriptor]

'when (element) {
            is KtPropertyAccessor -> element.property
            else -> element
        }' @ [106:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtDeclaration, entry1: KtDeclaration): KtDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtDeclaration

'element' @ [106:37] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'element' @ [107:38] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'property' @ [107:46] ==> public final val KtPropertyAccessor.property: KtProperty[MyPropertyDescriptor]

'element' @ [108:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'elementToSearch' @ [112:9] ==> val elementToSearch: KtDeclaration defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[LocalVariableDescriptor]

'processAllUsages' @ [112:25] ==> public fun KtDeclaration.processAllUsages(options: FindUsagesOptions, processor: (UsageInfo) -> Unit): Unit defined in org.jetbrains.kotlin.idea.findUsages[SimpleFunctionDescriptorImpl]

'findOptions' @ [112:42] ==> val findOptions: JavaFindUsagesOptions defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[LocalVariableDescriptor]

'processReference' @ [113:13] ==> internal final fun processReference(reference: PsiReference?, refElement: PsiElement, nodeDescriptor: HierarchyNodeDescriptor, callerToDescriptorMap: MutableMap<PsiElement, NodeDescriptor<*>>, isJavaMap: Boolean): Unit defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.Companion[SimpleFunctionDescriptorImpl]

'it' @ [113:30] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren.<anonymous>[ValueParameterDescriptorImpl]

'reference' @ [113:33] ==> public final val UsageInfo.reference: PsiReference?[MyPropertyDescriptor]

'it' @ [113:44] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [113:47] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'nodeDescriptor' @ [113:83] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'callerToDescriptorMap' @ [113:99] ==> value-parameter callerToDescriptorMap: MutableMap<PsiElement, NodeDescriptor<*>> defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'callerToDescriptorMap' @ [116:16] ==> value-parameter callerToDescriptorMap: MutableMap<PsiElement, NodeDescriptor<*>> defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'values' @ [116:38] ==> public abstract val values: MutableCollection<NodeDescriptor<*>> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'nodeDescriptor' @ [120:23] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'psiElement' @ [120:38] ==> public final val HierarchyNodeDescriptor.psiElement: PsiElement?[MyPropertyDescriptor]

'EMPTY_OBJECT_ARRAY' @ [120:87] ==> public final val EMPTY_OBJECT_ARRAY: (Array<(Any..Any?)>..Array<out (Any..Any?)>?) defined in com.intellij.util.ArrayUtil[JavaPropertyDescriptor]

'newHashMap' @ [121:42] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> newHashMap(): (HashMap<(PsiElement..PsiElement?), (NodeDescriptor<*>..NodeDescriptor<*>?)>..HashMap<(PsiElement..PsiElement?), (NodeDescriptor<*>..NodeDescriptor<*>?)>?) defined in com.google.common.collect.Maps[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> NodeDescriptor<*>

'element' @ [122:26] ==> val element: KtDeclaration defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[LocalVariableDescriptor]

'resolveToDescriptor' @ [122:34] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'if (descriptor is CallableMemberDescriptor) {
            return descriptor.getDeepestSuperDeclarations().flatMap { rootDescriptor ->
                val rootElement = DescriptorToSourceUtilsIde.getAnyDeclaration(myProject, rootDescriptor)
                                  ?: return@flatMap emptyList<Any>()
                val rootNodeDescriptor = when (rootElement) {
                    is KtElement -> nodeDescriptor
                    is PsiMethod -> CallHierarchyNodeDescriptor(
                            myProject,
                            nodeDescriptor.parentDescriptor as HierarchyNodeDescriptor?,
                            rootElement,
                            nodeDescriptor.parentDescriptor == null,
                            false
                    )
                    else -> return@flatMap emptyList<Any>()
                }
                buildChildren(rootElement, rootNodeDescriptor, callerToDescriptorMap)
            }.toTypedArray()
        }
        else {
            return buildChildren(element, nodeDescriptor, callerToDescriptorMap).toTypedArray()
        }' @ [123:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'descriptor' @ [123:13] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[LocalVariableDescriptor]

'descriptor' @ [124:20] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[LocalVariableDescriptor]

'getDeepestSuperDeclarations' @ [124:31] ==> public fun <D : CallableMemberDescriptor> CallableMemberDescriptor.getDeepestSuperDeclarations(): Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableMemberDescriptor> -> CallableMemberDescriptor

'flatMap' @ [124:61] ==> public inline fun <T, R> Iterable<CallableMemberDescriptor>.flatMap(transform: (CallableMemberDescriptor) -> Iterable<Any>): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor
    <R> -> Any

'DescriptorToSourceUtilsIde' @ [125:35] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [125:62] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'myProject' @ [125:80] ==> @NotNull protected/*protected and package*/ final val myProject: Project defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure[JavaPropertyDescriptor]

'rootDescriptor' @ [125:91] ==> value-parameter rootDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [126:53] ==> public fun <T> emptyList(): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'when (rootElement) {
                    is KtElement -> nodeDescriptor
                    is PsiMethod -> CallHierarchyNodeDescriptor(
                            myProject,
                            nodeDescriptor.parentDescriptor as HierarchyNodeDescriptor?,
                            rootElement,
                            nodeDescriptor.parentDescriptor == null,
                            false
                    )
                    else -> return@flatMap emptyList<Any>()
                }' @ [127:42] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: HierarchyNodeDescriptor, entry1: HierarchyNodeDescriptor, entry2: HierarchyNodeDescriptor): HierarchyNodeDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> HierarchyNodeDescriptor

'rootElement' @ [127:48] ==> val rootElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren.<anonymous>[LocalVariableDescriptor]

'nodeDescriptor' @ [128:37] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'CallHierarchyNodeDescriptor' @ [129:37] ==> public constructor CallHierarchyNodeDescriptor(@NotNull p0: Project, p1: (HierarchyNodeDescriptor..HierarchyNodeDescriptor?), @NotNull p2: PsiElement, p3: Boolean, p4: Boolean) defined in com.intellij.ide.hierarchy.call.CallHierarchyNodeDescriptor[JavaClassConstructorDescriptor]

'myProject' @ [130:29] ==> @NotNull protected/*protected and package*/ final val myProject: Project defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure[JavaPropertyDescriptor]

'nodeDescriptor' @ [131:29] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'parentDescriptor' @ [131:44] ==> public final val HierarchyNodeDescriptor.parentDescriptor: raw (NodeDescriptor<(Any..Any?)>?..NodeDescriptor<*>?)[MyPropertyDescriptor]

'rootElement' @ [132:29] ==> val rootElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren.<anonymous>[LocalVariableDescriptor]

'nodeDescriptor' @ [133:29] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'parentDescriptor' @ [133:44] ==> public final val HierarchyNodeDescriptor.parentDescriptor: raw (NodeDescriptor<(Any..Any?)>?..NodeDescriptor<*>?)[MyPropertyDescriptor]

'emptyList' @ [136:44] ==> public fun <T> emptyList(): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'buildChildren' @ [138:17] ==> private final fun buildChildren(element: PsiElement, nodeDescriptor: HierarchyNodeDescriptor, callerToDescriptorMap: MutableMap<PsiElement, NodeDescriptor<*>>): Collection<Any> defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure[SimpleFunctionDescriptorImpl]

'rootElement' @ [138:31] ==> val rootElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren.<anonymous>[LocalVariableDescriptor]

'rootNodeDescriptor' @ [138:44] ==> val rootNodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren.<anonymous>[LocalVariableDescriptor]

'callerToDescriptorMap' @ [138:64] ==> val callerToDescriptorMap: (HashMap<(PsiElement..PsiElement?), (NodeDescriptor<*>..NodeDescriptor<*>?)>..HashMap<(PsiElement..PsiElement?), (NodeDescriptor<*>..NodeDescriptor<*>?)>?) defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[LocalVariableDescriptor]

'toTypedArray' @ [139:15] ==> public inline fun <reified T> Collection<Any>.toTypedArray(): Array<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any

'buildChildren' @ [142:20] ==> private final fun buildChildren(element: PsiElement, nodeDescriptor: HierarchyNodeDescriptor, callerToDescriptorMap: MutableMap<PsiElement, NodeDescriptor<*>>): Collection<Any> defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure[SimpleFunctionDescriptorImpl]

'element' @ [142:34] ==> val element: KtDeclaration defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[LocalVariableDescriptor]

'nodeDescriptor' @ [142:43] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'callerToDescriptorMap' @ [142:59] ==> val callerToDescriptorMap: (HashMap<(PsiElement..PsiElement?), (NodeDescriptor<*>..NodeDescriptor<*>?)>..HashMap<(PsiElement..PsiElement?), (NodeDescriptor<*>..NodeDescriptor<*>?)>?) defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallerTreeStructure.buildChildren[LocalVariableDescriptor]

'toTypedArray' @ [142:82] ==> public inline fun <reified T> Collection<Any>.toTypedArray(): Array<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any

