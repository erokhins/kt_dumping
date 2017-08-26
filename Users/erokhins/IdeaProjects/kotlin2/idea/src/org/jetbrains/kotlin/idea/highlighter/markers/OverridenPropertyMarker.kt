'CollectElementsWithLimit' @ [46:60] ==> public constructor CollectElementsWithLimit<T : (PsiElement..PsiElement?)>(p0: Int) defined in com.intellij.psi.search.PsiElementProcessor.CollectElementsWithLimit[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiClass

'AdapterProcessor' @ [48:20] ==> public constructor AdapterProcessor<T : (Any..Any?), S : (Any..Any?)>(@NotNull p0: Processor<(PsiClass..PsiClass?)>, @NotNull p1: Function<(PsiMethod..PsiMethod?), (PsiClass..PsiClass?)>) defined in com.intellij.util.AdapterProcessor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiMethod
    <S : (Any..Any?)> -> PsiClass

'UniqueProcessor' @ [49:30] ==> public constructor UniqueProcessor<T : (Any..Any?)>(@NotNull p0: Processor<(PsiClass..PsiClass?)>) defined in com.intellij.util.CommonProcessors.UniqueProcessor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiClass

'PsiElementProcessorAdapter' @ [49:56] ==> public constructor PsiElementProcessorAdapter<T : (PsiElement..PsiElement?)>(p0: (PsiElementProcessor<(PsiClass..PsiClass?)>..PsiElementProcessor<(PsiClass..PsiClass?)>?)) defined in com.intellij.psi.search.PsiElementProcessorAdapter[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiClass

'overriddenInClassesProcessor' @ [49:83] ==> val overriddenInClassesProcessor: PsiElementProcessor.CollectElementsWithLimit<PsiClass> defined in org.jetbrains.kotlin.idea.highlighter.markers.getOverriddenPropertyTooltip[LocalVariableDescriptor]

'Function' @ [50:13] ==> public fun <Param : (Any..Any?), Result : (Any..Any?)> Function(function: ((PsiMethod..PsiMethod?)) -> (PsiClass..PsiClass?)): Function<PsiMethod, PsiClass> defined in com.intellij.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <Param : (Any..Any?)> -> PsiMethod
    <Result : (Any..Any?)> -> PsiClass

'method' @ [50:46] ==> value-parameter method: PsiMethod? defined in org.jetbrains.kotlin.idea.highlighter.markers.getOverriddenPropertyTooltip.<anonymous>[ValueParameterDescriptorImpl]

'containingClass' @ [50:54] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'property' @ [53:20] ==> value-parameter property: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.getOverriddenPropertyTooltip[ValueParameterDescriptorImpl]

'getAccessorLightMethods' @ [53:29] ==> public fun KtNamedDeclaration.getAccessorLightMethods(): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'!' @ [54:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'overriddenInClassesProcessor' @ [54:14] ==> val overriddenInClassesProcessor: PsiElementProcessor.CollectElementsWithLimit<PsiClass> defined in org.jetbrains.kotlin.idea.highlighter.markers.getOverriddenPropertyTooltip[LocalVariableDescriptor]

'isOverflow' @ [54:43] ==> public final val <T : (PsiElement..PsiElement?)> PsiElementProcessor.CollectElementsWithLimit<PsiClass>.isOverflow: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiClass

'search' @ [55:37] ==> @NotNull public open fun search(@NotNull p0: PsiMethod, p1: Boolean): Query<(PsiMethod..PsiMethod?)> defined in com.intellij.psi.search.searches.OverridingMethodsSearch[JavaMethodDescriptor]

'method' @ [55:44] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.highlighter.markers.getOverriddenPropertyTooltip[LocalVariableDescriptor]

'forEach' @ [55:58] ==> public abstract fun forEach(@NotNull p0: Processor<(PsiMethod..PsiMethod?)>): Boolean defined in com.intellij.util.Query[JavaMethodDescriptor]

'consumer' @ [55:66] ==> val consumer: AdapterProcessor<PsiMethod, PsiClass> defined in org.jetbrains.kotlin.idea.highlighter.markers.getOverriddenPropertyTooltip[LocalVariableDescriptor]

'isImplemented' @ [59:25] ==> public fun isImplemented(declaration: KtNamedDeclaration): Boolean defined in org.jetbrains.kotlin.idea.highlighter.markers in file OverridenPropertyMarker.kt[SimpleFunctionDescriptorImpl]

'property' @ [59:39] ==> value-parameter property: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.getOverriddenPropertyTooltip[ValueParameterDescriptorImpl]

'overriddenInClassesProcessor' @ [60:9] ==> val overriddenInClassesProcessor: PsiElementProcessor.CollectElementsWithLimit<PsiClass> defined in org.jetbrains.kotlin.idea.highlighter.markers.getOverriddenPropertyTooltip[LocalVariableDescriptor]

'isOverflow' @ [60:38] ==> public final val <T : (PsiElement..PsiElement?)> PsiElementProcessor.CollectElementsWithLimit<PsiClass>.isOverflow: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiClass

'if (isImplemented)
            KotlinBundle.message("property.is.implemented.too.many")
        else
            KotlinBundle.message("property.is.overridden.too.many")' @ [61:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'isImplemented' @ [61:20] ==> val isImplemented: Boolean defined in org.jetbrains.kotlin.idea.highlighter.markers.getOverriddenPropertyTooltip[LocalVariableDescriptor]

'message' @ [62:26] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'message' @ [64:26] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'overriddenInClassesProcessor' @ [67:28] ==> val overriddenInClassesProcessor: PsiElementProcessor.CollectElementsWithLimit<PsiClass> defined in org.jetbrains.kotlin.idea.highlighter.markers.getOverriddenPropertyTooltip[LocalVariableDescriptor]

'collection' @ [67:57] ==> public final val <T : (PsiElement..PsiElement?)> PsiElementProcessor.CollectElementsWithLimit<PsiClass>.collection: (MutableCollection<(PsiClass..PsiClass?)>..Collection<(PsiClass..PsiClass?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiClass

'collectedClasses' @ [68:9] ==> val collectedClasses: (MutableCollection<(PsiClass..PsiClass?)>..Collection<(PsiClass..PsiClass?)>) defined in org.jetbrains.kotlin.idea.highlighter.markers.getOverriddenPropertyTooltip[LocalVariableDescriptor]

'isEmpty' @ [68:26] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'if (isImplemented)
        KotlinBundle.message("property.is.implemented.header")
    else
        KotlinBundle.message("property.is.overridden.header")' @ [70:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isImplemented' @ [70:21] ==> val isImplemented: Boolean defined in org.jetbrains.kotlin.idea.highlighter.markers.getOverriddenPropertyTooltip[LocalVariableDescriptor]

'message' @ [71:22] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'message' @ [73:22] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'composeText' @ [76:36] ==> public open fun composeText(@NotNull p0: (MutableIterable<(PsiElement..PsiElement?)>..Iterable<(PsiElement..PsiElement?)>), @NotNull p1: String, @NotNull p2: String): (String..String?) defined in com.intellij.codeInsight.daemon.impl.GutterIconTooltipHelper[JavaMethodDescriptor]

'collectedClasses' @ [76:48] ==> val collectedClasses: (MutableCollection<(PsiClass..PsiClass?)>..Collection<(PsiClass..PsiClass?)>) defined in org.jetbrains.kotlin.idea.highlighter.markers.getOverriddenPropertyTooltip[LocalVariableDescriptor]

'sortedWith' @ [76:65] ==> public fun <T> Iterable<(PsiClass..PsiClass?)>.sortedWith(comparator: Comparator<in (PsiClass..PsiClass?)> /* = Comparator<in (PsiClass..PsiClass?)> */): List<(PsiClass..PsiClass?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'PsiClassListCellRenderer' @ [76:76] ==> public constructor PsiClassListCellRenderer() defined in com.intellij.ide.util.PsiClassListCellRenderer[JavaClassConstructorDescriptor]

'comparator' @ [76:103] ==> public final val PsiClassListCellRenderer.comparator: (Comparator<(PsiClass..PsiClass?)>..Comparator<(PsiClass..PsiClass?)>?)[MyPropertyDescriptor]

'start' @ [76:116] ==> val start: String defined in org.jetbrains.kotlin.idea.highlighter.markers.getOverriddenPropertyTooltip[LocalVariableDescriptor]

'pattern' @ [76:123] ==> val pattern: String defined in org.jetbrains.kotlin.idea.highlighter.markers.getOverriddenPropertyTooltip[LocalVariableDescriptor]

'element' @ [80:31] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[ValueParameterDescriptorImpl]

'parent' @ [80:40] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'propertyOrParameter' @ [81:19] ==> val propertyOrParameter: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[LocalVariableDescriptor]

'project' @ [81:39] ==> public final val KtNamedDeclaration.project: Project[MyPropertyDescriptor]

'isDumb' @ [83:21] ==> public open fun isDumb(@NotNull p0: Project): Boolean defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'project' @ [83:28] ==> val project: Project defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[LocalVariableDescriptor]

'getInstance' @ [84:21] ==> public open fun getInstance(@NotNull p0: Project): (DumbService..DumbService?) defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'project' @ [84:33] ==> val project: Project defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[LocalVariableDescriptor]

'showDumbModeNotification' @ [84:43] ==> public abstract fun showDumbModeNotification(@NotNull p0: String): Unit defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'when(propertyOrParameter) {
        is KtProperty  -> LightClassUtil.getLightClassPropertyMethods(propertyOrParameter)
        is KtParameter -> LightClassUtil.getLightClassPropertyMethods(propertyOrParameter)
        else -> return null
    }' @ [88:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LightClassUtil.PropertyAccessorsPsiMethods, entry1: LightClassUtil.PropertyAccessorsPsiMethods, entry2: LightClassUtil.PropertyAccessorsPsiMethods): LightClassUtil.PropertyAccessorsPsiMethods[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PropertyAccessorsPsiMethods

'propertyOrParameter' @ [88:35] ==> val propertyOrParameter: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[LocalVariableDescriptor]

'LightClassUtil' @ [89:27] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassPropertyMethods' @ [89:42] ==> public final fun getLightClassPropertyMethods(property: KtProperty): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'propertyOrParameter' @ [89:71] ==> val propertyOrParameter: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[LocalVariableDescriptor]

'LightClassUtil' @ [90:27] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassPropertyMethods' @ [90:42] ==> public final fun getLightClassPropertyMethods(parameter: KtParameter): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'propertyOrParameter' @ [90:71] ==> val propertyOrParameter: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[LocalVariableDescriptor]

'CollectUniquesProcessor' @ [93:45] ==> public constructor CollectUniquesProcessor<T : (Any..Any?)>() defined in com.intellij.util.CommonProcessors.CollectUniquesProcessor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiElement

'Runnable' @ [94:32] ==> @FunctionalInterface public fun Runnable(function: () -> Unit): Runnable defined in java.lang[SimpleFunctionDescriptorImpl]

'KotlinDefinitionsSearcher' @ [95:9] ==> public companion object defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher[FakeCallableDescriptorForObject]

'processPropertyImplementationsMethods' @ [95:35] ==> public final fun processPropertyImplementationsMethods(accessors: LightClassUtil.PropertyAccessorsPsiMethods, scope: SearchScope, consumer: Processor<PsiElement>): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDefinitionsSearcher.Companion[SimpleFunctionDescriptorImpl]

'psiPropertyMethods' @ [96:17] ==> val psiPropertyMethods: LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[LocalVariableDescriptor]

'allScope' @ [97:35] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [97:44] ==> val project: Project defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[LocalVariableDescriptor]

'elementProcessor' @ [98:17] ==> val elementProcessor: CommonProcessors.CollectUniquesProcessor<PsiElement> defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[LocalVariableDescriptor]

'!' @ [101:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [101:26] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'runProcessWithProgressSynchronously' @ [101:40] ==> public abstract fun runProcessWithProgressSynchronously(@NotNull p0: Runnable, @NotNull @Nls p1: String, p2: Boolean, @Nullable p3: Project?, @Nullable p4: JComponent?): Boolean defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'ktPsiMethodProcessor' @ [102:28] ==> val ktPsiMethodProcessor: Runnable defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[LocalVariableDescriptor]

'SEARCHING_FOR_OVERRIDING_METHODS' @ [103:24] ==> public const final val SEARCHING_FOR_OVERRIDING_METHODS: String defined in com.intellij.codeInsight.daemon.impl.MarkerType[JavaPropertyDescriptor]

'project' @ [105:13] ==> val project: Project defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[LocalVariableDescriptor]

'e' @ [106:13] ==> value-parameter e: MouseEvent? defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[ValueParameterDescriptorImpl]

'component' @ [106:16] ==> public final val MouseEvent.component: (Component..Component?)[MyPropertyDescriptor]

'DefaultPsiElementCellRenderer' @ [110:20] ==> public constructor DefaultPsiElementCellRenderer() defined in com.intellij.ide.util.DefaultPsiElementCellRenderer[JavaClassConstructorDescriptor]

'elementProcessor' @ [111:31] ==> val elementProcessor: CommonProcessors.CollectUniquesProcessor<PsiElement> defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[LocalVariableDescriptor]

'results' @ [111:48] ==> public final val <T : (Any..Any?)> CommonProcessors.CollectUniquesProcessor<PsiElement>.results: (MutableCollection<(PsiElement..PsiElement?)>..Collection<(PsiElement..PsiElement?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiElement

'sortedWith' @ [112:14] ==> public fun <T> Iterable<(PsiElement..PsiElement?)>.sortedWith(comparator: Comparator<in (PsiElement..PsiElement?)> /* = Comparator<in (PsiElement..PsiElement?)> */): List<(PsiElement..PsiElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'renderer' @ [112:25] ==> val renderer: DefaultPsiElementCellRenderer defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[LocalVariableDescriptor]

'comparator' @ [112:34] ==> public final val DefaultPsiElementCellRenderer.comparator: (Comparator<(PsiElement..PsiElement?)>..Comparator<(PsiElement..PsiElement?)>?)[MyPropertyDescriptor]

'filterIsInstance' @ [113:14] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<NavigatablePsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> NavigatablePsiElement

'NavigationPopupDescriptor' @ [115:12] ==> public constructor NavigationPopupDescriptor(targets: Collection<NavigatablePsiElement>, title: String, findUsagesTitle: String, renderer: ListCellRenderer<*>, updater: ListBackgroundUpdaterTask? = ...) defined in org.jetbrains.kotlin.idea.highlighter.markers.NavigationPopupDescriptor[ClassConstructorDescriptorImpl]

'navigatingOverrides' @ [115:38] ==> val navigatingOverrides: List<NavigatablePsiElement> defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[LocalVariableDescriptor]

'message' @ [116:51] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'propertyOrParameter' @ [116:99] ==> val propertyOrParameter: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[LocalVariableDescriptor]

'name' @ [116:119] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'message' @ [117:51] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'propertyOrParameter' @ [117:110] ==> val propertyOrParameter: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[LocalVariableDescriptor]

'name' @ [117:130] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'renderer' @ [117:137] ==> val renderer: DefaultPsiElementCellRenderer defined in org.jetbrains.kotlin.idea.highlighter.markers.buildNavigateToPropertyOverriddenDeclarationsPopup[LocalVariableDescriptor]

'declaration' @ [122:9] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.isImplemented[ValueParameterDescriptorImpl]

'hasModifier' @ [122:21] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [122:42] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'declaration' @ [124:18] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.isImplemented[ValueParameterDescriptorImpl]

'parent' @ [124:30] ==> public final val KtNamedDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [125:5] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.highlighter.markers.isImplemented[LocalVariableDescriptor]

'if (parent is KtClassBody) parent.getParent() else parent' @ [125:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'parent' @ [125:18] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.highlighter.markers.isImplemented[LocalVariableDescriptor]

'parent' @ [125:41] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.highlighter.markers.isImplemented[LocalVariableDescriptor]

'getParent' @ [125:48] ==> @Contract public abstract fun getParent(): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'parent' @ [125:65] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.highlighter.markers.isImplemented[LocalVariableDescriptor]

'parent' @ [127:9] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.highlighter.markers.isImplemented[LocalVariableDescriptor]

'parent' @ [129:12] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.highlighter.markers.isImplemented[LocalVariableDescriptor]

'isInterface' @ [129:19] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'declaration' @ [129:37] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.isImplemented[ValueParameterDescriptorImpl]

'!' @ [129:78] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [129:79] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.isImplemented[ValueParameterDescriptorImpl]

'hasBody' @ [129:91] ==> public abstract fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'declaration' @ [129:106] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.isImplemented[ValueParameterDescriptorImpl]

'!' @ [129:154] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [129:155] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.isImplemented[ValueParameterDescriptorImpl]

'hasInitializer' @ [129:167] ==> public abstract fun hasInitializer(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithInitializer[JavaMethodDescriptor]

