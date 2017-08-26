'JavaExtractSuperBaseDialog' @ [54:5] ==> public constructor JavaExtractSuperBaseDialog(p0: (Project..Project?), p1: (PsiClass..PsiClass?), p2: (MutableList<(MemberInfo..MemberInfo?)>..List<(MemberInfo..MemberInfo?)>?), p3: (String..String?)) defined in com.intellij.refactoring.extractSuperclass.JavaExtractSuperBaseDialog[JavaClassConstructorDescriptor]

'originalClass' @ [54:32] ==> value-parameter originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.<init>[ValueParameterDescriptorImpl]

'project' @ [54:46] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'originalClass' @ [54:55] ==> value-parameter originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.<init>[ValueParameterDescriptorImpl]

'toLightClass' @ [54:69] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [54:87] ==> public fun <T> emptyList(): List<(MemberInfo..MemberInfo?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.refactoring.util.classMembers.MemberInfo..com.intellij.refactoring.util.classMembers.MemberInfo?)

'refactoringName' @ [54:100] ==> value-parameter refactoringName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.<init>[ValueParameterDescriptorImpl]

'memberInfoModel' @ [60:17] ==> private final lateinit var memberInfoModel: KotlinExtractSuperDialogBase.MemberInfoModelBase defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'memberInfos' @ [60:33] ==> public final val memberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.MemberInfoModelBase[PropertyDescriptorImpl]

'filter' @ [60:45] ==> public inline fun <T> Iterable<KotlinMemberInfo>.filter(predicate: (KotlinMemberInfo) -> Boolean): List<KotlinMemberInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberInfo

'it' @ [60:54] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.<get-selectedMembers>.<anonymous>[ValueParameterDescriptorImpl]

'isChecked' @ [60:57] ==> public final var KotlinMemberInfo.isChecked: Boolean[MyPropertyDescriptor]

'JTextField' @ [62:33] ==> public constructor JTextField() defined in javax.swing.JTextField[JavaClassConstructorDescriptor]

