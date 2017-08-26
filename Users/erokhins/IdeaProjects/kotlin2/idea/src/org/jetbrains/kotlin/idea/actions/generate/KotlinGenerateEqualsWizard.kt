'AbstractGenerateEqualsWizard<KtClass, KtNamedDeclaration, KotlinMemberInfo>' @ [43:5] ==> public constructor AbstractGenerateEqualsWizard<C : (PsiElement..PsiElement?), M : (PsiElement..PsiElement?), I : (MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>..MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>?)>(p0: (Project..Project?), p1: (AbstractGenerateEqualsWizard.Builder<(KtClass..KtClass?), (KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..AbstractGenerateEqualsWizard.Builder<(KtClass..KtClass?), (KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?)) defined in com.intellij.codeInsight.generation.ui.AbstractGenerateEqualsWizard[JavaClassConstructorDescriptor]
Inferred types:
    <C : (PsiElement..PsiElement?)> -> KtClass
    <M : (PsiElement..PsiElement?)> -> KtNamedDeclaration
    <I : (MemberInfoBase<(M..M?)>..MemberInfoBase<(M..M?)>?)> -> KotlinMemberInfo

'project' @ [44:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.<init>[ValueParameterDescriptorImpl]

'BuilderImpl' @ [44:45] ==> public constructor BuilderImpl(klass: KtClass, properties: List<KtNamedDeclaration>, needEquals: Boolean, needHashCode: Boolean) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl[ClassConstructorDescriptorImpl]

'klass' @ [44:57] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.<init>[ValueParameterDescriptorImpl]

'properties' @ [44:64] ==> value-parameter properties: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.<init>[ValueParameterDescriptorImpl]

'needEquals' @ [44:76] ==> value-parameter needEquals: Boolean defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.<init>[ValueParameterDescriptorImpl]

'needHashCode' @ [44:88] ==> value-parameter needHashCode: Boolean defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.<init>[ValueParameterDescriptorImpl]

'AbstractMemberInfoModel<KtNamedDeclaration, KotlinMemberInfo>' @ [46:42] ==> public constructor AbstractMemberInfoModel<T : (PsiElement..PsiElement?), M : (MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>..MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>?)>() defined in com.intellij.refactoring.classMembers.AbstractMemberInfoModel[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtNamedDeclaration
    <M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> KotlinMemberInfo

'AbstractGenerateEqualsWizard.Builder<KtClass, KtNamedDeclaration, KotlinMemberInfo>' @ [53:9] ==> public constructor Builder<C : (PsiElement..PsiElement?), M : (PsiElement..PsiElement?), I : (MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>..MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>?)>() defined in com.intellij.codeInsight.generation.ui.AbstractGenerateEqualsWizard.Builder[JavaClassConstructorDescriptor]
Inferred types:
    <C : (PsiElement..PsiElement?)> -> KtClass
    <M : (PsiElement..PsiElement?)> -> KtNamedDeclaration
    <I : (MemberInfoBase<(M..M?)>..MemberInfoBase<(M..M?)>?)> -> KotlinMemberInfo

'properties' @ [57:35] ==> value-parameter properties: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl.<init>[ValueParameterDescriptorImpl]

'map' @ [57:46] ==> public inline fun <T, R> Iterable<KtNamedDeclaration>.map(transform: (KtNamedDeclaration) -> KotlinMemberInfo): List<KotlinMemberInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R> -> KotlinMemberInfo

'createMemberInfo' @ [57:52] ==> private final fun createMemberInfo(it: KtNamedDeclaration): KotlinMemberInfo defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl[SimpleFunctionDescriptorImpl]

'it' @ [57:69] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl.memberInfos.<anonymous>[ValueParameterDescriptorImpl]

'HashMap' @ [59:41] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?), K1 : (KtNamedDeclaration..KtNamedDeclaration?), V1 : (KotlinMemberInfo..KotlinMemberInfo?)>(p0: (MutableMap<out (KtNamedDeclaration..KtNamedDeclaration?), out (KotlinMemberInfo..KotlinMemberInfo?)>..Map<out (KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?)) defined in com.intellij.util.containers.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo..org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo?)
    <K1 : (K..K?)> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)
    <V1 : (V..V?)> -> (org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo..org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo?)

'properties' @ [59:49] ==> value-parameter properties: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl.<init>[ValueParameterDescriptorImpl]

'keysToMap' @ [59:60] ==> public fun <K, V> Iterable<KtNamedDeclaration>.keysToMap(value: (KtNamedDeclaration) -> KotlinMemberInfo): Map<KtNamedDeclaration, KotlinMemberInfo> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtNamedDeclaration
    <V> -> KotlinMemberInfo

'createMemberInfo' @ [59:72] ==> private final fun createMemberInfo(it: KtNamedDeclaration): KotlinMemberInfo defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl[SimpleFunctionDescriptorImpl]

'it' @ [59:89] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl.membersToHashCode.<anonymous>[ValueParameterDescriptorImpl]

'equalsPanel' @ [62:13] ==> private final val equalsPanel: KotlinMemberSelectionPanel? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl[PropertyDescriptorImpl]

'if (needEquals) {
                KotlinMemberSelectionPanel("Choose p&roperties to be included in equals()", memberInfos, null).apply {
                    table.memberInfoModel = MemberInfoModelImpl
                }
            } else null' @ [62:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinMemberSelectionPanel?, elseBranch: KotlinMemberSelectionPanel?): KotlinMemberSelectionPanel?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinMemberSelectionPanel?

'needEquals' @ [62:31] ==> value-parameter needEquals: Boolean defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl.<init>[ValueParameterDescriptorImpl]

'KotlinMemberSelectionPanel' @ [63:17] ==> public constructor KotlinMemberSelectionPanel(title: String, memberInfo: List<KotlinMemberInfo>, abstractColumnHeader: String?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberSelectionPanel[ClassConstructorDescriptorImpl]

'memberInfos' @ [63:93] ==> private final val memberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl[PropertyDescriptorImpl]

'apply' @ [63:112] ==> @InlineOnly public inline fun <T> KotlinMemberSelectionPanel.apply(block: KotlinMemberSelectionPanel.() -> Unit): KotlinMemberSelectionPanel defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberSelectionPanel

'table' @ [64:21] ==> public final val KotlinMemberSelectionPanel.table: KotlinMemberSelectionTable[MyPropertyDescriptor]

'memberInfoModel' @ [64:27] ==> public final var KotlinMemberSelectionTable.memberInfoModel: (MemberInfoModel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..MemberInfoModel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?)[MyPropertyDescriptor]

'MemberInfoModelImpl' @ [64:45] ==> private object MemberInfoModelImpl : AbstractMemberInfoModel<KtNamedDeclaration, KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard[FakeCallableDescriptorForObject]

'hashCodePanel' @ [68:13] ==> private final val hashCodePanel: KotlinMemberSelectionPanel? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl[PropertyDescriptorImpl]

'if (needHashCode) {
                KotlinMemberSelectionPanel("Choose p&roperties to be included in hashCode()", memberInfos, null).apply {
                    table.memberInfoModel = MemberInfoModelImpl
                }
            } else null' @ [68:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinMemberSelectionPanel?, elseBranch: KotlinMemberSelectionPanel?): KotlinMemberSelectionPanel?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinMemberSelectionPanel?

'needHashCode' @ [68:33] ==> value-parameter needHashCode: Boolean defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl.<init>[ValueParameterDescriptorImpl]

'KotlinMemberSelectionPanel' @ [69:17] ==> public constructor KotlinMemberSelectionPanel(title: String, memberInfo: List<KotlinMemberInfo>, abstractColumnHeader: String?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberSelectionPanel[ClassConstructorDescriptorImpl]

'memberInfos' @ [69:95] ==> private final val memberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl[PropertyDescriptorImpl]

'apply' @ [69:114] ==> @InlineOnly public inline fun <T> KotlinMemberSelectionPanel.apply(block: KotlinMemberSelectionPanel.() -> Unit): KotlinMemberSelectionPanel defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberSelectionPanel

'table' @ [70:21] ==> public final val KotlinMemberSelectionPanel.table: KotlinMemberSelectionTable[MyPropertyDescriptor]

'memberInfoModel' @ [70:27] ==> public final var KotlinMemberSelectionTable.memberInfoModel: (MemberInfoModel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..MemberInfoModel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?)[MyPropertyDescriptor]

'MemberInfoModelImpl' @ [70:45] ==> private object MemberInfoModelImpl : AbstractMemberInfoModel<KtNamedDeclaration, KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard[FakeCallableDescriptorForObject]

'KotlinMemberInfo' @ [75:64] ==> @JvmOverloads public constructor KotlinMemberInfo(member: KtNamedDeclaration, isSuperClass: Boolean = ..., isCompanionMember: Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[ClassConstructorDescriptorImpl]

'it' @ [75:81] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl.createMemberInfo[ValueParameterDescriptorImpl]

'apply' @ [75:85] ==> @InlineOnly public inline fun <T> KotlinMemberInfo.apply(block: KotlinMemberInfo.() -> Unit): KotlinMemberInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberInfo

'isChecked' @ [75:93] ==> public final var KotlinMemberInfo.isChecked: Boolean[MyPropertyDescriptor]

'klass' @ [77:38] ==> private final val klass: KtClass defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl[PropertyDescriptorImpl]

'memberInfos' @ [79:41] ==> private final val memberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl[PropertyDescriptorImpl]

'membersToHashCode' @ [81:46] ==> private final val membersToHashCode: HashMap<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl[PropertyDescriptorImpl]

'HashMap' @ [83:45] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtNamedDeclaration
    <V : (Any..Any?)> -> KotlinMemberInfo

'equalsPanel' @ [85:41] ==> private final val equalsPanel: KotlinMemberSelectionPanel? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl[PropertyDescriptorImpl]

'hashCodePanel' @ [87:43] ==> private final val hashCodePanel: KotlinMemberSelectionPanel? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl[PropertyDescriptorImpl]

'hashCodePanel' @ [92:13] ==> private final val hashCodePanel: KotlinMemberSelectionPanel? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl[PropertyDescriptorImpl]

'table' @ [92:28] ==> public final val KotlinMemberSelectionPanel.table: KotlinMemberSelectionTable[MyPropertyDescriptor]

'setMemberInfos' @ [92:35] ==> public open fun setMemberInfos(p0: (MutableCollection<(KotlinMemberInfo..KotlinMemberInfo?)>..Collection<(KotlinMemberInfo..KotlinMemberInfo?)>?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberSelectionTable[JavaMethodDescriptor]

'equalsMemberInfos' @ [92:50] ==> value-parameter equalsMemberInfos: MutableCollection<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl.updateHashCodeMemberInfos[ValueParameterDescriptorImpl]

'map' @ [92:68] ==> public inline fun <T, R> Iterable<KotlinMemberInfo>.map(transform: (KotlinMemberInfo) -> KotlinMemberInfo?): List<KotlinMemberInfo?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberInfo
    <R> -> KotlinMemberInfo?

'membersToHashCode' @ [92:74] ==> private final val membersToHashCode: HashMap<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl[PropertyDescriptorImpl]

'it' @ [92:92] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.BuilderImpl.updateHashCodeMemberInfos.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [92:95] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'StepAdapter' @ [100:34] ==> public constructor StepAdapter() defined in com.intellij.ide.wizard.StepAdapter[JavaClassConstructorDescriptor]

'JPanel' @ [101:29] ==> public constructor JPanel(p0: (LayoutManager..LayoutManager?)) defined in javax.swing.JPanel[JavaClassConstructorDescriptor]

'VerticalFlowLayout' @ [101:36] ==> public constructor VerticalFlowLayout() defined in com.intellij.openapi.ui.VerticalFlowLayout[JavaClassConstructorDescriptor]

'with' @ [104:13] ==> @InlineOnly public inline fun <T, R> with(receiver: NonFocusableCheckBox, block: NonFocusableCheckBox.() -> (Component..Component?)): (Component..Component?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NonFocusableCheckBox
    <R> -> (java.awt.Component..java.awt.Component?)

'NonFocusableCheckBox' @ [104:18] ==> public constructor NonFocusableCheckBox(p0: (String..String?)) defined in com.intellij.ui.NonFocusableCheckBox[JavaClassConstructorDescriptor]

'message' @ [104:57] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.codeInsight.CodeInsightBundle[JavaMethodDescriptor]

'isSelected' @ [105:17] ==> public final var NonFocusableCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'getInstance' @ [105:50] ==> public open fun getInstance(): (CodeInsightSettings..CodeInsightSettings?) defined in com.intellij.codeInsight.CodeInsightSettings[JavaMethodDescriptor]

'USE_INSTANCEOF_ON_EQUALS_PARAMETER' @ [105:64] ==> public final var USE_INSTANCEOF_ON_EQUALS_PARAMETER: Boolean defined in com.intellij.codeInsight.CodeInsightSettings[JavaPropertyDescriptor]

'addActionListener' @ [106:17] ==> public final fun addActionListener(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in com.intellij.ui.NonFocusableCheckBox[MyFunctionDescriptor]

'getInstance' @ [106:57] ==> public open fun getInstance(): (CodeInsightSettings..CodeInsightSettings?) defined in com.intellij.codeInsight.CodeInsightSettings[JavaMethodDescriptor]

'USE_INSTANCEOF_ON_EQUALS_PARAMETER' @ [106:71] ==> public final var USE_INSTANCEOF_ON_EQUALS_PARAMETER: Boolean defined in com.intellij.codeInsight.CodeInsightSettings[JavaPropertyDescriptor]

'isSelected' @ [106:108] ==> public final var NonFocusableCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'panel' @ [107:17] ==> private final val panel: JPanel defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.OptionsStep[PropertyDescriptorImpl]

'add' @ [107:23] ==> public open fun add(p0: (Component..Component?)): (Component..Component?) defined in javax.swing.JPanel[JavaMethodDescriptor]

'this' @ [107:27] ==> <this> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.OptionsStep.<init>.<anonymous>[ReceiverParameterDescriptorImpl]

'panel' @ [109:13] ==> private final val panel: JPanel defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.OptionsStep[PropertyDescriptorImpl]

'add' @ [109:19] ==> public open fun add(p0: (Component..Component?)): (Component..Component?) defined in javax.swing.JPanel[JavaMethodDescriptor]

'JLabel' @ [109:23] ==> public constructor JLabel(p0: (String..String?)) defined in javax.swing.JLabel[JavaClassConstructorDescriptor]

'message' @ [109:48] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.codeInsight.CodeInsightBundle[JavaMethodDescriptor]

'panel' @ [112:39] ==> private final val panel: JPanel defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.OptionsStep[PropertyDescriptorImpl]

'myEqualsPanel' @ [116:13] ==> protected/*protected and package*/ final val myEqualsPanel: (AbstractMemberSelectionPanel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..AbstractMemberSelectionPanel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard[JavaPropertyDescriptor]

'myClass' @ [116:38] ==> protected/*protected and package*/ final val myClass: (KtClass..KtClass?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard[JavaPropertyDescriptor]

'isInheritable' @ [116:46] ==> public fun KtClass.isInheritable(): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'addStep' @ [117:13] ==> public open fun addStep(@NotNull p0: Step): Unit defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard[JavaMethodDescriptor]

'OptionsStep' @ [117:21] ==> private object OptionsStep : StepAdapter defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard[FakeCallableDescriptorForObject]

'super' @ [119:9] ==> <this> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard[LazyClassReceiverParameterDescriptor]

'addSteps' @ [119:15] ==> protected/*protected and package*/ open fun addSteps(): Unit defined in com.intellij.codeInsight.generation.ui.AbstractGenerateEqualsWizard[JavaMethodDescriptor]

'myEqualsPanel' @ [123:9] ==> protected/*protected and package*/ final val myEqualsPanel: (AbstractMemberSelectionPanel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..AbstractMemberSelectionPanel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard[JavaPropertyDescriptor]

'let' @ [123:24] ==> @InlineOnly public inline fun <T, R> AbstractMemberSelectionPanel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>.let(block: (AbstractMemberSelectionPanel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractMemberSelectionPanel<(org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?), (org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo..org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo?)>
    <R> -> Unit

'updateHashCodeMemberInfos' @ [123:30] ==> protected/*protected and package*/ open fun updateHashCodeMemberInfos(p0: (MutableCollection<(KotlinMemberInfo..KotlinMemberInfo?)>..Collection<(KotlinMemberInfo..KotlinMemberInfo?)>?)): Unit defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard[JavaMethodDescriptor]

'it' @ [123:56] ==> value-parameter it: AbstractMemberSelectionPanel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.doOKAction.<anonymous>[ValueParameterDescriptorImpl]

'table' @ [123:59] ==> public final val <T : (PsiElement..PsiElement?), M : (MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>..MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>?)> AbstractMemberSelectionPanel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>.table: (AbstractMemberSelectionTable<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..AbstractMemberSelectionTable<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)
    <M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> (org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo..org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo?)

'selectedMemberInfos' @ [123:65] ==> public final val <T : (PsiElement..PsiElement?), M : (MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>..MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>?)> AbstractMemberSelectionTable<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>.selectedMemberInfos: (MutableCollection<(KotlinMemberInfo..KotlinMemberInfo?)>..Collection<(KotlinMemberInfo..KotlinMemberInfo?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)
    <M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> (org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo..org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo?)

'super' @ [124:9] ==> <this> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard[LazyClassReceiverParameterDescriptor]

'doOKAction' @ [124:15] ==> protected/*protected and package*/ open fun doOKAction(): Unit defined in com.intellij.codeInsight.generation.ui.AbstractGenerateEqualsWizard[JavaMethodDescriptor]

'myEqualsPanel' @ [127:36] ==> protected/*protected and package*/ final val myEqualsPanel: (AbstractMemberSelectionPanel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..AbstractMemberSelectionPanel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard[JavaPropertyDescriptor]

'table' @ [127:51] ==> public final val <T : (PsiElement..PsiElement?), M : (MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>..MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>?)> AbstractMemberSelectionPanel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>.table: (AbstractMemberSelectionTable<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..AbstractMemberSelectionTable<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)
    <M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> (org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo..org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo?)

'selectedMemberInfos' @ [127:58] ==> public final val <T : (PsiElement..PsiElement?), M : (MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>..MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>?)> AbstractMemberSelectionTable<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>.selectedMemberInfos: (MutableCollection<(KotlinMemberInfo..KotlinMemberInfo?)>..Collection<(KotlinMemberInfo..KotlinMemberInfo?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)
    <M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> (org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo..org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo?)

'map' @ [127:79] ==> public inline fun <T, R> Iterable<(KotlinMemberInfo..KotlinMemberInfo?)>.map(transform: ((KotlinMemberInfo..KotlinMemberInfo?)) -> (KtNamedDeclaration..KtNamedDeclaration?)): List<(KtNamedDeclaration..KtNamedDeclaration?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo..org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo?)
    <R> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)

'it' @ [127:85] ==> value-parameter it: (KotlinMemberInfo..KotlinMemberInfo?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.getPropertiesForEquals.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [127:88] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'emptyList' @ [127:100] ==> public fun <T> emptyList(): List<(KtNamedDeclaration..KtNamedDeclaration?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)

'myHashCodePanel' @ [129:38] ==> protected/*protected and package*/ final val myHashCodePanel: (AbstractMemberSelectionPanel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..AbstractMemberSelectionPanel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard[JavaPropertyDescriptor]

'table' @ [129:55] ==> public final val <T : (PsiElement..PsiElement?), M : (MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>..MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>?)> AbstractMemberSelectionPanel<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>.table: (AbstractMemberSelectionTable<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>..AbstractMemberSelectionTable<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)
    <M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> (org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo..org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo?)

'selectedMemberInfos' @ [129:62] ==> public final val <T : (PsiElement..PsiElement?), M : (MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>..MemberInfoBase<(KtNamedDeclaration..KtNamedDeclaration?)>?)> AbstractMemberSelectionTable<(KtNamedDeclaration..KtNamedDeclaration?), (KotlinMemberInfo..KotlinMemberInfo?)>.selectedMemberInfos: (MutableCollection<(KotlinMemberInfo..KotlinMemberInfo?)>..Collection<(KotlinMemberInfo..KotlinMemberInfo?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)
    <M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> (org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo..org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo?)

'map' @ [129:83] ==> public inline fun <T, R> Iterable<(KotlinMemberInfo..KotlinMemberInfo?)>.map(transform: ((KotlinMemberInfo..KotlinMemberInfo?)) -> (KtNamedDeclaration..KtNamedDeclaration?)): List<(KtNamedDeclaration..KtNamedDeclaration?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo..org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo?)
    <R> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)

'it' @ [129:89] ==> value-parameter it: (KotlinMemberInfo..KotlinMemberInfo?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateEqualsWizard.getPropertiesForHashCode.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [129:92] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'emptyList' @ [129:104] ==> public fun <T> emptyList(): List<(KtNamedDeclaration..KtNamedDeclaration?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)

