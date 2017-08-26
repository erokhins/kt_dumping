'KotlinGenerateActionBase' @ [61:5] ==> public constructor KotlinGenerateActionBase() defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateActionBase[ClassConstructorDescriptorImpl]

'file' @ [64:34] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion.findTargetClass[ValueParameterDescriptorImpl]

'findElementAt' @ [64:39] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'editor' @ [64:53] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion.findTargetClass[ValueParameterDescriptorImpl]

'caretModel' @ [64:60] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [64:71] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'elementAtCaret' @ [65:20] ==> val elementAtCaret: PsiElement defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion.findTargetClass[LocalVariableDescriptor]

'parentsWithSelf' @ [65:35] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'filterIsInstance' @ [65:51] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<KtClassOrObject> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtClassOrObject

'firstOrNull' @ [65:87] ==> public inline fun <T> Sequence<KtClassOrObject>.firstOrNull(predicate: (KtClassOrObject) -> Boolean): KtClassOrObject? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'!' @ [65:101] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [65:102] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion.findTargetClass.<anonymous>[ValueParameterDescriptorImpl]

'isLocal' @ [65:105] ==> public final val KtClassOrObject.isLocal: Boolean[MyPropertyDescriptor]

'frameworks' @ [69:13] ==> value-parameter frameworks: List<TestFramework> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion.chooseAndPerform[ValueParameterDescriptorImpl]

'ifEmpty' @ [69:24] ==> public inline fun <T, C : Collection<TestFramework>> List<TestFramework>.ifEmpty(body: () -> List<TestFramework>): List<TestFramework> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFramework
    <C : Collection<T>> -> List<TestFramework>

'frameworks' @ [70:13] ==> value-parameter frameworks: List<TestFramework> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion.chooseAndPerform[ValueParameterDescriptorImpl]

'singleOrNull' @ [70:24] ==> public fun <T> List<TestFramework>.singleOrNull(): TestFramework? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFramework

