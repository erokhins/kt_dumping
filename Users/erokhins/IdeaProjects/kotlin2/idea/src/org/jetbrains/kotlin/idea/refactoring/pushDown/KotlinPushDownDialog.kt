'RefactoringDialog' @ [46:5] ==> protected/*protected and package*/ constructor RefactoringDialog(@NotNull p0: Project, p1: Boolean) defined in com.intellij.refactoring.ui.RefactoringDialog[JavaClassConstructorDescriptor]

'project' @ [46:23] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.<init>[ValueParameterDescriptorImpl]

'title' @ [48:9] ==> public final var KotlinPushDownDialog.title: (String..String?)[MyPropertyDescriptor]

'PUSH_MEMBERS_DOWN' @ [48:17] ==> public val PUSH_MEMBERS_DOWN: String defined in org.jetbrains.kotlin.idea.refactoring.pushDown in file KotlinPushDownHandler.kt[PropertyDescriptorImpl]

'init' @ [49:9] ==> protected/*protected and package*/ open fun init(): Unit defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog[JavaMethodDescriptor]

'memberInfos' @ [55:17] ==> private final val memberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog[PropertyDescriptorImpl]

'filter' @ [55:29] ==> public inline fun <T> Iterable<KotlinMemberInfo>.filter(predicate: (KotlinMemberInfo) -> Boolean): List<KotlinMemberInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberInfo

'it' @ [55:38] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.<get-selectedMemberInfos>.<anonymous>[ValueParameterDescriptorImpl]

'isChecked' @ [55:41] ==> public final var KotlinMemberInfo.isChecked: Boolean[MyPropertyDescriptor]

'memberInfoModel' @ [55:54] ==> private final var memberInfoModel: MemberInfoModel<KtNamedDeclaration, KotlinMemberInfo>? defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog[PropertyDescriptorImpl]

'isMemberEnabled' @ [55:71] ==> public abstract fun isMemberEnabled(p0: (KotlinMemberInfo..KotlinMemberInfo?)): Boolean defined in com.intellij.refactoring.classMembers.MemberInfoModel[JavaMethodDescriptor]

'it' @ [55:87] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.<get-selectedMemberInfos>.<anonymous>[ValueParameterDescriptorImpl]

'+' @ [57:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'this' @ [57:51] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog[LazyClassReceiverParameterDescriptor]

'java' @ [57:63] ==> public val <T> KClass<out KotlinPushDownDialog>.java: Class<out KotlinPushDownDialog> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out KotlinPushDownDialog)

'name' @ [57:68] ==> public final val <T : (Any..Any?)> Class<out KotlinPushDownDialog>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out KotlinPushDownDialog)

'GridBagConstraints' @ [60:29] ==> public constructor GridBagConstraints() defined in java.awt.GridBagConstraints[JavaClassConstructorDescriptor]

'JPanel' @ [62:21] ==> public constructor JPanel(p0: (LayoutManager..LayoutManager?)) defined in javax.swing.JPanel[JavaClassConstructorDescriptor]

'GridBagLayout' @ [62:28] ==> public constructor GridBagLayout() defined in java.awt.GridBagLayout[JavaClassConstructorDescriptor]

'gbConstraints' @ [64:9] ==> val gbConstraints: GridBagConstraints defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createNorthPanel[LocalVariableDescriptor]

'insets' @ [64:23] ==> public final var insets: (Insets..Insets?) defined in java.awt.GridBagConstraints[JavaPropertyDescriptor]

'Insets' @ [64:32] ==> public constructor Insets(p0: Int, p1: Int, p2: Int, p3: Int) defined in java.awt.Insets[JavaClassConstructorDescriptor]

'gbConstraints' @ [65:9] ==> val gbConstraints: GridBagConstraints defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createNorthPanel[LocalVariableDescriptor]

'weighty' @ [65:23] ==> public final var weighty: Double defined in java.awt.GridBagConstraints[JavaPropertyDescriptor]

