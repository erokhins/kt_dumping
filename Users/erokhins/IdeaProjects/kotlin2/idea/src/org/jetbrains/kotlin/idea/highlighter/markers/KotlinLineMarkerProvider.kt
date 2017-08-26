'elements' @ [63:13] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[ValueParameterDescriptorImpl]

'isEmpty' @ [63:22] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'elements' @ [65:21] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[ValueParameterDescriptorImpl]

'first' @ [65:30] ==> public fun <T> List<PsiElement>.first(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'getInstance' @ [66:25] ==> public open fun getInstance(@NotNull p0: Project): (DumbService..DumbService?) defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'first' @ [66:37] ==> val first: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'project' @ [66:43] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'isDumb' @ [66:52] ==> public final val DumbService.isDumb: Boolean[MyPropertyDescriptor]

'!' @ [66:62] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ProjectRootsUtil' @ [66:63] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'isInProjectOrLibSource' @ [66:80] ==> @JvmStatic public final fun isInProjectOrLibSource(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[DeserializedSimpleFunctionDescriptor]

'first' @ [66:103] ==> val first: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'HashSet' @ [68:25] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtNamedFunction

'HashSet' @ [69:26] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtNamedDeclaration

'elements' @ [71:25] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[ValueParameterDescriptorImpl]

'checkCanceled' @ [72:29] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'when (element) {
                is KtClass -> {
                    collectInheritedClassMarker(element, result)
                }
                is KtNamedFunction -> {
                    functions.add(element)
                    collectSuperDeclarationMarkers(element, result)
                }
                is KtProperty -> {
                    properties.add(element)
                    collectSuperDeclarationMarkers(element, result)
                }
                is KtParameter -> {
                    if (element.hasValOrVar()) {
                        properties.add(element)
                        collectSuperDeclarationMarkers(element, result)
                    }
                }
            }' @ [74:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [74:19] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'collectInheritedClassMarker' @ [76:21] ==> private fun collectInheritedClassMarker(element: KtClass, result: MutableCollection<LineMarkerInfo<*>>): Unit defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'element' @ [76:49] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'result' @ [76:58] ==> value-parameter result: MutableCollection<LineMarkerInfo<*>> defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[ValueParameterDescriptorImpl]

'functions' @ [79:21] ==> val functions: HashSet<KtNamedFunction> defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'add' @ [79:31] ==> public open fun add(element: KtNamedFunction): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'element' @ [79:35] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'collectSuperDeclarationMarkers' @ [80:21] ==> private fun collectSuperDeclarationMarkers(declaration: KtDeclaration, result: MutableCollection<LineMarkerInfo<*>>): Unit defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'element' @ [80:52] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'result' @ [80:61] ==> value-parameter result: MutableCollection<LineMarkerInfo<*>> defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[ValueParameterDescriptorImpl]

'properties' @ [83:21] ==> val properties: HashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'add' @ [83:32] ==> public open fun add(element: KtNamedDeclaration): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'element' @ [83:36] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'collectSuperDeclarationMarkers' @ [84:21] ==> private fun collectSuperDeclarationMarkers(declaration: KtDeclaration, result: MutableCollection<LineMarkerInfo<*>>): Unit defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'element' @ [84:52] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'result' @ [84:61] ==> value-parameter result: MutableCollection<LineMarkerInfo<*>> defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[ValueParameterDescriptorImpl]

'element' @ [87:25] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'hasValOrVar' @ [87:33] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'properties' @ [88:25] ==> val properties: HashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'add' @ [88:36] ==> public open fun add(element: KtNamedDeclaration): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'element' @ [88:40] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'collectSuperDeclarationMarkers' @ [89:25] ==> private fun collectSuperDeclarationMarkers(declaration: KtDeclaration, result: MutableCollection<LineMarkerInfo<*>>): Unit defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'element' @ [89:56] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'result' @ [89:65] ==> value-parameter result: MutableCollection<LineMarkerInfo<*>> defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[ValueParameterDescriptorImpl]

'collectOverriddenFunctions' @ [95:9] ==> private fun collectOverriddenFunctions(functions: Collection<KtNamedFunction>, result: MutableCollection<LineMarkerInfo<*>>): Unit defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'functions' @ [95:36] ==> val functions: HashSet<KtNamedFunction> defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'result' @ [95:47] ==> value-parameter result: MutableCollection<LineMarkerInfo<*>> defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[ValueParameterDescriptorImpl]

'collectOverriddenPropertyAccessors' @ [96:9] ==> private fun collectOverriddenPropertyAccessors(properties: Collection<KtNamedDeclaration>, result: MutableCollection<LineMarkerInfo<*>>): Unit defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'properties' @ [96:44] ==> val properties: HashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'result' @ [96:56] ==> value-parameter result: MutableCollection<LineMarkerInfo<*>> defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[ValueParameterDescriptorImpl]

'elements' @ [98:25] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[ValueParameterDescriptorImpl]

'element' @ [99:17] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'if (element.hasModifier(KtTokens.HEADER_KEYWORD)) {
                collectImplementationMarkers(element, result)
            }
            else if (element.hasModifier(KtTokens.IMPL_KEYWORD)) {
                collectHeaderMarkers(element, result)
            }' @ [101:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'element' @ [101:17] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'hasModifier' @ [101:25] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'HEADER_KEYWORD' @ [101:46] ==> public final val HEADER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'collectImplementationMarkers' @ [102:17] ==> private fun collectImplementationMarkers(declaration: KtNamedDeclaration, result: MutableCollection<LineMarkerInfo<*>>): Unit defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'element' @ [102:46] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'result' @ [102:55] ==> value-parameter result: MutableCollection<LineMarkerInfo<*>> defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[ValueParameterDescriptorImpl]

'element' @ [104:22] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'hasModifier' @ [104:30] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'IMPL_KEYWORD' @ [104:51] ==> public final val IMPL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'collectHeaderMarkers' @ [105:17] ==> private fun collectHeaderMarkers(declaration: KtNamedDeclaration, result: MutableCollection<LineMarkerInfo<*>>): Unit defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'element' @ [105:38] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'result' @ [105:47] ==> value-parameter result: MutableCollection<LineMarkerInfo<*>> defined in org.jetbrains.kotlin.idea.highlighter.markers.KotlinLineMarkerProvider.collectSlowLineMarkers[ValueParameterDescriptorImpl]