'let' @ [70:40] ==> @InlineOnly public inline fun <T, R> TestFramework.let(block: (TestFramework) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFramework
    <R> -> Nothing

'invoke' @ [70:53] ==> public abstract operator fun invoke(p1: TestFramework): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [70:62] ==> value-parameter it: TestFramework defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion.chooseAndPerform.<anonymous>[ValueParameterDescriptorImpl]

'getApplication' @ [72:36] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [72:53] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'invoke' @ [72:76] ==> public abstract operator fun invoke(p1: TestFramework): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'frameworks' @ [72:85] ==> value-parameter frameworks: List<TestFramework> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion.chooseAndPerform[ValueParameterDescriptorImpl]

'first' @ [72:96] ==> public fun <T> List<TestFramework>.first(): TestFramework defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFramework

'JBList' @ [74:24] ==> public constructor JBList<E : (Any..Any?)>(@NotNull vararg p0: (TestFramework..TestFramework?)) defined in com.intellij.ui.components.JBList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TestFramework

'frameworks' @ [74:47] ==> value-parameter frameworks: List<TestFramework> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion.chooseAndPerform[ValueParameterDescriptorImpl]

'toTypedArray' @ [74:58] ==> public inline fun <reified T> Collection<TestFramework>.toTypedArray(): Array<TestFramework> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> TestFramework

'list' @ [75:13] ==> val list: JBList<TestFramework> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion.chooseAndPerform[LocalVariableDescriptor]

'cellRenderer' @ [75:18] ==> public final var <E : (Any..Any?)> JBList<TestFramework>.cellRenderer: (ListCellRenderer<in (TestFramework..TestFramework?)>..ListCellRenderer<in (TestFramework..TestFramework?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TestFramework

'TestFrameworkListCellRenderer' @ [75:33] ==> public constructor TestFrameworkListCellRenderer() defined in org.jetbrains.kotlin.idea.actions.generate.TestFrameworkListCellRenderer[JavaClassConstructorDescriptor]

'PopupChooserBuilder' @ [77:13] ==> public constructor PopupChooserBuilder(@NotNull p0: raw (JList<(Any..Any?)>..JList<*>)) defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaClassConstructorDescriptor]

'list' @ [77:33] ==> val list: JBList<TestFramework> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion.chooseAndPerform[LocalVariableDescriptor]

'setFilteringEnabled' @ [78:22] ==> public final fun setFilteringEnabled(p0: (((Any..Any?)) -> (String..String?)..(((Any..Any?)) -> (String..String?))?)): (PopupChooserBuilder..PopupChooserBuilder?) defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[MyFunctionDescriptor]

'it' @ [78:45] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion.chooseAndPerform.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [78:66] ==> public final val TestFramework.name: String[MyPropertyDescriptor]

'setTitle' @ [79:22] ==> @NotNull public open fun setTitle(@NotNull @Nls p0: String): PopupChooserBuilder defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'setItemChoosenCallback' @ [80:22] ==> @NotNull public final fun setItemChoosenCallback(@NotNull p0: () -> Unit): PopupChooserBuilder defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[MyFunctionDescriptor]

'invoke' @ [80:47] ==> public abstract operator fun invoke(p1: TestFramework): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'list' @ [80:56] ==> val list: JBList<TestFramework> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion.chooseAndPerform[LocalVariableDescriptor]

'selectedValue' @ [80:61] ==> public final val <E : (Any..Any?)> JBList<TestFramework>.selectedValue: (TestFramework..TestFramework?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TestFramework

'setMovable' @ [81:22] ==> public open fun setMovable(p0: Boolean): (PopupChooserBuilder..PopupChooserBuilder?) defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'createPopup' @ [82:22] ==> @NotNull public open fun createPopup(): JBPopup defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'showInBestPositionFor' @ [83:22] ==> public abstract fun showInBestPositionFor(@NotNull p0: Editor): Unit defined in com.intellij.openapi.ui.popup.JBPopup[JavaMethodDescriptor]

'editor' @ [83:44] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion.chooseAndPerform[ValueParameterDescriptorImpl]

'KotlinNameSuggester' @ [90:60] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'isIdentifier' @ [90:80] ==> public final fun isIdentifier(name: String?): Boolean defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'inputString' @ [90:93] ==> value-parameter inputString: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion.NAME_VALIDATOR.<no name provided>.checkInput[ValueParameterDescriptorImpl]

'quoteIfNeeded' @ [90:105] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'KotlinGenerateTestSupportActionBase' @ [95:19] ==> public constructor KotlinGenerateTestSupportActionBase(methodKind: TestIntegrationUtils.MethodKind) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[ClassConstructorDescriptorImpl]

'SET_UP' @ [95:66] ==> enum entry SET_UP defined in com.intellij.testIntegration.TestIntegrationUtils.MethodKind[FakeCallableDescriptorForObject]

'framework' @ [97:20] ==> value-parameter framework: TestFramework defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.SetUp.isApplicableTo[ValueParameterDescriptorImpl]

'findSetUpMethod' @ [97:30] ==> @Nullable public abstract fun findSetUpMethod(@NotNull p0: PsiElement): PsiElement? defined in com.intellij.testIntegration.TestFramework[JavaMethodDescriptor]

'targetClass' @ [97:46] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.SetUp.isApplicableTo[ValueParameterDescriptorImpl]

'toLightClass' @ [97:58] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'KotlinGenerateTestSupportActionBase' @ [101:18] ==> public constructor KotlinGenerateTestSupportActionBase(methodKind: TestIntegrationUtils.MethodKind) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[ClassConstructorDescriptorImpl]

'TEST' @ [101:65] ==> enum entry TEST defined in com.intellij.testIntegration.TestIntegrationUtils.MethodKind[FakeCallableDescriptorForObject]

'KotlinGenerateTestSupportActionBase' @ [105:18] ==> public constructor KotlinGenerateTestSupportActionBase(methodKind: TestIntegrationUtils.MethodKind) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[ClassConstructorDescriptorImpl]

'DATA' @ [105:65] ==> enum entry DATA defined in com.intellij.testIntegration.TestIntegrationUtils.MethodKind[FakeCallableDescriptorForObject]

'framework' @ [107:17] ==> value-parameter framework: TestFramework defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Data.isApplicableTo[ValueParameterDescriptorImpl]

'framework' @ [108:20] ==> value-parameter framework: TestFramework defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Data.isApplicableTo[ValueParameterDescriptorImpl]

'findParametersMethod' @ [108:30] ==> @Nullable public open fun findParametersMethod(p0: (PsiClass..PsiClass?)): PsiMethod? defined in com.intellij.testIntegration.JavaTestFramework[JavaMethodDescriptor]

'targetClass' @ [108:51] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Data.isApplicableTo[ValueParameterDescriptorImpl]

'toLightClass' @ [108:63] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'KotlinGenerateTestSupportActionBase' @ [112:22] ==> public constructor KotlinGenerateTestSupportActionBase(methodKind: TestIntegrationUtils.MethodKind) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[ClassConstructorDescriptorImpl]

'TEAR_DOWN' @ [112:69] ==> enum entry TEAR_DOWN defined in com.intellij.testIntegration.TestIntegrationUtils.MethodKind[FakeCallableDescriptorForObject]

'framework' @ [114:20] ==> value-parameter framework: TestFramework defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.TearDown.isApplicableTo[ValueParameterDescriptorImpl]

'findTearDownMethod' @ [114:30] ==> @Nullable public abstract fun findTearDownMethod(@NotNull p0: PsiElement): PsiElement? defined in com.intellij.testIntegration.TestFramework[JavaMethodDescriptor]

'targetClass' @ [114:49] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.TearDown.isApplicableTo[ValueParameterDescriptorImpl]

'toLightClass' @ [114:61] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'findTargetClass' @ [119:16] ==> private final fun findTargetClass(editor: Editor, file: PsiFile): KtClassOrObject? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion[SimpleFunctionDescriptorImpl]

'editor' @ [119:32] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.getTargetClass[ValueParameterDescriptorImpl]

'file' @ [119:40] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.getTargetClass[ValueParameterDescriptorImpl]

'findSuitableFrameworks' @ [123:16] ==> public fun findSuitableFrameworks(klass: KtClassOrObject): List<TestFramework> defined in org.jetbrains.kotlin.idea.testIntegration in file testIntegrationUtils.kt[SimpleFunctionDescriptorImpl]

'targetClass' @ [123:39] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.isValidForClass[ValueParameterDescriptorImpl]

'any' @ [123:52] ==> public inline fun <T> Iterable<TestFramework>.any(predicate: (TestFramework) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFramework

'isApplicableTo' @ [123:58] ==> protected abstract fun isApplicableTo(framework: TestFramework, targetClass: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[SimpleFunctionDescriptorImpl]

'it' @ [123:73] ==> value-parameter it: TestFramework defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.isValidForClass.<anonymous>[ValueParameterDescriptorImpl]

'targetClass' @ [123:77] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.isValidForClass[ValueParameterDescriptorImpl]

'findTargetClass' @ [129:21] ==> private final fun findTargetClass(editor: Editor, file: PsiFile): KtClassOrObject? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion[SimpleFunctionDescriptorImpl]

'editor' @ [129:37] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke[ValueParameterDescriptorImpl]

'file' @ [129:45] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke[ValueParameterDescriptorImpl]

'if (testFrameworkToUse != null) {
            val frameworkToUse = findSuitableFrameworks(klass).first { it.name == testFrameworkToUse }
            if (isApplicableTo(frameworkToUse, klass)) {
                doGenerate(editor, file, klass, frameworkToUse)
            }
        }
        else {
            val frameworks = findSuitableFrameworks(klass)
                    .filter { methodKind.getFileTemplateDescriptor(it) != null && isApplicableTo(it, klass) }

            chooseAndPerform(editor, frameworks) { doGenerate(editor, file, klass, it) }
        }' @ [131:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'testFrameworkToUse' @ [131:13] ==> public final var testFrameworkToUse: String? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[PropertyDescriptorImpl]

'findSuitableFrameworks' @ [132:34] ==> public fun findSuitableFrameworks(klass: KtClassOrObject): List<TestFramework> defined in org.jetbrains.kotlin.idea.testIntegration in file testIntegrationUtils.kt[SimpleFunctionDescriptorImpl]

'klass' @ [132:57] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke[LocalVariableDescriptor]

'first' @ [132:64] ==> public inline fun <T> Iterable<TestFramework>.first(predicate: (TestFramework) -> Boolean): TestFramework defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFramework

'it' @ [132:72] ==> value-parameter it: TestFramework defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [132:75] ==> public final val TestFramework.name: String[MyPropertyDescriptor]

'testFrameworkToUse' @ [132:83] ==> public final var testFrameworkToUse: String? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[PropertyDescriptorImpl]

'isApplicableTo' @ [133:17] ==> protected abstract fun isApplicableTo(framework: TestFramework, targetClass: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[SimpleFunctionDescriptorImpl]

'frameworkToUse' @ [133:32] ==> val frameworkToUse: TestFramework defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke[LocalVariableDescriptor]

'klass' @ [133:48] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke[LocalVariableDescriptor]

'doGenerate' @ [134:17] ==> private final fun doGenerate(editor: Editor, file: PsiFile, klass: KtClassOrObject, framework: TestFramework): Unit defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[SimpleFunctionDescriptorImpl]

'editor' @ [134:28] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke[ValueParameterDescriptorImpl]

'file' @ [134:36] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke[ValueParameterDescriptorImpl]

'klass' @ [134:42] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke[LocalVariableDescriptor]

'frameworkToUse' @ [134:49] ==> val frameworkToUse: TestFramework defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke[LocalVariableDescriptor]

'findSuitableFrameworks' @ [138:30] ==> public fun findSuitableFrameworks(klass: KtClassOrObject): List<TestFramework> defined in org.jetbrains.kotlin.idea.testIntegration in file testIntegrationUtils.kt[SimpleFunctionDescriptorImpl]

'klass' @ [138:53] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke[LocalVariableDescriptor]

'filter' @ [139:22] ==> public inline fun <T> Iterable<TestFramework>.filter(predicate: (TestFramework) -> Boolean): List<TestFramework> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFramework

'methodKind' @ [139:31] ==> private final val methodKind: TestIntegrationUtils.MethodKind defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[PropertyDescriptorImpl]

'getFileTemplateDescriptor' @ [139:42] ==> public abstract fun getFileTemplateDescriptor(@NotNull p0: TestFramework): (FileTemplateDescriptor..FileTemplateDescriptor?) defined in com.intellij.testIntegration.TestIntegrationUtils.MethodKind[JavaMethodDescriptor]

'it' @ [139:68] ==> value-parameter it: TestFramework defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke.<anonymous>[ValueParameterDescriptorImpl]

'isApplicableTo' @ [139:83] ==> protected abstract fun isApplicableTo(framework: TestFramework, targetClass: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[SimpleFunctionDescriptorImpl]

'it' @ [139:98] ==> value-parameter it: TestFramework defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke.<anonymous>[ValueParameterDescriptorImpl]

'klass' @ [139:102] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke[LocalVariableDescriptor]

'chooseAndPerform' @ [141:13] ==> private final fun chooseAndPerform(editor: Editor, frameworks: List<TestFramework>, consumer: (TestFramework) -> Unit): Unit defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion[SimpleFunctionDescriptorImpl]

'editor' @ [141:30] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke[ValueParameterDescriptorImpl]

'frameworks' @ [141:38] ==> val frameworks: List<TestFramework> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke[LocalVariableDescriptor]

'doGenerate' @ [141:52] ==> private final fun doGenerate(editor: Editor, file: PsiFile, klass: KtClassOrObject, framework: TestFramework): Unit defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[SimpleFunctionDescriptorImpl]

'editor' @ [141:63] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke[ValueParameterDescriptorImpl]

'file' @ [141:71] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke[ValueParameterDescriptorImpl]

'klass' @ [141:77] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke[LocalVariableDescriptor]

'it' @ [141:84] ==> value-parameter it: TestFramework defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.invoke.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [150:23] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[ValueParameterDescriptorImpl]

'project' @ [150:28] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'methodKind' @ [153:38] ==> private final val methodKind: TestIntegrationUtils.MethodKind defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[PropertyDescriptorImpl]

'getFileTemplateDescriptor' @ [153:49] ==> public abstract fun getFileTemplateDescriptor(@NotNull p0: TestFramework): (FileTemplateDescriptor..FileTemplateDescriptor?) defined in com.intellij.testIntegration.TestIntegrationUtils.MethodKind[JavaMethodDescriptor]

'framework' @ [153:75] ==> value-parameter framework: TestFramework defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[ValueParameterDescriptorImpl]

'getInstance' @ [154:48] ==> public open fun getInstance(@NotNull p0: Project): (FileTemplateManager..FileTemplateManager?) defined in com.intellij.ide.fileTemplates.FileTemplateManager[JavaMethodDescriptor]

'project' @ [154:60] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'getCodeTemplate' @ [154:69] ==> public abstract fun getCodeTemplate(@NotNull @NonNls p0: String): (FileTemplate..FileTemplate?) defined in com.intellij.ide.fileTemplates.FileTemplateManager[JavaMethodDescriptor]

'fileTemplateDescriptor' @ [154:85] ==> val fileTemplateDescriptor: (FileTemplateDescriptor..FileTemplateDescriptor?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'fileName' @ [154:108] ==> public final val FileTemplateDescriptor.fileName: (String..String?)[MyPropertyDescriptor]

'fileTemplate' @ [155:28] ==> val fileTemplate: (FileTemplate..FileTemplate?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'text' @ [155:41] ==> public final var FileTemplate.text: String[MyPropertyDescriptor]

'replace' @ [155:46] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'BODY_VAR' @ [155:54] ==> private final val BODY_VAR: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion[PropertyDescriptorImpl]

'templateText' @ [157:13] ==> var templateText: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'contains' @ [157:26] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'NAME_VAR' @ [157:35] ==> private final val NAME_VAR: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion[PropertyDescriptorImpl]

'name' @ [158:13] ==> var name: String? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'if (templateText.contains("test$NAME_VAR")) "Name" else "name"' @ [158:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'templateText' @ [158:24] ==> var templateText: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'contains' @ [158:37] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'NAME_VAR' @ [158:52] ==> private final val NAME_VAR: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion[PropertyDescriptorImpl]

'!' @ [159:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [159:37] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [159:54] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'name' @ [160:17] ==> var name: String? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'?:' @ [160:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String?

'showInputDialog' @ [160:33] ==> @Nullable public open fun showInputDialog(p0: (String..String?), @Nls p1: (String..String?), @Nullable p2: Icon?, @Nullable p3: String?, @Nullable p4: InputValidator?): String? defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'commandName' @ [160:71] ==> val commandName: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'name' @ [160:90] ==> var name: String? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'NAME_VALIDATOR' @ [160:96] ==> private final val NAME_VALIDATOR: <no name provided> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion[PropertyDescriptorImpl]

'templateText' @ [164:13] ==> var templateText: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'fileTemplate' @ [164:28] ==> val fileTemplate: (FileTemplate..FileTemplate?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'text' @ [164:41] ==> public final var FileTemplate.text: String[MyPropertyDescriptor]

'replace' @ [164:46] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'NAME_VAR' @ [164:54] ==> private final val NAME_VAR: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion[PropertyDescriptorImpl]

'DUMMY_NAME' @ [164:64] ==> private final val DUMMY_NAME: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[PropertyDescriptorImpl]

'project' @ [169:13] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'executeWriteCommand' @ [169:21] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'commandName' @ [169:41] ==> val commandName: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'getInstance' @ [170:36] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [170:48] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'commitAllDocuments' @ [170:57] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'getInstance' @ [172:57] ==> public open fun getInstance(p0: (Project..Project?)): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.PsiElementFactory.SERVICE[JavaMethodDescriptor]

'project' @ [172:69] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'factory' @ [173:33] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'createMethodFromText' @ [173:41] ==> @NotNull public abstract fun createMethodFromText(@NotNull @NonNls p0: String, @Nullable p1: PsiElement?): PsiMethod defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'templateText' @ [173:62] ==> var templateText: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'psiMethod' @ [174:17] ==> val psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'throwsList' @ [174:27] ==> public final val PsiMethod.throwsList: PsiReferenceList[MyPropertyDescriptor]

'referenceElements' @ [174:38] ==> public final val PsiReferenceList.referenceElements: (Array<(PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>..Array<out (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>)[MyPropertyDescriptor]

'forEach' @ [174:56] ==> public inline fun <T> Array<out (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>.forEach(action: ((PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiJavaCodeReferenceElement..com.intellij.psi.PsiJavaCodeReferenceElement?)

'it' @ [174:66] ==> value-parameter it: (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [174:69] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiJavaCodeReferenceElement[JavaMethodDescriptor]

'psiMethod' @ [175:32] ==> val psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'j2k' @ [175:42] ==> public fun PsiMember.j2k(): KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'run' @ [175:71] ==> @InlineOnly public inline fun <T, R> KotlinGenerateTestSupportActionBase.run(block: KotlinGenerateTestSupportActionBase.() -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinGenerateTestSupportActionBase
    <R> -> Nothing

'errorHint' @ [176:21] ==> var errorHint: String? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'name' @ [179:17] ==> var name: String? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'let' @ [179:23] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'function' @ [180:21] ==> var function: KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'substituteNewName' @ [180:32] ==> private final fun substituteNewName(function: KtNamedFunction, name: String): KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[SimpleFunctionDescriptorImpl]

'function' @ [180:50] ==> var function: KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'it' @ [180:60] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'insertMember' @ [182:39] ==> public fun <T : KtDeclaration> insertMember(editor: Editor?, classOrObject: KtClassOrObject, declaration: KtNamedFunction, anchor: PsiElement? = ...): KtNamedFunction defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : KtDeclaration> -> KtNamedFunction

'editor' @ [182:52] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[ValueParameterDescriptorImpl]

'klass' @ [182:60] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[ValueParameterDescriptorImpl]

'function' @ [182:67] ==> var function: KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'functionInPlace' @ [184:42] ==> val functionInPlace: KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'resolveToDescriptor' @ [184:58] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [185:45] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'overriddenDescriptors' @ [185:64] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'when (overriddenDescriptors.size) {
                    0 -> generateUnsupportedOrSuperCall(project, functionDescriptor, BodyType.EMPTY)
                    1 -> generateUnsupportedOrSuperCall(project, overriddenDescriptors.single(), BodyType.SUPER)
                    else -> generateUnsupportedOrSuperCall(project, overriddenDescriptors.first(), BodyType.QUALIFIED_SUPER)
                }' @ [186:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'overriddenDescriptors' @ [186:38] ==> val overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'size' @ [186:60] ==> public abstract val size: Int defined in kotlin.collections.MutableCollection[DeserializedPropertyDescriptor]

'generateUnsupportedOrSuperCall' @ [187:26] ==> public fun generateUnsupportedOrSuperCall(project: Project, descriptor: CallableMemberDescriptor, bodyType: OverrideMemberChooserObject.BodyType): String defined in org.jetbrains.kotlin.idea.core.overrideImplement[DeserializedSimpleFunctionDescriptor]

'project' @ [187:57] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'functionDescriptor' @ [187:66] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'EMPTY' @ [187:95] ==> public object EMPTY : OverrideMemberChooserObject.BodyType defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideMemberChooserObject.BodyType[FakeCallableDescriptorForObject]

'generateUnsupportedOrSuperCall' @ [188:26] ==> public fun generateUnsupportedOrSuperCall(project: Project, descriptor: CallableMemberDescriptor, bodyType: OverrideMemberChooserObject.BodyType): String defined in org.jetbrains.kotlin.idea.core.overrideImplement[DeserializedSimpleFunctionDescriptor]

'project' @ [188:57] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'overriddenDescriptors' @ [188:66] ==> val overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'single' @ [188:88] ==> public fun <T> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.single(): (FunctionDescriptor..FunctionDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'SUPER' @ [188:107] ==> public object SUPER : OverrideMemberChooserObject.BodyType defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideMemberChooserObject.BodyType[FakeCallableDescriptorForObject]

'generateUnsupportedOrSuperCall' @ [189:29] ==> public fun generateUnsupportedOrSuperCall(project: Project, descriptor: CallableMemberDescriptor, bodyType: OverrideMemberChooserObject.BodyType): String defined in org.jetbrains.kotlin.idea.core.overrideImplement[DeserializedSimpleFunctionDescriptor]

'project' @ [189:60] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'overriddenDescriptors' @ [189:69] ==> val overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'first' @ [189:91] ==> public fun <T> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.first(): (FunctionDescriptor..FunctionDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'QUALIFIED_SUPER' @ [189:109] ==> public object QUALIFIED_SUPER : OverrideMemberChooserObject.BodyType defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideMemberChooserObject.BodyType[FakeCallableDescriptorForObject]

'functionInPlace' @ [191:17] ==> val functionInPlace: KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'bodyExpression' @ [191:33] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'delete' @ [191:49] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'functionInPlace' @ [192:17] ==> val functionInPlace: KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'add' @ [192:33] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'KtPsiFactory' @ [192:37] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [192:50] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'createBlock' @ [192:59] ==> public final fun createBlock(bodyText: String): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'bodyText' @ [192:71] ==> val bodyText: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'overriddenDescriptors' @ [194:21] ==> val overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [194:43] ==> @InlineOnly public inline fun <T> Collection<(FunctionDescriptor..FunctionDescriptor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'functionInPlace' @ [195:21] ==> val functionInPlace: KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'addModifier' @ [195:37] ==> public open fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [195:58] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'setupEditorSelection' @ [198:17] ==> public fun setupEditorSelection(editor: Editor, declaration: KtNamedDeclaration): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file generationUtils.kt[SimpleFunctionDescriptorImpl]

'editor' @ [198:38] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[ValueParameterDescriptorImpl]

'functionInPlace' @ [198:46] ==> val functionInPlace: KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[LocalVariableDescriptor]

'errorHint' @ [200:13] ==> var errorHint: String? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'let' @ [200:24] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'getInstance' @ [200:42] ==> public open fun getInstance(): (HintManager..HintManager?) defined in com.intellij.codeInsight.hint.HintManager[JavaMethodDescriptor]

'showErrorHint' @ [200:56] ==> public abstract fun showErrorHint(@NotNull p0: Editor, @NotNull p1: String): Unit defined in com.intellij.codeInsight.hint.HintManager[JavaMethodDescriptor]

'editor' @ [200:70] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[ValueParameterDescriptorImpl]

'it' @ [200:78] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate.<anonymous>[ValueParameterDescriptorImpl]

'getInstance' @ [203:25] ==> public open fun getInstance(): (HintManager..HintManager?) defined in com.intellij.codeInsight.hint.HintManager[JavaMethodDescriptor]

'showErrorHint' @ [203:39] ==> public abstract fun showErrorHint(@NotNull p0: Editor, @NotNull p1: String): Unit defined in com.intellij.codeInsight.hint.HintManager[JavaMethodDescriptor]

'editor' @ [203:53] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[ValueParameterDescriptorImpl]

'+' @ [203:61] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'e' @ [203:90] ==> val e: IncorrectOperationException defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.doGenerate[LocalVariableDescriptor]

'message' @ [203:92] ==> public open val message: String? defined in com.intellij.util.IncorrectOperationException[DeserializedPropertyDescriptor]

'KtPsiFactory' @ [208:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'function' @ [208:39] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName[ValueParameterDescriptorImpl]

'function' @ [211:25] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName[ValueParameterDescriptorImpl]

'function1' @ [212:9] ==> var function1: KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName[LocalVariableDescriptor]

'accept' @ [212:19] ==> public final fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [213:26] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'!' @ [215:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'currentId' @ [215:30] ==> value-parameter currentId: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName.<no name provided>.getNewId[ValueParameterDescriptorImpl]

'contains' @ [215:40] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DUMMY_NAME' @ [215:49] ==> private final val DUMMY_NAME: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[PropertyDescriptorImpl]

'currentId' @ [216:32] ==> value-parameter currentId: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName.<no name provided>.getNewId[ValueParameterDescriptorImpl]

'replace' @ [216:42] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DUMMY_NAME' @ [216:50] ==> private final val DUMMY_NAME: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[PropertyDescriptorImpl]

'name' @ [216:62] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName[ValueParameterDescriptorImpl]

'quoteIfNeeded' @ [216:68] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'declaration' @ [220:46] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName.<no name provided>.visitNamedDeclaration[ValueParameterDescriptorImpl]

'nameIdentifier' @ [220:58] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'getNewId' @ [221:37] ==> private final fun getNewId(currentId: String): String? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName.<no name provided>[SimpleFunctionDescriptorImpl]

'nameIdentifier' @ [221:46] ==> val nameIdentifier: PsiElement defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName.<no name provided>.visitNamedDeclaration[LocalVariableDescriptor]

'text' @ [221:61] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'declaration' @ [222:25] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName.<no name provided>.visitNamedDeclaration[ValueParameterDescriptorImpl]

'setName' @ [222:37] ==> public abstract fun setName(@NotNull p0: String): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'newId' @ [222:45] ==> val newId: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName.<no name provided>.visitNamedDeclaration[LocalVariableDescriptor]

'getNewId' @ [226:37] ==> private final fun getNewId(currentId: String): String? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [226:46] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'text' @ [226:57] ==> public final val KtSimpleNameExpression.text: (String..String?)[MyPropertyDescriptor]

'expression' @ [227:25] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'replace' @ [227:36] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[JavaMethodDescriptor]

'psiFactory' @ [227:44] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName[LocalVariableDescriptor]

'createSimpleName' @ [227:55] ==> public final fun createSimpleName(name: String): KtSimpleNameExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newId' @ [227:72] ==> val newId: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'function1' @ [232:28] ==> var function1: KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName[LocalVariableDescriptor]

'text' @ [232:38] ==> public final val KtNamedFunction.text: (String..String?)[MyPropertyDescriptor]

'functionText' @ [233:13] ==> val functionText: (String..String?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName[LocalVariableDescriptor]

'contains' @ [233:26] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DUMMY_NAME' @ [233:35] ==> private final val DUMMY_NAME: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[PropertyDescriptorImpl]

'function1' @ [234:13] ==> var function1: KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName[LocalVariableDescriptor]

'psiFactory' @ [234:25] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName[LocalVariableDescriptor]

'createFunction' @ [234:36] ==> public final fun createFunction(funDecl: String): KtNamedFunction defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'function1' @ [234:51] ==> var function1: KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName[LocalVariableDescriptor]

'text' @ [234:61] ==> public final val KtNamedFunction.text: (String..String?)[MyPropertyDescriptor]

'replace' @ [234:66] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DUMMY_NAME' @ [234:74] ==> private final val DUMMY_NAME: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[PropertyDescriptorImpl]

'name' @ [234:86] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName[ValueParameterDescriptorImpl]

'function1' @ [236:16] ==> var function1: KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.substituteNewName[LocalVariableDescriptor]

'?:' @ [240:23] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Project?, right: Project): Project[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Project

'PROJECT' @ [240:38] ==> public final val PROJECT: (DataKey<(Project..Project?)>..DataKey<(Project..Project?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'getData' @ [240:46] ==> @Nullable public open fun getData(@NotNull p0: DataContext): Project? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'dataContext' @ [240:54] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.createEditTemplateAction[ValueParameterDescriptorImpl]

'?:' @ [241:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Editor?, right: Editor): Editor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Editor

'EDITOR' @ [241:37] ==> public final val EDITOR: (DataKey<(Editor..Editor?)>..DataKey<(Editor..Editor?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'getData' @ [241:44] ==> @Nullable public open fun getData(@NotNull p0: DataContext): Editor? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'dataContext' @ [241:52] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.createEditTemplateAction[ValueParameterDescriptorImpl]

'?:' @ [242:20] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiFile?, right: PsiFile): PsiFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiFile

'PSI_FILE' @ [242:35] ==> public final val PSI_FILE: (DataKey<(PsiFile..PsiFile?)>..DataKey<(PsiFile..PsiFile?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'getData' @ [242:44] ==> @Nullable public open fun getData(@NotNull p0: DataContext): PsiFile? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'dataContext' @ [242:52] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.createEditTemplateAction[ValueParameterDescriptorImpl]

'getTargetClass' @ [244:27] ==> protected open fun getTargetClass(editor: Editor, file: PsiFile): KtClassOrObject? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[SimpleFunctionDescriptorImpl]

'editor' @ [244:42] ==> val editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.createEditTemplateAction[LocalVariableDescriptor]

'file' @ [244:50] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.createEditTemplateAction[LocalVariableDescriptor]

'findSuitableFrameworks' @ [245:26] ==> public fun findSuitableFrameworks(klass: KtClassOrObject): List<TestFramework> defined in org.jetbrains.kotlin.idea.testIntegration in file testIntegrationUtils.kt[SimpleFunctionDescriptorImpl]

'targetClass' @ [245:49] ==> val targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.createEditTemplateAction[LocalVariableDescriptor]

'ifEmpty' @ [245:62] ==> public inline fun <T, C : Collection<TestFramework>> List<TestFramework>.ifEmpty(body: () -> List<TestFramework>): List<TestFramework> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFramework
    <C : Collection<T>> -> List<TestFramework>

'AnAction' @ [247:25] ==> public constructor AnAction(@Nullable p0: String?) defined in com.intellij.openapi.actionSystem.AnAction[JavaClassConstructorDescriptor]

'chooseAndPerform' @ [249:17] ==> private final fun chooseAndPerform(editor: Editor, frameworks: List<TestFramework>, consumer: (TestFramework) -> Unit): Unit defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.Companion[SimpleFunctionDescriptorImpl]

'editor' @ [249:34] ==> val editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.createEditTemplateAction[LocalVariableDescriptor]

'frameworks' @ [249:42] ==> val frameworks: List<TestFramework> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.createEditTemplateAction[LocalVariableDescriptor]

'methodKind' @ [250:38] ==> private final val methodKind: TestIntegrationUtils.MethodKind defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase[PropertyDescriptorImpl]

'getFileTemplateDescriptor' @ [250:49] ==> public abstract fun getFileTemplateDescriptor(@NotNull p0: TestFramework): (FileTemplateDescriptor..FileTemplateDescriptor?) defined in com.intellij.testIntegration.TestIntegrationUtils.MethodKind[JavaMethodDescriptor]

'it' @ [250:75] ==> value-parameter it: TestFramework defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.createEditTemplateAction.<no name provided>.actionPerformed.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [251:25] ==> val descriptor: (FileTemplateDescriptor..FileTemplateDescriptor?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.createEditTemplateAction.<no name provided>.actionPerformed.<anonymous>[LocalVariableDescriptor]

'getInstance' @ [252:37] ==> public open fun getInstance(): (HintManager..HintManager?) defined in com.intellij.codeInsight.hint.HintManager[JavaMethodDescriptor]

'showErrorHint' @ [252:51] ==> public abstract fun showErrorHint(@NotNull p0: Editor, @NotNull p1: String): Unit defined in com.intellij.codeInsight.hint.HintManager[JavaMethodDescriptor]

'editor' @ [252:65] ==> val editor: Editor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.createEditTemplateAction[LocalVariableDescriptor]

'it' @ [252:98] ==> value-parameter it: TestFramework defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.createEditTemplateAction.<no name provided>.actionPerformed.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [252:101] ==> public final val TestFramework.name: String[MyPropertyDescriptor]

'templatePresentation' @ [252:109] ==> public final val <no name provided>.templatePresentation: Presentation[MyPropertyDescriptor]

'text' @ [252:130] ==> public final var Presentation.text: String?[MyPropertyDescriptor]

'editCodeTemplate' @ [256:50] ==> public open fun editCodeTemplate(@NotNull p0: String, p1: (Project..Project?)): Unit defined in com.intellij.ide.fileTemplates.impl.AllFileTemplatesConfigurable[JavaMethodDescriptor]

'getNameWithoutExtension' @ [256:76] ==> @NotNull public open fun getNameWithoutExtension(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'descriptor' @ [256:100] ==> val descriptor: (FileTemplateDescriptor..FileTemplateDescriptor?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.createEditTemplateAction.<no name provided>.actionPerformed.<anonymous>[LocalVariableDescriptor]

'fileName' @ [256:111] ==> public final val FileTemplateDescriptor.fileName: (String..String?)[MyPropertyDescriptor]

'project' @ [256:122] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateTestSupportActionBase.createEditTemplateAction[LocalVariableDescriptor]