'gbConstraints' @ [66:9] ==> val gbConstraints: GridBagConstraints defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createNorthPanel[LocalVariableDescriptor]

'weightx' @ [66:23] ==> public final var weightx: Double defined in java.awt.GridBagConstraints[JavaPropertyDescriptor]

'gbConstraints' @ [67:9] ==> val gbConstraints: GridBagConstraints defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createNorthPanel[LocalVariableDescriptor]

'gridy' @ [67:23] ==> public final var gridy: Int defined in java.awt.GridBagConstraints[JavaPropertyDescriptor]

'gbConstraints' @ [68:9] ==> val gbConstraints: GridBagConstraints defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createNorthPanel[LocalVariableDescriptor]

'gridwidth' @ [68:23] ==> public final var gridwidth: Int defined in java.awt.GridBagConstraints[JavaPropertyDescriptor]

'REMAINDER' @ [68:54] ==> public const final val REMAINDER: Int defined in java.awt.GridBagConstraints[JavaPropertyDescriptor]

'gbConstraints' @ [69:9] ==> val gbConstraints: GridBagConstraints defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createNorthPanel[LocalVariableDescriptor]

'fill' @ [69:23] ==> public final var fill: Int defined in java.awt.GridBagConstraints[JavaPropertyDescriptor]

'BOTH' @ [69:49] ==> public const final val BOTH: Int defined in java.awt.GridBagConstraints[JavaPropertyDescriptor]

'gbConstraints' @ [70:9] ==> val gbConstraints: GridBagConstraints defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createNorthPanel[LocalVariableDescriptor]

'anchor' @ [70:23] ==> public final var anchor: Int defined in java.awt.GridBagConstraints[JavaPropertyDescriptor]

'WEST' @ [70:51] ==> public const final val WEST: Int defined in java.awt.GridBagConstraints[JavaPropertyDescriptor]

'panel' @ [71:9] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createNorthPanel[LocalVariableDescriptor]

'add' @ [71:15] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in javax.swing.JPanel[JavaMethodDescriptor]

'JLabel' @ [71:19] ==> public constructor JLabel(p0: (String..String?)) defined in javax.swing.JLabel[JavaClassConstructorDescriptor]

'message' @ [71:44] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'sourceClass' @ [72:52] ==> private final val sourceClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog[PropertyDescriptorImpl]

'qualifiedClassNameForRendering' @ [72:64] ==> public fun PsiNamedElement.qualifiedClassNameForRendering(): String defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file memberInfoUtils.kt[SimpleFunctionDescriptorImpl]

'gbConstraints' @ [72:100] ==> val gbConstraints: GridBagConstraints defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createNorthPanel[LocalVariableDescriptor]

'panel' @ [73:16] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createNorthPanel[LocalVariableDescriptor]

'JPanel' @ [77:21] ==> public constructor JPanel(p0: (LayoutManager..LayoutManager?)) defined in javax.swing.JPanel[JavaClassConstructorDescriptor]

'BorderLayout' @ [77:28] ==> public constructor BorderLayout() defined in java.awt.BorderLayout[JavaClassConstructorDescriptor]