'KotlinUsesAndInterfacesDependencyMemberInfoModel<KtNamedDeclaration, KotlinMemberInfo>' @ [68:9] ==> public constructor KotlinUsesAndInterfacesDependencyMemberInfoModel<T : KtNamedDeclaration, M : MemberInfoBase<KtNamedDeclaration>>(klass: KtClassOrObject, superClass: PsiNamedElement?, recursive: Boolean, interfaceContainmentVerifier: (KtNamedDeclaration) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinUsesAndInterfacesDependencyMemberInfoModel[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtNamedDeclaration> -> KtNamedDeclaration
    <M : MemberInfoBase<T>> -> KotlinMemberInfo

'originalClass' @ [68:96] ==> value-parameter originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.MemberInfoModelBase.<init>[ValueParameterDescriptorImpl]

'interfaceContainmentVerifier' @ [68:124] ==> value-parameter interfaceContainmentVerifier: (KtNamedDeclaration) -> Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.MemberInfoModelBase.<init>[ValueParameterDescriptorImpl]

'member' @ [70:31] ==> value-parameter member: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.MemberInfoModelBase.isMemberEnabled[ValueParameterDescriptorImpl]

'member' @ [70:38] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'!' @ [71:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [71:21] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.MemberInfoModelBase.isMemberEnabled[LocalVariableDescriptor]

'hasModifier' @ [71:33] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'CONST_KEYWORD' @ [71:54] ==> public final val CONST_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'memberInfo' @ [75:26] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.MemberInfoModelBase.isAbstractEnabled[ValueParameterDescriptorImpl]

'member' @ [75:37] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'!' @ [76:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'member' @ [76:22] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.MemberInfoModelBase.isAbstractEnabled[LocalVariableDescriptor]

'hasModifier' @ [76:29] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'INLINE_KEYWORD' @ [76:50] ==> public final val INLINE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'member' @ [77:22] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.MemberInfoModelBase.isAbstractEnabled[LocalVariableDescriptor]

'hasModifier' @ [77:29] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'EXTERNAL_KEYWORD' @ [77:50] ==> public final val EXTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'member' @ [78:22] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.MemberInfoModelBase.isAbstractEnabled[LocalVariableDescriptor]

'hasModifier' @ [78:29] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'LATEINIT_KEYWORD' @ [78:50] ==> public final val LATEINIT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (targetParent is PsiDirectory) targetDirectory else targetParent' @ [85:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'targetParent' @ [85:21] ==> protected final val targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'targetDirectory' @ [85:51] ==> public final val KotlinExtractSuperDialogBase.targetDirectory: (PsiDirectory..PsiDirectory?)[MyPropertyDescriptor]

'targetParent' @ [85:72] ==> protected final val targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'fileNameField' @ [88:17] ==> private final val fileNameField: JTextField defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'text' @ [88:31] ==> public final var JTextField.text: (String..String?)[MyPropertyDescriptor]

'!' @ [91:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'initComplete' @ [91:14] ==> private final var initComplete: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'fileNameField' @ [92:9] ==> private final val fileNameField: JTextField defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'text' @ [92:23] ==> public final var JTextField.text: (String..String?)[MyPropertyDescriptor]

'extractedSuperName' @ [92:32] ==> public final val KotlinExtractSuperDialogBase.extractedSuperName: (String..String?)[MyPropertyDescriptor]

'EXTENSION' @ [92:68] ==> public const final val EXTENSION: String defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'invoke' @ [99:37] ==> public abstract operator fun invoke(p1: KotlinExtractSuperDialogBase): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [99:53] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[LazyClassReceiverParameterDescriptor]

'!!' @ [101:44] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Box?): Box[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Box

'createHorizontalBox' @ [101:48] ==> public open fun createHorizontalBox(): (Box..Box?) defined in javax.swing.Box[JavaMethodDescriptor]

'super' @ [104:16] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[LazyClassReceiverParameterDescriptor]

'createExtractedSuperNameField' @ [104:22] ==> protected/*protected and package*/ open fun createExtractedSuperNameField(): (JTextField..JTextField?) defined in com.intellij.refactoring.extractSuperclass.JavaExtractSuperBaseDialog[JavaMethodDescriptor]

'apply' @ [104:54] ==> @InlineOnly public inline fun <T> (JTextField..JTextField?).apply(block: (JTextField..JTextField?).() -> Unit): (JTextField..JTextField?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.swing.JTextField..javax.swing.JTextField?)

'document' @ [105:13] ==> public final var JTextField.document: (Document..Document?)[MyPropertyDescriptor]

'addDocumentListener' @ [105:22] ==> public abstract fun addDocumentListener(p0: (DocumentListener..DocumentListener?)): Unit defined in javax.swing.text.Document[JavaMethodDescriptor]

'DocumentAdapter' @ [106:30] ==> public constructor DocumentAdapter() defined in com.intellij.ui.DocumentAdapter[JavaClassConstructorDescriptor]

'resetFileNameField' @ [108:29] ==> private final fun resetFileNameField(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[SimpleFunctionDescriptorImpl]

'targetParent' @ [116:13] ==> protected final val targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'super' @ [118:36] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[LazyClassReceiverParameterDescriptor]

'createDestinationRootPanel' @ [118:42] ==> protected/*protected and package*/ open fun createDestinationRootPanel(): (JPanel..JPanel?) defined in com.intellij.refactoring.extractSuperclass.JavaExtractSuperBaseDialog[JavaMethodDescriptor]

'JPanel' @ [119:35] ==> public constructor JPanel(p0: (LayoutManager..LayoutManager?)) defined in javax.swing.JPanel[JavaClassConstructorDescriptor]

'BorderLayout' @ [119:42] ==> public constructor BorderLayout() defined in java.awt.BorderLayout[JavaClassConstructorDescriptor]

'apply' @ [119:58] ==> @InlineOnly public inline fun <T> JPanel.apply(block: JPanel.() -> Unit): JPanel defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JPanel

'border' @ [120:13] ==> public final var JPanel.border: (Border..Border?)[MyPropertyDescriptor]

'createEmptyBorder' @ [120:36] ==> public open fun createEmptyBorder(p0: Int, p1: Int, p2: Int, p3: Int): (Border..Border?) defined in javax.swing.BorderFactory[JavaMethodDescriptor]

'JBLabel' @ [121:25] ==> public constructor JBLabel(@NotNull p0: String) defined in com.intellij.ui.components.JBLabel[JavaClassConstructorDescriptor]

'add' @ [122:13] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in javax.swing.JPanel[JavaMethodDescriptor]

'label' @ [122:17] ==> val label: JBLabel defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.createDestinationRootPanel.<anonymous>[LocalVariableDescriptor]

'NORTH' @ [122:37] ==> public const final val NORTH: String defined in java.awt.BorderLayout[JavaPropertyDescriptor]

'label' @ [123:13] ==> val label: JBLabel defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.createDestinationRootPanel.<anonymous>[LocalVariableDescriptor]

'labelFor' @ [123:19] ==> public final var JBLabel.labelFor: (Component..Component?)[MyPropertyDescriptor]

'fileNameField' @ [123:30] ==> private final val fileNameField: JTextField defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'add' @ [124:13] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in javax.swing.JPanel[JavaMethodDescriptor]

'fileNameField' @ [124:17] ==> private final val fileNameField: JTextField defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'CENTER' @ [124:45] ==> public const final val CENTER: String defined in java.awt.BorderLayout[JavaPropertyDescriptor]

'createFormBuilder' @ [128:18] ==> public open fun createFormBuilder(): (FormBuilder..FormBuilder?) defined in com.intellij.util.ui.FormBuilder[JavaMethodDescriptor]

'addComponent' @ [129:18] ==> public open fun addComponent(@NotNull p0: JComponent): (FormBuilder..FormBuilder?) defined in com.intellij.util.ui.FormBuilder[JavaMethodDescriptor]

'targetDirectoryPanel' @ [129:31] ==> val targetDirectoryPanel: (JPanel..JPanel?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.createDestinationRootPanel[LocalVariableDescriptor]

'addComponent' @ [130:18] ==> public open fun addComponent(@NotNull p0: JComponent): (FormBuilder..FormBuilder?) defined in com.intellij.util.ui.FormBuilder[JavaMethodDescriptor]

'targetFileNamePanel' @ [130:31] ==> val targetFileNamePanel: JPanel defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.createDestinationRootPanel[LocalVariableDescriptor]

'panel' @ [131:18] ==> public final val FormBuilder.panel: (JPanel..JPanel?)[MyPropertyDescriptor]

'super' @ [135:16] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[LazyClassReceiverParameterDescriptor]

'createNorthPanel' @ [135:22] ==> protected/*protected and package*/ open fun createNorthPanel(): JComponent? defined in com.intellij.refactoring.extractSuperclass.JavaExtractSuperBaseDialog[JavaMethodDescriptor]

'apply' @ [135:41] ==> @InlineOnly public inline fun <T> JComponent?.apply(block: (JComponent?).() -> Unit): JComponent? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JComponent?

'targetParent' @ [136:17] ==> protected final val targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'myPackageNameLabel' @ [137:17] ==> protected/*protected and package*/ final var myPackageNameLabel: (JLabel..JLabel?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[JavaPropertyDescriptor]

'parent' @ [137:36] ==> public final val JLabel.parent: (Container..Container?)[MyPropertyDescriptor]

'remove' @ [137:43] ==> public open fun remove(p0: (Component..Component?)): Unit defined in java.awt.Container[JavaMethodDescriptor]

'myPackageNameLabel' @ [137:50] ==> protected/*protected and package*/ final var myPackageNameLabel: (JLabel..JLabel?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[JavaPropertyDescriptor]

'myPackageNameField' @ [138:17] ==> protected/*protected and package*/ final var myPackageNameField: raw (ComponentWithBrowseButton<(JComponent..JComponent?)>..ComponentWithBrowseButton<*>?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[JavaPropertyDescriptor]

'parent' @ [138:36] ==> public final val <Comp : (JComponent..JComponent?)> ComponentWithBrowseButton<(JComponent..JComponent?)>.parent: (Container..Container?)[MyPropertyDescriptor]
Inferred types:
    <Comp : (JComponent..JComponent?)> -> (javax.swing.JComponent..javax.swing.JComponent?)

'remove' @ [138:43] ==> public open fun remove(p0: (Component..Component?)): Unit defined in java.awt.Container[JavaMethodDescriptor]

'myPackageNameField' @ [138:50] ==> protected/*protected and package*/ final var myPackageNameField: raw (ComponentWithBrowseButton<(JComponent..JComponent?)>..ComponentWithBrowseButton<*>?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[JavaPropertyDescriptor]

'memberInfoModel' @ [144:9] ==> private final lateinit var memberInfoModel: KotlinExtractSuperDialogBase.MemberInfoModelBase defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'createMemberInfoModel' @ [144:27] ==> protected abstract fun createMemberInfoModel(): KotlinExtractSuperDialogBase.MemberInfoModelBase defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[SimpleFunctionDescriptorImpl]

'apply' @ [144:51] ==> @InlineOnly public inline fun <T> KotlinExtractSuperDialogBase.MemberInfoModelBase.apply(block: KotlinExtractSuperDialogBase.MemberInfoModelBase.() -> Unit): KotlinExtractSuperDialogBase.MemberInfoModelBase defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberInfoModelBase

'memberInfoChanged' @ [145:13] ==> public open fun memberInfoChanged(p0: (MemberInfoChange<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..MemberInfoChange<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.MemberInfoModelBase[JavaMethodDescriptor]

'MemberInfoChange' @ [145:31] ==> public constructor MemberInfoChange<T : (PsiElement..PsiElement?), U : (MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>..MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>?)>(p0: (MutableCollection<(KotlinMemberInfo..KotlinMemberInfo?)>..Collection<(KotlinMemberInfo..KotlinMemberInfo?)>?)) defined in com.intellij.refactoring.classMembers.MemberInfoChange[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)
    <U : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> (org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo..org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo?)

'memberInfos' @ [145:48] ==> public final val memberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.MemberInfoModelBase[PropertyDescriptorImpl]

'JPanel' @ [148:16] ==> public constructor JPanel(p0: (LayoutManager..LayoutManager?)) defined in javax.swing.JPanel[JavaClassConstructorDescriptor]

'BorderLayout' @ [148:23] ==> public constructor BorderLayout() defined in java.awt.BorderLayout[JavaClassConstructorDescriptor]

'apply' @ [148:39] ==> @InlineOnly public inline fun <T> JPanel.apply(block: JPanel.() -> Unit): JPanel defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JPanel

'KotlinMemberSelectionPanel' @ [149:40] ==> public constructor KotlinMemberSelectionPanel(title: String, memberInfo: List<KotlinMemberInfo>, abstractColumnHeader: String?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberSelectionPanel[ClassConstructorDescriptorImpl]

'message' @ [150:39] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'if (isExtractInterface) "members.to.form.interface" else "members.to.form.superclass"' @ [150:47] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isExtractInterface' @ [150:51] ==> private final val isExtractInterface: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'memberInfoModel' @ [151:21] ==> private final lateinit var memberInfoModel: KotlinExtractSuperDialogBase.MemberInfoModelBase defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'memberInfos' @ [151:37] ==> public final val memberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.MemberInfoModelBase[PropertyDescriptorImpl]

'message' @ [152:39] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'memberSelectionPanel' @ [154:13] ==> val memberSelectionPanel: KotlinMemberSelectionPanel defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.createCenterPanel.<anonymous>[LocalVariableDescriptor]

'table' @ [154:34] ==> public final val KotlinMemberSelectionPanel.table: KotlinMemberSelectionTable[MyPropertyDescriptor]

'memberInfoModel' @ [154:40] ==> public final var KotlinMemberSelectionTable.memberInfoModel: (MemberInfoModel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..MemberInfoModel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?)[MyPropertyDescriptor]

'memberInfoModel' @ [154:58] ==> private final lateinit var memberInfoModel: KotlinExtractSuperDialogBase.MemberInfoModelBase defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'memberSelectionPanel' @ [155:13] ==> val memberSelectionPanel: KotlinMemberSelectionPanel defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.createCenterPanel.<anonymous>[LocalVariableDescriptor]

'table' @ [155:34] ==> public final val KotlinMemberSelectionPanel.table: KotlinMemberSelectionTable[MyPropertyDescriptor]

'addMemberInfoChangeListener' @ [155:40] ==> public open fun addMemberInfoChangeListener(p0: (MemberInfoChangeListener<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..MemberInfoChangeListener<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberSelectionTable[JavaMethodDescriptor]

'memberInfoModel' @ [155:68] ==> private final lateinit var memberInfoModel: KotlinExtractSuperDialogBase.MemberInfoModelBase defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'add' @ [156:13] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in javax.swing.JPanel[JavaMethodDescriptor]

'memberSelectionPanel' @ [156:17] ==> val memberSelectionPanel: KotlinMemberSelectionPanel defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.createCenterPanel.<anonymous>[LocalVariableDescriptor]

'CENTER' @ [156:52] ==> public const final val CENTER: String defined in java.awt.BorderLayout[JavaPropertyDescriptor]

'add' @ [158:13] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in javax.swing.JPanel[JavaMethodDescriptor]

'myDocCommentPanel' @ [158:17] ==> protected/*protected and package*/ final var myDocCommentPanel: (DocCommentPanel..DocCommentPanel?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[JavaPropertyDescriptor]

'EAST' @ [158:49] ==> public const final val EAST: String defined in java.awt.BorderLayout[JavaPropertyDescriptor]

'super' @ [163:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[LazyClassReceiverParameterDescriptor]

'init' @ [163:15] ==> protected/*protected and package*/ open fun init(): Unit defined in com.intellij.refactoring.extractSuperclass.JavaExtractSuperBaseDialog[JavaMethodDescriptor]

'initComplete' @ [165:9] ==> private final var initComplete: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'resetFileNameField' @ [167:9] ==> private final fun resetFileNameField(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[SimpleFunctionDescriptorImpl]

'targetParent' @ [171:13] ==> protected final val targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'super' @ [171:43] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[LazyClassReceiverParameterDescriptor]

'preparePackage' @ [171:49] ==> protected/*protected and package*/ open fun preparePackage(): Unit defined in com.intellij.refactoring.extractSuperclass.JavaExtractSuperBaseDialog[JavaMethodDescriptor]

'when {
            !KotlinNameSuggester.isIdentifier(name.quoteIfNeeded()) -> RefactoringMessageUtil.getIncorrectIdentifierMessage(name)
            name.unquote() == mySourceClass.name -> "Different name expected"
            else -> null
        }' @ [177:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'!' @ [178:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'KotlinNameSuggester' @ [178:14] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'isIdentifier' @ [178:34] ==> public final fun isIdentifier(name: String?): Boolean defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'name' @ [178:47] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.validateName[ValueParameterDescriptorImpl]

'quoteIfNeeded' @ [178:52] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'getIncorrectIdentifierMessage' @ [178:95] ==> public open fun getIncorrectIdentifierMessage(p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.util.RefactoringMessageUtil[JavaMethodDescriptor]

'name' @ [178:125] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.validateName[ValueParameterDescriptorImpl]

'name' @ [179:13] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.validateName[ValueParameterDescriptorImpl]

'unquote' @ [179:18] ==> public fun String.unquote(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'mySourceClass' @ [179:31] ==> protected/*protected and package*/ final val mySourceClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[JavaPropertyDescriptor]

'name' @ [179:45] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'ExtractSuperInfo' @ [187:27] ==> public constructor ExtractSuperInfo(originalClass: KtClassOrObject, memberInfos: Collection<KotlinMemberInfo>, targetParent: PsiElement, targetFileName: String, newClassName: String, isInterface: Boolean, docPolicy: DocCommentPolicy<*>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[ClassConstructorDescriptorImpl]

'mySourceClass' @ [188:17] ==> protected/*protected and package*/ final val mySourceClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[JavaPropertyDescriptor]

'unwrapped' @ [188:31] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'selectedMembers' @ [189:17] ==> public final val selectedMembers: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'if (targetParent is PsiDirectory) targetDirectory else targetParent' @ [190:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'targetParent' @ [190:21] ==> protected final val targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'targetDirectory' @ [190:51] ==> public final val KotlinExtractSuperDialogBase.targetDirectory: (PsiDirectory..PsiDirectory?)[MyPropertyDescriptor]

'targetParent' @ [190:72] ==> protected final val targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'targetFileName' @ [191:17] ==> public final val targetFileName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'extractedSuperName' @ [192:17] ==> public final val KotlinExtractSuperDialogBase.extractedSuperName: (String..String?)[MyPropertyDescriptor]

'quoteIfNeeded' @ [192:36] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'isExtractInterface' @ [193:17] ==> private final val isExtractInterface: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase[PropertyDescriptorImpl]

'DocCommentPolicy' @ [194:17] ==> public constructor DocCommentPolicy<T : (PsiComment..PsiComment?)>(p0: Int) defined in com.intellij.refactoring.util.DocCommentPolicy[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiComment..PsiComment?)> -> PsiComment

'docCommentPolicy' @ [194:46] ==> public final val KotlinExtractSuperDialogBase.docCommentPolicy: Int[MyPropertyDescriptor]

'invoke' @ [196:9] ==> public abstract operator fun invoke(p1: ExtractSuperInfo): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'extractInfo' @ [196:21] ==> val extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ui.KotlinExtractSuperDialogBase.executeRefactoring[LocalVariableDescriptor]

