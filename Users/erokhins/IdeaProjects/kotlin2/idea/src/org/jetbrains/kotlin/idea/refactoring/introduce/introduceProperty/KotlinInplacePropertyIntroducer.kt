'KotlinInplaceVariableIntroducer<KtProperty>' @ [51:4] ==> public constructor KotlinInplaceVariableIntroducer<D : (KtCallableDeclaration..KtCallableDeclaration?)>(elementToRename: (PsiNamedElement..PsiNamedElement?), editor: (Editor..Editor?), project: (Project..Project?), title: (String..String?), occurrences: (Array<(KtExpression..KtExpression?)>..Array<out (KtExpression..KtExpression?)>?), @Nullable expr: KtExpression?, replaceOccurrence: Boolean, declaration: (KtProperty..KtProperty?), isVar: Boolean, doNotChangeVar: Boolean, @Nullable exprType: KotlinType?, noTypeInference: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinInplaceVariableIntroducer[JavaClassConstructorDescriptor]
Inferred types:
    <D : (KtCallableDeclaration..KtCallableDeclaration?)> -> KtProperty

'property' @ [52:9] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.<init>[ValueParameterDescriptorImpl]

'editor' @ [52:19] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.<init>[ValueParameterDescriptorImpl]

'project' @ [52:27] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.<init>[ValueParameterDescriptorImpl]

'title' @ [52:36] ==> value-parameter title: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.<init>[ValueParameterDescriptorImpl]

'EMPTY_ARRAY' @ [52:56] ==> public final val EMPTY_ARRAY: (Array<(KtExpression..KtExpression?)>..Array<out (KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaPropertyDescriptor]

'property' @ [52:82] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.<init>[ValueParameterDescriptorImpl]

'doNotChangeVar' @ [52:99] ==> value-parameter doNotChangeVar: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.<init>[ValueParameterDescriptorImpl]

'exprType' @ [52:115] ==> value-parameter exprType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.<init>[ValueParameterDescriptorImpl]

'assert' @ [55:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'availableTargets' @ [55:16] ==> private final val availableTargets: List<ExtractionTarget> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'isNotEmpty' @ [55:33] ==> @InlineOnly public inline fun <T> Collection<ExtractionTarget>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtractionTarget

'property' @ [55:74] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.<init>[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [55:83] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'extractionResult' @ [58:51] ==> private final var extractionResult: ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'config' @ [58:68] ==> public final val config: ExtractionGeneratorConfiguration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionResult[PropertyDescriptorImpl]

'generatorOptions' @ [58:75] ==> public final val generatorOptions: ExtractionGeneratorOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorConfiguration[PropertyDescriptorImpl]

'target' @ [58:92] ==> public final val target: ExtractionTarget defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorOptions[PropertyDescriptorImpl]

'value' @ [60:17] ==> value-parameter value: ExtractionTarget defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.<set-currentTarget>[ValueParameterDescriptorImpl]

'currentTarget' @ [60:26] ==> private final var currentTarget: ExtractionTarget defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'field' @ [62:13] ==> var field: ExtractionTarget defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.<set-currentTarget>[SyntheticFieldDescriptor]

'value' @ [62:21] ==> value-parameter value: ExtractionTarget defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.<set-currentTarget>[ValueParameterDescriptorImpl]

'runWriteActionAndRestartRefactoring' @ [63:13] ==> protected/*protected and package*/ for synthetic extension final fun runWriteActionAndRestartRefactoring(runnable: (() -> Unit..(() -> Unit)?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[MyFunctionDescriptor]

'with' @ [64:17] ==> @InlineOnly public inline fun <T, R> with(receiver: ExtractionGeneratorConfiguration, block: ExtractionGeneratorConfiguration.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtractionGeneratorConfiguration
    <R> -> Unit

'extractionResult' @ [64:23] ==> private final var extractionResult: ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'config' @ [64:40] ==> public final val config: ExtractionGeneratorConfiguration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionResult[PropertyDescriptorImpl]

'extractionResult' @ [65:21] ==> private final var extractionResult: ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'copy' @ [65:40] ==> public final fun copy(descriptor: ExtractableCodeDescriptor = ..., generatorOptions: ExtractionGeneratorOptions = ...): ExtractionGeneratorConfiguration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorConfiguration[SimpleFunctionDescriptorImpl]

'generatorOptions' @ [65:64] ==> public final val generatorOptions: ExtractionGeneratorOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorConfiguration[PropertyDescriptorImpl]

'copy' @ [65:81] ==> public final fun copy(inTempFile: Boolean = ..., target: ExtractionTarget = ..., dummyName: String? = ..., allowExpressionBody: Boolean = ..., delayInitialOccurrenceReplacement: Boolean = ...): ExtractionGeneratorOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorOptions[SimpleFunctionDescriptorImpl]

'currentTarget' @ [65:95] ==> private final var currentTarget: ExtractionTarget defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'generateDeclaration' @ [65:111] ==> public fun ExtractionGeneratorConfiguration.generateDeclaration(declarationToReplace: KtNamedDeclaration? = ...): ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractorUtil.kt[SimpleFunctionDescriptorImpl]

'property' @ [65:131] ==> private final var property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'property' @ [66:21] ==> private final var property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'extractionResult' @ [66:32] ==> private final var extractionResult: ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'declaration' @ [66:49] ==> public final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionResult[PropertyDescriptorImpl]

'myElementToRename' @ [67:21] ==> protected/*protected and package*/ final var myElementToRename: (PsiNamedElement..PsiNamedElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[JavaPropertyDescriptor]

'property' @ [67:41] ==> private final var property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'updatePanelControls' @ [70:13] ==> protected/*protected and package*/ final fun updatePanelControls(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[JavaMethodDescriptor]

'myDeclaration' @ [76:17] ==> protected/*protected and package*/ final var myDeclaration: (KtProperty..KtProperty?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[JavaPropertyDescriptor]

'myDeclaration' @ [78:13] ==> protected/*protected and package*/ final var myDeclaration: (KtProperty..KtProperty?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[JavaPropertyDescriptor]

'value' @ [78:29] ==> value-parameter value: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.<set-property>[ValueParameterDescriptorImpl]

'currentTarget' @ [81:44] ==> private final var currentTarget: ExtractionTarget defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'ExtractionTarget' @ [81:61] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[FakeCallableDescriptorForObject]

'PROPERTY_WITH_INITIALIZER' @ [81:78] ==> enum entry PROPERTY_WITH_INITIALIZER defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[FakeCallableDescriptorForObject]

'availableTargets' @ [84:13] ==> private final val availableTargets: List<ExtractionTarget> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'size' @ [84:30] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'addPanelControl' @ [85:13] ==> protected/*protected and package*/ final fun addPanelControl(@NotNull panelControl: KotlinInplaceVariableIntroducer.ControlWrapper): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[JavaMethodDescriptor]

'ControlWrapper' @ [86:21] ==> public constructor ControlWrapper(@NotNull factory: () -> (JComponent..JComponent?)) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinInplaceVariableIntroducer.ControlWrapper[JavaClassConstructorDescriptor]

'with' @ [87:52] ==> @InlineOnly public inline fun <T, R> with(receiver: JComboBox<String>, block: JComboBox<String>.() -> JComboBox<String>): JComboBox<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JComboBox<String>
    <R> -> JComboBox<String>

'JComboBox' @ [87:57] ==> public constructor JComboBox<E : (Any..Any?)>(p0: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in javax.swing.JComboBox[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'availableTargets' @ [87:67] ==> private final val availableTargets: List<ExtractionTarget> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'map' @ [87:84] ==> public inline fun <T, R> Iterable<ExtractionTarget>.map(transform: (ExtractionTarget) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtractionTarget
    <R> -> String

'it' @ [87:90] ==> value-parameter it: ExtractionTarget defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'targetName' @ [87:93] ==> public final val targetName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[PropertyDescriptorImpl]

'capitalize' @ [87:104] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toTypedArray' @ [87:119] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'addPopupMenuListener' @ [88:29] ==> public open fun addPopupMenuListener(p0: (PopupMenuListener..PopupMenuListener?)): Unit defined in javax.swing.JComboBox[JavaMethodDescriptor]

'PopupMenuListenerAdapter' @ [89:46] ==> public constructor PopupMenuListenerAdapter() defined in com.intellij.ui.PopupMenuListenerAdapter[JavaClassConstructorDescriptor]

'getApplication' @ [91:64] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'invokeLater' @ [91:81] ==> public final fun invokeLater(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'currentTarget' @ [92:49] ==> private final var currentTarget: ExtractionTarget defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'availableTargets' @ [92:65] ==> private final val availableTargets: List<ExtractionTarget> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'selectedIndex' @ [92:82] ==> public final var <E : (Any..Any?)> JComboBox<String>.selectedIndex: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'selectedIndex' @ [98:29] ==> public final var <E : (Any..Any?)> JComboBox<String>.selectedIndex: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'availableTargets' @ [98:45] ==> private final val availableTargets: List<ExtractionTarget> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'indexOf' @ [98:62] ==> public abstract fun indexOf(element: ExtractionTarget): Int defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'currentTarget' @ [98:70] ==> private final var currentTarget: ExtractionTarget defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'this' @ [100:29] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'JLabel' @ [103:49] ==> public constructor JLabel(p0: (String..String?)) defined in javax.swing.JLabel[JavaClassConstructorDescriptor]

'propertyKindLabel' @ [104:25] ==> val propertyKindLabel: JLabel defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>[LocalVariableDescriptor]

'setDisplayedMnemonic' @ [104:43] ==> public open fun setDisplayedMnemonic(p0: Char): Unit defined in javax.swing.JLabel[JavaMethodDescriptor]

'propertyKindLabel' @ [105:25] ==> val propertyKindLabel: JLabel defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>[LocalVariableDescriptor]

'labelFor' @ [105:43] ==> public final var JLabel.labelFor: (Component..Component?)[MyPropertyDescriptor]

'propertyKindComboBox' @ [105:54] ==> val propertyKindComboBox: JComboBox<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>[LocalVariableDescriptor]

'JPanel' @ [107:37] ==> public constructor JPanel() defined in javax.swing.JPanel[JavaClassConstructorDescriptor]

'panel' @ [108:25] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>[LocalVariableDescriptor]

'add' @ [108:31] ==> public open fun add(p0: (Component..Component?)): (Component..Component?) defined in javax.swing.JPanel[JavaMethodDescriptor]

'propertyKindLabel' @ [108:35] ==> val propertyKindLabel: JLabel defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>[LocalVariableDescriptor]

'panel' @ [109:25] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>[LocalVariableDescriptor]

'add' @ [109:31] ==> public open fun add(p0: (Component..Component?)): (Component..Component?) defined in javax.swing.JPanel[JavaMethodDescriptor]

'propertyKindComboBox' @ [109:35] ==> val propertyKindComboBox: JComboBox<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>[LocalVariableDescriptor]

'panel' @ [111:25] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>[LocalVariableDescriptor]

'ExtractionTarget' @ [116:13] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[FakeCallableDescriptorForObject]

'PROPERTY_WITH_INITIALIZER' @ [116:30] ==> enum entry PROPERTY_WITH_INITIALIZER defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[FakeCallableDescriptorForObject]

'availableTargets' @ [116:59] ==> private final val availableTargets: List<ExtractionTarget> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'isInitializer' @ [117:31] ==> private final fun isInitializer(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[SimpleFunctionDescriptorImpl]

'createVarCheckBox' @ [119:13] ==> protected/*protected and package*/ for synthetic extension final val KotlinInplacePropertyIntroducer.createVarCheckBox: (() -> (JComponent..JComponent?))?[MyPropertyDescriptor]

'let' @ [119:32] ==> @InlineOnly public inline fun <T, R> (() -> (JComponent..JComponent?)).let(block: (() -> (JComponent..JComponent?)) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<(javax.swing.JComponent..javax.swing.JComponent?)>
    <R> -> Unit

'Pass<JComponent>' @ [120:43] ==> public constructor Pass<T : (Any..Any?)>() defined in com.intellij.openapi.util.Pass[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JComponent

't' @ [122:26] ==> value-parameter t: JComponent defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>.<no name provided>.pass[ValueParameterDescriptorImpl]

'isSelected' @ [122:42] ==> public final var JCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'property' @ [122:55] ==> private final var property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'isVar' @ [122:64] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'addPanelControl' @ [125:17] ==> protected/*protected and package*/ final fun addPanelControl(@NotNull panelControl: KotlinInplaceVariableIntroducer.ControlWrapper): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[JavaMethodDescriptor]

'ControlWrapper' @ [125:33] ==> public constructor ControlWrapper(@NotNull factory: () -> (JComponent..JComponent?), @NotNull condition: () -> (Boolean..Boolean?), @NotNull initializer: Pass<(JComponent..JComponent?)>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinInplaceVariableIntroducer.ControlWrapper[JavaClassConstructorDescriptor]

'it' @ [125:48] ==> value-parameter it: () -> (JComponent..JComponent?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>[ValueParameterDescriptorImpl]

'condition' @ [125:52] ==> val condition: () -> Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls[LocalVariableDescriptor]

'initializer' @ [125:63] ==> val initializer: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>[LocalVariableDescriptor]

'createExplicitTypeCheckBox' @ [127:13] ==> protected/*protected and package*/ for synthetic extension final val KotlinInplacePropertyIntroducer.createExplicitTypeCheckBox: (() -> (JComponent..JComponent?))?[MyPropertyDescriptor]

'let' @ [127:41] ==> @InlineOnly public inline fun <T, R> (() -> (JComponent..JComponent?)).let(block: (() -> (JComponent..JComponent?)) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<(javax.swing.JComponent..javax.swing.JComponent?)>
    <R> -> Unit

'Pass<JComponent>' @ [128:43] ==> public constructor Pass<T : (Any..Any?)>() defined in com.intellij.openapi.util.Pass[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JComponent

't' @ [130:26] ==> value-parameter t: JComponent defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>.<no name provided>.pass[ValueParameterDescriptorImpl]

'isSelected' @ [130:42] ==> public final var JCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'property' @ [130:55] ==> private final var property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'typeReference' @ [130:64] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'addPanelControl' @ [133:17] ==> protected/*protected and package*/ final fun addPanelControl(@NotNull panelControl: KotlinInplaceVariableIntroducer.ControlWrapper): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[JavaMethodDescriptor]

'ControlWrapper' @ [133:33] ==> public constructor ControlWrapper(@NotNull factory: () -> (JComponent..JComponent?), @NotNull condition: () -> (Boolean..Boolean?), @NotNull initializer: Pass<(JComponent..JComponent?)>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinInplaceVariableIntroducer.ControlWrapper[JavaClassConstructorDescriptor]

'it' @ [133:48] ==> value-parameter it: () -> (JComponent..JComponent?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>[ValueParameterDescriptorImpl]

'condition' @ [133:52] ==> val condition: () -> Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls[LocalVariableDescriptor]

'initializer' @ [133:63] ==> val initializer: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>[LocalVariableDescriptor]

'extractionResult' @ [137:31] ==> private final var extractionResult: ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'duplicateReplacers' @ [137:48] ==> public final val duplicateReplacers: Map<KotlinPsiRange, () -> Unit> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionResult[PropertyDescriptorImpl]

'size' @ [137:67] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'occurrenceCount' @ [138:13] ==> val occurrenceCount: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls[LocalVariableDescriptor]

'addPanelControl' @ [139:13] ==> protected/*protected and package*/ final fun addPanelControl(@NotNull panelControl: KotlinInplaceVariableIntroducer.ControlWrapper): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[JavaMethodDescriptor]

'ControlWrapper' @ [140:21] ==> public constructor ControlWrapper(@NotNull factory: () -> (JComponent..JComponent?)) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinInplaceVariableIntroducer.ControlWrapper[JavaClassConstructorDescriptor]

'NonFocusableCheckBox' @ [141:50] ==> public constructor NonFocusableCheckBox(p0: (String..String?)) defined in com.intellij.ui.NonFocusableCheckBox[JavaClassConstructorDescriptor]

'occurrenceCount' @ [141:98] ==> val occurrenceCount: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls[LocalVariableDescriptor]

'replaceAllCheckBox' @ [142:25] ==> val replaceAllCheckBox: NonFocusableCheckBox defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>[LocalVariableDescriptor]

'isSelected' @ [142:44] ==> public final var NonFocusableCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'replaceAll' @ [142:57] ==> private final var replaceAll: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'replaceAllCheckBox' @ [143:25] ==> val replaceAllCheckBox: NonFocusableCheckBox defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>[LocalVariableDescriptor]

'setMnemonic' @ [143:44] ==> public open fun setMnemonic(p0: Char): Unit defined in com.intellij.ui.NonFocusableCheckBox[JavaMethodDescriptor]

'replaceAllCheckBox' @ [144:25] ==> val replaceAllCheckBox: NonFocusableCheckBox defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>[LocalVariableDescriptor]

'addActionListener' @ [144:44] ==> public final fun addActionListener(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in com.intellij.ui.NonFocusableCheckBox[MyFunctionDescriptor]

'replaceAll' @ [144:64] ==> private final var replaceAll: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'replaceAllCheckBox' @ [144:77] ==> val replaceAllCheckBox: NonFocusableCheckBox defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>[LocalVariableDescriptor]

'isSelected' @ [144:96] ==> public final var NonFocusableCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'replaceAllCheckBox' @ [145:25] ==> val replaceAllCheckBox: NonFocusableCheckBox defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.initPanelControls.<anonymous>[LocalVariableDescriptor]

'!' @ [152:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInitializer' @ [152:14] ==> private final fun isInitializer(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[SimpleFunctionDescriptorImpl]

'super' @ [153:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[LazyClassReceiverParameterDescriptor]

'addTypeReferenceVariable' @ [153:15] ==> protected/*protected and package*/ open fun addTypeReferenceVariable(builder: (TemplateBuilderImpl..TemplateBuilderImpl?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinInplaceVariableIntroducer[JavaMethodDescriptor]

'builder' @ [153:40] ==> value-parameter builder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.addTypeReferenceVariable[ValueParameterDescriptorImpl]

'myElementToRename' @ [157:16] ==> protected/*protected and package*/ final var myElementToRename: (PsiNamedElement..PsiNamedElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[JavaPropertyDescriptor]

'parentsWithSelf' @ [157:34] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'first' @ [157:50] ==> public inline fun <T> Sequence<PsiElement>.first(predicate: (PsiElement) -> Boolean): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [157:58] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.checkLocalScope.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [157:83] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer.checkLocalScope.<anonymous>[ValueParameterDescriptorImpl]

'replaceAll' @ [161:13] ==> private final var replaceAll: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'processDuplicatesSilently' @ [162:13] ==> public fun processDuplicatesSilently(duplicateReplacers: Map<KotlinPsiRange, () -> Unit>, project: Project): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine[SimpleFunctionDescriptorImpl]

'extractionResult' @ [162:39] ==> private final var extractionResult: ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[PropertyDescriptorImpl]

'duplicateReplacers' @ [162:56] ==> public final val duplicateReplacers: Map<KotlinPsiRange, () -> Unit> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionResult[PropertyDescriptorImpl]

'myProject' @ [162:76] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[JavaPropertyDescriptor]

