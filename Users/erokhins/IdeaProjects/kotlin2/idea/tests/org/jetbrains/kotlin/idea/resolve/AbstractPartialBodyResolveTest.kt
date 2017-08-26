'KotlinLightCodeInsightFixtureTestCase' @ [48:49] ==> public constructor KotlinLightCodeInsightFixtureTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[ClassConstructorDescriptorImpl]

'getHomeDirectory' @ [49:54] ==> @NotNull public open fun getHomeDirectory(): String defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'INSTANCE' @ [50:89] ==> @NotNull public final val INSTANCE: KotlinWithJdkAndRuntimeLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test.KotlinWithJdkAndRuntimeLightProjectDescriptor[JavaPropertyDescriptor]

'dump' @ [53:26] ==> private final fun dump(testPath: String, resolveMode: BodyResolveMode): String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest[SimpleFunctionDescriptorImpl]

'testPath' @ [53:31] ==> value-parameter testPath: String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doTest[ValueParameterDescriptorImpl]

'PARTIAL' @ [53:57] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'getNameWithoutExtension' @ [55:38] ==> @NotNull public open fun getNameWithoutExtension(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'testPath' @ [55:62] ==> value-parameter testPath: String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doTest[ValueParameterDescriptorImpl]

'assertEqualsToFile' @ [56:25] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [56:44] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testPathNoExt' @ [56:49] ==> val testPathNoExt: String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doTest[LocalVariableDescriptor]

'dumpNormal' @ [56:75] ==> val dumpNormal: String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doTest[LocalVariableDescriptor]

'dump' @ [58:33] ==> private final fun dump(testPath: String, resolveMode: BodyResolveMode): String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest[SimpleFunctionDescriptorImpl]

'testPath' @ [58:38] ==> value-parameter testPath: String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doTest[ValueParameterDescriptorImpl]

'PARTIAL_FOR_COMPLETION' @ [58:64] ==> enum entry PARTIAL_FOR_COMPLETION defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'File' @ [59:30] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testPathNoExt' @ [59:35] ==> val testPathNoExt: String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doTest[LocalVariableDescriptor]

'if (dumpForCompletion != dumpNormal) {
            KotlinTestUtils.assertEqualsToFile(completionDump, dumpForCompletion)
        }
        else {
            Assert.assertFalse(completionDump.exists())
        }' @ [60:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'dumpForCompletion' @ [60:13] ==> val dumpForCompletion: String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doTest[LocalVariableDescriptor]

'dumpNormal' @ [60:34] ==> val dumpNormal: String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doTest[LocalVariableDescriptor]

'assertEqualsToFile' @ [61:29] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'completionDump' @ [61:48] ==> val completionDump: File defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doTest[LocalVariableDescriptor]

'dumpForCompletion' @ [61:64] ==> val dumpForCompletion: String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doTest[LocalVariableDescriptor]

