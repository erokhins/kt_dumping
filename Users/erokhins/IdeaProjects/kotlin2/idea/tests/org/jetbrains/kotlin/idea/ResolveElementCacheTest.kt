'KotlinLightCodeInsightFixtureTestCase' @ [40:33] ==> public constructor KotlinLightCodeInsightFixtureTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[ClassConstructorDescriptorImpl]

'INSTANCE' @ [41:72] ==> public final val INSTANCE: (KotlinLightProjectDescriptor..KotlinLightProjectDescriptor?) defined in org.jetbrains.kotlin.idea.test.KotlinLightProjectDescriptor[JavaPropertyDescriptor]

'myFixture' @ [72:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[JavaPropertyDescriptor]

'configureByText' @ [72:30] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'FILE_TEXT' @ [72:57] ==> private final val FILE_TEXT: String defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[PropertyDescriptorImpl]

'extractData' @ [73:20] ==> private final fun extractData(file: KtFile): ResolveElementCacheTest.Data defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'file' @ [73:32] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.doTest[LocalVariableDescriptor]

'myFixture' @ [74:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[JavaPropertyDescriptor]

'project' @ [74:19] ==> public final val JavaCodeInsightTestFixture.project: (Project..Project?)[MyPropertyDescriptor]

'executeWriteCommand' @ [74:27] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'data' @ [74:53] ==> val data: ResolveElementCacheTest.Data defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.doTest[LocalVariableDescriptor]

'invoke' @ [74:58] ==> public abstract operator fun ResolveElementCacheTest.Data.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'file' @ [78:21] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.extractData[ValueParameterDescriptorImpl]

'declarations' @ [78:26] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'single' @ [78:39] ==> public fun <T> List<(KtDeclaration..KtDeclaration?)>.single(): (KtDeclaration..KtDeclaration?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'klass' @ [79:23] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.extractData[LocalVariableDescriptor]

'declarations' @ [79:29] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'members' @ [80:24] ==> val members: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.extractData[LocalVariableDescriptor]

'first' @ [80:32] ==> public fun <T> List<KtDeclaration>.first(): KtDeclaration defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'function' @ [81:27] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.extractData[LocalVariableDescriptor]

'bodyExpression' @ [81:36] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'statements' @ [81:73] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'Data' @ [82:16] ==> public constructor Data(file: KtFile, klass: KtClass, members: List<KtDeclaration>, statements: List<KtExpression>, factory: KtPsiFactory) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[ClassConstructorDescriptorImpl]

'file' @ [82:21] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.extractData[ValueParameterDescriptorImpl]

'klass' @ [82:27] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.extractData[LocalVariableDescriptor]

'members' @ [82:34] ==> val members: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.extractData[LocalVariableDescriptor]

'statements' @ [82:43] ==> val statements: List<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.extractData[LocalVariableDescriptor]

'KtPsiFactory' @ [82:55] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [82:68] ==> public final val ResolveElementCacheTest.project: Project[MyPropertyDescriptor]

'doTest' @ [86:9] ==> private final fun doTest(handler: ResolveElementCacheTest.Data.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'this' @ [86:18] ==> <this> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFullResolveCaching.<anonymous>[ReceiverParameterDescriptorImpl]

'testResolveCaching' @ [86:23] ==> private final fun ResolveElementCacheTest.Data.testResolveCaching(): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'statements' @ [91:26] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'statements' @ [92:26] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'statement1' @ [93:32] ==> val statement1: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'analyze' @ [93:43] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [93:67] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'statement2' @ [94:32] ==> val statement2: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'analyze' @ [94:43] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [94:67] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [95:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'aFunBodyContext1' @ [95:16] ==> val aFunBodyContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'aFunBodyContext2' @ [95:37] ==> val aFunBodyContext2: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'statement1' @ [97:32] ==> val statement1: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'analyze' @ [97:43] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [97:67] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [98:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'aFunBodyContext3' @ [98:16] ==> val aFunBodyContext3: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'aFunBodyContext1' @ [98:37] ==> val aFunBodyContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'members' @ [100:20] ==> public final val members: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'bFun' @ [101:21] ==> val bFun: KtNamedFunction defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'bodyExpression' @ [101:26] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'bBody' @ [102:26] ==> val bBody: KtBlockExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'statements' @ [102:32] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'bStatement' @ [103:31] ==> val bStatement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'analyze' @ [103:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [103:66] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'bBody' @ [106:9] ==> val bBody: KtBlockExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'addAfter' @ [106:15] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtBlockExpression[JavaMethodDescriptor]

'factory' @ [106:24] ==> public final val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'createExpression' @ [106:32] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'bBody' @ [106:57] ==> val bBody: KtBlockExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'lBrace' @ [106:63] ==> public final val KtBlockExpression.lBrace: PsiElement?[MyPropertyDescriptor]

'bStatement' @ [107:43] ==> val bStatement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'analyze' @ [107:54] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [107:78] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [108:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bFunBodyContext' @ [108:16] ==> val bFunBodyContext: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'bFunBodyContextAfterChange1' @ [108:36] ==> val bFunBodyContextAfterChange1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'file' @ [110:13] ==> public final val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'isPhysical' @ [110:18] ==> public final val KtFile.isPhysical: Boolean[MyPropertyDescriptor]

'statement1' @ [111:47] ==> val statement1: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'analyze' @ [111:58] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [111:82] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [112:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'aFunBodyContextAfterChange1' @ [112:20] ==> val aFunBodyContextAfterChange1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'aFunBodyContext1' @ [112:52] ==> val aFunBodyContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'bFun' @ [116:9] ==> val bFun: KtNamedFunction defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'valueParameterList' @ [116:14] ==> public final val KtNamedFunction.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'addParameter' @ [116:35] ==> @NotNull public open fun addParameter(@NotNull p0: KtParameter): KtParameter defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'factory' @ [116:48] ==> public final val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'createParameter' @ [116:56] ==> public final fun createParameter(text: String): KtParameter defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'statement1' @ [118:43] ==> val statement1: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'analyze' @ [118:54] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [118:78] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [119:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'aFunBodyContextAfterChange2' @ [119:16] ==> val aFunBodyContextAfterChange2: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'aFunBodyContext1' @ [119:48] ==> val aFunBodyContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'bStatement' @ [121:43] ==> val bStatement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'analyze' @ [121:54] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [121:78] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [122:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bFunBodyContextAfterChange2' @ [122:16] ==> val bFunBodyContextAfterChange2: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'bFunBodyContextAfterChange1' @ [122:48] ==> val bFunBodyContextAfterChange1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveCaching[LocalVariableDescriptor]

'doTest' @ [126:9] ==> private final fun doTest(handler: ResolveElementCacheTest.Data.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'KtPsiFactory' @ [127:35] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [127:48] ==> public final val ResolveElementCacheTest.project: Project[MyPropertyDescriptor]

'createAnalyzableFile' @ [127:57] ==> public final fun createAnalyzableFile(fileName: String, text: String, contextToAnalyzeIn: PsiElement): KtFile defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'FILE_TEXT' @ [127:96] ==> private final val FILE_TEXT: String defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[PropertyDescriptorImpl]

'file' @ [127:107] ==> public final val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'extractData' @ [128:35] ==> private final fun extractData(file: KtFile): ResolveElementCacheTest.Data defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'nonPhysicalFile' @ [128:47] ==> val nonPhysicalFile: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNonPhysicalFileFullResolveCaching.<anonymous>[LocalVariableDescriptor]

'nonPhysicalData' @ [129:13] ==> val nonPhysicalData: ResolveElementCacheTest.Data defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNonPhysicalFileFullResolveCaching.<anonymous>[LocalVariableDescriptor]

'testResolveCaching' @ [129:29] ==> private final fun ResolveElementCacheTest.Data.testResolveCaching(): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'nonPhysicalData' @ [132:29] ==> val nonPhysicalData: ResolveElementCacheTest.Data defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNonPhysicalFileFullResolveCaching.<anonymous>[LocalVariableDescriptor]

'statements' @ [132:45] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'statement' @ [133:39] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNonPhysicalFileFullResolveCaching.<anonymous>[LocalVariableDescriptor]

'analyze' @ [133:49] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [133:73] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'statements' @ [135:13] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'delete' @ [135:27] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'statement' @ [137:39] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNonPhysicalFileFullResolveCaching.<anonymous>[LocalVariableDescriptor]

'analyze' @ [137:49] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [137:73] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [138:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'nonPhysicalContext2' @ [138:20] ==> val nonPhysicalContext2: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNonPhysicalFileFullResolveCaching.<anonymous>[LocalVariableDescriptor]

'nonPhysicalContext1' @ [138:44] ==> val nonPhysicalContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNonPhysicalFileFullResolveCaching.<anonymous>[LocalVariableDescriptor]

'members' @ [140:13] ==> public final val members: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'delete' @ [140:24] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'statement' @ [142:39] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNonPhysicalFileFullResolveCaching.<anonymous>[LocalVariableDescriptor]

'analyze' @ [142:49] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [142:73] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [143:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'nonPhysicalContext3' @ [143:20] ==> val nonPhysicalContext3: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNonPhysicalFileFullResolveCaching.<anonymous>[LocalVariableDescriptor]

'nonPhysicalContext1' @ [143:44] ==> val nonPhysicalContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNonPhysicalFileFullResolveCaching.<anonymous>[LocalVariableDescriptor]

'statements' @ [146:36] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'analyze' @ [146:50] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [146:74] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'nonPhysicalData' @ [147:13] ==> val nonPhysicalData: ResolveElementCacheTest.Data defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNonPhysicalFileFullResolveCaching.<anonymous>[LocalVariableDescriptor]

'members' @ [147:29] ==> public final val members: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'delete' @ [147:40] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'statements' @ [148:36] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'analyze' @ [148:50] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [148:74] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [149:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'physicalContext1' @ [149:20] ==> val physicalContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNonPhysicalFileFullResolveCaching.<anonymous>[LocalVariableDescriptor]

'physicalContext2' @ [149:41] ==> val physicalContext2: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNonPhysicalFileFullResolveCaching.<anonymous>[LocalVariableDescriptor]

'doTest' @ [154:9] ==> private final fun doTest(handler: ResolveElementCacheTest.Data.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'statements' @ [155:29] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'statement' @ [156:35] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'analyze' @ [156:45] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [156:69] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'klass' @ [158:48] ==> public final val klass: KtClass defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'getPrimaryConstructor' @ [158:54] ==> public open fun getPrimaryConstructor(): KtPrimaryConstructor? defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'valueParameters' @ [158:80] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'first' @ [158:96] ==> public fun <T> List<(KtParameter..KtParameter?)>.first(): (KtParameter..KtParameter?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'typeReference' @ [158:104] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'classConstructorParamTypeRef' @ [159:35] ==> val classConstructorParamTypeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'analyze' @ [159:64] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [159:88] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'getInstance' @ [161:54] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [161:66] ==> public final val ResolveElementCacheTest.project: Project[MyPropertyDescriptor]

'documentManager' @ [162:28] ==> val documentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'getDocument' @ [162:44] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'file' @ [162:56] ==> public final val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'documentManager' @ [163:13] ==> val documentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'doPostponedOperationsAndUnblockDocument' @ [163:29] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'document' @ [163:69] ==> val document: Document defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'members' @ [166:24] ==> public final val members: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'bFun' @ [167:25] ==> val bFun: KtNamedFunction defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'bodyExpression' @ [167:30] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'document' @ [168:13] ==> val document: Document defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'insertString' @ [168:22] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'bBody' @ [168:35] ==> val bBody: KtBlockExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'lBrace' @ [168:41] ==> public final val KtBlockExpression.lBrace: PsiElement?[MyPropertyDescriptor]

'startOffset' @ [168:50] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'documentManager' @ [169:13] ==> val documentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'commitAllDocuments' @ [169:29] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'statement' @ [171:35] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'analyze' @ [171:45] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [171:69] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [172:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext3' @ [172:20] ==> val bindingContext3: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'bindingContext1' @ [172:40] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'classConstructorParamTypeRef' @ [174:35] ==> val classConstructorParamTypeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'analyze' @ [174:64] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [174:88] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [175:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext4' @ [175:20] ==> val bindingContext4: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'bindingContext2' @ [175:40] ==> val bindingContext2: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'document' @ [178:13] ==> val document: Document defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'insertString' @ [178:22] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'statement' @ [178:35] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [178:45] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'documentManager' @ [179:13] ==> val documentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'commitAllDocuments' @ [179:29] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'!!' @ [181:35] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtExpression?): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtExpression

'members' @ [181:36] ==> public final val members: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'bodyExpression' @ [181:67] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'analyze' @ [181:84] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [181:108] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [182:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext5' @ [182:20] ==> val bindingContext5: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'bindingContext1' @ [182:40] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'classConstructorParamTypeRef' @ [184:35] ==> val classConstructorParamTypeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'analyze' @ [184:64] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [184:88] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [185:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext6' @ [185:20] ==> val bindingContext6: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'bindingContext2' @ [185:40] ==> val bindingContext2: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveSurvivesTypingInCodeBlock.<anonymous>[LocalVariableDescriptor]

'doTest' @ [190:9] ==> private final fun doTest(handler: ResolveElementCacheTest.Data.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'statements' @ [191:30] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'statements' @ [192:30] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'statement1' @ [193:35] ==> val statement1: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveUsesFullResolveCached.<anonymous>[LocalVariableDescriptor]

'analyze' @ [193:46] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [193:70] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'statement2' @ [195:35] ==> val statement2: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveUsesFullResolveCached.<anonymous>[LocalVariableDescriptor]

'analyze' @ [195:46] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [195:70] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [196:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext2' @ [196:20] ==> val bindingContext2: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveUsesFullResolveCached.<anonymous>[LocalVariableDescriptor]

'bindingContext1' @ [196:40] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveUsesFullResolveCached.<anonymous>[LocalVariableDescriptor]

'statement2' @ [198:35] ==> val statement2: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveUsesFullResolveCached.<anonymous>[LocalVariableDescriptor]

'analyze' @ [198:46] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL_FOR_COMPLETION' @ [198:70] ==> enum entry PARTIAL_FOR_COMPLETION defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [199:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext3' @ [199:20] ==> val bindingContext3: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveUsesFullResolveCached.<anonymous>[LocalVariableDescriptor]

'bindingContext1' @ [199:40] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveUsesFullResolveCached.<anonymous>[LocalVariableDescriptor]

'statement2' @ [201:35] ==> val statement2: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveUsesFullResolveCached.<anonymous>[LocalVariableDescriptor]

'analyze' @ [201:46] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL_WITH_DIAGNOSTICS' @ [201:70] ==> enum entry PARTIAL_WITH_DIAGNOSTICS defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [202:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext4' @ [202:20] ==> val bindingContext4: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveUsesFullResolveCached.<anonymous>[LocalVariableDescriptor]

'bindingContext1' @ [202:40] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveUsesFullResolveCached.<anonymous>[LocalVariableDescriptor]

'doTest' @ [207:9] ==> private final fun doTest(handler: ResolveElementCacheTest.Data.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'this' @ [207:18] ==> <this> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching.<anonymous>[ReceiverParameterDescriptorImpl]

'testPartialResolveCaching' @ [207:23] ==> private final fun ResolveElementCacheTest.Data.testPartialResolveCaching(mode: BodyResolveMode): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'PARTIAL' @ [207:65] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'doTest' @ [211:9] ==> private final fun doTest(handler: ResolveElementCacheTest.Data.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'this' @ [211:18] ==> <this> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialForCompletionResolveCaching.<anonymous>[ReceiverParameterDescriptorImpl]

'testPartialResolveCaching' @ [211:23] ==> private final fun ResolveElementCacheTest.Data.testPartialResolveCaching(mode: BodyResolveMode): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'PARTIAL_FOR_COMPLETION' @ [211:65] ==> enum entry PARTIAL_FOR_COMPLETION defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'statements' @ [215:26] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'statements' @ [216:26] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'statement1' @ [217:31] ==> val statement1: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'analyze' @ [217:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'mode' @ [217:50] ==> value-parameter mode: BodyResolveMode defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[ValueParameterDescriptorImpl]

'statement2' @ [218:31] ==> val statement2: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'analyze' @ [218:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'mode' @ [218:50] ==> value-parameter mode: BodyResolveMode defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[ValueParameterDescriptorImpl]

'assert' @ [219:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext1' @ [219:16] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'bindingContext2' @ [219:36] ==> val bindingContext2: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'statement1' @ [221:31] ==> val statement1: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'analyze' @ [221:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'mode' @ [221:50] ==> value-parameter mode: BodyResolveMode defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[ValueParameterDescriptorImpl]

'statement2' @ [222:31] ==> val statement2: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'analyze' @ [222:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'mode' @ [222:50] ==> value-parameter mode: BodyResolveMode defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[ValueParameterDescriptorImpl]

'assert' @ [223:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext3' @ [223:16] ==> val bindingContext3: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'bindingContext1' @ [223:36] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'assert' @ [224:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext4' @ [224:16] ==> val bindingContext4: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'bindingContext2' @ [224:36] ==> val bindingContext2: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'file' @ [226:9] ==> public final val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'add' @ [226:14] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'factory' @ [226:18] ==> public final val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'createFunction' @ [226:26] ==> public final fun createFunction(funDecl: String): KtNamedFunction defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'statement1' @ [228:31] ==> val statement1: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'analyze' @ [228:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'mode' @ [228:50] ==> value-parameter mode: BodyResolveMode defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[ValueParameterDescriptorImpl]

'assert' @ [229:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext5' @ [229:16] ==> val bindingContext5: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'bindingContext1' @ [229:36] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'statement1' @ [231:9] ==> val statement1: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'parent' @ [231:20] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addAfter' @ [231:27] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'factory' @ [231:36] ==> public final val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'createExpression' @ [231:44] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'statement1' @ [231:69] ==> val statement1: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'statement1' @ [233:31] ==> val statement1: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'analyze' @ [233:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'mode' @ [233:50] ==> value-parameter mode: BodyResolveMode defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[ValueParameterDescriptorImpl]

'assert' @ [234:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext6' @ [234:16] ==> val bindingContext6: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'bindingContext5' @ [234:36] ==> val bindingContext5: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCaching[LocalVariableDescriptor]

'doTest' @ [238:9] ==> private final fun doTest(handler: ResolveElementCacheTest.Data.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'KtPsiFactory' @ [239:35] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [239:48] ==> public final val ResolveElementCacheTest.project: Project[MyPropertyDescriptor]

'createAnalyzableFile' @ [239:57] ==> public final fun createAnalyzableFile(fileName: String, text: String, contextToAnalyzeIn: PsiElement): KtFile defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'FILE_TEXT' @ [239:96] ==> private final val FILE_TEXT: String defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[PropertyDescriptorImpl]

'file' @ [239:107] ==> public final val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'extractData' @ [240:35] ==> private final fun extractData(file: KtFile): ResolveElementCacheTest.Data defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'nonPhysicalFile' @ [240:47] ==> val nonPhysicalFile: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNonPhysicalFilePartialResolveCaching.<anonymous>[LocalVariableDescriptor]

'nonPhysicalData' @ [241:13] ==> val nonPhysicalData: ResolveElementCacheTest.Data defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNonPhysicalFilePartialResolveCaching.<anonymous>[LocalVariableDescriptor]

'testPartialResolveCaching' @ [241:29] ==> private final fun ResolveElementCacheTest.Data.testPartialResolveCaching(mode: BodyResolveMode): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'PARTIAL' @ [241:71] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'doTest' @ [246:9] ==> private final fun doTest(handler: ResolveElementCacheTest.Data.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'statements' @ [247:29] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'statement' @ [248:29] ==> val statement: KtCallExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCachedForWholeStatement.<anonymous>[LocalVariableDescriptor]

'valueArguments' @ [248:39] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'statement' @ [249:29] ==> val statement: KtCallExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCachedForWholeStatement.<anonymous>[LocalVariableDescriptor]

'valueArguments' @ [249:39] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'argument1' @ [250:35] ==> val argument1: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCachedForWholeStatement.<anonymous>[LocalVariableDescriptor]

'analyze' @ [250:45] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [250:69] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'argument2' @ [251:35] ==> val argument2: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCachedForWholeStatement.<anonymous>[LocalVariableDescriptor]

'analyze' @ [251:45] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [251:69] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [252:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext1' @ [252:20] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCachedForWholeStatement.<anonymous>[LocalVariableDescriptor]

'bindingContext2' @ [252:40] ==> val bindingContext2: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCachedForWholeStatement.<anonymous>[LocalVariableDescriptor]

'doTest' @ [257:9] ==> private final fun doTest(handler: ResolveElementCacheTest.Data.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'statements' @ [258:35] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'analyze' @ [258:49] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [258:73] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'!!' @ [259:35] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtExpression?): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtExpression

'statements' @ [259:36] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'initializer' @ [259:76] ==> public final val KtVariableDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'analyze' @ [259:90] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [259:114] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [260:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext1' @ [260:20] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCachedForAllStatementsResolved.<anonymous>[LocalVariableDescriptor]

'bindingContext2' @ [260:40] ==> val bindingContext2: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCachedForAllStatementsResolved.<anonymous>[LocalVariableDescriptor]

'statements' @ [262:35] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'analyze' @ [262:49] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [262:73] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [263:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext3' @ [263:20] ==> val bindingContext3: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCachedForAllStatementsResolved.<anonymous>[LocalVariableDescriptor]

'bindingContext1' @ [263:40] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCachedForAllStatementsResolved.<anonymous>[LocalVariableDescriptor]

'doTest' @ [268:9] ==> private final fun doTest(handler: ResolveElementCacheTest.Data.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'(members[0] as KtNamedFunction).valueParameters[0]' @ [269:32] ==> public abstract fun get(index: Int): (KtParameter..KtParameter?) defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'members' @ [269:33] ==> public final val members: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'valueParameters' @ [269:64] ==> public final val KtNamedFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'defaultValue' @ [269:83] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'defaultValue' @ [270:35] ==> val defaultValue: KtExpression? defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCachedForDefaultParameterValue.<anonymous>[LocalVariableDescriptor]

'analyze' @ [270:50] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [270:74] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'defaultValue' @ [271:35] ==> val defaultValue: KtExpression? defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCachedForDefaultParameterValue.<anonymous>[LocalVariableDescriptor]

'analyze' @ [271:48] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [271:72] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [272:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext1' @ [272:20] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCachedForDefaultParameterValue.<anonymous>[LocalVariableDescriptor]

'bindingContext2' @ [272:40] ==> val bindingContext2: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCachedForDefaultParameterValue.<anonymous>[LocalVariableDescriptor]

'statements' @ [274:35] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'analyze' @ [274:49] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [274:73] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [275:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext3' @ [275:20] ==> val bindingContext3: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCachedForDefaultParameterValue.<anonymous>[LocalVariableDescriptor]

'bindingContext2' @ [275:40] ==> val bindingContext2: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveCachedForDefaultParameterValue.<anonymous>[LocalVariableDescriptor]

'doTest' @ [280:9] ==> private final fun doTest(handler: ResolveElementCacheTest.Data.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'statements' @ [281:29] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'statement' @ [282:35] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialForCompletionAndPartialAfter.<anonymous>[LocalVariableDescriptor]

'analyze' @ [282:45] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL_FOR_COMPLETION' @ [282:69] ==> enum entry PARTIAL_FOR_COMPLETION defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'statement' @ [283:35] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialForCompletionAndPartialAfter.<anonymous>[LocalVariableDescriptor]

'analyze' @ [283:45] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [283:69] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [284:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext2' @ [284:20] ==> val bindingContext2: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialForCompletionAndPartialAfter.<anonymous>[LocalVariableDescriptor]

'bindingContext1' @ [284:40] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialForCompletionAndPartialAfter.<anonymous>[LocalVariableDescriptor]

'statement' @ [286:35] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialForCompletionAndPartialAfter.<anonymous>[LocalVariableDescriptor]

'analyze' @ [286:45] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL_WITH_DIAGNOSTICS' @ [286:69] ==> enum entry PARTIAL_WITH_DIAGNOSTICS defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [287:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext3' @ [287:20] ==> val bindingContext3: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialForCompletionAndPartialAfter.<anonymous>[LocalVariableDescriptor]

'bindingContext1' @ [287:40] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialForCompletionAndPartialAfter.<anonymous>[LocalVariableDescriptor]

'doTest' @ [292:9] ==> private final fun doTest(handler: ResolveElementCacheTest.Data.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'statements' @ [293:29] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'statement' @ [294:35] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialWithDiagnosticsAndPartialAfter.<anonymous>[LocalVariableDescriptor]

'analyze' @ [294:45] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL_WITH_DIAGNOSTICS' @ [294:69] ==> enum entry PARTIAL_WITH_DIAGNOSTICS defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'statement' @ [295:35] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialWithDiagnosticsAndPartialAfter.<anonymous>[LocalVariableDescriptor]

'analyze' @ [295:45] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [295:69] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [296:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext2' @ [296:20] ==> val bindingContext2: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialWithDiagnosticsAndPartialAfter.<anonymous>[LocalVariableDescriptor]

'bindingContext1' @ [296:40] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialWithDiagnosticsAndPartialAfter.<anonymous>[LocalVariableDescriptor]

'statement' @ [298:35] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialWithDiagnosticsAndPartialAfter.<anonymous>[LocalVariableDescriptor]

'analyze' @ [298:45] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL_FOR_COMPLETION' @ [298:69] ==> enum entry PARTIAL_FOR_COMPLETION defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [299:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext3' @ [299:20] ==> val bindingContext3: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialWithDiagnosticsAndPartialAfter.<anonymous>[LocalVariableDescriptor]

'bindingContext1' @ [299:40] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialWithDiagnosticsAndPartialAfter.<anonymous>[LocalVariableDescriptor]

'doTest' @ [304:9] ==> private final fun doTest(handler: ResolveElementCacheTest.Data.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'klass' @ [305:33] ==> public final val klass: KtClass defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'getPrimaryConstructorParameters' @ [305:39] ==> public open fun getPrimaryConstructorParameters(): List<KtParameter> defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'defaultValue' @ [305:76] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'klass' @ [306:33] ==> public final val klass: KtClass defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'getPrimaryConstructorParameters' @ [306:39] ==> public open fun getPrimaryConstructorParameters(): List<KtParameter> defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'defaultValue' @ [306:76] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'defaultValue1' @ [307:35] ==> val defaultValue1: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFullResolvedCachedWhenPartialForConstructorInvoked.<anonymous>[LocalVariableDescriptor]

'analyze' @ [307:49] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [307:73] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'defaultValue2' @ [308:35] ==> val defaultValue2: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFullResolvedCachedWhenPartialForConstructorInvoked.<anonymous>[LocalVariableDescriptor]

'analyze' @ [308:49] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [308:73] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [309:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext1' @ [309:20] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFullResolvedCachedWhenPartialForConstructorInvoked.<anonymous>[LocalVariableDescriptor]

'bindingContext2' @ [309:40] ==> val bindingContext2: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFullResolvedCachedWhenPartialForConstructorInvoked.<anonymous>[LocalVariableDescriptor]

'configureWithKotlin' @ [314:20] ==> private final fun configureWithKotlin(@Language text: String): KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'file' @ [320:21] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testAnnotationEntry[LocalVariableDescriptor]

'declarations' @ [320:26] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'klass' @ [321:31] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testAnnotationEntry[LocalVariableDescriptor]

'annotationEntries' @ [321:37] ==> public final val KtClass.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'single' @ [321:55] ==> public fun <T> List<(KtAnnotationEntry..KtAnnotationEntry?)>.single(): (KtAnnotationEntry..KtAnnotationEntry?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'annotationEntry' @ [323:23] ==> val annotationEntry: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testAnnotationEntry[LocalVariableDescriptor]

'analyze' @ [323:39] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [323:63] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [324:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'context' @ [324:16] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testAnnotationEntry[LocalVariableDescriptor]

'ANNOTATION' @ [324:39] ==> public final val ANNOTATION: (WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'annotationEntry' @ [324:51] ==> val annotationEntry: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testAnnotationEntry[LocalVariableDescriptor]

'configureWithKotlin' @ [328:20] ==> private final fun configureWithKotlin(@Language text: String): KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'file' @ [334:34] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFileAnnotationList[LocalVariableDescriptor]

'fileAnnotationList' @ [334:39] ==> public final val KtFile.fileAnnotationList: KtFileAnnotationList?[MyPropertyDescriptor]

'fileAnnotationList' @ [335:23] ==> val fileAnnotationList: KtFileAnnotationList defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFileAnnotationList[LocalVariableDescriptor]

'analyze' @ [335:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [335:66] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [336:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'context' @ [336:16] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFileAnnotationList[LocalVariableDescriptor]

'ANNOTATION' @ [336:39] ==> public final val ANNOTATION: (WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'fileAnnotationList' @ [336:51] ==> val fileAnnotationList: KtFileAnnotationList defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFileAnnotationList[LocalVariableDescriptor]

'annotationEntries' @ [336:70] ==> public final val KtFileAnnotationList.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'assert' @ [337:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'context' @ [337:16] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFileAnnotationList[LocalVariableDescriptor]

'ANNOTATION' @ [337:39] ==> public final val ANNOTATION: (WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'fileAnnotationList' @ [337:51] ==> val fileAnnotationList: KtFileAnnotationList defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFileAnnotationList[LocalVariableDescriptor]

'annotationEntries' @ [337:70] ==> public final val KtFileAnnotationList.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'myFixture' @ [341:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[JavaPropertyDescriptor]

'configureByText' @ [341:30] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'file' @ [346:34] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testIncompleteFileAnnotationList[LocalVariableDescriptor]

'fileAnnotationList' @ [346:39] ==> public final val KtFile.fileAnnotationList: KtFileAnnotationList?[MyPropertyDescriptor]

'fileAnnotationList' @ [347:9] ==> val fileAnnotationList: KtFileAnnotationList defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testIncompleteFileAnnotationList[LocalVariableDescriptor]

'analyze' @ [347:28] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [347:52] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'configureWithKotlin' @ [351:20] ==> private final fun configureWithKotlin(@Language text: String): KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'file' @ [356:24] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNamedParametersInFunctionType[LocalVariableDescriptor]

'declarations' @ [356:29] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'function' @ [357:28] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNamedParametersInFunctionType[LocalVariableDescriptor]

'valueParameters' @ [357:37] ==> public final val KtNamedFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'first' @ [357:53] ==> public fun <T> List<(KtParameter..KtParameter?)>.first(): (KtParameter..KtParameter?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'typeReference' @ [357:61] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeElement' @ [357:77] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'functionType' @ [358:40] ==> val functionType: KtFunctionType defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNamedParametersInFunctionType[LocalVariableDescriptor]

'parameters' @ [358:53] ==> public final val KtFunctionType.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'map' @ [358:64] ==> public inline fun <T, R> Iterable<(KtParameter..KtParameter?)>.map(transform: ((KtParameter..KtParameter?)) -> DeclarationDescriptor): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)
    <R> -> DeclarationDescriptor

'it' @ [358:70] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNamedParametersInFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [358:73] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'assert' @ [360:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'listOf' @ [361:17] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'NO_NAME_PROVIDED' @ [361:52] ==> public final val NO_NAME_PROVIDED: (Name..Name?) defined in org.jetbrains.kotlin.name.SpecialNames[JavaPropertyDescriptor]

'asString' @ [361:69] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'descriptorsForParameters' @ [362:25] ==> val descriptorsForParameters: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNamedParametersInFunctionType[LocalVariableDescriptor]

'map' @ [362:50] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> String

'it' @ [362:56] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNamedParametersInFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [362:59] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [362:64] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'configureWithKotlin' @ [367:20] ==> private final fun configureWithKotlin(@Language text: String): KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'file' @ [374:24] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNoBodyResolveOnFunctionParameterAnalyze[LocalVariableDescriptor]

'declarations' @ [374:29] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'function' @ [375:33] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNoBodyResolveOnFunctionParameterAnalyze[LocalVariableDescriptor]

'valueParameters' @ [375:42] ==> public final val KtNamedFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'first' @ [375:58] ==> public fun <T> List<(KtParameter..KtParameter?)>.first(): (KtParameter..KtParameter?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'functionParameter' @ [377:23] ==> val functionParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNoBodyResolveOnFunctionParameterAnalyze[LocalVariableDescriptor]

'analyze' @ [377:41] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [377:65] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assertEmpty' @ [379:9] ==> public open fun assertEmpty(@NotNull p0: (MutableCollection<*>..Collection<*>)): Unit defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCaseBase[JavaMethodDescriptor]

'context' @ [379:21] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testNoBodyResolveOnFunctionParameterAnalyze[LocalVariableDescriptor]

'diagnostics' @ [379:29] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'all' @ [379:41] ==> public abstract fun all(): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'Language' @ [382:37] ==> public constructor Language(value: String, prefix: String = ..., suffix: String = ...) defined in org.intellij.lang.annotations.Language[JavaClassConstructorDescriptor]

'myFixture' @ [383:16] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[JavaPropertyDescriptor]

'configureByText' @ [383:26] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'text' @ [383:53] ==> value-parameter @Language text: String defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.configureWithKotlin[ValueParameterDescriptorImpl]

'trimIndent' @ [383:58] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'myFixture' @ [387:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[JavaPropertyDescriptor]

'configureByText' @ [387:30] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'!!' @ [391:28] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtPrimaryConstructor?): KtPrimaryConstructor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtPrimaryConstructor

'file' @ [391:30] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPrimaryConstructorParameterFullAnalysis[LocalVariableDescriptor]

'declarations' @ [391:35] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'getPrimaryConstructor' @ [391:64] ==> public open fun getPrimaryConstructor(): KtPrimaryConstructor? defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'valueParameters' @ [391:90] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'defaultValue' @ [391:109] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'defaultValue' @ [392:9] ==> val defaultValue: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPrimaryConstructorParameterFullAnalysis[LocalVariableDescriptor]

'analyzeFullyAndGetResult' @ [392:22] ==> public fun KtElement.analyzeFullyAndGetResult(vararg extraFiles: KtFile): AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'myFixture' @ [396:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[JavaPropertyDescriptor]

'configureByText' @ [396:30] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'!!' @ [400:35] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtPrimaryConstructor?): KtPrimaryConstructor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtPrimaryConstructor

'file' @ [400:37] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPrimaryConstructorAnnotationFullAnalysis[LocalVariableDescriptor]

'declarations' @ [400:42] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'getPrimaryConstructor' @ [400:71] ==> public open fun getPrimaryConstructor(): KtPrimaryConstructor? defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'annotationEntries' @ [400:97] ==> public final val KtPrimaryConstructor.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'valueArgumentList' @ [400:118] ==> public final val KtAnnotationEntry.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'annotationArguments' @ [401:9] ==> val annotationArguments: KtValueArgumentList defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPrimaryConstructorAnnotationFullAnalysis[LocalVariableDescriptor]

'analyzeFullyAndGetResult' @ [401:29] ==> public fun KtElement.analyzeFullyAndGetResult(vararg extraFiles: KtFile): AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'myFixture' @ [405:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[JavaPropertyDescriptor]

'configureByText' @ [405:30] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'file' @ [412:25] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFunctionParameterAnnotation[LocalVariableDescriptor]

'declarations' @ [412:30] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'function' @ [413:31] ==> val function: KtFunction defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFunctionParameterAnnotation[LocalVariableDescriptor]

'valueParameters' @ [413:40] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'annotationEntries' @ [413:59] ==> public final val KtParameter.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'annotationEntry' @ [414:23] ==> val annotationEntry: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFunctionParameterAnnotation[LocalVariableDescriptor]

'typeReference' @ [414:39] ==> public final val KtAnnotationEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeRef' @ [416:30] ==> val typeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFunctionParameterAnnotation[LocalVariableDescriptor]

'analyze' @ [416:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [416:62] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'typeRef' @ [418:30] ==> val typeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFunctionParameterAnnotation[LocalVariableDescriptor]

'typeElement' @ [418:38] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'referenceExpression' @ [418:65] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'bindingContext' @ [419:22] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFunctionParameterAnnotation[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [419:52] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'referenceExpr' @ [419:70] ==> val referenceExpr: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFunctionParameterAnnotation[LocalVariableDescriptor]

'assertEquals' @ [420:18] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'target' @ [420:38] ==> val target: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFunctionParameterAnnotation[LocalVariableDescriptor]

'importableFqName' @ [420:46] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'asString' @ [420:64] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'(function.bodyExpression as KtBlockExpression).statements[0]' @ [422:25] ==> public abstract operator fun get(index: Int): (KtExpression..KtExpression?) defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'function' @ [422:26] ==> val function: KtFunction defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFunctionParameterAnnotation[LocalVariableDescriptor]

'bodyExpression' @ [422:35] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'statements' @ [422:72] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'assertEquals' @ [423:18] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'bindingContext' @ [423:37] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFunctionParameterAnnotation[LocalVariableDescriptor]

'PROCESSED' @ [423:67] ==> public final val PROCESSED: (WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>..WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'statement' @ [423:78] ==> val statement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFunctionParameterAnnotation[LocalVariableDescriptor]

'myFixture' @ [427:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[JavaPropertyDescriptor]

'configureByText' @ [427:30] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'!!' @ [432:27] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtPrimaryConstructor?): KtPrimaryConstructor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtPrimaryConstructor

'file' @ [432:29] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPrimaryConstructorParameterAnnotation[LocalVariableDescriptor]

'declarations' @ [432:34] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'getPrimaryConstructor' @ [432:63] ==> public open fun getPrimaryConstructor(): KtPrimaryConstructor? defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'constructor' @ [433:31] ==> val constructor: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPrimaryConstructorParameterAnnotation[LocalVariableDescriptor]

'valueParameters' @ [433:43] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'annotationEntries' @ [433:62] ==> public final val KtParameter.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'annotationEntry' @ [434:23] ==> val annotationEntry: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPrimaryConstructorParameterAnnotation[LocalVariableDescriptor]

'typeReference' @ [434:39] ==> public final val KtAnnotationEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeRef' @ [436:30] ==> val typeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPrimaryConstructorParameterAnnotation[LocalVariableDescriptor]

'analyze' @ [436:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [436:62] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'typeRef' @ [438:30] ==> val typeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPrimaryConstructorParameterAnnotation[LocalVariableDescriptor]

'typeElement' @ [438:38] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'referenceExpression' @ [438:65] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'bindingContext' @ [439:22] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPrimaryConstructorParameterAnnotation[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [439:52] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'referenceExpr' @ [439:70] ==> val referenceExpr: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPrimaryConstructorParameterAnnotation[LocalVariableDescriptor]

'assertEquals' @ [440:18] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'target' @ [440:38] ==> val target: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPrimaryConstructorParameterAnnotation[LocalVariableDescriptor]

'importableFqName' @ [440:46] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'asString' @ [440:64] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'myFixture' @ [444:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[JavaPropertyDescriptor]

'configureByText' @ [444:30] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'((file.declarations[1]) as KtClass).getSecondaryConstructors()[0]' @ [453:27] ==> public abstract operator fun get(index: Int): KtSecondaryConstructor defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'file' @ [453:29] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testSecondaryConstructorParameterAnnotation[LocalVariableDescriptor]

'declarations' @ [453:34] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'getSecondaryConstructors' @ [453:63] ==> public open fun getSecondaryConstructors(): List<KtSecondaryConstructor> defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'constructor' @ [454:31] ==> val constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testSecondaryConstructorParameterAnnotation[LocalVariableDescriptor]

'valueParameters' @ [454:43] ==> public final val KtSecondaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'annotationEntries' @ [454:62] ==> public final val KtParameter.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'annotationEntry' @ [455:23] ==> val annotationEntry: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testSecondaryConstructorParameterAnnotation[LocalVariableDescriptor]

'typeReference' @ [455:39] ==> public final val KtAnnotationEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeRef' @ [457:30] ==> val typeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testSecondaryConstructorParameterAnnotation[LocalVariableDescriptor]

'analyze' @ [457:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [457:62] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'typeRef' @ [459:30] ==> val typeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testSecondaryConstructorParameterAnnotation[LocalVariableDescriptor]

'typeElement' @ [459:38] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'referenceExpression' @ [459:65] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'bindingContext' @ [460:22] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testSecondaryConstructorParameterAnnotation[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [460:52] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'referenceExpr' @ [460:70] ==> val referenceExpr: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testSecondaryConstructorParameterAnnotation[LocalVariableDescriptor]

'assertEquals' @ [461:18] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'target' @ [461:38] ==> val target: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testSecondaryConstructorParameterAnnotation[LocalVariableDescriptor]

'importableFqName' @ [461:46] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'asString' @ [461:64] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'(constructor.bodyExpression as KtBlockExpression).statements[0]' @ [463:25] ==> public abstract operator fun get(index: Int): (KtExpression..KtExpression?) defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'constructor' @ [463:26] ==> val constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testSecondaryConstructorParameterAnnotation[LocalVariableDescriptor]

'bodyExpression' @ [463:38] ==> public final val KtSecondaryConstructor.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'statements' @ [463:75] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'assertEquals' @ [464:18] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'bindingContext' @ [464:37] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testSecondaryConstructorParameterAnnotation[LocalVariableDescriptor]

'PROCESSED' @ [464:67] ==> public final val PROCESSED: (WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>..WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'statement' @ [464:78] ==> val statement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testSecondaryConstructorParameterAnnotation[LocalVariableDescriptor]

'doTest' @ [468:9] ==> private final fun doTest(handler: ResolveElementCacheTest.Data.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'members' @ [469:26] ==> public final val members: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'bodyExpression' @ [469:52] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'aBody' @ [470:36] ==> val aBody: KtBlockExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFullResolveMultiple.<anonymous>[LocalVariableDescriptor]

'statements' @ [470:42] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'aBody' @ [471:36] ==> val aBody: KtBlockExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFullResolveMultiple.<anonymous>[LocalVariableDescriptor]

'statements' @ [471:42] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'((members[1] as KtFunction).bodyExpression as KtBlockExpression).statements[0]' @ [472:35] ==> public abstract operator fun get(index: Int): (KtExpression..KtExpression?) defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'members' @ [472:37] ==> public final val members: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'bodyExpression' @ [472:63] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'statements' @ [472:100] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'((members[2] as KtFunction).bodyExpression as KtBlockExpression).statements[0]' @ [473:35] ==> public abstract operator fun get(index: Int): (KtExpression..KtExpression?) defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'members' @ [473:37] ==> public final val members: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'bodyExpression' @ [473:63] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'statements' @ [473:100] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'checkResolveMultiple' @ [475:34] ==> private final fun checkResolveMultiple(mode: BodyResolveMode, vararg expressions: KtExpression): BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'FULL' @ [475:71] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'statement1InFunA' @ [475:77] ==> val statement1InFunA: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFullResolveMultiple.<anonymous>[LocalVariableDescriptor]

'statementInFunB' @ [475:95] ==> val statementInFunB: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFullResolveMultiple.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [477:22] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'bindingContext' @ [477:41] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFullResolveMultiple.<anonymous>[LocalVariableDescriptor]

'PROCESSED' @ [477:71] ==> public final val PROCESSED: (WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>..WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'statement2InFunA' @ [477:82] ==> val statement2InFunA: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFullResolveMultiple.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [478:22] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'bindingContext' @ [478:41] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFullResolveMultiple.<anonymous>[LocalVariableDescriptor]

'PROCESSED' @ [478:71] ==> public final val PROCESSED: (WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>..WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'statementInFunC' @ [478:82] ==> val statementInFunC: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testFullResolveMultiple.<anonymous>[LocalVariableDescriptor]

'doTest' @ [483:9] ==> private final fun doTest(handler: ResolveElementCacheTest.Data.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'members' @ [484:26] ==> public final val members: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'bodyExpression' @ [484:52] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'aBody' @ [485:36] ==> val aBody: KtBlockExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveMultiple.<anonymous>[LocalVariableDescriptor]

'statements' @ [485:42] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'aBody' @ [486:36] ==> val aBody: KtBlockExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveMultiple.<anonymous>[LocalVariableDescriptor]

'statements' @ [486:42] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'((members[1] as KtFunction).bodyExpression as KtBlockExpression).statements[0]' @ [487:35] ==> public abstract operator fun get(index: Int): (KtExpression..KtExpression?) defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'members' @ [487:37] ==> public final val members: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'bodyExpression' @ [487:63] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'statements' @ [487:100] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'klass' @ [488:47] ==> public final val klass: KtClass defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'getPrimaryConstructor' @ [488:53] ==> public open fun getPrimaryConstructor(): KtPrimaryConstructor? defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'valueParameters' @ [488:79] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'defaultValue' @ [488:98] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'members' @ [489:24] ==> public final val members: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'checkResolveMultiple' @ [491:13] ==> private final fun checkResolveMultiple(mode: BodyResolveMode, vararg expressions: KtExpression): BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'PARTIAL' @ [491:50] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'statement1InFunA' @ [491:59] ==> val statement1InFunA: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveMultiple.<anonymous>[LocalVariableDescriptor]

'statement2InFunA' @ [491:77] ==> val statement2InFunA: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveMultiple.<anonymous>[LocalVariableDescriptor]

'statementInFunB' @ [491:95] ==> val statementInFunB: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveMultiple.<anonymous>[LocalVariableDescriptor]

'constructorParameterDefault' @ [491:112] ==> val constructorParameterDefault: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveMultiple.<anonymous>[LocalVariableDescriptor]

'funC' @ [491:141] ==> val funC: KtDeclaration defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveMultiple.<anonymous>[LocalVariableDescriptor]

'doTest' @ [496:9] ==> private final fun doTest(handler: ResolveElementCacheTest.Data.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'members' @ [497:26] ==> public final val members: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.Data[PropertyDescriptorImpl]

'bodyExpression' @ [497:52] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'aBody' @ [498:36] ==> val aBody: KtBlockExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveMultipleInOneFunction.<anonymous>[LocalVariableDescriptor]

'statements' @ [498:42] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'aBody' @ [499:36] ==> val aBody: KtBlockExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveMultipleInOneFunction.<anonymous>[LocalVariableDescriptor]

'statements' @ [499:42] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'checkResolveMultiple' @ [501:34] ==> private final fun checkResolveMultiple(mode: BodyResolveMode, vararg expressions: KtExpression): BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[SimpleFunctionDescriptorImpl]

'PARTIAL' @ [501:71] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'statement1InFunA' @ [501:80] ==> val statement1InFunA: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveMultipleInOneFunction.<anonymous>[LocalVariableDescriptor]

'statement2InFunA' @ [501:98] ==> val statement2InFunA: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveMultipleInOneFunction.<anonymous>[LocalVariableDescriptor]

'statement1InFunA' @ [503:35] ==> val statement1InFunA: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveMultipleInOneFunction.<anonymous>[LocalVariableDescriptor]

'analyze' @ [503:52] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [503:76] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [504:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext1' @ [504:20] ==> val bindingContext1: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveMultipleInOneFunction.<anonymous>[LocalVariableDescriptor]

'bindingContext' @ [504:40] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testPartialResolveMultipleInOneFunction.<anonymous>[LocalVariableDescriptor]

'myFixture' @ [509:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[JavaPropertyDescriptor]

'configureByText' @ [509:30] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'file' @ [510:23] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testKT14376[LocalVariableDescriptor]

'findDescendantOfType' @ [510:28] ==> public inline fun <reified T : PsiElement> PsiElement.findDescendantOfType(noinline predicate: (KtNameReferenceExpression) -> Boolean = ...): KtNameReferenceExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNameReferenceExpression

'nameRef' @ [511:30] ==> val nameRef: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testKT14376[LocalVariableDescriptor]

'analyze' @ [511:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [511:62] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [512:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [512:16] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testKT14376[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [512:46] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'nameRef' @ [512:64] ==> val nameRef: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testKT14376[LocalVariableDescriptor]

'fqNameSafe' @ [512:74] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [512:86] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'myFixture' @ [516:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest[JavaPropertyDescriptor]

'configureByText' @ [516:30] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'file' @ [529:22] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveDefaultValueInPrimaryConstructor[LocalVariableDescriptor]

'declarations' @ [529:27] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'classA' @ [530:28] ==> val classA: KtClass defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveDefaultValueInPrimaryConstructor[LocalVariableDescriptor]

'primaryConstructor' @ [530:35] ==> public final val KtClass.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'valueParameters' @ [530:56] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'defaultValue' @ [530:75] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'defaultValue' @ [531:25] ==> val defaultValue: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveDefaultValueInPrimaryConstructor[LocalVariableDescriptor]

'objectDeclaration' @ [531:38] ==> public final val KtObjectLiteralExpression.objectDeclaration: KtObjectDeclaration[MyPropertyDescriptor]

'declarations' @ [531:56] ==> public final val KtObjectDeclaration.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'methodOne' @ [533:30] ==> val methodOne: KtFunction defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveDefaultValueInPrimaryConstructor[LocalVariableDescriptor]

'analyze' @ [533:40] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [533:64] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'methodOne' @ [535:25] ==> val methodOne: KtFunction defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveDefaultValueInPrimaryConstructor[LocalVariableDescriptor]

'valueParameters' @ [535:35] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'bindingContext' @ [536:35] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveDefaultValueInPrimaryConstructor[LocalVariableDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [536:65] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'parameter' @ [536:92] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveDefaultValueInPrimaryConstructor[LocalVariableDescriptor]

'assert' @ [538:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [538:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameterDescriptor' @ [538:17] ==> val parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.testResolveDefaultValueInPrimaryConstructor[LocalVariableDescriptor]

'type' @ [538:37] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'containsError' @ [538:42] ==> public fun KotlinType.containsError(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'expressions' @ [542:32] ==> value-parameter vararg expressions: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.checkResolveMultiple[ValueParameterDescriptorImpl]

'first' @ [542:44] ==> public fun <T> Array<out KtExpression>.first(): KtExpression defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'getResolutionFacade' @ [542:52] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [543:30] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.checkResolveMultiple[LocalVariableDescriptor]

'analyze' @ [543:47] ==> public abstract fun analyze(elements: Collection<KtElement>, bodyResolveMode: BodyResolveMode): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'expressions' @ [543:55] ==> value-parameter vararg expressions: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.checkResolveMultiple[ValueParameterDescriptorImpl]

'asList' @ [543:67] ==> public fun <T> Array<out KtExpression>.asList(): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'mode' @ [543:77] ==> value-parameter mode: BodyResolveMode defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.checkResolveMultiple[ValueParameterDescriptorImpl]

'expressions' @ [545:9] ==> value-parameter vararg expressions: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.checkResolveMultiple[ValueParameterDescriptorImpl]

'forEach' @ [545:21] ==> public inline fun <T> Array<out KtExpression>.forEach(action: (KtExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'if (it !is KtDeclaration) {
                TestCase.assertEquals(true, bindingContext[BindingContext.PROCESSED, it])
            }
            else {
                TestCase.assertNotNull(bindingContext[BindingContext.DECLARATION_TO_DESCRIPTOR, it])
            }' @ [546:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'it' @ [546:17] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.checkResolveMultiple.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [547:26] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'bindingContext' @ [547:45] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.checkResolveMultiple[LocalVariableDescriptor]

'PROCESSED' @ [547:75] ==> public final val PROCESSED: (WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>..WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [547:86] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.checkResolveMultiple.<anonymous>[ValueParameterDescriptorImpl]

'assertNotNull' @ [550:26] ==> public open fun assertNotNull(p0: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'bindingContext' @ [550:40] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.checkResolveMultiple[LocalVariableDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [550:70] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [550:97] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.checkResolveMultiple.<anonymous>[ValueParameterDescriptorImpl]

'bindingContext' @ [554:16] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.ResolveElementCacheTest.checkResolveMultiple[LocalVariableDescriptor]

