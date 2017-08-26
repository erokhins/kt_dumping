'KotlinLightCodeInsightFixtureTestCase' @ [79:41] ==> public constructor KotlinLightCodeInsightFixtureTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[ClassConstructorDescriptorImpl]

'JAVA_LATEST' @ [80:75] ==> public final val JAVA_LATEST: (LightProjectDescriptor..LightProjectDescriptor?) defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaPropertyDescriptor]

'myFixture' @ [82:53] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[JavaPropertyDescriptor]

'doTest' @ [85:9] ==> protected final fun doTest(path: String, checkAdditionalAfterdata: Boolean = ..., action: (PsiFile) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[SimpleFunctionDescriptorImpl]

'path' @ [85:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceVariableTest[ValueParameterDescriptorImpl]

'file' @ [86:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceVariableTest.<anonymous>[ValueParameterDescriptorImpl]

'KotlinIntroduceVariableHandler' @ [88:13] ==> public object KotlinIntroduceVariableHandler : RefactoringActionHandler defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable[FakeCallableDescriptorForObject]

'invoke' @ [88:44] ==> public open fun invoke(project: Project, editor: Editor, file: PsiFile, dataContext: DataContext): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[DeserializedSimpleFunctionDescriptor]

'fixture' @ [89:21] ==> public final val fixture: JavaCodeInsightTestFixture defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[PropertyDescriptorImpl]

'project' @ [89:29] ==> public final val JavaCodeInsightTestFixture.project: (Project..Project?)[MyPropertyDescriptor]

'fixture' @ [90:21] ==> public final val fixture: JavaCodeInsightTestFixture defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[PropertyDescriptorImpl]

'editor' @ [90:29] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'file' @ [91:21] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceVariableTest.<anonymous>[ValueParameterDescriptorImpl]

'getInstance' @ [92:33] ==> public open fun getInstance(): (DataManager..DataManager?) defined in com.intellij.ide.DataManager[JavaMethodDescriptor]

'getDataContext' @ [92:47] ==> public abstract fun getDataContext(p0: (Component..Component?)): (DataContext..DataContext?) defined in com.intellij.ide.DataManager[JavaMethodDescriptor]

'fixture' @ [92:62] ==> public final val fixture: JavaCodeInsightTestFixture defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[PropertyDescriptorImpl]

'editor' @ [92:70] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'component' @ [92:77] ==> public final val Editor.component: JComponent[MyPropertyDescriptor]

'doTest' @ [98:9] ==> protected final fun doTest(path: String, checkAdditionalAfterdata: Boolean = ..., action: (PsiFile) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[SimpleFunctionDescriptorImpl]

'path' @ [98:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest[ValueParameterDescriptorImpl]

'file' @ [99:28] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [99:33] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'with' @ [103:28] ==> @InlineOnly public inline fun <T, R> with(receiver: IntroduceParameterDescriptor, block: IntroduceParameterDescriptor.() -> IntroduceParameterDescriptor): IntroduceParameterDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntroduceParameterDescriptor
    <R> -> IntroduceParameterDescriptor

'descriptor' @ [103:34] ==> value-parameter descriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>.HelperImpl.configure[ValueParameterDescriptorImpl]

'isDirectiveDefined' @ [104:67] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [104:86] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>[LocalVariableDescriptor]

'?:' @ [105:48] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'getPrefixedBoolean' @ [105:70] ==> @Nullable public open fun getPrefixedBoolean(p0: (String..String?), p1: (String..String?)): Boolean? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [105:89] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>[LocalVariableDescriptor]

'copy' @ [107:25] ==> public final fun copy(originalRange: KotlinPsiRange = ..., callable: KtNamedDeclaration = ..., callableDescriptor: FunctionDescriptor = ..., newParameterName: String = ..., newParameterTypeText: String = ..., argumentValue: KtExpression = ..., withDefaultValue: Boolean = ..., parametersUsages: MultiMap<KtElement, KtElement> = ..., occurrencesToReplace: List<KotlinPsiRange> = ..., parametersToRemove: List<KtElement> = ..., occurrenceReplacer: IntroduceParameterDescriptor.(KotlinPsiRange) -> Unit = ...): IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'if (singleReplace) Collections.singletonList(originalOccurrence) else occurrencesToReplace' @ [107:53] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<KotlinPsiRange>, elseBranch: List<KotlinPsiRange>): List<KotlinPsiRange>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<KotlinPsiRange>

'singleReplace' @ [107:57] ==> val singleReplace: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>.HelperImpl.configure.<anonymous>[LocalVariableDescriptor]

'singletonList' @ [107:84] ==> public open fun <T : (Any..Any?)> singletonList(p0: (KotlinPsiRange..KotlinPsiRange?)): (MutableList<(KotlinPsiRange..KotlinPsiRange?)>..List<(KotlinPsiRange..KotlinPsiRange?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinPsiRange

'originalOccurrence' @ [107:98] ==> public final val originalOccurrence: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[DeserializedPropertyDescriptor]

'occurrencesToReplace' @ [107:123] ==> public final val occurrencesToReplace: List<KotlinPsiRange> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[DeserializedPropertyDescriptor]

'withDefaultValue' @ [108:49] ==> val withDefaultValue: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>.HelperImpl.configure.<anonymous>[LocalVariableDescriptor]

'HelperImpl' @ [113:37] ==> public constructor HelperImpl() defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>.HelperImpl[ClassConstructorDescriptorImpl]

'with' @ [115:28] ==> @InlineOnly public inline fun <T, R> with(receiver: ExtractableCodeDescriptor, block: ExtractableCodeDescriptor.() -> ExtractableCodeDescriptor): ExtractableCodeDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtractableCodeDescriptor
    <R> -> ExtractableCodeDescriptor

'descriptor' @ [115:33] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>.LambdaHelperImpl.configureExtractLambda[ValueParameterDescriptorImpl]

'if (name.isNullOrEmpty()) copy(suggestedNames = listOf("__dummyTestFun__")) else this' @ [116:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ExtractableCodeDescriptor, elseBranch: ExtractableCodeDescriptor): ExtractableCodeDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExtractableCodeDescriptor

'name' @ [116:29] ==> public final val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[DeserializedPropertyDescriptor]

'isNullOrEmpty' @ [116:34] ==> @InlineOnly public inline fun CharSequence?.isNullOrEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'copy' @ [116:51] ==> public final fun copy(extractionData: ExtractionData = ..., originalContext: BindingContext = ..., suggestedNames: List<String> = ..., visibility: String = ..., parameters: List<Parameter> = ..., receiverParameter: Parameter? = ..., typeParameters: List<TypeParameter> = ..., replacementMap: MultiMap<KtSimpleNameExpression, Replacement> = ..., controlFlow: ControlFlow = ..., returnType: KotlinType = ..., modifiers: List<KtKeywordToken> = ...): ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[DeserializedSimpleFunctionDescriptor]

'listOf' @ [116:73] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'this' @ [116:106] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>.LambdaHelperImpl.configureExtractLambda.<anonymous>[ReceiverParameterDescriptorImpl]

'if (asLambda) {
                KotlinIntroduceLambdaParameterHandler(LambdaHelperImpl())
            } else {
                KotlinIntroduceParameterHandler(HelperImpl())
            }' @ [121:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinIntroduceParameterHandler, elseBranch: KotlinIntroduceParameterHandler): KotlinIntroduceParameterHandler[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinIntroduceParameterHandler

'asLambda' @ [121:31] ==> value-parameter asLambda: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest[ValueParameterDescriptorImpl]

'KotlinIntroduceLambdaParameterHandler' @ [122:17] ==> public constructor KotlinIntroduceLambdaParameterHandler(helper: KotlinIntroduceLambdaParameterHelper = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler[DeserializedClassConstructorDescriptor]

'LambdaHelperImpl' @ [122:55] ==> public constructor LambdaHelperImpl() defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>.LambdaHelperImpl[ClassConstructorDescriptorImpl]

'KotlinIntroduceParameterHandler' @ [124:17] ==> public constructor KotlinIntroduceParameterHandler(helper: KotlinIntroduceParameterHelper = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler[DeserializedClassConstructorDescriptor]

'HelperImpl' @ [124:49] ==> public constructor HelperImpl() defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>.HelperImpl[ClassConstructorDescriptorImpl]

'with' @ [126:13] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinIntroduceParameterHandler, block: KotlinIntroduceParameterHandler.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinIntroduceParameterHandler
    <R> -> Unit

'handler' @ [126:19] ==> val handler: KotlinIntroduceParameterHandler defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>[LocalVariableDescriptor]

'file' @ [127:31] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>[ValueParameterDescriptorImpl]

'findElementByCommentPrefix' @ [127:47] ==> public fun PsiFile.findElementByCommentPrefix(commentText: String): PsiElement? defined in org.jetbrains.kotlin.test.util[DeserializedSimpleFunctionDescriptor]

'if (target != null) {
                    selectElement(fixture.editor, file, true, listOf(CodeInsightUtils.ElementKind.EXPRESSION)) { element ->
                        invoke(fixture.project, fixture.editor, element as KtExpression, target)
                    }
                }
                else {
                    invoke(fixture.project, fixture.editor, file, null)
                }' @ [128:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'target' @ [128:21] ==> val target: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'selectElement' @ [129:21] ==> public fun selectElement(editor: Editor, file: KtFile, failOnEmptySuggestion: Boolean, elementKinds: Collection<CodeInsightUtils.ElementKind>, callback: (PsiElement?) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring[DeserializedSimpleFunctionDescriptor]

'fixture' @ [129:35] ==> public final val fixture: JavaCodeInsightTestFixture defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[PropertyDescriptorImpl]

'editor' @ [129:43] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'file' @ [129:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [129:63] ==> public fun <T> listOf(element: CodeInsightUtils.ElementKind): List<CodeInsightUtils.ElementKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementKind

'EXPRESSION' @ [129:99] ==> enum entry EXPRESSION defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils.ElementKind[FakeCallableDescriptorForObject]

'invoke' @ [130:25] ==> public open fun invoke(project: Project, editor: Editor, expression: KtExpression, targetParent: KtNamedDeclaration): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler[DeserializedSimpleFunctionDescriptor]

'fixture' @ [130:32] ==> public final val fixture: JavaCodeInsightTestFixture defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[PropertyDescriptorImpl]

'project' @ [130:40] ==> public final val JavaCodeInsightTestFixture.project: (Project..Project?)[MyPropertyDescriptor]

'fixture' @ [130:49] ==> public final val fixture: JavaCodeInsightTestFixture defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[PropertyDescriptorImpl]

'editor' @ [130:57] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'element' @ [130:65] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'target' @ [130:90] ==> val target: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'invoke' @ [134:21] ==> public open fun invoke(project: Project, editor: Editor, file: PsiFile, dataContext: DataContext?): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler[DeserializedSimpleFunctionDescriptor]

'fixture' @ [134:28] ==> public final val fixture: JavaCodeInsightTestFixture defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[PropertyDescriptorImpl]

'project' @ [134:36] ==> public final val JavaCodeInsightTestFixture.project: (Project..Project?)[MyPropertyDescriptor]

'fixture' @ [134:45] ==> public final val fixture: JavaCodeInsightTestFixture defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[PropertyDescriptorImpl]

'editor' @ [134:53] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'file' @ [134:61] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceParameterTest.<anonymous>[ValueParameterDescriptorImpl]

'doIntroduceParameterTest' @ [141:9] ==> private final fun doIntroduceParameterTest(path: String, asLambda: Boolean): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[SimpleFunctionDescriptorImpl]

'path' @ [141:34] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceSimpleParameterTest[ValueParameterDescriptorImpl]

'doIntroduceParameterTest' @ [145:9] ==> private final fun doIntroduceParameterTest(path: String, asLambda: Boolean): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[SimpleFunctionDescriptorImpl]

'path' @ [145:34] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceLambdaParameterTest[ValueParameterDescriptorImpl]

'doTest' @ [150:9] ==> protected final fun doTest(path: String, checkAdditionalAfterdata: Boolean = ..., action: (PsiFile) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[SimpleFunctionDescriptorImpl]

'path' @ [150:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest[ValueParameterDescriptorImpl]

'file' @ [151:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[ValueParameterDescriptorImpl]

'processElementToWorkOn' @ [154:29] ==> public open fun processElementToWorkOn(p0: (Editor..Editor?), p1: (PsiFile..PsiFile?), p2: (String..String?), p3: (String..String?), p4: (Project..Project?), p5: (ElementToWorkOn.ElementsProcessor<(ElementToWorkOn..ElementToWorkOn?)>..ElementToWorkOn.ElementsProcessor<(ElementToWorkOn..ElementToWorkOn?)>?)): Unit defined in com.intellij.refactoring.introduceField.ElementToWorkOn[JavaMethodDescriptor]

'editor' @ [155:21] ==> public final val AbstractExtractionTest.editor: Editor[MyPropertyDescriptor]

'file' @ [156:21] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [159:21] ==> public final val AbstractExtractionTest.project: Project[MyPropertyDescriptor]

'e' @ [166:33] ==> value-parameter e: ElementToWorkOn? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>.<no name provided>.pass[ValueParameterDescriptorImpl]

'elementToWorkOn' @ [167:33] ==> var elementToWorkOn: ElementToWorkOn? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'e' @ [167:51] ==> value-parameter e: ElementToWorkOn? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>.<no name provided>.pass[ValueParameterDescriptorImpl]

'elementToWorkOn' @ [172:24] ==> var elementToWorkOn: ElementToWorkOn? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'expression' @ [172:42] ==> public final val ElementToWorkOn.expression: (PsiExpression..PsiExpression?)[MyPropertyDescriptor]

'elementToWorkOn' @ [173:28] ==> var elementToWorkOn: ElementToWorkOn? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'localVariable' @ [173:46] ==> public final val ElementToWorkOn.localVariable: (PsiLocalVariable..PsiLocalVariable?)[MyPropertyDescriptor]

'expr' @ [175:27] ==> val expr: (PsiExpression..PsiExpression?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'localVar' @ [175:35] ==> val localVar: (PsiLocalVariable..PsiLocalVariable?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'?:' @ [176:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiMethod?, right: PsiMethod): PsiMethod[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiMethod

'getContainingMethod' @ [176:31] ==> public open fun getContainingMethod(p0: (PsiElement..PsiElement?)): (PsiMethod..PsiMethod?) defined in com.intellij.refactoring.introduceParameter.Util[JavaMethodDescriptor]

'context' @ [176:51] ==> val context: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'AssertionError' @ [176:69] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'isDirectiveDefined' @ [178:54] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'file' @ [178:73] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[ValueParameterDescriptorImpl]

'getText' @ [178:78] ==> @NonNls @Contract public abstract fun getText(): (String..String?) defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'if (applyToSuper) method.findDeepestSuperMethods()[0] else method' @ [179:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiMethod..PsiMethod?), elseBranch: (PsiMethod..PsiMethod?)): (PsiMethod..PsiMethod?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'applyToSuper' @ [179:41] ==> val applyToSuper: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'method' @ [179:55] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'findDeepestSuperMethods' @ [179:62] ==> @NotNull public abstract fun findDeepestSuperMethods(): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'method' @ [179:96] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'component1' @ [181:18] ==> public final operator fun component1(): PsiExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [181:31] ==> public final operator fun component2(): (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'if (expr == null) {
                        localVar.initializer!! to CodeInsightUtil.findReferenceExpressions(method, localVar)
                    }
                    else {
                        expr to ExpressionOccurrenceManager(expr, method, null).findExpressionOccurrences()
                    }' @ [182:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<PsiExpression, (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>)>, elseBranch: Pair<PsiExpression, (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>)>): Pair<PsiExpression, (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<PsiExpression, (kotlin.Array<(com.intellij.psi.PsiExpression..com.intellij.psi.PsiExpression?)>..kotlin.Array<out (com.intellij.psi.PsiExpression..com.intellij.psi.PsiExpression?)>)>

'expr' @ [182:25] ==> val expr: (PsiExpression..PsiExpression?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'localVar' @ [183:25] ==> val localVar: (PsiLocalVariable..PsiLocalVariable?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'initializer' @ [183:34] ==> public final var PsiLocalVariable.initializer: PsiExpression?[MyPropertyDescriptor]

'findReferenceExpressions' @ [183:67] ==> @NotNull public open fun findReferenceExpressions(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>) defined in com.intellij.codeInsight.CodeInsightUtil[JavaMethodDescriptor]

'method' @ [183:92] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'localVar' @ [183:100] ==> val localVar: (PsiLocalVariable..PsiLocalVariable?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'expr' @ [186:25] ==> val expr: (PsiExpression..PsiExpression?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'ExpressionOccurrenceManager' @ [186:33] ==> public constructor ExpressionOccurrenceManager(p0: (PsiExpression..PsiExpression?), p1: (PsiElement..PsiElement?), p2: (OccurrenceFilter..OccurrenceFilter?)) defined in com.intellij.refactoring.util.occurrences.ExpressionOccurrenceManager[JavaClassConstructorDescriptor]

'expr' @ [186:61] ==> val expr: (PsiExpression..PsiExpression?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'method' @ [186:67] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'findExpressionOccurrences' @ [186:81] ==> public open fun findExpressionOccurrences(): (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>?) defined in com.intellij.refactoring.util.occurrences.ExpressionOccurrenceManager[JavaMethodDescriptor]

'initializer' @ [188:24] ==> val initializer: PsiExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'type' @ [188:36] ==> public final val PsiExpression.type: PsiType?[MyPropertyDescriptor]

'findParametersToRemove' @ [190:43] ==> @NotNull public open fun findParametersToRemove(@NotNull p0: PsiMethod, @NotNull p1: PsiExpression, @Nullable p2: (Array<(PsiExpression..PsiExpression?)>?..Array<out (PsiExpression..PsiExpression?)>?)): TIntArrayList defined in com.intellij.refactoring.introduceParameter.Util[JavaMethodDescriptor]

'method' @ [190:66] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'initializer' @ [190:74] ==> val initializer: PsiExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'occurrences' @ [190:87] ==> val occurrences: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'getInstance' @ [192:57] ==> public open fun getInstance(p0: (Project..Project?)): (JavaCodeStyleManager..JavaCodeStyleManager?) defined in com.intellij.psi.codeStyle.JavaCodeStyleManager[JavaMethodDescriptor]

'project' @ [192:69] ==> public final val AbstractExtractionTest.project: Project[MyPropertyDescriptor]

'codeStyleManager' @ [193:24] ==> val codeStyleManager: (JavaCodeStyleManager..JavaCodeStyleManager?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'suggestUniqueVariableName' @ [193:41] ==> @NotNull public open fun suggestUniqueVariableName(@NotNull p0: SuggestedNameInfo, p1: (PsiElement..PsiElement?), p2: Boolean): SuggestedNameInfo defined in com.intellij.psi.codeStyle.JavaCodeStyleManager[JavaMethodDescriptor]

'codeStyleManager' @ [194:21] ==> val codeStyleManager: (JavaCodeStyleManager..JavaCodeStyleManager?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'suggestVariableName' @ [194:38] ==> public open fun suggestVariableName(@NotNull p0: VariableKind, @Nullable p1: String?, @Nullable p2: PsiExpression?, @Nullable p3: PsiType?): (SuggestedNameInfo..SuggestedNameInfo?) defined in com.intellij.psi.codeStyle.JavaCodeStyleManager[JavaMethodDescriptor]

'PARAMETER' @ [194:71] ==> enum entry PARAMETER defined in com.intellij.psi.codeStyle.VariableKind[FakeCallableDescriptorForObject]

'localVar' @ [194:82] ==> val localVar: (PsiLocalVariable..PsiLocalVariable?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'name' @ [194:92] ==> public final val PsiLocalVariable.name: String?[MyPropertyDescriptor]

'initializer' @ [194:98] ==> val initializer: PsiExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'type' @ [194:111] ==> val type: PsiType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'expr' @ [195:21] ==> val expr: (PsiExpression..PsiExpression?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'appendUnresolvedExprName' @ [198:64] ==> public open fun appendUnresolvedExprName(p0: (Array<(String..String?)>..Array<out (String..String?)>?), p1: (PsiExpression..PsiExpression?)): (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.intellij.refactoring.introduceParameter.AbstractJavaInplaceIntroducer[JavaMethodDescriptor]

'completeVariableNameForRefactoring' @ [199:40] ==> public open fun completeVariableNameForRefactoring(p0: (JavaCodeStyleManager..JavaCodeStyleManager?), @Nullable p1: PsiType?, p2: (VariableKind..VariableKind?), p3: (SuggestedNameInfo..SuggestedNameInfo?)): (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.intellij.codeInsight.completion.JavaCompletionUtil[JavaMethodDescriptor]

'codeStyleManager' @ [199:75] ==> val codeStyleManager: (JavaCodeStyleManager..JavaCodeStyleManager?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'type' @ [199:93] ==> val type: PsiType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'LOCAL_VARIABLE' @ [199:112] ==> enum entry LOCAL_VARIABLE defined in com.intellij.psi.codeStyle.VariableKind[FakeCallableDescriptorForObject]

'info' @ [199:128] ==> val info: SuggestedNameInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'initializer' @ [200:21] ==> val initializer: PsiExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'IntroduceParameterProcessor' @ [203:13] ==> public constructor IntroduceParameterProcessor(@NotNull p0: Project, p1: (PsiMethod..PsiMethod?), @NotNull p2: PsiMethod, p3: (PsiExpression..PsiExpression?), p4: (PsiExpression..PsiExpression?), p5: (PsiLocalVariable..PsiLocalVariable?), p6: Boolean, p7: (String..String?), p8: Boolean, p9: Int, p10: Boolean, p11: Boolean, p12: (PsiType..PsiType?), @NotNull p13: TIntArrayList) defined in com.intellij.refactoring.introduceParameter.IntroduceParameterProcessor[JavaClassConstructorDescriptor]

'project' @ [203:41] ==> public final val AbstractExtractionTest.project: Project[MyPropertyDescriptor]

'method' @ [204:41] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'methodToSearchFor' @ [205:41] ==> val methodToSearchFor: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'initializer' @ [206:41] ==> val initializer: PsiExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'expr' @ [207:41] ==> val expr: (PsiExpression..PsiExpression?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'localVar' @ [208:41] ==> val localVar: (PsiLocalVariable..PsiLocalVariable?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'suggestedNames' @ [210:41] ==> val suggestedNames: (Array<(String..String?)>..Array<out (String..String?)>?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'first' @ [210:56] ==> public fun <T> Array<out (String..String?)>.first(): (String..String?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'REPLACE_FIELDS_WITH_GETTERS_NONE' @ [212:71] ==> public const final val REPLACE_FIELDS_WITH_GETTERS_NONE: Int defined in com.intellij.refactoring.IntroduceParameterRefactoring[JavaPropertyDescriptor]

'parametersToRemove' @ [216:41] ==> val parametersToRemove: TIntArrayList defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceJavaParameterTest.<anonymous>[LocalVariableDescriptor]

'run' @ [216:61] ==> public final fun run(): Unit defined in com.intellij.refactoring.introduceParameter.IntroduceParameterProcessor[JavaMethodDescriptor]

'editor' @ [218:13] ==> public final val AbstractExtractionTest.editor: Editor[MyPropertyDescriptor]

'selectionModel' @ [218:20] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'removeSelection' @ [218:35] ==> public abstract fun removeSelection(): Unit defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'doTest' @ [223:9] ==> protected final fun doTest(path: String, checkAdditionalAfterdata: Boolean = ..., action: (PsiFile) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[SimpleFunctionDescriptorImpl]

'path' @ [223:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest[ValueParameterDescriptorImpl]

'file' @ [224:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>[ValueParameterDescriptorImpl]

'propertyTargets' @ [226:36] ==> public val propertyTargets: List<ExtractionTarget> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine[DeserializedPropertyDescriptor]

'single' @ [226:52] ==> public inline fun <T> Iterable<ExtractionTarget>.single(predicate: (ExtractionTarget) -> Boolean): ExtractionTarget defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtractionTarget

'it' @ [227:17] ==> value-parameter it: ExtractionTarget defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'targetName' @ [227:20] ==> public final val targetName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[DeserializedPropertyDescriptor]

'findStringWithPrefixes' @ [227:56] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'file' @ [227:79] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>[ValueParameterDescriptorImpl]

'getText' @ [227:84] ==> @NonNls @Contract public abstract fun getText(): (String..String?) defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'file' @ [229:43] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>[ValueParameterDescriptorImpl]

'findElementByCommentPrefix' @ [229:48] ==> public fun PsiFile.findElementByCommentPrefix(commentText: String): PsiElement? defined in org.jetbrains.kotlin.test.util[DeserializedSimpleFunctionDescriptor]

'ExtractionEngineHelper' @ [230:35] ==> public constructor ExtractionEngineHelper(operationName: String) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngineHelper[DeserializedClassConstructorDescriptor]

'INTRODUCE_PROPERTY' @ [230:58] ==> public val INTRODUCE_PROPERTY: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty[DeserializedPropertyDescriptor]

'descriptor' @ [231:80] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>.<no name provided>.validate[ValueParameterDescriptorImpl]

'validate' @ [231:91] ==> @JvmOverloads public fun ExtractableCodeDescriptor.validate(target: ExtractionTarget = ...): ExtractableCodeDescriptorWithConflicts defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine[DeserializedSimpleFunctionDescriptor]

'extractionTarget' @ [231:100] ==> val extractionTarget: ExtractionTarget defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>[LocalVariableDescriptor]

'doRefactor' @ [239:21] ==> public final fun doRefactor(config: ExtractionGeneratorConfiguration, onFinish: (ExtractionResult) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>.<no name provided>[DeserializedSimpleFunctionDescriptor]

'ExtractionGeneratorConfiguration' @ [240:29] ==> public constructor ExtractionGeneratorConfiguration(descriptor: ExtractableCodeDescriptor, generatorOptions: ExtractionGeneratorOptions) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorConfiguration[DeserializedClassConstructorDescriptor]

'descriptorWithConflicts' @ [241:37] ==> value-parameter descriptorWithConflicts: ExtractableCodeDescriptorWithConflicts defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>.<no name provided>.configureAndRun[ValueParameterDescriptorImpl]

'descriptor' @ [241:61] ==> public final val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptorWithConflicts[DeserializedPropertyDescriptor]

'ExtractionGeneratorOptions' @ [242:37] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorOptions[FakeCallableDescriptorForObject]

'DEFAULT' @ [242:64] ==> @field:JvmField public final val DEFAULT: ExtractionGeneratorOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorOptions.Companion[DeserializedPropertyDescriptor]

'copy' @ [242:72] ==> public final fun copy(inTempFile: Boolean = ..., target: ExtractionTarget = ..., dummyName: String? = ..., allowExpressionBody: Boolean = ..., delayInitialOccurrenceReplacement: Boolean = ...): ExtractionGeneratorOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorOptions[DeserializedSimpleFunctionDescriptor]

'extractionTarget' @ [242:86] ==> val extractionTarget: ExtractionTarget defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>[LocalVariableDescriptor]

'onFinish' @ [244:29] ==> value-parameter onFinish: (ExtractionResult) -> Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>.<no name provided>.configureAndRun[ValueParameterDescriptorImpl]

'KotlinIntroducePropertyHandler' @ [248:27] ==> public constructor KotlinIntroducePropertyHandler(helper: ExtractionEngineHelper = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler[DeserializedClassConstructorDescriptor]

'helper' @ [248:58] ==> val helper: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>[LocalVariableDescriptor]

'fixture' @ [249:26] ==> public final val fixture: JavaCodeInsightTestFixture defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[PropertyDescriptorImpl]

'editor' @ [249:34] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'handler' @ [250:13] ==> val handler: KotlinIntroducePropertyHandler defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>[LocalVariableDescriptor]

'selectElements' @ [250:21] ==> public final fun selectElements(editor: Editor, file: KtFile, continuation: (elements: List<PsiElement>, targetSibling: PsiElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler[DeserializedSimpleFunctionDescriptor]

'editor' @ [250:36] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>[LocalVariableDescriptor]

'file' @ [250:44] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>[ValueParameterDescriptorImpl]

'handler' @ [251:17] ==> val handler: KotlinIntroducePropertyHandler defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>[LocalVariableDescriptor]

'doInvoke' @ [251:25] ==> public final fun doInvoke(project: Project, editor: Editor, file: KtFile, elements: List<PsiElement>, targetSibling: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler[DeserializedSimpleFunctionDescriptor]

'project' @ [251:34] ==> public final val AbstractExtractionTest.project: Project[MyPropertyDescriptor]

'editor' @ [251:43] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>[LocalVariableDescriptor]

'file' @ [251:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>[ValueParameterDescriptorImpl]

'elements' @ [251:57] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'explicitPreviousSibling' @ [251:67] ==> val explicitPreviousSibling: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>[LocalVariableDescriptor]

'previousSibling' @ [251:94] ==> value-parameter previousSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroducePropertyTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'doTest' @ [257:9] ==> protected final fun doTest(path: String, checkAdditionalAfterdata: Boolean = ..., action: (PsiFile) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[SimpleFunctionDescriptorImpl]

'path' @ [257:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractFunctionTest[ValueParameterDescriptorImpl]

'doExtractFunction' @ [257:32] ==> public fun doExtractFunction(fixture: CodeInsightTestFixture, file: KtFile): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file AbstractExtractionTest.kt[SimpleFunctionDescriptorImpl]

'myFixture' @ [257:50] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[JavaPropertyDescriptor]

'file' @ [257:61] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractFunctionTest.<anonymous>[ValueParameterDescriptorImpl]

'doTest' @ [261:9] ==> protected final fun doTest(path: String, checkAdditionalAfterdata: Boolean = ..., action: (PsiFile) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[SimpleFunctionDescriptorImpl]

'path' @ [261:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeParameterTest[ValueParameterDescriptorImpl]

'file' @ [262:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeParameterTest.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [264:43] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeParameterTest.<anonymous>[ValueParameterDescriptorImpl]

'findElementByCommentPrefix' @ [264:48] ==> public fun PsiFile.findElementByCommentPrefix(commentText: String): PsiElement? defined in org.jetbrains.kotlin.test.util[DeserializedSimpleFunctionDescriptor]

'fixture' @ [265:26] ==> public final val fixture: JavaCodeInsightTestFixture defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[PropertyDescriptorImpl]

'editor' @ [265:34] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'KotlinIntroduceTypeParameterHandler' @ [266:13] ==> public object KotlinIntroduceTypeParameterHandler : RefactoringActionHandler defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter[FakeCallableDescriptorForObject]

'selectElements' @ [266:49] ==> public final fun selectElements(editor: Editor, file: KtFile, continuation: (elements: List<PsiElement>, targetParent: PsiElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler[DeserializedSimpleFunctionDescriptor]

'editor' @ [266:64] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeParameterTest.<anonymous>[LocalVariableDescriptor]

'file' @ [266:72] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeParameterTest.<anonymous>[ValueParameterDescriptorImpl]

'KotlinIntroduceTypeParameterHandler' @ [267:17] ==> public object KotlinIntroduceTypeParameterHandler : RefactoringActionHandler defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter[FakeCallableDescriptorForObject]

'doInvoke' @ [267:53] ==> public final fun doInvoke(project: Project, editor: Editor, elements: List<PsiElement>, targetParent: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler[DeserializedSimpleFunctionDescriptor]

'project' @ [267:62] ==> public final val AbstractExtractionTest.project: Project[MyPropertyDescriptor]

'editor' @ [267:71] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeParameterTest.<anonymous>[LocalVariableDescriptor]

'elements' @ [267:79] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeParameterTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'explicitPreviousSibling' @ [267:89] ==> val explicitPreviousSibling: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeParameterTest.<anonymous>[LocalVariableDescriptor]

'previousSibling' @ [267:116] ==> value-parameter previousSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeParameterTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'doTest' @ [273:9] ==> protected final fun doTest(path: String, checkAdditionalAfterdata: Boolean = ..., action: (PsiFile) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[SimpleFunctionDescriptorImpl]

'path' @ [273:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest[ValueParameterDescriptorImpl]

'file' @ [274:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [276:43] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>[ValueParameterDescriptorImpl]

'findElementByCommentPrefix' @ [276:48] ==> public fun PsiFile.findElementByCommentPrefix(commentText: String): PsiElement? defined in org.jetbrains.kotlin.test.util[DeserializedSimpleFunctionDescriptor]

'file' @ [277:28] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [277:33] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'findStringWithPrefixes' @ [278:51] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [278:74] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>[LocalVariableDescriptor]

'findStringWithPrefixes' @ [279:57] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [279:80] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>[LocalVariableDescriptor]

'let' @ [279:109] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> KtModifierKeywordToken): KtModifierKeywordToken defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> KtModifierKeywordToken

'KtPsiFactory' @ [280:17] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [280:30] ==> public final val AbstractExtractionTest.project: Project[MyPropertyDescriptor]

'createModifierList' @ [280:39] ==> public final fun createModifierList(text: String): KtModifierList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'it' @ [280:58] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'firstChild' @ [280:62] ==> public final val KtModifierList.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'node' @ [280:73] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [280:78] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'fixture' @ [282:26] ==> public final val fixture: JavaCodeInsightTestFixture defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[PropertyDescriptorImpl]

'editor' @ [282:34] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'KotlinIntroduceTypeAliasHandler' @ [283:22] ==> public constructor KotlinIntroduceTypeAliasHandler() defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler[DeserializedClassConstructorDescriptor]

'super' @ [291:21] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'doInvoke' @ [291:27] ==> public open fun doInvoke(project: Project, editor: Editor, elements: List<PsiElement>, targetSibling: PsiElement, descriptorSubstitutor: ((IntroduceTypeAliasDescriptor) -> IntroduceTypeAliasDescriptor)? = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler[DeserializedSimpleFunctionDescriptor]

'project' @ [291:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>.<no name provided>.doInvoke[ValueParameterDescriptorImpl]

'editor' @ [291:45] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>.<no name provided>.doInvoke[ValueParameterDescriptorImpl]

'elements' @ [291:53] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>.<no name provided>.doInvoke[ValueParameterDescriptorImpl]

'explicitPreviousSibling' @ [291:63] ==> val explicitPreviousSibling: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>[LocalVariableDescriptor]

'targetSibling' @ [291:90] ==> value-parameter targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>.<no name provided>.doInvoke[ValueParameterDescriptorImpl]

'it' @ [292:25] ==> value-parameter it: IntroduceTypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>.<no name provided>.doInvoke.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [292:28] ==> public final fun copy(originalData: IntroduceTypeAliasData = ..., name: String = ..., visibility: KtModifierKeywordToken? = ..., typeParameters: List<TypeParameter> = ...): IntroduceTypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[DeserializedSimpleFunctionDescriptor]

'aliasName' @ [292:40] ==> val aliasName: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>[LocalVariableDescriptor]

'it' @ [292:53] ==> value-parameter it: IntroduceTypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>.<no name provided>.doInvoke.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [292:56] ==> public final val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[DeserializedPropertyDescriptor]

'aliasVisibility' @ [292:75] ==> val aliasVisibility: KtModifierKeywordToken? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>[LocalVariableDescriptor]

'it' @ [292:94] ==> value-parameter it: IntroduceTypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>.<no name provided>.doInvoke.<anonymous>[ValueParameterDescriptorImpl]

'visibility' @ [292:97] ==> public final val visibility: KtModifierKeywordToken? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[DeserializedPropertyDescriptor]

'invoke' @ [295:15] ==> public open fun invoke(project: Project, editor: Editor, file: PsiFile, dataContext: DataContext?): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>.<no name provided>[DeserializedSimpleFunctionDescriptor]

'project' @ [295:22] ==> public final val AbstractExtractionTest.project: Project[MyPropertyDescriptor]

'editor' @ [295:31] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>[LocalVariableDescriptor]

'file' @ [295:39] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doIntroduceTypeAliasTest.<anonymous>[ValueParameterDescriptorImpl]

'doTest' @ [300:9] ==> protected final fun doTest(path: String, checkAdditionalAfterdata: Boolean = ..., action: (PsiFile) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[SimpleFunctionDescriptorImpl]

'path' @ [300:16] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest[ValueParameterDescriptorImpl]

'file' @ [301:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[ValueParameterDescriptorImpl]

'markMembersInfo' @ [303:13] ==> internal fun markMembersInfo(file: PsiFile): Unit defined in org.jetbrains.kotlin.idea.refactoring in file AbstractMemberPullPushTest.kt[SimpleFunctionDescriptorImpl]

'file' @ [303:29] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [305:32] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[ValueParameterDescriptorImpl]

'findElementByCommentPrefix' @ [305:37] ==> public fun PsiFile.findElementByCommentPrefix(commentText: String): PsiElement? defined in org.jetbrains.kotlin.test.util[DeserializedSimpleFunctionDescriptor]

'parent' @ [305:80] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'file' @ [305:90] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [305:95] ==> public final val KtFile.parent: PsiDirectory?[MyPropertyDescriptor]

'file' @ [306:28] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [306:33] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'!!' @ [307:29] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'findStringWithPrefixes' @ [307:51] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [307:74] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[LocalVariableDescriptor]

'fixture' @ [308:26] ==> public final val fixture: JavaCodeInsightTestFixture defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[PropertyDescriptorImpl]

'editor' @ [308:34] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'file' @ [309:33] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[ValueParameterDescriptorImpl]

'findElementAt' @ [309:38] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'editor' @ [309:52] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[LocalVariableDescriptor]

'caretModel' @ [309:59] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [309:70] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'getStrictParentOfType' @ [309:79] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'chooseMembers' @ [310:31] ==> internal fun <T : MemberInfoBase<*>> chooseMembers(members: List<KotlinMemberInfo>): List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : MemberInfoBase<*>> -> KotlinMemberInfo

'extractClassMembers' @ [310:45] ==> public fun extractClassMembers(aClass: KtClassOrObject, collectSuperTypeEntries: Boolean = ..., filter: ((KtNamedDeclaration) -> Boolean)? = ...): List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo[DeserializedSimpleFunctionDescriptor]

'originalClass' @ [310:65] ==> val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[LocalVariableDescriptor]

'ExtractSuperRefactoring' @ [311:29] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[FakeCallableDescriptorForObject]

'collectConflicts' @ [311:53] ==> public final fun collectConflicts(originalClass: KtClassOrObject, memberInfos: List<KotlinMemberInfo>, targetParent: PsiElement, newClassName: String, isExtractInterface: Boolean): MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion[DeserializedSimpleFunctionDescriptor]

'originalClass' @ [311:70] ==> val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[LocalVariableDescriptor]

'memberInfos' @ [311:85] ==> val memberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[LocalVariableDescriptor]

'targetParent' @ [311:98] ==> val targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[LocalVariableDescriptor]

'className' @ [311:112] ==> val className: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[LocalVariableDescriptor]

'isInterface' @ [311:123] ==> value-parameter isInterface: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest[ValueParameterDescriptorImpl]

'project' @ [312:13] ==> public final val AbstractExtractionTest.project: Project[MyPropertyDescriptor]

'checkConflictsInteractively' @ [312:21] ==> public fun Project.checkConflictsInteractively(conflicts: MultiMap<PsiElement, String>, onShowConflicts: () -> Unit = ..., onAccept: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring[DeserializedSimpleFunctionDescriptor]

'conflicts' @ [312:49] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[LocalVariableDescriptor]

'ExtractSuperInfo' @ [313:35] ==> public constructor ExtractSuperInfo(originalClass: KtClassOrObject, memberInfos: Collection<KotlinMemberInfo>, targetParent: PsiElement, targetFileName: String, newClassName: String, isInterface: Boolean, docPolicy: DocCommentPolicy<*>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[DeserializedClassConstructorDescriptor]

'originalClass' @ [314:25] ==> val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[LocalVariableDescriptor]

'memberInfos' @ [315:25] ==> val memberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[LocalVariableDescriptor]

'targetParent' @ [316:25] ==> val targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[LocalVariableDescriptor]

'className' @ [317:27] ==> val className: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[LocalVariableDescriptor]

'EXTENSION' @ [317:54] ==> public const final val EXTENSION: String defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'className' @ [318:25] ==> val className: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>[LocalVariableDescriptor]

'isInterface' @ [319:25] ==> value-parameter isInterface: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest[ValueParameterDescriptorImpl]

'DocCommentPolicy' @ [320:25] ==> public constructor DocCommentPolicy<T : (PsiComment..PsiComment?)>(p0: Int) defined in com.intellij.refactoring.util.DocCommentPolicy[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiComment..PsiComment?)> -> PsiComment

'ASIS' @ [320:71] ==> public const final val ASIS: Int defined in com.intellij.refactoring.util.DocCommentPolicy[JavaPropertyDescriptor]

'ExtractSuperRefactoring' @ [322:17] ==> public constructor ExtractSuperRefactoring(extractInfo: ExtractSuperInfo) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[DeserializedClassConstructorDescriptor]

'extractInfo' @ [322:41] ==> val extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'performRefactoring' @ [322:54] ==> public final fun performRefactoring(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[DeserializedSimpleFunctionDescriptor]

'doExtractSuperTest' @ [327:59] ==> protected final fun doExtractSuperTest(path: String, isInterface: Boolean): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[SimpleFunctionDescriptorImpl]

'path' @ [327:78] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractSuperclassTest[ValueParameterDescriptorImpl]

'doExtractSuperTest' @ [329:58] ==> protected final fun doExtractSuperTest(path: String, isInterface: Boolean): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[SimpleFunctionDescriptorImpl]

'path' @ [329:77] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doExtractInterfaceTest[ValueParameterDescriptorImpl]

'File' @ [332:24] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [332:29] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest[ValueParameterDescriptorImpl]

'fixture' @ [334:9] ==> public final val fixture: JavaCodeInsightTestFixture defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[PropertyDescriptorImpl]

'testDataPath' @ [334:17] ==> public final var JavaCodeInsightTestFixture.testDataPath: String[MyPropertyDescriptor]

'getHomeDirectory' @ [334:51] ==> @NotNull public open fun getHomeDirectory(): String defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'mainFile' @ [334:73] ==> val mainFile: File defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest[LocalVariableDescriptor]

'parent' @ [334:82] ==> public final val File.parent: (String..String?)[MyPropertyDescriptor]

'mainFile' @ [336:28] ==> val mainFile: File defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest[LocalVariableDescriptor]

'name' @ [336:37] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'getNameWithoutExtension' @ [337:41] ==> @NotNull public open fun getNameWithoutExtension(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'mainFileName' @ [337:65] ==> val mainFileName: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest[LocalVariableDescriptor]

'mainFile' @ [338:26] ==> val mainFile: File defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest[LocalVariableDescriptor]

'parentFile' @ [338:35] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'listFiles' @ [338:46] ==> public final fun listFiles(p0: (((File..File?), (String..String?)) -> Boolean..(((File..File?), (String..String?)) -> Boolean)?)): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[MyFunctionDescriptor]

'name' @ [339:13] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'mainFileName' @ [339:21] ==> val mainFileName: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest[LocalVariableDescriptor]

'name' @ [339:37] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [339:42] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'mainFileBaseName' @ [339:55] ==> val mainFileBaseName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest[LocalVariableDescriptor]

'name' @ [339:79] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'endsWith' @ [339:84] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [339:103] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'endsWith' @ [339:108] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'extraFiles' @ [341:31] ==> val extraFiles: (Array<(File..File?)>..Array<out (File..File?)>?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest[LocalVariableDescriptor]

'associateBy' @ [341:42] ==> public inline fun <T, K> Array<out (File..File?)>.associateBy(keySelector: ((File..File?)) -> (PsiFile..PsiFile?)): Map<(PsiFile..PsiFile?), (File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)
    <K> -> (com.intellij.psi.PsiFile..com.intellij.psi.PsiFile?)

'fixture' @ [341:56] ==> public final val fixture: JavaCodeInsightTestFixture defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[PropertyDescriptorImpl]

'configureByFile' @ [341:64] ==> public abstract fun configureByFile(@NotNull p0: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'it' @ [341:80] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [341:83] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'fixture' @ [342:20] ==> public final val fixture: JavaCodeInsightTestFixture defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[PropertyDescriptorImpl]

'configureByFile' @ [342:28] ==> public abstract fun configureByFile(@NotNull p0: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'mainFileName' @ [342:44] ==> val mainFileName: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest[LocalVariableDescriptor]

'!=' @ [344:32] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'findStringWithPrefixes' @ [344:54] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'file' @ [344:77] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest[LocalVariableDescriptor]

'text' @ [344:82] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'addKotlinRuntime' @ [345:13] ==> val addKotlinRuntime: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest[LocalVariableDescriptor]

'ConfigLibraryUtil' @ [346:13] ==> public object ConfigLibraryUtil defined in org.jetbrains.kotlin.idea.test in file ConfigLibraryUtil.kt[FakeCallableDescriptorForObject]

'configureKotlinRuntimeAndSdk' @ [346:31] ==> public final fun configureKotlinRuntimeAndSdk(module: Module, sdk: Sdk): Unit defined in org.jetbrains.kotlin.idea.test.ConfigLibraryUtil[SimpleFunctionDescriptorImpl]

'myModule' @ [346:60] ==> protected/*protected and package*/ final var myModule: (Module..Module?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[JavaPropertyDescriptor]

'mockJdk' @ [346:89] ==> @NotNull public open fun mockJdk(): Sdk defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

'checkExtract' @ [350:13] ==> public fun checkExtract(files: ExtractTestFiles, checkAdditionalAfterdata: Boolean = ..., action: (PsiFile) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce[SimpleFunctionDescriptorImpl]

'ExtractTestFiles' @ [350:26] ==> public constructor ExtractTestFiles(path: String, mainFile: PsiFile, extraFilesToPsi: Map<PsiFile, File> = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractTestFiles[ClassConstructorDescriptorImpl]

'path' @ [350:43] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest[ValueParameterDescriptorImpl]

'file' @ [350:49] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest[LocalVariableDescriptor]

'extraFilesToPsi' @ [350:55] ==> val extraFilesToPsi: Map<(PsiFile..PsiFile?), (File..File?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest[LocalVariableDescriptor]

'checkAdditionalAfterdata' @ [350:73] ==> value-parameter checkAdditionalAfterdata: Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest[ValueParameterDescriptorImpl]

'action' @ [350:99] ==> value-parameter action: (PsiFile) -> Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest[ValueParameterDescriptorImpl]

'addKotlinRuntime' @ [353:17] ==> val addKotlinRuntime: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest.doTest[LocalVariableDescriptor]

'ConfigLibraryUtil' @ [354:17] ==> public object ConfigLibraryUtil defined in org.jetbrains.kotlin.idea.test in file ConfigLibraryUtil.kt[FakeCallableDescriptorForObject]

'unConfigureKotlinRuntimeAndSdk' @ [354:35] ==> public final fun unConfigureKotlinRuntimeAndSdk(module: Module, sdk: Sdk): Unit defined in org.jetbrains.kotlin.idea.test.ConfigLibraryUtil[SimpleFunctionDescriptorImpl]

'myModule' @ [354:66] ==> protected/*protected and package*/ final var myModule: (Module..Module?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractExtractionTest[JavaPropertyDescriptor]

'mockJdk' @ [354:95] ==> @NotNull public open fun mockJdk(): Sdk defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

'emptyMap' @ [364:51] ==> public fun <K, V> emptyMap(): Map<PsiFile, File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PsiFile
    <V> -> File

'emptyMap' @ [365:88] ==> public fun <K, V> emptyMap(): Map<PsiFile, File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PsiFile
    <V> -> File

'this' @ [366:13] ==> public constructor ExtractTestFiles(mainFile: PsiFile, afterFile: File, conflictFile: File, extraFilesToPsi: Map<PsiFile, File> = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractTestFiles[ClassConstructorDescriptorImpl]

'mainFile' @ [366:18] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractTestFiles.<init>[ValueParameterDescriptorImpl]

'File' @ [366:28] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [366:35] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractTestFiles.<init>[ValueParameterDescriptorImpl]

'File' @ [366:49] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [366:56] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractTestFiles.<init>[ValueParameterDescriptorImpl]

'extraFilesToPsi' @ [366:74] ==> value-parameter extraFilesToPsi: Map<PsiFile, File> = ... defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractTestFiles.<init>[ValueParameterDescriptorImpl]

'files' @ [370:24] ==> value-parameter files: ExtractTestFiles defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[ValueParameterDescriptorImpl]

'conflictFile' @ [370:30] ==> public final val conflictFile: File defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractTestFiles[PropertyDescriptorImpl]

'files' @ [371:21] ==> value-parameter files: ExtractTestFiles defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[ValueParameterDescriptorImpl]

'afterFile' @ [371:27] ==> public final val afterFile: File defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractTestFiles[PropertyDescriptorImpl]

'invoke' @ [374:9] ==> public abstract operator fun invoke(p1: PsiFile): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'files' @ [374:16] ==> value-parameter files: ExtractTestFiles defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[ValueParameterDescriptorImpl]

'mainFile' @ [374:22] ==> public final val mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractTestFiles[PropertyDescriptorImpl]

'assert' @ [376:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [376:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'conflictFile' @ [376:17] ==> val conflictFile: File defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[LocalVariableDescriptor]

'exists' @ [376:30] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'conflictFile' @ [376:58] ==> val conflictFile: File defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[LocalVariableDescriptor]

'assertEqualsToFile' @ [377:25] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'afterFile' @ [377:44] ==> val afterFile: File defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[LocalVariableDescriptor]

'files' @ [377:55] ==> value-parameter files: ExtractTestFiles defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[ValueParameterDescriptorImpl]

'mainFile' @ [377:61] ==> public final val mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractTestFiles[PropertyDescriptorImpl]

'text' @ [377:70] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'checkAdditionalAfterdata' @ [379:13] ==> value-parameter checkAdditionalAfterdata: Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[ValueParameterDescriptorImpl]

'component1' @ [380:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<PsiFile, File>.component1(): PsiFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PsiFile
    <V> -> File

'component2' @ [380:33] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<PsiFile, File>.component2(): File defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PsiFile
    <V> -> File

'files' @ [380:47] ==> value-parameter files: ExtractTestFiles defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[ValueParameterDescriptorImpl]

'extraFilesToPsi' @ [380:53] ==> public final val extraFilesToPsi: Map<PsiFile, File> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractTestFiles[PropertyDescriptorImpl]

'assertEqualsToFile' @ [381:33] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [381:52] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'extraFile' @ [381:60] ==> val extraFile: File defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[LocalVariableDescriptor]

'path' @ [381:70] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'extraPsiFile' @ [381:85] ==> val extraPsiFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[LocalVariableDescriptor]

'text' @ [381:98] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'e' @ [386:23] ==> val e: BaseRefactoringProcessor.ConflictsInTestsException defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[LocalVariableDescriptor]

'messages' @ [386:25] ==> public final val BaseRefactoringProcessor.ConflictsInTestsException.messages: (MutableCollection<(String..String?)>..Collection<(String..String?)>)[MyPropertyDescriptor]

'sorted' @ [386:34] ==> public fun <T : Comparable<(String..String?)>> Iterable<(String..String?)>.sorted(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> (kotlin.String..kotlin.String?)

'joinToString' @ [386:43] ==> public fun <T> Iterable<(String..String?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((String..String?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'replace' @ [386:61] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEqualsToFile' @ [387:25] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'conflictFile' @ [387:44] ==> val conflictFile: File defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[LocalVariableDescriptor]

'message' @ [387:58] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[LocalVariableDescriptor]

'assertEqualsToFile' @ [390:25] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'conflictFile' @ [390:44] ==> val conflictFile: File defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[LocalVariableDescriptor]

'e' @ [390:58] ==> val e: CommonRefactoringUtil.RefactoringErrorHintException defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[LocalVariableDescriptor]

'message' @ [390:60] ==> public open val message: String? defined in com.intellij.refactoring.util.CommonRefactoringUtil.RefactoringErrorHintException[DeserializedPropertyDescriptor]

'e' @ [393:13] ==> val e: RuntimeException /* = RuntimeException */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[LocalVariableDescriptor]

'java' @ [393:22] ==> public val <T> KClass<out RuntimeException /* = RuntimeException */>.java: Class<out RuntimeException /* = RuntimeException */> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> RuntimeException

'RuntimeException' @ [393:30] ==> public final fun <init>(): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'java' @ [393:54] ==> public val <T> KClass<RuntimeException /* = RuntimeException */>.java: Class<RuntimeException /* = RuntimeException */> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> RuntimeException

'e' @ [393:66] ==> val e: RuntimeException /* = RuntimeException */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[LocalVariableDescriptor]

'assertEqualsToFile' @ [394:25] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'conflictFile' @ [394:44] ==> val conflictFile: File defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[LocalVariableDescriptor]

'e' @ [394:58] ==> val e: RuntimeException /* = RuntimeException */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.checkExtract[LocalVariableDescriptor]

'message' @ [394:60] ==> public open val message: String? defined in java.lang.RuntimeException[DeserializedPropertyDescriptor]

'file' @ [399:35] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[ValueParameterDescriptorImpl]

'findElementByCommentPrefix' @ [399:40] ==> public fun PsiFile.findElementByCommentPrefix(commentText: String): PsiElement? defined in org.jetbrains.kotlin.test.util[DeserializedSimpleFunctionDescriptor]

'file' @ [400:20] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[ValueParameterDescriptorImpl]

'getText' @ [400:25] ==> public open fun getText(): (String..String?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'findListWithPrefixes' @ [401:47] ==> @NotNull public open fun findListWithPrefixes(@NotNull p0: String, @NotNull vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [401:68] ==> val fileText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'findListWithPrefixes' @ [402:53] ==> @NotNull public open fun findListWithPrefixes(@NotNull p0: String, @NotNull vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [402:74] ==> val fileText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'findLinesWithPrefixesRemoved' @ [404:35] ==> @NotNull public open fun findLinesWithPrefixesRemoved(p0: (String..String?), vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [404:64] ==> val fileText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'joinToString' @ [404:99] ==> public fun <T> Iterable<(String..String?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((String..String?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'findLinesWithPrefixesRemoved' @ [406:35] ==> @NotNull public open fun findLinesWithPrefixesRemoved(p0: (String..String?), vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [406:64] ==> val fileText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'map' @ [406:94] ==> public inline fun <T, R> Iterable<(String..String?)>.map(transform: ((String..String?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> String

'it' @ [406:103] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [406:110] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'findListWithPrefixes' @ [408:51] ==> @NotNull public open fun findListWithPrefixes(@NotNull p0: String, @NotNull vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [408:72] ==> val fileText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'let' @ [408:98] ==> @InlineOnly public inline fun <T, R> (MutableList<(String..String?)>..List<(String..String?)>).let(block: ((MutableList<(String..String?)>..List<(String..String?)>)) -> ExtractionOptions): ExtractionOptions defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableList<(kotlin.String..kotlin.String?)>..kotlin.collections.List<(kotlin.String..kotlin.String?)>)
    <R> -> ExtractionOptions

'if (it.isNotEmpty()) {
            @Suppress("UNCHECKED_CAST")
            val args = it.map { it.toBoolean() }.toTypedArray() as Array<Any?>
            ExtractionOptions::class.java.constructors.first { it.parameterTypes.size == args.size }.newInstance(*args) as ExtractionOptions
        } else ExtractionOptions.DEFAULT' @ [409:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ExtractionOptions, elseBranch: ExtractionOptions): ExtractionOptions[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExtractionOptions

'it' @ [409:13] ==> value-parameter it: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [409:16] ==> @InlineOnly public inline fun <T> Collection<(String..String?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'Suppress' @ [410:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'it' @ [411:24] ==> value-parameter it: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [411:27] ==> public inline fun <T, R> Iterable<(String..String?)>.map(transform: ((String..String?)) -> Boolean): List<Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> Boolean

'it' @ [411:33] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toBoolean' @ [411:36] ==> @InlineOnly public inline fun String.toBoolean(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toTypedArray' @ [411:50] ==> public inline fun <reified T> Collection<Boolean>.toTypedArray(): Array<Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Boolean

'ExtractionOptions' @ [412:13] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[FakeCallableDescriptorForObject]

'java' @ [412:38] ==> public val <T> KClass<ExtractionOptions>.java: Class<ExtractionOptions> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ExtractionOptions

'constructors' @ [412:43] ==> public final val <T : (Any..Any?)> Class<ExtractionOptions>.constructors: (Array<(Constructor<*>..Constructor<*>?)>..Array<out (Constructor<*>..Constructor<*>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ExtractionOptions

'first' @ [412:56] ==> public inline fun <T> Array<out (Constructor<*>..Constructor<*>?)>.first(predicate: ((Constructor<*>..Constructor<*>?)) -> Boolean): (Constructor<*>..Constructor<*>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Constructor<*>..java.lang.reflect.Constructor<*>?)

'it' @ [412:64] ==> value-parameter it: (Constructor<*>..Constructor<*>?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parameterTypes' @ [412:67] ==> public final val <T : (Any..Any?)> Constructor<out (Any..Any?)>.parameterTypes: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'size' @ [412:82] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'args' @ [412:90] ==> val args: Array<Any?> defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<anonymous>[LocalVariableDescriptor]

'size' @ [412:95] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'newInstance' @ [412:102] ==> @CallerSensitive public open fun newInstance(vararg p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Constructor[JavaMethodDescriptor]

'args' @ [412:115] ==> val args: Array<Any?> defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<anonymous>[LocalVariableDescriptor]

'ExtractionOptions' @ [413:16] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[FakeCallableDescriptorForObject]

'DEFAULT' @ [413:34] ==> public final val DEFAULT: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions.Companion[DeserializedPropertyDescriptor]

'DescriptorRenderer' @ [416:20] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [416:39] ==> @field:JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'fixture' @ [418:18] ==> value-parameter fixture: CodeInsightTestFixture defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[ValueParameterDescriptorImpl]

'editor' @ [418:26] ==> public final val CodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'ExtractKotlinFunctionHandler' @ [419:19] ==> public constructor ExtractKotlinFunctionHandler(allContainersEnabled: Boolean = ..., helper: ExtractionEngineHelper = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler[DeserializedClassConstructorDescriptor]

'ExtractionEngineHelper' @ [420:31] ==> public constructor ExtractionEngineHelper(operationName: String) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngineHelper[DeserializedClassConstructorDescriptor]

'EXTRACT_FUNCTION' @ [420:54] ==> public val EXTRACT_FUNCTION: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction[DeserializedPropertyDescriptor]

'data' @ [422:28] ==> value-parameter data: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.adjustExtractionData[ValueParameterDescriptorImpl]

'copy' @ [422:33] ==> public final fun copy(originalFile: KtFile = ..., originalRange: KotlinPsiRange = ..., targetSibling: PsiElement = ..., duplicateContainer: PsiElement? = ..., options: ExtractionOptions = ...): ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[DeserializedSimpleFunctionDescriptor]

'extractionOptions' @ [422:48] ==> val extractionOptions: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'descriptorWithConflicts' @ [431:38] ==> value-parameter descriptorWithConflicts: ExtractableCodeDescriptorWithConflicts defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[ValueParameterDescriptorImpl]

'descriptor' @ [431:62] ==> public final val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptorWithConflicts[DeserializedPropertyDescriptor]

'descriptor' @ [432:39] ==> val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[LocalVariableDescriptor]

'suggestedNames' @ [432:50] ==> public final val suggestedNames: List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[DeserializedPropertyDescriptor]

'descriptor' @ [433:45] ==> val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[LocalVariableDescriptor]

'controlFlow' @ [433:56] ==> public final val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[DeserializedPropertyDescriptor]

'possibleReturnTypes' @ [433:68] ==> public val ControlFlow.possibleReturnTypes: List<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine[DeserializedPropertyDescriptor]

'map' @ [433:88] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String

'IdeDescriptorRenderers' @ [434:25] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [434:48] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [434:60] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [434:71] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun.<anonymous>[ValueParameterDescriptorImpl]

'listOfNotNull' @ [436:41] ==> public fun <T : Any> listOfNotNull(element: Parameter?): List<Parameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Parameter

'descriptor' @ [436:55] ==> val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[LocalVariableDescriptor]

'receiverParameter' @ [436:66] ==> public final val receiverParameter: Parameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[DeserializedPropertyDescriptor]

'descriptor' @ [436:87] ==> val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[LocalVariableDescriptor]

'parameters' @ [436:98] ==> public final val parameters: List<Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[DeserializedPropertyDescriptor]

'allParameters' @ [437:45] ==> val allParameters: List<Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[LocalVariableDescriptor]

'map' @ [437:59] ==> public inline fun <T, R> Iterable<Parameter>.map(transform: (Parameter) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter
    <R> -> String

'renderer' @ [437:65] ==> val renderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'render' @ [437:74] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [437:81] ==> value-parameter it: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun.<anonymous>[ValueParameterDescriptorImpl]

'originalDescriptor' @ [437:84] ==> public abstract val originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Parameter[DeserializedPropertyDescriptor]

'joinToString' @ [437:106] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'allParameters' @ [438:39] ==> val allParameters: List<Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[LocalVariableDescriptor]

'map' @ [438:53] ==> public inline fun <T, R> Iterable<Parameter>.map(transform: (Parameter) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter
    <R> -> String

'it' @ [439:25] ==> value-parameter it: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun.<anonymous>[ValueParameterDescriptorImpl]

'getParameterTypeCandidates' @ [439:28] ==> public abstract fun getParameterTypeCandidates(allowSpecialClassNames: Boolean): List<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Parameter[DeserializedSimpleFunctionDescriptor]

'map' @ [439:62] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String

'renderer' @ [439:68] ==> val renderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'renderType' @ [439:77] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [439:88] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [439:94] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'joinToString' @ [440:23] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'actualNames' @ [442:25] ==> val actualNames: List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[LocalVariableDescriptor]

'size' @ [442:37] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'expectedNames' @ [442:50] ==> val expectedNames: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'isNotEmpty' @ [442:64] ==> @InlineOnly public inline fun <T> Collection<(String..String?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'assertEquals' @ [443:25] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (List<String>..List<(String..String?)>), actual: (List<String>..List<(String..String?)>), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (kotlin.collections.List<kotlin.String>..kotlin.collections.List<(kotlin.String..kotlin.String?)>)

'expectedNames' @ [443:38] ==> val expectedNames: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'actualNames' @ [443:53] ==> val actualNames: List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[LocalVariableDescriptor]

'actualReturnTypes' @ [445:25] ==> val actualReturnTypes: List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[LocalVariableDescriptor]

'size' @ [445:43] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'expectedReturnTypes' @ [445:56] ==> val expectedReturnTypes: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'isNotEmpty' @ [445:76] ==> @InlineOnly public inline fun <T> Collection<(String..String?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'assertEquals' @ [446:25] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (List<String>..List<(String..String?)>), actual: (List<String>..List<(String..String?)>), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (kotlin.collections.List<kotlin.String>..kotlin.collections.List<(kotlin.String..kotlin.String?)>)

'expectedReturnTypes' @ [446:38] ==> val expectedReturnTypes: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'actualReturnTypes' @ [446:59] ==> val actualReturnTypes: List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[LocalVariableDescriptor]

'assertEquals' @ [448:63] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCaseBase[JavaMethodDescriptor]

'expectedDescriptors' @ [448:110] ==> val expectedDescriptors: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'actualDescriptors' @ [448:131] ==> val actualDescriptors: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[LocalVariableDescriptor]

'assertEquals' @ [449:63] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCaseBase[JavaMethodDescriptor]

'expectedTypes' @ [449:104] ==> val expectedTypes: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'actualTypes' @ [449:119] ==> val actualTypes: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[LocalVariableDescriptor]

'if (descriptor.name == "") {
                        descriptor.copy(suggestedNames = Collections.singletonList("__dummyTestFun__"))
                    }
                    else {
                        descriptor
                    }' @ [451:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ExtractableCodeDescriptor, elseBranch: ExtractableCodeDescriptor): ExtractableCodeDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExtractableCodeDescriptor

'descriptor' @ [451:45] ==> val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[LocalVariableDescriptor]

'name' @ [451:56] ==> public final val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[DeserializedPropertyDescriptor]

'descriptor' @ [452:25] ==> val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[LocalVariableDescriptor]

'copy' @ [452:36] ==> public final fun copy(extractionData: ExtractionData = ..., originalContext: BindingContext = ..., suggestedNames: List<String> = ..., visibility: String = ..., parameters: List<Parameter> = ..., receiverParameter: Parameter? = ..., typeParameters: List<TypeParameter> = ..., replacementMap: MultiMap<KtSimpleNameExpression, Replacement> = ..., controlFlow: ControlFlow = ..., returnType: KotlinType = ..., modifiers: List<KtKeywordToken> = ...): ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[DeserializedSimpleFunctionDescriptor]

'singletonList' @ [452:70] ==> public open fun <T : (Any..Any?)> singletonList(p0: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'descriptor' @ [455:25] ==> val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[LocalVariableDescriptor]

'doRefactor' @ [458:21] ==> public final fun doRefactor(config: ExtractionGeneratorConfiguration, onFinish: (ExtractionResult) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>[DeserializedSimpleFunctionDescriptor]

'ExtractionGeneratorConfiguration' @ [458:32] ==> public constructor ExtractionGeneratorConfiguration(descriptor: ExtractableCodeDescriptor, generatorOptions: ExtractionGeneratorOptions) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorConfiguration[DeserializedClassConstructorDescriptor]

'newDescriptor' @ [458:65] ==> val newDescriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[LocalVariableDescriptor]

'ExtractionGeneratorOptions' @ [458:80] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorOptions[FakeCallableDescriptorForObject]

'DEFAULT' @ [458:107] ==> @field:JvmField public final val DEFAULT: ExtractionGeneratorOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorOptions.Companion[DeserializedPropertyDescriptor]

'onFinish' @ [458:117] ==> value-parameter onFinish: (ExtractionResult) -> Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<no name provided>.configureAndRun[ValueParameterDescriptorImpl]

'handler' @ [462:5] ==> val handler: ExtractKotlinFunctionHandler defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'selectElements' @ [462:13] ==> public final fun selectElements(editor: Editor, file: KtFile, continuation: (elements: List<PsiElement>, targetSibling: PsiElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler[DeserializedSimpleFunctionDescriptor]

'editor' @ [462:28] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'file' @ [462:36] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[ValueParameterDescriptorImpl]

'handler' @ [463:9] ==> val handler: ExtractKotlinFunctionHandler defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'doInvoke' @ [463:17] ==> public final fun doInvoke(editor: Editor, file: KtFile, elements: List<PsiElement>, targetSibling: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler[DeserializedSimpleFunctionDescriptor]

'editor' @ [463:26] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'file' @ [463:34] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[ValueParameterDescriptorImpl]

'elements' @ [463:40] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<anonymous>[ValueParameterDescriptorImpl]

'explicitPreviousSibling' @ [463:50] ==> val explicitPreviousSibling: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction[LocalVariableDescriptor]

'previousSibling' @ [463:77] ==> value-parameter previousSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.doExtractFunction.<anonymous>[ValueParameterDescriptorImpl]