'assertFalse' @ [64:20] ==> public open fun assertFalse(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'completionDump' @ [64:32] ==> val completionDump: File defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doTest[LocalVariableDescriptor]

'exists' @ [64:47] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'myFixture' @ [69:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest[JavaPropertyDescriptor]

'configureByText' @ [69:19] ==> public abstract fun configureByText(@NotNull p0: FileType, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'INSTANCE' @ [69:50] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'File' @ [69:60] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testPath' @ [69:65] ==> value-parameter testPath: String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[ValueParameterDescriptorImpl]

'readText' @ [69:75] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'myFixture' @ [71:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest[JavaPropertyDescriptor]

'file' @ [71:30] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'myFixture' @ [72:22] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest[JavaPropertyDescriptor]

'editor' @ [72:32] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'editor' @ [73:30] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'selectionModel' @ [73:37] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'if (selectionModel.hasSelection()) {
            PsiTreeUtil.findElementOfClassAtRange(file, selectionModel.selectionStart, selectionModel.selectionEnd, KtExpression::class.java)
                ?: error("No JetExpression at selection range")
        }
        else {
            val offset = editor.caretModel.offset
            val element = file.findElementAt(offset)!!
            element.getNonStrictParentOfType<KtSimpleNameExpression>() ?: error("No JetSimpleNameExpression at caret")
        }' @ [74:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'selectionModel' @ [74:30] ==> val selectionModel: SelectionModel defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'hasSelection' @ [74:45] ==> public abstract fun hasSelection(): Boolean defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'?:' @ [75:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'findElementOfClassAtRange' @ [75:25] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> findElementOfClassAtRange(@NotNull p0: PsiFile, p1: Int, p2: Int, @NotNull p3: Class<(KtExpression..KtExpression?)>): KtExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtExpression

'file' @ [75:51] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'selectionModel' @ [75:57] ==> val selectionModel: SelectionModel defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'selectionStart' @ [75:72] ==> public final val SelectionModel.selectionStart: Int[MyPropertyDescriptor]

'selectionModel' @ [75:88] ==> val selectionModel: SelectionModel defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'selectionEnd' @ [75:103] ==> public final val SelectionModel.selectionEnd: Int[MyPropertyDescriptor]

'java' @ [75:137] ==> public val <T> KClass<KtExpression>.java: Class<KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'error' @ [76:20] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'editor' @ [79:26] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'caretModel' @ [79:33] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [79:44] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'file' @ [80:27] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'findElementAt' @ [80:32] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'offset' @ [80:46] ==> val offset: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'element' @ [81:13] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [81:21] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'error' @ [81:75] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'file' @ [84:32] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'getResolutionFacade' @ [84:37] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'component1' @ [87:14] ==> public final operator fun component1(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.ResolveData[SimpleFunctionDescriptorImpl]

'component2' @ [87:23] ==> public final operator fun component2(): KotlinType? defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.ResolveData[SimpleFunctionDescriptorImpl]

'component3' @ [87:30] ==> public final operator fun component3(): Collection<KtExpression> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.ResolveData[SimpleFunctionDescriptorImpl]

'doResolve' @ [87:54] ==> private final fun doResolve(expression: KtExpression, bindingContext: BindingContext): AbstractPartialBodyResolveTest.ResolveData defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest[SimpleFunctionDescriptorImpl]

'expression' @ [87:64] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'resolutionFacade' @ [87:76] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'analyze' @ [87:93] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'expression' @ [87:101] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'resolveMode' @ [87:113] ==> value-parameter resolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[ValueParameterDescriptorImpl]

'component1' @ [90:14] ==> public final operator fun component1(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.ResolveData[SimpleFunctionDescriptorImpl]

'component2' @ [90:23] ==> public final operator fun component2(): KotlinType? defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.ResolveData[SimpleFunctionDescriptorImpl]

'component3' @ [90:30] ==> public final operator fun component3(): Collection<KtExpression> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.ResolveData[SimpleFunctionDescriptorImpl]

'doResolve' @ [90:54] ==> private final fun doResolve(expression: KtExpression, bindingContext: BindingContext): AbstractPartialBodyResolveTest.ResolveData defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest[SimpleFunctionDescriptorImpl]

'expression' @ [90:64] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'resolutionFacade' @ [90:76] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'analyze' @ [90:93] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'expression' @ [90:101] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'HashSet' @ [92:19] ==> public constructor HashSet<E : (Any..Any?)>(p0: (MutableCollection<out (KtExpression..KtExpression?)>..Collection<(KtExpression..KtExpression?)>?)) defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'processedStatements2' @ [92:27] ==> val processedStatements2: Collection<KtExpression> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'assert' @ [93:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'set' @ [93:17] ==> val set: HashSet<KtExpression> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'containsAll' @ [93:21] ==> public open fun containsAll(elements: Collection<KtExpression>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'processedStatements1' @ [93:33] ==> val processedStatements1: Collection<KtExpression> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'set' @ [94:9] ==> val set: HashSet<KtExpression> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'removeAll' @ [94:13] ==> public open fun removeAll(elements: Collection<KtExpression>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'processedStatements1' @ [94:23] ==> val processedStatements1: Collection<KtExpression> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'StringBuilder' @ [96:23] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'if (expression is KtReferenceExpression) {
            builder.append("Resolve target: ${target2.presentation(type2)}\n")
        }
        else {
            builder.append("Expression type:${type2.presentation()}\n")
        }' @ [98:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'expression' @ [98:13] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'builder' @ [99:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'append' @ [99:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'target2' @ [99:47] ==> val target2: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'presentation' @ [99:55] ==> private final fun DeclarationDescriptor?.presentation(type: KotlinType?): String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest[SimpleFunctionDescriptorImpl]

'type2' @ [99:68] ==> val type2: KotlinType? defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'builder' @ [102:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'append' @ [102:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'type2' @ [102:47] ==> val type2: KotlinType? defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'presentation' @ [102:53] ==> private final fun KotlinType?.presentation(): String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest[SimpleFunctionDescriptorImpl]

'builder' @ [104:9] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'append' @ [104:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'set' @ [106:33] ==> val set: HashSet<KtExpression> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'filter' @ [107:18] ==> public inline fun <T> Iterable<KtExpression>.filter(predicate: (KtExpression) -> Boolean): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'!' @ [107:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [107:28] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump.<anonymous>[ValueParameterDescriptorImpl]

'parents' @ [107:31] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'any' @ [107:39] ==> public inline fun <T> Sequence<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [107:45] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'set' @ [107:51] ==> val set: HashSet<KtExpression> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'sortedBy' @ [108:18] ==> public inline fun <T, R : Comparable<Int>> Iterable<KtExpression>.sortedBy(crossinline selector: (KtExpression) -> Int?): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R : Comparable<R>> -> Int

'it' @ [108:29] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump.<anonymous>[ValueParameterDescriptorImpl]

'textOffset' @ [108:32] ==> public final val KtExpression.textOffset: Int[MyPropertyDescriptor]

'myFixture' @ [110:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest[JavaPropertyDescriptor]

'project' @ [110:19] ==> public final val JavaCodeInsightTestFixture.project: (Project..Project?)[MyPropertyDescriptor]

'executeWriteCommand' @ [110:27] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'skippedStatements' @ [111:31] ==> val skippedStatements: List<KtExpression> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'statement' @ [112:17] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump.<anonymous>[LocalVariableDescriptor]

'replace' @ [112:27] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'KtPsiFactory' @ [112:35] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [112:48] ==> public final val AbstractPartialBodyResolveTest.project: Project[MyPropertyDescriptor]

'createComment' @ [112:57] ==> public final fun createComment(text: String): PsiComment defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'statement' @ [112:96] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump.<anonymous>[LocalVariableDescriptor]

'compactPresentation' @ [112:106] ==> private final fun KtExpression.compactPresentation(): String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest[SimpleFunctionDescriptorImpl]

'file' @ [116:24] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'text' @ [116:29] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'if (selectionModel.hasSelection()) {
            val start = selectionModel.selectionStart
            val end = selectionModel.selectionEnd
            builder.append(fileText.substring(0, start))
            builder.append("<selection>")
            builder.append(fileText.substring(start, end))
            builder.append("<selection>")
            builder.append(fileText.substring(end))
        }
        else {
            val newCaretOffset = editor.caretModel.offset
            builder.append(fileText.substring(0, newCaretOffset))
            builder.append("<caret>")
            builder.append(fileText.substring(newCaretOffset))
        }' @ [117:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'selectionModel' @ [117:13] ==> val selectionModel: SelectionModel defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'hasSelection' @ [117:28] ==> public abstract fun hasSelection(): Boolean defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'selectionModel' @ [118:25] ==> val selectionModel: SelectionModel defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'selectionStart' @ [118:40] ==> public final val SelectionModel.selectionStart: Int[MyPropertyDescriptor]

'selectionModel' @ [119:23] ==> val selectionModel: SelectionModel defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'selectionEnd' @ [119:38] ==> public final val SelectionModel.selectionEnd: Int[MyPropertyDescriptor]

'builder' @ [120:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'append' @ [120:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'fileText' @ [120:28] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'substring' @ [120:37] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'start' @ [120:50] ==> val start: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'builder' @ [121:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'append' @ [121:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'builder' @ [122:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'append' @ [122:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'fileText' @ [122:28] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'substring' @ [122:37] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'start' @ [122:47] ==> val start: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'end' @ [122:54] ==> val end: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'builder' @ [123:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'append' @ [123:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'builder' @ [124:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'append' @ [124:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'fileText' @ [124:28] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'substring' @ [124:37] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'end' @ [124:47] ==> val end: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'editor' @ [127:34] ==> val editor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'caretModel' @ [127:41] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [127:52] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'builder' @ [128:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'append' @ [128:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'fileText' @ [128:28] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'substring' @ [128:37] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'newCaretOffset' @ [128:50] ==> val newCaretOffset: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'builder' @ [129:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'append' @ [129:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'builder' @ [130:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'append' @ [130:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'fileText' @ [130:28] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'substring' @ [130:37] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'newCaretOffset' @ [130:47] ==> val newCaretOffset: Int defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'assertEquals' @ [133:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'target2' @ [133:29] ==> val target2: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'presentation' @ [133:37] ==> private final fun DeclarationDescriptor?.presentation(type: KotlinType?): String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest[SimpleFunctionDescriptorImpl]

'target1' @ [133:57] ==> val target1: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'presentation' @ [133:65] ==> private final fun DeclarationDescriptor?.presentation(type: KotlinType?): String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest[SimpleFunctionDescriptorImpl]

'assertEquals' @ [134:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'type2' @ [134:29] ==> val type2: KotlinType? defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'presentation' @ [134:35] ==> private final fun KotlinType?.presentation(): String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest[SimpleFunctionDescriptorImpl]

'type1' @ [134:51] ==> val type1: KotlinType? defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'presentation' @ [134:57] ==> private final fun KotlinType?.presentation(): String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest[SimpleFunctionDescriptorImpl]

'builder' @ [136:16] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.dump[LocalVariableDescriptor]

'toString' @ [136:24] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'if (expression is KtReferenceExpression) bindingContext[BindingContext.REFERENCE_TARGET, expression] else null' @ [146:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeclarationDescriptor?, elseBranch: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeclarationDescriptor?

'expression' @ [146:26] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doResolve[ValueParameterDescriptorImpl]

'bindingContext' @ [146:63] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doResolve[ValueParameterDescriptorImpl]

'REFERENCE_TARGET' @ [146:93] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [146:111] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doResolve[ValueParameterDescriptorImpl]

'bindingContext' @ [148:35] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doResolve[ValueParameterDescriptorImpl]

'getSliceContents' @ [148:50] ==> @NotNull public abstract fun <K : (Any..Any?), V : (Any..Any?)> getSliceContents(@NotNull p0: ReadOnlySlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>): ImmutableMap<(KtExpression..KtExpression?), (Boolean..Boolean?)> defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> Boolean

'PROCESSED' @ [148:82] ==> public final val PROCESSED: (WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>..WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'filter' @ [149:18] ==> public inline fun <K, V> Map<out (KtExpression..KtExpression?), (Boolean..Boolean?)>.filter(predicate: (Map.Entry<(KtExpression..KtExpression?), (Boolean..Boolean?)>) -> Boolean): Map<(KtExpression..KtExpression?), (Boolean..Boolean?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V> -> (kotlin.Boolean..kotlin.Boolean?)

'it' @ [149:27] ==> value-parameter it: Map.Entry<(KtExpression..KtExpression?), (Boolean..Boolean?)> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doResolve.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [149:30] ==> public abstract val value: (Boolean..Boolean?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'map' @ [150:18] ==> public inline fun <K, V, R> Map<out (KtExpression..KtExpression?), (Boolean..Boolean?)>.map(transform: (Map.Entry<(KtExpression..KtExpression?), (Boolean..Boolean?)>) -> (KtExpression..KtExpression?)): List<(KtExpression..KtExpression?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V> -> (kotlin.Boolean..kotlin.Boolean?)
    <R> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'it' @ [150:24] ==> value-parameter it: Map.Entry<(KtExpression..KtExpression?), (Boolean..Boolean?)> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doResolve.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [150:27] ==> public abstract val key: (KtExpression..KtExpression?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'filter' @ [151:18] ==> public inline fun <T> Iterable<(KtExpression..KtExpression?)>.filter(predicate: ((KtExpression..KtExpression?)) -> Boolean): List<(KtExpression..KtExpression?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'it' @ [151:27] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doResolve.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [151:30] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'expression' @ [153:25] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doResolve[ValueParameterDescriptorImpl]

'getReceiverExpression' @ [153:65] ==> public fun KtSimpleNameExpression.getReceiverExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'if (receiver != null) {
            expression.parent as? KtExpression ?: expression
        }
        else {
            expression
        }' @ [154:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'receiver' @ [154:38] ==> val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doResolve[LocalVariableDescriptor]

'expression' @ [155:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doResolve[ValueParameterDescriptorImpl]

'parent' @ [155:24] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'expression' @ [155:51] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doResolve[ValueParameterDescriptorImpl]

'expression' @ [158:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doResolve[ValueParameterDescriptorImpl]

'bindingContext' @ [160:20] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doResolve[ValueParameterDescriptorImpl]

'getType' @ [160:35] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'expressionWithType' @ [160:43] ==> val expressionWithType: KtExpression defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doResolve[LocalVariableDescriptor]

'ResolveData' @ [162:16] ==> public constructor ResolveData(target: DeclarationDescriptor?, type: KotlinType?, processedStatements: Collection<KtExpression>) defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.ResolveData[ClassConstructorDescriptorImpl]

'target' @ [162:28] ==> val target: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doResolve[LocalVariableDescriptor]

'type' @ [162:36] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doResolve[LocalVariableDescriptor]

'processedStatements' @ [162:42] ==> val processedStatements: List<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.doResolve[LocalVariableDescriptor]

'this' @ [166:13] ==> <this> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.presentation[ReceiverParameterDescriptorImpl]

'DescriptorRenderer' @ [168:17] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'COMPACT' @ [168:36] ==> @field:JvmField public final val COMPACT: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [168:44] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this' @ [168:51] ==> <this> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.presentation[ReceiverParameterDescriptorImpl]

'this' @ [170:26] ==> <this> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.presentation[ReceiverParameterDescriptorImpl]

'type' @ [170:56] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.presentation[ValueParameterDescriptorImpl]

'this' @ [170:64] ==> <this> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.presentation[ReceiverParameterDescriptorImpl]

'returnType' @ [170:69] ==> public final val VariableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'!' @ [171:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'renderType' @ [171:14] ==> val renderType: Boolean defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.presentation[LocalVariableDescriptor]

's' @ [171:33] ==> val s: String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.presentation[LocalVariableDescriptor]

's' @ [172:18] ==> val s: String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.presentation[LocalVariableDescriptor]

'type' @ [172:36] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.presentation[ValueParameterDescriptorImpl]

'presentation' @ [172:41] ==> private final fun KotlinType?.presentation(): String defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest[SimpleFunctionDescriptorImpl]

'if (this != null) DescriptorRenderer.COMPACT.renderType(this) else "unknown type"' @ [176:15] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'this' @ [176:19] ==> <this> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.presentation[ReceiverParameterDescriptorImpl]

'DescriptorRenderer' @ [176:33] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'COMPACT' @ [176:52] ==> @field:JvmField public final val COMPACT: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'renderType' @ [176:60] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this' @ [176:71] ==> <this> defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.presentation[ReceiverParameterDescriptorImpl]

'text' @ [179:20] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'StringBuilder' @ [180:23] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'text' @ [182:19] ==> val text: (String..String?) defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.compactPresentation[LocalVariableDescriptor]

'when (c) {
                ' ', '\n', '\r' -> {
                    if (!dropSpace) builder.append(' ')
                    dropSpace = true
                }

                else -> {
                    builder.append(c)
                    dropSpace = false
                }
            }' @ [183:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'c' @ [183:19] ==> val c: Char defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.compactPresentation[LocalVariableDescriptor]

'!' @ [185:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dropSpace' @ [185:26] ==> var dropSpace: Boolean defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.compactPresentation[LocalVariableDescriptor]

'builder' @ [185:37] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.compactPresentation[LocalVariableDescriptor]

'append' @ [185:45] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'dropSpace' @ [186:21] ==> var dropSpace: Boolean defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.compactPresentation[LocalVariableDescriptor]

'builder' @ [190:21] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.compactPresentation[LocalVariableDescriptor]

'append' @ [190:29] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'c' @ [190:36] ==> val c: Char defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.compactPresentation[LocalVariableDescriptor]

'dropSpace' @ [191:21] ==> var dropSpace: Boolean defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.compactPresentation[LocalVariableDescriptor]

'builder' @ [195:16] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.resolve.AbstractPartialBodyResolveTest.compactPresentation[LocalVariableDescriptor]

'toString' @ [195:24] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