'OverridingMethod' @ [111:53] ==> public final val OverridingMethod: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Gutter[JavaPropertyDescriptor]

'ImplementingMethod' @ [112:55] ==> public final val ImplementingMethod: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Gutter[JavaPropertyDescriptor]

'OverridenMethod' @ [113:53] ==> public final val OverridenMethod: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Gutter[JavaPropertyDescriptor]

'ImplementedMethod' @ [114:54] ==> public final val ImplementedMethod: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Gutter[JavaPropertyDescriptor]

'openTargets' @ [124:33] ==> public open fun openTargets(p0: (MouseEvent..MouseEvent?), p1: (Array<(NavigatablePsiElement..NavigatablePsiElement?)>..Array<out (NavigatablePsiElement..NavigatablePsiElement?)>?), p2: (String..String?), p3: (String..String?), p4: raw (ListCellRenderer<(Any..Any?)>..ListCellRenderer<*>?), @Nullable p5: ListBackgroundUpdaterTask?): Unit defined in com.intellij.codeInsight.daemon.impl.PsiElementListNavigator[JavaMethodDescriptor]

'e' @ [124:45] ==> value-parameter e: MouseEvent? defined in org.jetbrains.kotlin.idea.highlighter.markers.NavigationPopupDescriptor.showPopup[ValueParameterDescriptorImpl]

'targets' @ [124:48] ==> public final val targets: Collection<NavigatablePsiElement> defined in org.jetbrains.kotlin.idea.highlighter.markers.NavigationPopupDescriptor[PropertyDescriptorImpl]

'toTypedArray' @ [124:56] ==> public inline fun <reified T> Collection<NavigatablePsiElement>.toTypedArray(): Array<NavigatablePsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> NavigatablePsiElement

'title' @ [124:72] ==> public final val title: String defined in org.jetbrains.kotlin.idea.highlighter.markers.NavigationPopupDescriptor[PropertyDescriptorImpl]

'findUsagesTitle' @ [124:79] ==> public final val findUsagesTitle: String defined in org.jetbrains.kotlin.idea.highlighter.markers.NavigationPopupDescriptor[PropertyDescriptorImpl]

'renderer' @ [124:96] ==> public final val renderer: ListCellRenderer<*> defined in org.jetbrains.kotlin.idea.highlighter.markers.NavigationPopupDescriptor[PropertyDescriptorImpl]

'updater' @ [124:106] ==> public final val updater: ListBackgroundUpdaterTask? defined in org.jetbrains.kotlin.idea.highlighter.markers.NavigationPopupDescriptor[PropertyDescriptorImpl]

'MarkerType' @ [132:32] ==> public constructor MarkerType(@NotNull p0: String, @NotNull p1: ((PsiElement..PsiElement?)) -> (String..String?), @NotNull p2: LineMarkerNavigator) defined in com.intellij.codeInsight.daemon.impl.MarkerType[SamAdapterClassConstructorDescriptor]

