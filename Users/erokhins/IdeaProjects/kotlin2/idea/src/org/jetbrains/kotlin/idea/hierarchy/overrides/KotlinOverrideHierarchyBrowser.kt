'MethodHierarchyBrowserBase' @ [41:5] ==> public constructor MethodHierarchyBrowserBase(p0: (Project..Project?), p1: (PsiElement..PsiElement?)) defined in com.intellij.ide.hierarchy.MethodHierarchyBrowserBase[JavaClassConstructorDescriptor]

'project' @ [41:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.<init>[ValueParameterDescriptorImpl]

'baseElement' @ [41:41] ==> value-parameter baseElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.<init>[ValueParameterDescriptorImpl]

'getInstance' @ [43:43] ==> public open fun getInstance(): (ActionManager..ActionManager?) defined in com.intellij.openapi.actionSystem.ActionManager[JavaMethodDescriptor]

'createTree' @ [45:20] ==> protected/*protected and package*/ final fun createTree(p0: Boolean): (JTree..JTree?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser[JavaMethodDescriptor]

'actionManager' @ [47:21] ==> val actionManager: (ActionManager..ActionManager?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.createTrees[LocalVariableDescriptor]

'getAction' @ [47:35] ==> public abstract fun getAction(@NonNls @NotNull p0: String): (AnAction..AnAction?) defined in com.intellij.openapi.actionSystem.ActionManager[JavaMethodDescriptor]

'GROUP_METHOD_HIERARCHY_POPUP' @ [47:56] ==> @NonNls public const final val GROUP_METHOD_HIERARCHY_POPUP: String defined in com.intellij.openapi.actionSystem.IdeActions[JavaPropertyDescriptor]

'installPopupHandler' @ [48:22] ==> public open fun installPopupHandler(p0: (JComponent..JComponent?), @NotNull p1: ActionGroup, p2: (String..String?), p3: (ActionManager..ActionManager?)): (MouseListener..MouseListener?) defined in com.intellij.ui.PopupHandler[JavaMethodDescriptor]

'tree' @ [48:42] ==> val tree: (JTree..JTree?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.createTrees[LocalVariableDescriptor]

'group' @ [48:48] ==> val group: ActionGroup defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.createTrees[LocalVariableDescriptor]

'METHOD_HIERARCHY_VIEW_POPUP' @ [48:68] ==> public const final val METHOD_HIERARCHY_VIEW_POPUP: String defined in com.intellij.openapi.actionSystem.ActionPlaces[JavaPropertyDescriptor]

'actionManager' @ [48:97] ==> val actionManager: (ActionManager..ActionManager?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.createTrees[LocalVariableDescriptor]

'BaseOnThisMethodAction' @ [50:9] ==> public constructor BaseOnThisMethodAction() defined in com.intellij.ide.hierarchy.MethodHierarchyBrowserBase.BaseOnThisMethodAction[JavaClassConstructorDescriptor]

'registerCustomShortcutSet' @ [50:34] ==> public final fun registerCustomShortcutSet(@NotNull p0: ShortcutSet, @Nullable p1: JComponent?): Unit defined in com.intellij.ide.hierarchy.MethodHierarchyBrowserBase.BaseOnThisMethodAction[JavaMethodDescriptor]

'actionManager' @ [50:60] ==> val actionManager: (ActionManager..ActionManager?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.createTrees[LocalVariableDescriptor]

'getAction' @ [50:74] ==> public abstract fun getAction(@NonNls @NotNull p0: String): (AnAction..AnAction?) defined in com.intellij.openapi.actionSystem.ActionManager[JavaMethodDescriptor]

'ACTION_METHOD_HIERARCHY' @ [50:95] ==> @NonNls public const final val ACTION_METHOD_HIERARCHY: String defined in com.intellij.openapi.actionSystem.IdeActions[JavaPropertyDescriptor]

'shortcutSet' @ [50:120] ==> public final var AnAction.shortcutSet: (ShortcutSet..ShortcutSet?)[MyPropertyDescriptor]

'tree' @ [50:133] ==> val tree: (JTree..JTree?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.createTrees[LocalVariableDescriptor]

'trees' @ [52:9] ==> value-parameter trees: MutableMap<String, JTree> defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.createTrees[ValueParameterDescriptorImpl]

'put' @ [52:15] ==> public abstract fun put(key: String, value: JTree): JTree? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'METHOD_TYPE' @ [52:46] ==> public const final val METHOD_TYPE: (String..String?) defined in com.intellij.ide.hierarchy.MethodHierarchyBrowserBase[JavaPropertyDescriptor]

'tree' @ [52:59] ==> val tree: (JTree..JTree?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.createTrees[LocalVariableDescriptor]

'createStandardLegendPanel' @ [56:40] ==> protected/*protected static*/ open fun createStandardLegendPanel(p0: (String..String?), p1: (String..String?), p2: (String..String?)): (JPanel..JPanel?) defined in com.intellij.ide.hierarchy.MethodHierarchyBrowserBase[JavaMethodDescriptor]

'message' @ [57:34] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'message' @ [58:34] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'message' @ [59:34] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'descriptor' @ [62:82] ==> value-parameter descriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.getElementFromDescriptor[ValueParameterDescriptorImpl]

'psiElement' @ [62:93] ==> public final val HierarchyNodeDescriptor.psiElement: PsiElement?[MyPropertyDescriptor]

'psiElement' @ [65:13] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.isApplicableElement[ValueParameterDescriptorImpl]

'isOverrideHierarchyElement' @ [65:24] ==> public fun PsiElement.isOverrideHierarchyElement(): Boolean defined in org.jetbrains.kotlin.idea.hierarchy.overrides in file KotlinOverrideHierarchyProvider.kt[SimpleFunctionDescriptorImpl]

'if (typeName == MethodHierarchyBrowserBase.METHOD_TYPE) KotlinOverrideTreeStructure(myProject, psiElement as KtCallableDeclaration) else null' @ [68:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: HierarchyTreeStructure?, elseBranch: HierarchyTreeStructure?): HierarchyTreeStructure?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> HierarchyTreeStructure?

'typeName' @ [68:17] ==> value-parameter typeName: String defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.createHierarchyTreeStructure[ValueParameterDescriptorImpl]

'METHOD_TYPE' @ [68:56] ==> public const final val METHOD_TYPE: (String..String?) defined in com.intellij.ide.hierarchy.MethodHierarchyBrowserBase[JavaPropertyDescriptor]

'KotlinOverrideTreeStructure' @ [68:69] ==> public constructor KotlinOverrideTreeStructure(project: Project, declaration: KtCallableDeclaration) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideTreeStructure[ClassConstructorDescriptorImpl]

'myProject' @ [68:97] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser[JavaPropertyDescriptor]

'psiElement' @ [68:108] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.createHierarchyTreeStructure[ValueParameterDescriptorImpl]

'!!' @ [70:36] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Comparator<raw (NodeDescriptor<(Any..Any?)>..NodeDescriptor<*>?)>?): Comparator<raw (NodeDescriptor<(Any..Any?)>..NodeDescriptor<*>?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Comparator<raw (com.intellij.ide.util.treeView.NodeDescriptor<(kotlin.Any..kotlin.Any?)>..com.intellij.ide.util.treeView.NodeDescriptor<*>?)>

'getComparator' @ [70:54] ==> public open fun getComparator(p0: (Project..Project?)): (Comparator<raw (NodeDescriptor<(Any..Any?)>..NodeDescriptor<*>?)>..Comparator<raw (NodeDescriptor<(Any..Any?)>..NodeDescriptor<*>?)>?) defined in com.intellij.ide.hierarchy.JavaHierarchyUtil[JavaMethodDescriptor]

'myProject' @ [70:68] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser[JavaPropertyDescriptor]

'element' @ [73:29] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.getContentDisplayName[ValueParameterDescriptorImpl]

'unwrapped' @ [73:37] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'targetElement' @ [74:13] ==> val targetElement: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.getContentDisplayName[LocalVariableDescriptor]

'getElementDescription' @ [75:43] ==> @NotNull public open fun getElementDescription(@NotNull p0: PsiElement, @NotNull p1: ElementDescriptionLocation): String defined in com.intellij.psi.ElementDescriptionUtil[JavaMethodDescriptor]

'targetElement' @ [75:65] ==> val targetElement: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.getContentDisplayName[LocalVariableDescriptor]

'INSTANCE' @ [75:106] ==> public final val INSTANCE: (UsageViewLongNameLocation..UsageViewLongNameLocation?) defined in com.intellij.usageView.UsageViewLongNameLocation[JavaPropertyDescriptor]

'super' @ [77:16] ==> <this> defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser[LazyClassReceiverParameterDescriptor]

'getContentDisplayName' @ [77:22] ==> @Nullable protected/*protected and package*/ open fun getContentDisplayName(@NotNull p0: String, @NotNull p1: PsiElement): String? defined in com.intellij.ide.hierarchy.MethodHierarchyBrowserBase[JavaMethodDescriptor]

'typeName' @ [77:44] ==> value-parameter typeName: String defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.getContentDisplayName[ValueParameterDescriptorImpl]

'element' @ [77:54] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser.getContentDisplayName[ValueParameterDescriptorImpl]