'KotlinMemberSelectionPanel' @ [78:36] ==> public constructor KotlinMemberSelectionPanel(title: String, memberInfo: List<KotlinMemberInfo>, abstractColumnHeader: String?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberSelectionPanel[ClassConstructorDescriptorImpl]

'message' @ [79:35] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'memberInfos' @ [80:17] ==> private final val memberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog[PropertyDescriptorImpl]

'message' @ [81:35] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'panel' @ [82:9] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createCenterPanel[LocalVariableDescriptor]

'add' @ [82:15] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in javax.swing.JPanel[JavaMethodDescriptor]

'memberSelectionPanel' @ [82:19] ==> val memberSelectionPanel: KotlinMemberSelectionPanel defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createCenterPanel[LocalVariableDescriptor]

'CENTER' @ [82:54] ==> public const final val CENTER: String defined in java.awt.BorderLayout[JavaPropertyDescriptor]

'memberInfoModel' @ [84:9] ==> private final var memberInfoModel: MemberInfoModel<KtNamedDeclaration, KotlinMemberInfo>? defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog[PropertyDescriptorImpl]

'DelegatingMemberInfoModel<KtNamedDeclaration, KotlinMemberInfo>' @ [84:36] ==> public constructor DelegatingMemberInfoModel<T : (PsiElement..PsiElement?), M : (MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>..MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>?)>(p0: (MemberInfoModel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..MemberInfoModel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?)) defined in com.intellij.refactoring.classMembers.DelegatingMemberInfoModel[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtNamedDeclaration
    <M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> KotlinMemberInfo

'ANDCombinedMemberInfoModel' @ [85:17] ==> public constructor ANDCombinedMemberInfoModel<T : (PsiElement..PsiElement?), M : (MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>..MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>?)>(p0: (MemberInfoModel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..MemberInfoModel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?), p1: (MemberInfoModel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..MemberInfoModel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?)) defined in com.intellij.refactoring.classMembers.ANDCombinedMemberInfoModel[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtNamedDeclaration
    <M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> KotlinMemberInfo

'KotlinUsesDependencyMemberInfoModel' @ [86:25] ==> public constructor KotlinUsesDependencyMemberInfoModel<T : KtNamedDeclaration, M : MemberInfoBase<KtNamedDeclaration>>(klass: KtClassOrObject, superClass: PsiNamedElement?, recursive: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinUsesDependencyMemberInfoModel[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtNamedDeclaration> -> KtNamedDeclaration
    <M : MemberInfoBase<T>> -> KotlinMemberInfo

'sourceClass' @ [86:99] ==> private final val sourceClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog[PropertyDescriptorImpl]

'UsedByDependencyMemberInfoModel' @ [87:25] ==> public constructor UsedByDependencyMemberInfoModel<T : (NavigatablePsiElement..NavigatablePsiElement?), C : (PsiElement..PsiElement?), M : (MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>..MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>?)>(p0: (PsiNamedElement..PsiNamedElement?)) defined in com.intellij.refactoring.classMembers.UsedByDependencyMemberInfoModel[JavaClassConstructorDescriptor]
Inferred types:
    <T : (NavigatablePsiElement..NavigatablePsiElement?)> -> KtNamedDeclaration
    <C : (PsiElement..PsiElement?)> -> PsiNamedElement
    <M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> KotlinMemberInfo

'sourceClass' @ [87:112] ==> private final val sourceClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog[PropertyDescriptorImpl]

'memberInfo' @ [92:30] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createCenterPanel.<no name provided>.isAbstractEnabled[ValueParameterDescriptorImpl]

'member' @ [92:41] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'member' @ [93:21] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createCenterPanel.<no name provided>.isAbstractEnabled[LocalVariableDescriptor]

'hasModifier' @ [93:28] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'INLINE_KEYWORD' @ [93:49] ==> public final val INLINE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'member' @ [94:21] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createCenterPanel.<no name provided>.isAbstractEnabled[LocalVariableDescriptor]

'hasModifier' @ [94:28] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'EXTERNAL_KEYWORD' @ [94:49] ==> public final val EXTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'member' @ [95:21] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createCenterPanel.<no name provided>.isAbstractEnabled[LocalVariableDescriptor]

'hasModifier' @ [95:28] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'LATEINIT_KEYWORD' @ [95:49] ==> public final val LATEINIT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'member' @ [96:24] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createCenterPanel.<no name provided>.isAbstractEnabled[LocalVariableDescriptor]

'member' @ [96:53] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createCenterPanel.<no name provided>.isAbstractEnabled[LocalVariableDescriptor]

'memberInfoModel' @ [99:9] ==> private final var memberInfoModel: MemberInfoModel<KtNamedDeclaration, KotlinMemberInfo>? defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog[PropertyDescriptorImpl]

'memberInfoChanged' @ [99:27] ==> public abstract fun memberInfoChanged(p0: (MemberInfoChange<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..MemberInfoChange<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?)): Unit defined in com.intellij.refactoring.classMembers.MemberInfoModel[JavaMethodDescriptor]

'MemberInfoChange' @ [99:45] ==> public constructor MemberInfoChange<T : (PsiElement..PsiElement?), U : (MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>..MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>?)>(p0: (MutableCollection<(KotlinMemberInfo..KotlinMemberInfo?)>..Collection<(KotlinMemberInfo..KotlinMemberInfo?)>?)) defined in com.intellij.refactoring.classMembers.MemberInfoChange[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)
    <U : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> (org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo..org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo?)

'memberInfos' @ [99:62] ==> private final val memberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog[PropertyDescriptorImpl]

'memberSelectionPanel' @ [100:9] ==> val memberSelectionPanel: KotlinMemberSelectionPanel defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createCenterPanel[LocalVariableDescriptor]

'table' @ [100:30] ==> public final val KotlinMemberSelectionPanel.table: KotlinMemberSelectionTable[MyPropertyDescriptor]

'memberInfoModel' @ [100:36] ==> public final var KotlinMemberSelectionTable.memberInfoModel: (MemberInfoModel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..MemberInfoModel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?)[MyPropertyDescriptor]

'memberInfoModel' @ [100:54] ==> private final var memberInfoModel: MemberInfoModel<KtNamedDeclaration, KotlinMemberInfo>? defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog[PropertyDescriptorImpl]

'memberSelectionPanel' @ [101:9] ==> val memberSelectionPanel: KotlinMemberSelectionPanel defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createCenterPanel[LocalVariableDescriptor]

'table' @ [101:30] ==> public final val KotlinMemberSelectionPanel.table: KotlinMemberSelectionTable[MyPropertyDescriptor]

'addMemberInfoChangeListener' @ [101:36] ==> public open fun addMemberInfoChangeListener(p0: (MemberInfoChangeListener<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..MemberInfoChangeListener<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberSelectionTable[JavaMethodDescriptor]

'memberInfoModel' @ [101:64] ==> private final var memberInfoModel: MemberInfoModel<KtNamedDeclaration, KotlinMemberInfo>? defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog[PropertyDescriptorImpl]

'panel' @ [103:16] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog.createCenterPanel[LocalVariableDescriptor]

'!' @ [107:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isOKActionEnabled' @ [107:14] ==> public final var KotlinPushDownDialog.isOKActionEnabled: Boolean[MyPropertyDescriptor]

'getInstance' @ [109:33] ==> public open fun getInstance(): (JavaRefactoringSettings..JavaRefactoringSettings?) defined in com.intellij.refactoring.JavaRefactoringSettings[JavaMethodDescriptor]

'PUSH_DOWN_PREVIEW_USAGES' @ [109:47] ==> public final var PUSH_DOWN_PREVIEW_USAGES: Boolean defined in com.intellij.refactoring.JavaRefactoringSettings[JavaPropertyDescriptor]

'isPreviewUsages' @ [109:74] ==> public final val KotlinPushDownDialog.isPreviewUsages: Boolean[MyPropertyDescriptor]

'invokeRefactoring' @ [111:9] ==> protected/*protected and package*/ open fun invokeRefactoring(p0: (BaseRefactoringProcessor..BaseRefactoringProcessor?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog[JavaMethodDescriptor]

'KotlinPushDownProcessor' @ [111:27] ==> public constructor KotlinPushDownProcessor(project: Project, sourceClass: KtClass, membersToMove: List<KotlinMemberInfo>) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownProcessor[ClassConstructorDescriptorImpl]

'project' @ [111:51] ==> protected/*protected and package*/ for synthetic extension final val KotlinPushDownDialog.project: (Project..Project?)[MyPropertyDescriptor]

'sourceClass' @ [111:60] ==> private final val sourceClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog[PropertyDescriptorImpl]

'selectedMemberInfos' @ [111:73] ==> private final val selectedMemberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pushDown.KotlinPushDownDialog[PropertyDescriptorImpl]