'getPsiClass' @ [134:11] ==> internal fun getPsiClass(element: PsiElement?): PsiClass? defined in org.jetbrains.kotlin.idea.highlighter.markers in file JavaPsiUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [134:23] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.highlighter.markers.SUBCLASSED_CLASS.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [134:28] ==> @InlineOnly public inline fun <T, R> PsiClass.let(block: (PsiClass) -> (String..String?)): (String..String?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass
    <R> -> (kotlin.String..kotlin.String?)

'getSubclassedClassTooltip' @ [134:45] ==> public open fun getSubclassedClassTooltip(@NotNull p0: PsiClass): (String..String?) defined in com.intellij.codeInsight.daemon.impl.MarkerType[JavaMethodDescriptor]

'it' @ [134:71] ==> value-parameter it: PsiClass defined in org.jetbrains.kotlin.idea.highlighter.markers.SUBCLASSED_CLASS.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'LineMarkerNavigator' @ [135:18] ==> public constructor LineMarkerNavigator() defined in com.intellij.codeInsight.daemon.impl.LineMarkerNavigator[JavaClassConstructorDescriptor]

'getPsiClass' @ [137:17] ==> internal fun getPsiClass(element: PsiElement?): PsiClass? defined in org.jetbrains.kotlin.idea.highlighter.markers in file JavaPsiUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [137:29] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.SUBCLASSED_CLASS.<no name provided>.browse[ValueParameterDescriptorImpl]

'let' @ [137:39] ==> @InlineOnly public inline fun <T, R> PsiClass.let(block: (PsiClass) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass
    <R> -> Unit

'navigateToSubclassedClass' @ [137:56] ==> public open fun navigateToSubclassedClass(p0: (MouseEvent..MouseEvent?), @NotNull p1: PsiClass): Unit defined in com.intellij.codeInsight.daemon.impl.MarkerType[JavaMethodDescriptor]

'e' @ [137:82] ==> value-parameter e: MouseEvent? defined in org.jetbrains.kotlin.idea.highlighter.markers.SUBCLASSED_CLASS.<no name provided>.browse[ValueParameterDescriptorImpl]

'it' @ [137:85] ==> value-parameter it: PsiClass defined in org.jetbrains.kotlin.idea.highlighter.markers.SUBCLASSED_CLASS.<no name provided>.browse.<anonymous>[ValueParameterDescriptorImpl]

'MarkerType' @ [141:44] ==> public constructor MarkerType(@NotNull p0: String, @NotNull p1: ((PsiElement..PsiElement?)) -> (String..String?), @NotNull p2: LineMarkerNavigator) defined in com.intellij.codeInsight.daemon.impl.MarkerType[SamAdapterClassConstructorDescriptor]

'getPsiMethod' @ [143:11] ==> internal fun getPsiMethod(element: PsiElement?): PsiMethod? defined in org.jetbrains.kotlin.idea.highlighter.markers in file JavaPsiUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [143:24] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_FUNCTION.<no name provided>.<init>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [143:29] ==> @InlineOnly public inline fun <T, R> PsiMethod.let(block: (PsiMethod) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> String?

'LineMarkerNavigator' @ [144:18] ==> public constructor LineMarkerNavigator() defined in com.intellij.codeInsight.daemon.impl.LineMarkerNavigator[JavaClassConstructorDescriptor]

'buildNavigateToOverriddenMethodPopup' @ [146:17] ==> public fun buildNavigateToOverriddenMethodPopup(e: MouseEvent?, element: PsiElement?): NavigationPopupDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.markers in file OverridenFunctionMarker.kt[SimpleFunctionDescriptorImpl]

'e' @ [146:54] ==> value-parameter e: MouseEvent? defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_FUNCTION.<no name provided>.<init>.<no name provided>.browse[ValueParameterDescriptorImpl]

'element' @ [146:57] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_FUNCTION.<no name provided>.<init>.<no name provided>.browse[ValueParameterDescriptorImpl]

'showPopup' @ [146:67] ==> public final fun showPopup(e: MouseEvent?): Unit defined in org.jetbrains.kotlin.idea.highlighter.markers.NavigationPopupDescriptor[SimpleFunctionDescriptorImpl]

'e' @ [146:77] ==> value-parameter e: MouseEvent? defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_FUNCTION.<no name provided>.<init>.<no name provided>.browse[ValueParameterDescriptorImpl]

'super' @ [151:28] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_FUNCTION.<no name provided>[LazyClassReceiverParameterDescriptor]

'getNavigationHandler' @ [151:34] ==> @NotNull public open fun getNavigationHandler(): GutterIconNavigationHandler<(PsiElement..PsiElement?)> defined in com.intellij.codeInsight.daemon.impl.MarkerType[JavaMethodDescriptor]

'superHandler' @ [154:17] ==> val superHandler: GutterIconNavigationHandler<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_FUNCTION.<no name provided>.getNavigationHandler[LocalVariableDescriptor]

'navigate' @ [154:30] ==> public abstract fun navigate(p0: (MouseEvent..MouseEvent?), p1: (PsiElement..PsiElement?)): Unit defined in com.intellij.codeInsight.daemon.GutterIconNavigationHandler[JavaMethodDescriptor]

'e' @ [154:39] ==> value-parameter e: MouseEvent? defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_FUNCTION.<no name provided>.getNavigationHandler.<no name provided>.navigate[ValueParameterDescriptorImpl]

'elt' @ [154:42] ==> value-parameter elt: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_FUNCTION.<no name provided>.getNavigationHandler.<no name provided>.navigate[ValueParameterDescriptorImpl]

'buildNavigateToOverriddenMethodPopup' @ [157:76] ==> public fun buildNavigateToOverriddenMethodPopup(e: MouseEvent?, element: PsiElement?): NavigationPopupDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.markers in file OverridenFunctionMarker.kt[SimpleFunctionDescriptorImpl]

'element' @ [157:119] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_FUNCTION.<no name provided>.getNavigationHandler.<no name provided>.getTargetsPopupDescriptor[ValueParameterDescriptorImpl]

'MarkerType' @ [162:44] ==> public constructor MarkerType(@NotNull p0: String, @NotNull p1: ((PsiElement..PsiElement?)) -> (String..String?), @NotNull p2: LineMarkerNavigator) defined in com.intellij.codeInsight.daemon.impl.MarkerType[SamAdapterClassConstructorDescriptor]

'it' @ [164:11] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_PROPERTY.<no name provided>.<init>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [164:15] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> String?

'getOverriddenPropertyTooltip' @ [164:21] ==> public fun getOverriddenPropertyTooltip(property: KtNamedDeclaration): String? defined in org.jetbrains.kotlin.idea.highlighter.markers in file OverridenPropertyMarker.kt[SimpleFunctionDescriptorImpl]

'it' @ [164:50] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_PROPERTY.<no name provided>.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [164:53] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'LineMarkerNavigator' @ [165:18] ==> public constructor LineMarkerNavigator() defined in com.intellij.codeInsight.daemon.impl.LineMarkerNavigator[JavaClassConstructorDescriptor]

'buildNavigateToPropertyOverriddenDeclarationsPopup' @ [167:17] ==> public fun buildNavigateToPropertyOverriddenDeclarationsPopup(e: MouseEvent?, element: PsiElement?): NavigationPopupDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.markers in file OverridenPropertyMarker.kt[SimpleFunctionDescriptorImpl]

'e' @ [167:68] ==> value-parameter e: MouseEvent? defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_PROPERTY.<no name provided>.<init>.<no name provided>.browse[ValueParameterDescriptorImpl]

'element' @ [167:71] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_PROPERTY.<no name provided>.<init>.<no name provided>.browse[ValueParameterDescriptorImpl]

'showPopup' @ [167:81] ==> public final fun showPopup(e: MouseEvent?): Unit defined in org.jetbrains.kotlin.idea.highlighter.markers.NavigationPopupDescriptor[SimpleFunctionDescriptorImpl]

'e' @ [167:91] ==> value-parameter e: MouseEvent? defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_PROPERTY.<no name provided>.<init>.<no name provided>.browse[ValueParameterDescriptorImpl]

'super' @ [172:28] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_PROPERTY.<no name provided>[LazyClassReceiverParameterDescriptor]

'getNavigationHandler' @ [172:34] ==> @NotNull public open fun getNavigationHandler(): GutterIconNavigationHandler<(PsiElement..PsiElement?)> defined in com.intellij.codeInsight.daemon.impl.MarkerType[JavaMethodDescriptor]

'superHandler' @ [175:17] ==> val superHandler: GutterIconNavigationHandler<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_PROPERTY.<no name provided>.getNavigationHandler[LocalVariableDescriptor]

'navigate' @ [175:30] ==> public abstract fun navigate(p0: (MouseEvent..MouseEvent?), p1: (PsiElement..PsiElement?)): Unit defined in com.intellij.codeInsight.daemon.GutterIconNavigationHandler[JavaMethodDescriptor]

'e' @ [175:39] ==> value-parameter e: MouseEvent? defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_PROPERTY.<no name provided>.getNavigationHandler.<no name provided>.navigate[ValueParameterDescriptorImpl]

'elt' @ [175:42] ==> value-parameter elt: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_PROPERTY.<no name provided>.getNavigationHandler.<no name provided>.navigate[ValueParameterDescriptorImpl]

'buildNavigateToPropertyOverriddenDeclarationsPopup' @ [178:76] ==> public fun buildNavigateToPropertyOverriddenDeclarationsPopup(e: MouseEvent?, element: PsiElement?): NavigationPopupDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.markers in file OverridenPropertyMarker.kt[SimpleFunctionDescriptorImpl]

'element' @ [178:133] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.OVERRIDDEN_PROPERTY.<no name provided>.getNavigationHandler.<no name provided>.getTargetsPopupDescriptor[ValueParameterDescriptorImpl]

'MarkerType' @ [183:39] ==> public constructor MarkerType(@NotNull p0: String, @NotNull p1: ((PsiElement..PsiElement?)) -> (String..String?), @NotNull p2: LineMarkerNavigator) defined in com.intellij.codeInsight.daemon.impl.MarkerType[SamAdapterClassConstructorDescriptor]

'it' @ [185:11] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.highlighter.markers.PLATFORM_IMPLEMENTATION.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [185:15] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> String?

'getPlatformImplementationTooltip' @ [185:21] ==> public fun getPlatformImplementationTooltip(declaration: KtDeclaration): String? defined in org.jetbrains.kotlin.idea.highlighter.markers in file ImplementedHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'it' @ [185:54] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.PLATFORM_IMPLEMENTATION.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [185:57] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'LineMarkerNavigator' @ [186:18] ==> public constructor LineMarkerNavigator() defined in com.intellij.codeInsight.daemon.impl.LineMarkerNavigator[JavaClassConstructorDescriptor]

'element' @ [188:17] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.PLATFORM_IMPLEMENTATION.<no name provided>.browse[ValueParameterDescriptorImpl]

'let' @ [188:26] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'navigateToPlatformImplementation' @ [188:32] ==> public fun navigateToPlatformImplementation(e: MouseEvent?, declaration: KtDeclaration): Unit defined in org.jetbrains.kotlin.idea.highlighter.markers in file ImplementedHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'e' @ [188:65] ==> value-parameter e: MouseEvent? defined in org.jetbrains.kotlin.idea.highlighter.markers.PLATFORM_IMPLEMENTATION.<no name provided>.browse[ValueParameterDescriptorImpl]

'it' @ [188:68] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.PLATFORM_IMPLEMENTATION.<no name provided>.browse.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [188:71] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'MarkerType' @ [193:34] ==> public constructor MarkerType(@NotNull p0: String, @NotNull p1: ((PsiElement..PsiElement?)) -> (String..String?), @NotNull p2: LineMarkerNavigator) defined in com.intellij.codeInsight.daemon.impl.MarkerType[SamAdapterClassConstructorDescriptor]

'it' @ [195:11] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.highlighter.markers.HEADER_DECLARATION.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [195:15] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> String?

'getHeaderDeclarationTooltip' @ [195:21] ==> public fun getHeaderDeclarationTooltip(declaration: KtDeclaration): String? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'it' @ [195:49] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.HEADER_DECLARATION.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [195:52] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'LineMarkerNavigator' @ [196:18] ==> public constructor LineMarkerNavigator() defined in com.intellij.codeInsight.daemon.impl.LineMarkerNavigator[JavaClassConstructorDescriptor]

'element' @ [198:17] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.markers.HEADER_DECLARATION.<no name provided>.browse[ValueParameterDescriptorImpl]

'let' @ [198:26] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'navigateToHeaderDeclaration' @ [198:32] ==> public fun navigateToHeaderDeclaration(declaration: KtDeclaration): Unit defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'it' @ [198:60] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.HEADER_DECLARATION.<no name provided>.browse.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [198:63] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'descriptor' @ [204:12] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.isImplementsAndNotOverrides[ValueParameterDescriptorImpl]

'modality' @ [204:23] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [204:35] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [204:44] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'overriddenMembers' @ [204:56] ==> value-parameter overriddenMembers: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.highlighter.markers.isImplementsAndNotOverrides[ValueParameterDescriptorImpl]

'all' @ [204:74] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.all(predicate: (CallableMemberDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'it' @ [204:80] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.isImplementsAndNotOverrides.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [204:83] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [204:95] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [204:104] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'assert' @ [208:5] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'declaration' @ [208:12] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectSuperDeclarationMarkers[ValueParameterDescriptorImpl]

'declaration' @ [208:46] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectSuperDeclarationMarkers[ValueParameterDescriptorImpl]

'declaration' @ [208:75] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectSuperDeclarationMarkers[ValueParameterDescriptorImpl]

'!' @ [210:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [210:10] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectSuperDeclarationMarkers[ValueParameterDescriptorImpl]

'hasModifier' @ [210:22] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [210:43] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'resolveDeclarationWithParents' @ [212:30] ==> public fun resolveDeclarationWithParents(element: KtDeclaration): ResolveWithParentsResult defined in org.jetbrains.kotlin.idea.highlighter.markers in file SuperDeclarationMarker.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [212:60] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectSuperDeclarationMarkers[ValueParameterDescriptorImpl]

'resolveWithParents' @ [213:9] ==> val resolveWithParents: ResolveWithParentsResult defined in org.jetbrains.kotlin.idea.highlighter.markers.collectSuperDeclarationMarkers[LocalVariableDescriptor]

'overriddenDescriptors' @ [213:28] ==> public final val overriddenDescriptors: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.highlighter.markers.ResolveWithParentsResult[PropertyDescriptorImpl]

'isEmpty' @ [213:50] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'isImplementsAndNotOverrides' @ [215:22] ==> private fun isImplementsAndNotOverrides(descriptor: CallableMemberDescriptor, overriddenMembers: Collection<CallableMemberDescriptor>): Boolean defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'resolveWithParents' @ [215:50] ==> val resolveWithParents: ResolveWithParentsResult defined in org.jetbrains.kotlin.idea.highlighter.markers.collectSuperDeclarationMarkers[LocalVariableDescriptor]

'descriptor' @ [215:69] ==> public final val descriptor: CallableMemberDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.markers.ResolveWithParentsResult[PropertyDescriptorImpl]

'resolveWithParents' @ [215:83] ==> val resolveWithParents: ResolveWithParentsResult defined in org.jetbrains.kotlin.idea.highlighter.markers.collectSuperDeclarationMarkers[LocalVariableDescriptor]

'overriddenDescriptors' @ [215:102] ==> public final val overriddenDescriptors: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.highlighter.markers.ResolveWithParentsResult[PropertyDescriptorImpl]

'?:' @ [217:18] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'declaration' @ [217:19] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectSuperDeclarationMarkers[ValueParameterDescriptorImpl]

'nameIdentifier' @ [217:56] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'declaration' @ [217:74] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectSuperDeclarationMarkers[ValueParameterDescriptorImpl]

'result' @ [222:5] ==> value-parameter result: MutableCollection<LineMarkerInfo<*>> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectSuperDeclarationMarkers[ValueParameterDescriptorImpl]

'add' @ [222:12] ==> public abstract fun add(element: LineMarkerInfo<*>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'LineMarkerInfo' @ [222:16] ==> public constructor LineMarkerInfo<T : (PsiElement..PsiElement?)>(@NotNull p0: KtDeclaration, @NotNull p1: TextRange, p2: (Icon..Icon?), p3: Int, @Nullable p4: Function<in (KtDeclaration..KtDeclaration?), (String..String?)>?, @Nullable p5: GutterIconNavigationHandler<(KtDeclaration..KtDeclaration?)>?, @NotNull p6: GutterIconRenderer.Alignment) defined in com.intellij.codeInsight.daemon.LineMarkerInfo[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtDeclaration

'declaration' @ [223:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectSuperDeclarationMarkers[ValueParameterDescriptorImpl]

'anchor' @ [224:13] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.collectSuperDeclarationMarkers[LocalVariableDescriptor]

'textRange' @ [224:20] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'if (implements) IMPLEMENTING_MARK else OVERRIDING_MARK' @ [225:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Icon, elseBranch: Icon): Icon[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Icon

'implements' @ [225:17] ==> val implements: Boolean defined in org.jetbrains.kotlin.idea.highlighter.markers.collectSuperDeclarationMarkers[LocalVariableDescriptor]

'IMPLEMENTING_MARK' @ [225:29] ==> private val IMPLEMENTING_MARK: Icon defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'OVERRIDING_MARK' @ [225:52] ==> private val OVERRIDING_MARK: Icon defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'LINE_MARKERS' @ [226:18] ==> public const final val LINE_MARKERS: Int defined in com.intellij.codeHighlighting.Pass[JavaPropertyDescriptor]

'SuperDeclarationMarkerTooltip' @ [227:13] ==> public object SuperDeclarationMarkerTooltip : Function<KtDeclaration, String> defined in org.jetbrains.kotlin.idea.highlighter.markers in file SuperDeclarationMarker.kt[FakeCallableDescriptorForObject]

'SuperDeclarationMarkerNavigationHandler' @ [228:13] ==> public constructor SuperDeclarationMarkerNavigationHandler() defined in org.jetbrains.kotlin.idea.highlighter.markers.SuperDeclarationMarkerNavigationHandler[ClassConstructorDescriptorImpl]

'RIGHT' @ [229:42] ==> enum entry RIGHT defined in com.intellij.openapi.editor.markup.GutterIconRenderer.Alignment[FakeCallableDescriptorForObject]

'!' @ [234:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [234:10] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.highlighter.markers.collectInheritedClassMarker[ValueParameterDescriptorImpl]

'isInheritable' @ [234:18] ==> public fun KtClass.isInheritable(): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'element' @ [238:22] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.highlighter.markers.collectInheritedClassMarker[ValueParameterDescriptorImpl]

'toLightClass' @ [238:30] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'==' @ [240:9] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.psi.PsiClass[DeserializedSimpleFunctionDescriptor]

'search' @ [240:31] ==> @NotNull public open fun search(@NotNull p0: PsiClass, p1: Boolean): Query<(PsiClass..PsiClass?)> defined in com.intellij.psi.search.searches.ClassInheritorsSearch[JavaMethodDescriptor]

'lightClass' @ [240:38] ==> val lightClass: KtLightClass defined in org.jetbrains.kotlin.idea.highlighter.markers.collectInheritedClassMarker[LocalVariableDescriptor]

'findFirst' @ [240:57] ==> @Nullable public abstract fun findFirst(): PsiClass? defined in com.intellij.util.Query[JavaMethodDescriptor]

'element' @ [242:18] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.highlighter.markers.collectInheritedClassMarker[ValueParameterDescriptorImpl]

'nameIdentifier' @ [242:26] ==> public final val KtClass.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'element' @ [242:44] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.highlighter.markers.collectInheritedClassMarker[ValueParameterDescriptorImpl]

'result' @ [244:5] ==> value-parameter result: MutableCollection<LineMarkerInfo<*>> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectInheritedClassMarker[ValueParameterDescriptorImpl]

'add' @ [244:12] ==> public abstract fun add(element: LineMarkerInfo<*>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'LineMarkerInfo' @ [244:16] ==> public constructor LineMarkerInfo<T : (PsiElement..PsiElement?)>(@NotNull p0: PsiElement, @NotNull p1: TextRange, p2: (Icon..Icon?), p3: Int, @Nullable p4: Function<in (PsiElement..PsiElement?), (String..String?)>?, @Nullable p5: GutterIconNavigationHandler<(PsiElement..PsiElement?)>?, @NotNull p6: GutterIconRenderer.Alignment) defined in com.intellij.codeInsight.daemon.LineMarkerInfo[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiElement

'anchor' @ [245:13] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.collectInheritedClassMarker[LocalVariableDescriptor]

'anchor' @ [246:13] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.collectInheritedClassMarker[LocalVariableDescriptor]

'textRange' @ [246:20] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'if (element.isInterface()) IMPLEMENTED_MARK else OVERRIDDEN_MARK' @ [247:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Icon, elseBranch: Icon): Icon[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Icon

'element' @ [247:17] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.highlighter.markers.collectInheritedClassMarker[ValueParameterDescriptorImpl]

'isInterface' @ [247:25] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'IMPLEMENTED_MARK' @ [247:40] ==> private val IMPLEMENTED_MARK: Icon defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'OVERRIDDEN_MARK' @ [247:62] ==> private val OVERRIDDEN_MARK: Icon defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'LINE_MARKERS' @ [248:18] ==> public const final val LINE_MARKERS: Int defined in com.intellij.codeHighlighting.Pass[JavaPropertyDescriptor]

'SUBCLASSED_CLASS' @ [249:13] ==> private val SUBCLASSED_CLASS: MarkerType defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'tooltip' @ [249:30] ==> public final val MarkerType.tooltip: Function<(PsiElement..PsiElement?), (String..String?)>[MyPropertyDescriptor]

'SUBCLASSED_CLASS' @ [250:13] ==> private val SUBCLASSED_CLASS: MarkerType defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'navigationHandler' @ [250:30] ==> public final val MarkerType.navigationHandler: GutterIconNavigationHandler<(PsiElement..PsiElement?)>[MyPropertyDescriptor]

'RIGHT' @ [251:42] ==> enum entry RIGHT defined in com.intellij.openapi.editor.markup.GutterIconRenderer.Alignment[FakeCallableDescriptorForObject]

'HashMap' @ [257:25] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> KtNamedDeclaration

'properties' @ [258:22] ==> value-parameter properties: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[ValueParameterDescriptorImpl]

'property' @ [259:13] ==> val property: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[LocalVariableDescriptor]

'isOverridable' @ [259:22] ==> public fun KtDeclaration.isOverridable(): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'property' @ [260:39] ==> val property: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[LocalVariableDescriptor]

'getAccessorLightMethods' @ [260:48] ==> public fun KtNamedDeclaration.getAccessorLightMethods(): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'accessorsPsiMethods' @ [261:31] ==> val accessorsPsiMethods: LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[LocalVariableDescriptor]

'mappingToJava' @ [262:17] ==> val mappingToJava: HashMap<PsiElement, KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[LocalVariableDescriptor]

'put' @ [262:31] ==> public open fun put(key: PsiElement, value: KtNamedDeclaration): KtNamedDeclaration? defined in java.util.HashMap[JavaMethodDescriptor]

'psiMethod' @ [262:35] ==> val psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[LocalVariableDescriptor]

'property' @ [262:46] ==> val property: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[LocalVariableDescriptor]

'mappingToJava' @ [264:13] ==> val mappingToJava: HashMap<PsiElement, KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[LocalVariableDescriptor]

'property' @ [264:27] ==> val property: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[LocalVariableDescriptor]

'property' @ [264:39] ==> val property: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[LocalVariableDescriptor]

'collectContainingClasses' @ [268:19] ==> public fun collectContainingClasses(methods: Collection<PsiMethod>): Set<PsiClass> defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'mappingToJava' @ [268:44] ==> val mappingToJava: HashMap<PsiElement, KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[LocalVariableDescriptor]

'keys' @ [268:58] ==> public open val keys: MutableSet<PsiElement> defined in java.util.HashMap[JavaPropertyDescriptor]

'filterIsInstance' @ [268:63] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> PsiMethod

'getOverriddenDeclarations' @ [270:22] ==> internal fun <T> getOverriddenDeclarations(mappingToJava: MutableMap<PsiElement, KtNamedDeclaration>, classes: Set<PsiClass>): Set<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> KtNamedDeclaration

'mappingToJava' @ [270:48] ==> val mappingToJava: HashMap<PsiElement, KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[LocalVariableDescriptor]

'classes' @ [270:63] ==> val classes: Set<PsiClass> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[LocalVariableDescriptor]

'checkCanceled' @ [271:25] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'?:' @ [273:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'property' @ [273:23] ==> val property: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[LocalVariableDescriptor]

'nameIdentifier' @ [273:61] ==> public final val PsiNameIdentifierOwner.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'property' @ [273:79] ==> val property: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[LocalVariableDescriptor]

'result' @ [275:9] ==> value-parameter result: MutableCollection<LineMarkerInfo<*>> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[ValueParameterDescriptorImpl]

'add' @ [275:16] ==> public abstract fun add(element: LineMarkerInfo<*>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'LineMarkerInfo' @ [275:20] ==> public constructor LineMarkerInfo<T : (PsiElement..PsiElement?)>(@NotNull p0: PsiElement, @NotNull p1: TextRange, p2: (Icon..Icon?), p3: Int, @Nullable p4: Function<in (PsiElement..PsiElement?), (String..String?)>?, @Nullable p5: GutterIconNavigationHandler<(PsiElement..PsiElement?)>?, @NotNull p6: GutterIconRenderer.Alignment) defined in com.intellij.codeInsight.daemon.LineMarkerInfo[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiElement

'anchor' @ [276:17] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[LocalVariableDescriptor]

'anchor' @ [277:17] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[LocalVariableDescriptor]

'textRange' @ [277:24] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'if (isImplemented(property)) IMPLEMENTED_MARK else OVERRIDDEN_MARK' @ [278:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Icon, elseBranch: Icon): Icon[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Icon

'isImplemented' @ [278:21] ==> public fun isImplemented(declaration: KtNamedDeclaration): Boolean defined in org.jetbrains.kotlin.idea.highlighter.markers in file OverridenPropertyMarker.kt[SimpleFunctionDescriptorImpl]

'property' @ [278:35] ==> val property: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenPropertyAccessors[LocalVariableDescriptor]

'IMPLEMENTED_MARK' @ [278:46] ==> private val IMPLEMENTED_MARK: Icon defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'OVERRIDDEN_MARK' @ [278:68] ==> private val OVERRIDDEN_MARK: Icon defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'LINE_MARKERS' @ [279:22] ==> public const final val LINE_MARKERS: Int defined in com.intellij.codeHighlighting.Pass[JavaPropertyDescriptor]

'OVERRIDDEN_PROPERTY' @ [280:17] ==> private val OVERRIDDEN_PROPERTY: <no name provided> defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'tooltip' @ [280:37] ==> public final val <no name provided>.tooltip: Function<(PsiElement..PsiElement?), (String..String?)>[MyPropertyDescriptor]

'OVERRIDDEN_PROPERTY' @ [281:17] ==> private val OVERRIDDEN_PROPERTY: <no name provided> defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'navigationHandler' @ [281:37] ==> public final val <no name provided>.navigationHandler: GutterIconNavigationHandler<PsiElement>[MyPropertyDescriptor]

'RIGHT' @ [282:46] ==> enum entry RIGHT defined in com.intellij.openapi.editor.markup.GutterIconRenderer.Alignment[FakeCallableDescriptorForObject]

'declaration' @ [290:22] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectImplementationMarkers[ValueParameterDescriptorImpl]

'toDescriptor' @ [290:34] ==> public fun KtDeclaration.toDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'declaration' @ [291:34] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectImplementationMarkers[ValueParameterDescriptorImpl]

'containingKtFile' @ [291:46] ==> public final val KtNamedDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'findModuleDescriptor' @ [291:63] ==> public fun KtElement.findModuleDescriptor(): ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'commonModuleDescriptor' @ [293:9] ==> val commonModuleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.collectImplementationMarkers[LocalVariableDescriptor]

'allImplementingCompatibleModules' @ [293:32] ==> public val ModuleDescriptor.allImplementingCompatibleModules: List<ModuleDescriptor> defined in org.jetbrains.kotlin.idea.highlighter[DeserializedPropertyDescriptor]

'none' @ [293:65] ==> public inline fun <T> Iterable<ModuleDescriptor>.none(predicate: (ModuleDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptor

'it' @ [293:72] ==> value-parameter it: ModuleDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.collectImplementationMarkers.<anonymous>[ValueParameterDescriptorImpl]

'hasImplementationsOf' @ [293:75] ==> public fun ModuleDescriptor.hasImplementationsOf(descriptor: MemberDescriptor): Boolean defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'descriptor' @ [293:96] ==> val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.collectImplementationMarkers[LocalVariableDescriptor]

'declaration' @ [295:18] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectImplementationMarkers[ValueParameterDescriptorImpl]

'nameIdentifier' @ [295:30] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'declaration' @ [295:48] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectImplementationMarkers[ValueParameterDescriptorImpl]

'result' @ [297:5] ==> value-parameter result: MutableCollection<LineMarkerInfo<*>> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectImplementationMarkers[ValueParameterDescriptorImpl]

'add' @ [297:12] ==> public abstract fun add(element: LineMarkerInfo<*>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'LineMarkerInfo' @ [297:16] ==> public constructor LineMarkerInfo<T : (PsiElement..PsiElement?)>(@NotNull p0: PsiElement, @NotNull p1: TextRange, p2: (Icon..Icon?), p3: Int, @Nullable p4: Function<in (PsiElement..PsiElement?), (String..String?)>?, @Nullable p5: GutterIconNavigationHandler<(PsiElement..PsiElement?)>?, @NotNull p6: GutterIconRenderer.Alignment) defined in com.intellij.codeInsight.daemon.LineMarkerInfo[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiElement

'anchor' @ [298:13] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.collectImplementationMarkers[LocalVariableDescriptor]

'anchor' @ [299:13] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.collectImplementationMarkers[LocalVariableDescriptor]

'textRange' @ [299:20] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'FROM_HEADER' @ [300:25] ==> public final val FROM_HEADER: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'LINE_MARKERS' @ [301:18] ==> public const final val LINE_MARKERS: Int defined in com.intellij.codeHighlighting.Pass[JavaPropertyDescriptor]

'PLATFORM_IMPLEMENTATION' @ [302:13] ==> private val PLATFORM_IMPLEMENTATION: MarkerType defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'tooltip' @ [302:37] ==> public final val MarkerType.tooltip: Function<(PsiElement..PsiElement?), (String..String?)>[MyPropertyDescriptor]

'PLATFORM_IMPLEMENTATION' @ [303:13] ==> private val PLATFORM_IMPLEMENTATION: MarkerType defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'navigationHandler' @ [303:37] ==> public final val MarkerType.navigationHandler: GutterIconNavigationHandler<(PsiElement..PsiElement?)>[MyPropertyDescriptor]

'RIGHT' @ [304:42] ==> enum entry RIGHT defined in com.intellij.openapi.editor.markup.GutterIconRenderer.Alignment[FakeCallableDescriptorForObject]

'declaration' @ [311:22] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectHeaderMarkers[ValueParameterDescriptorImpl]

'toDescriptor' @ [311:34] ==> public fun KtDeclaration.toDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'declaration' @ [312:36] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectHeaderMarkers[ValueParameterDescriptorImpl]

'containingKtFile' @ [312:48] ==> public final val KtNamedDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'findModuleDescriptor' @ [312:65] ==> public fun KtElement.findModuleDescriptor(): ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'platformModuleDescriptor' @ [313:34] ==> val platformModuleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.collectHeaderMarkers[LocalVariableDescriptor]

'commonModuleOrNull' @ [313:59] ==> public fun ModuleDescriptor.commonModuleOrNull(): ModuleDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'!' @ [314:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'commonModuleDescriptor' @ [314:10] ==> val commonModuleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.collectHeaderMarkers[LocalVariableDescriptor]

'hasDeclarationOf' @ [314:33] ==> public fun ModuleDescriptor.hasDeclarationOf(descriptor: MemberDescriptor): Boolean defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'descriptor' @ [314:50] ==> val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.collectHeaderMarkers[LocalVariableDescriptor]

'declaration' @ [316:18] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectHeaderMarkers[ValueParameterDescriptorImpl]

'nameIdentifier' @ [316:30] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'declaration' @ [316:48] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.collectHeaderMarkers[ValueParameterDescriptorImpl]

'result' @ [318:5] ==> value-parameter result: MutableCollection<LineMarkerInfo<*>> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectHeaderMarkers[ValueParameterDescriptorImpl]

'add' @ [318:12] ==> public abstract fun add(element: LineMarkerInfo<*>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'LineMarkerInfo' @ [318:16] ==> public constructor LineMarkerInfo<T : (PsiElement..PsiElement?)>(@NotNull p0: PsiElement, @NotNull p1: TextRange, p2: (Icon..Icon?), p3: Int, @Nullable p4: Function<in (PsiElement..PsiElement?), (String..String?)>?, @Nullable p5: GutterIconNavigationHandler<(PsiElement..PsiElement?)>?, @NotNull p6: GutterIconRenderer.Alignment) defined in com.intellij.codeInsight.daemon.LineMarkerInfo[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiElement

'anchor' @ [319:13] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.collectHeaderMarkers[LocalVariableDescriptor]

'anchor' @ [320:13] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.collectHeaderMarkers[LocalVariableDescriptor]

'textRange' @ [320:20] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'FROM_IMPL' @ [321:25] ==> public final val FROM_IMPL: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'LINE_MARKERS' @ [322:18] ==> public const final val LINE_MARKERS: Int defined in com.intellij.codeHighlighting.Pass[JavaPropertyDescriptor]

'HEADER_DECLARATION' @ [323:13] ==> private val HEADER_DECLARATION: MarkerType defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'tooltip' @ [323:32] ==> public final val MarkerType.tooltip: Function<(PsiElement..PsiElement?), (String..String?)>[MyPropertyDescriptor]

'HEADER_DECLARATION' @ [324:13] ==> private val HEADER_DECLARATION: MarkerType defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'navigationHandler' @ [324:32] ==> public final val MarkerType.navigationHandler: GutterIconNavigationHandler<(PsiElement..PsiElement?)>[MyPropertyDescriptor]

'RIGHT' @ [325:42] ==> enum entry RIGHT defined in com.intellij.openapi.editor.markup.GutterIconRenderer.Alignment[FakeCallableDescriptorForObject]

'HashMap' @ [330:25] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> KtNamedFunction

'functions' @ [331:22] ==> value-parameter functions: Collection<KtNamedFunction> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[ValueParameterDescriptorImpl]

'function' @ [332:13] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[LocalVariableDescriptor]

'isOverridable' @ [332:22] ==> public fun KtDeclaration.isOverridable(): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'LightClassUtil' @ [333:26] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassMethod' @ [333:41] ==> public final fun getLightClassMethod(function: KtFunction): PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'function' @ [333:61] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[LocalVariableDescriptor]

'method' @ [334:17] ==> val method: PsiMethod? defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[LocalVariableDescriptor]

'mappingToJava' @ [335:17] ==> val mappingToJava: HashMap<PsiElement, KtNamedFunction> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[LocalVariableDescriptor]

'put' @ [335:31] ==> public open fun put(key: PsiElement, value: KtNamedFunction): KtNamedFunction? defined in java.util.HashMap[JavaMethodDescriptor]

'method' @ [335:35] ==> val method: PsiMethod? defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[LocalVariableDescriptor]

'function' @ [335:43] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[LocalVariableDescriptor]

'mappingToJava' @ [337:13] ==> val mappingToJava: HashMap<PsiElement, KtNamedFunction> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[LocalVariableDescriptor]

'put' @ [337:27] ==> public open fun put(key: PsiElement, value: KtNamedFunction): KtNamedFunction? defined in java.util.HashMap[JavaMethodDescriptor]

'function' @ [337:31] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[LocalVariableDescriptor]

'function' @ [337:41] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[LocalVariableDescriptor]

'collectContainingClasses' @ [341:19] ==> public fun collectContainingClasses(methods: Collection<PsiMethod>): Set<PsiClass> defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'mappingToJava' @ [341:44] ==> val mappingToJava: HashMap<PsiElement, KtNamedFunction> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[LocalVariableDescriptor]

'keys' @ [341:58] ==> public open val keys: MutableSet<PsiElement> defined in java.util.HashMap[JavaPropertyDescriptor]

'filterIsInstance' @ [341:63] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> PsiMethod

'getOverriddenDeclarations' @ [343:22] ==> internal fun <T> getOverriddenDeclarations(mappingToJava: MutableMap<PsiElement, KtNamedFunction>, classes: Set<PsiClass>): Set<KtNamedFunction> defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> KtNamedFunction

'mappingToJava' @ [343:48] ==> val mappingToJava: HashMap<PsiElement, KtNamedFunction> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[LocalVariableDescriptor]

'classes' @ [343:63] ==> val classes: Set<PsiClass> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[LocalVariableDescriptor]

'checkCanceled' @ [344:25] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'function' @ [346:22] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[LocalVariableDescriptor]

'nameIdentifier' @ [346:31] ==> public final val KtNamedFunction.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'function' @ [346:49] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[LocalVariableDescriptor]

'result' @ [348:9] ==> value-parameter result: MutableCollection<LineMarkerInfo<*>> defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[ValueParameterDescriptorImpl]

'add' @ [348:16] ==> public abstract fun add(element: LineMarkerInfo<*>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'LineMarkerInfo' @ [348:20] ==> public constructor LineMarkerInfo<T : (PsiElement..PsiElement?)>(@NotNull p0: PsiElement, @NotNull p1: TextRange, p2: (Icon..Icon?), p3: Int, @Nullable p4: Function<in (PsiElement..PsiElement?), (String..String?)>?, @Nullable p5: GutterIconNavigationHandler<(PsiElement..PsiElement?)>?, @NotNull p6: GutterIconRenderer.Alignment) defined in com.intellij.codeInsight.daemon.LineMarkerInfo[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiElement

'anchor' @ [349:17] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[LocalVariableDescriptor]

'anchor' @ [350:17] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[LocalVariableDescriptor]

'textRange' @ [350:24] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'if (isImplemented(function)) IMPLEMENTED_MARK else OVERRIDDEN_MARK' @ [351:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Icon, elseBranch: Icon): Icon[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Icon

'isImplemented' @ [351:21] ==> public fun isImplemented(declaration: KtNamedDeclaration): Boolean defined in org.jetbrains.kotlin.idea.highlighter.markers in file OverridenPropertyMarker.kt[SimpleFunctionDescriptorImpl]

'function' @ [351:35] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.highlighter.markers.collectOverriddenFunctions[LocalVariableDescriptor]

'IMPLEMENTED_MARK' @ [351:46] ==> private val IMPLEMENTED_MARK: Icon defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'OVERRIDDEN_MARK' @ [351:68] ==> private val OVERRIDDEN_MARK: Icon defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'LINE_MARKERS' @ [352:22] ==> public const final val LINE_MARKERS: Int defined in com.intellij.codeHighlighting.Pass[JavaPropertyDescriptor]

'OVERRIDDEN_FUNCTION' @ [352:36] ==> private val OVERRIDDEN_FUNCTION: <no name provided> defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'tooltip' @ [352:56] ==> public final val <no name provided>.tooltip: Function<(PsiElement..PsiElement?), (String..String?)>[MyPropertyDescriptor]

'OVERRIDDEN_FUNCTION' @ [353:17] ==> private val OVERRIDDEN_FUNCTION: <no name provided> defined in org.jetbrains.kotlin.idea.highlighter.markers in file KotlinLineMarkerProvider.kt[PropertyDescriptorImpl]

'navigationHandler' @ [353:37] ==> public final val <no name provided>.navigationHandler: GutterIconNavigationHandler<PsiElement>[MyPropertyDescriptor]

'RIGHT' @ [354:46] ==> enum entry RIGHT defined in com.intellij.openapi.editor.markup.GutterIconRenderer.Alignment[FakeCallableDescriptorForObject]

