'KotlinTestWithEnvironment' @ [34:42] ==> public constructor KotlinTestWithEnvironment() defined in org.jetbrains.kotlin.test.KotlinTestWithEnvironment[JavaClassConstructorDescriptor]

'createEnvironmentWithMockJdk' @ [35:40] ==> @NotNull protected/*protected and package*/ open fun createEnvironmentWithMockJdk(@NotNull p0: ConfigurationKind): KotlinCoreEnvironment defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest[JavaMethodDescriptor]

'ALL' @ [35:87] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'File' @ [38:24] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [38:29] ==> value-parameter path: String defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.doTest[ValueParameterDescriptorImpl]

'loadJetFile' @ [39:26] ==> @NotNull public open fun loadJetFile(@NotNull p0: Project, @NotNull p1: File): KtFile defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'project' @ [39:38] ==> public final val AbstractTypeBindingTest.project: Project[MyPropertyDescriptor]

'testFile' @ [39:47] ==> val testFile: File defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.doTest[LocalVariableDescriptor]

'JvmResolveUtil' @ [41:29] ==> public object JvmResolveUtil defined in org.jetbrains.kotlin.resolve.lazy[FakeCallableDescriptorForObject]

'analyze' @ [41:44] ==> @JvmStatic public final fun analyze(file: KtFile, environment: KotlinCoreEnvironment): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[DeserializedSimpleFunctionDescriptor]

'testKtFile' @ [41:52] ==> val testKtFile: KtFile defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.doTest[LocalVariableDescriptor]

'environment' @ [41:64] ==> public final val AbstractTypeBindingTest.environment: KotlinCoreEnvironment[MyPropertyDescriptor]

'testKtFile' @ [43:31] ==> val testKtFile: KtFile defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.doTest[LocalVariableDescriptor]

'declarations' @ [43:42] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'last' @ [43:55] ==> public fun <T> List<(KtDeclaration..KtDeclaration?)>.last(): (KtDeclaration..KtDeclaration?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'testDeclaration' @ [45:27] ==> val testDeclaration: KtCallableDeclaration defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.doTest[LocalVariableDescriptor]

'createTypeBindingForReturnType' @ [45:43] ==> public fun KtCallableDeclaration.createTypeBindingForReturnType(trace: BindingContext): TypeBinding<PsiElement>? defined in org.jetbrains.kotlin.resolve.typeBinding[DeserializedSimpleFunctionDescriptor]

'analyzeResult' @ [45:74] ==> val analyzeResult: AnalysisResult defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.doTest[LocalVariableDescriptor]

'bindingContext' @ [45:88] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'assertEqualsToFile' @ [47:9] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'testFile' @ [48:17] ==> val testFile: File defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.doTest[LocalVariableDescriptor]

'buildString' @ [49:17] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [50:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'removeLastComment' @ [50:28] ==> private final fun removeLastComment(file: KtFile): String defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest[SimpleFunctionDescriptorImpl]

'testKtFile' @ [50:46] ==> val testKtFile: KtFile defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.doTest[LocalVariableDescriptor]

'append' @ [51:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'MyPrinter' @ [53:21] ==> public constructor MyPrinter(out: StringBuilder /* = StringBuilder */) defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[ClassConstructorDescriptorImpl]

'this' @ [53:31] ==> <this> defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.doTest.<anonymous>[ReceiverParameterDescriptorImpl]

'print' @ [53:37] ==> public final fun print(binding: TypeBinding<*>?): AbstractTypeBindingTest.MyPrinter defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[SimpleFunctionDescriptorImpl]

'typeBinding' @ [53:43] ==> val typeBinding: TypeBinding<PsiElement>? defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.doTest[LocalVariableDescriptor]

'append' @ [55:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'file' @ [61:24] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.removeLastComment[ValueParameterDescriptorImpl]

'text' @ [61:29] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'fileText' @ [62:25] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.removeLastComment[LocalVariableDescriptor]

'indexOf' @ [62:34] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (lastIndex > 0) {
            fileText.substring(0, lastIndex)
        }
        else fileText' @ [63:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'lastIndex' @ [63:20] ==> val lastIndex: Int defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.removeLastComment[LocalVariableDescriptor]

'fileText' @ [64:13] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.removeLastComment[LocalVariableDescriptor]

'substring' @ [64:22] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'lastIndex' @ [64:35] ==> val lastIndex: Int defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.removeLastComment[LocalVariableDescriptor]

'fileText' @ [66:14] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.removeLastComment[LocalVariableDescriptor]

'Printer' @ [69:51] ==> public constructor Printer(@NotNull p0: Appendable) defined in org.jetbrains.kotlin.utils.Printer[JavaClassConstructorDescriptor]

'out' @ [69:59] ==> value-parameter out: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.<init>[ValueParameterDescriptorImpl]

'DescriptorRenderer' @ [70:43] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'SHORT_NAMES_IN_TYPES' @ [70:62] ==> @field:JvmField public final val SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'renderType' @ [70:83] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this' @ [70:94] ==> <this> defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.render[ReceiverParameterDescriptorImpl]

'if (this == null) "null" else DescriptorRenderer.SHORT_NAMES_IN_TYPES.render(this)' @ [71:57] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'this' @ [71:61] ==> <this> defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.render[ReceiverParameterDescriptorImpl]

'DescriptorRenderer' @ [71:87] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'SHORT_NAMES_IN_TYPES' @ [71:106] ==> @field:JvmField public final val SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [71:127] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this' @ [71:134] ==> <this> defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.render[ReceiverParameterDescriptorImpl]

'argument' @ [74:17] ==> value-parameter argument: TypeArgumentBinding<*>? defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.print[ValueParameterDescriptorImpl]

'println' @ [75:17] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[JavaMethodDescriptor]

'this' @ [76:24] ==> <this> defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[LazyClassReceiverParameterDescriptor]

'println' @ [78:13] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[JavaMethodDescriptor]

'argument' @ [78:39] ==> value-parameter argument: TypeArgumentBinding<*>? defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.print[ValueParameterDescriptorImpl]

'typeParameter' @ [78:48] ==> public abstract val typeParameter: TypeParameterDescriptor? defined in org.jetbrains.kotlin.resolve.typeBinding.TypeArgumentBinding[DeserializedPropertyDescriptor]

'render' @ [78:62] ==> private final fun TypeParameterDescriptor?.render(): String defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[SimpleFunctionDescriptorImpl]

'argument' @ [80:30] ==> value-parameter argument: TypeArgumentBinding<*>? defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.print[ValueParameterDescriptorImpl]

'projection' @ [80:39] ==> public abstract val projection: TypeProjection defined in org.jetbrains.kotlin.resolve.typeBinding.TypeArgumentBinding[DeserializedPropertyDescriptor]

'projectionKind' @ [80:50] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'label' @ [80:65] ==> public final val label: String defined in org.jetbrains.kotlin.types.Variance[DeserializedPropertyDescriptor]

'let' @ [80:71] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'if (it.isNotEmpty())
                    "$it "
                else
                    ""' @ [81:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'it' @ [81:21] ==> value-parameter it: String defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.print.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [81:24] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [82:23] ==> value-parameter it: String defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.print.<anonymous>[ValueParameterDescriptorImpl]

'print' @ [87:13] ==> @NotNull public open fun print(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[JavaMethodDescriptor]

'if (argument.projection.isStarProjection)
                printlnWithNoIndent("*")
            else printlnWithNoIndent("${projection}${argument.projection.type.render()}")' @ [88:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Printer, elseBranch: Printer): Printer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Printer

'argument' @ [88:17] ==> value-parameter argument: TypeArgumentBinding<*>? defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.print[ValueParameterDescriptorImpl]

'projection' @ [88:26] ==> public abstract val projection: TypeProjection defined in org.jetbrains.kotlin.resolve.typeBinding.TypeArgumentBinding[DeserializedPropertyDescriptor]

'isStarProjection' @ [88:37] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'printlnWithNoIndent' @ [89:17] ==> @NotNull public open fun printlnWithNoIndent(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[JavaMethodDescriptor]

'printlnWithNoIndent' @ [90:18] ==> @NotNull public open fun printlnWithNoIndent(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[JavaMethodDescriptor]

'projection' @ [90:41] ==> val projection: String defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.print[LocalVariableDescriptor]

'argument' @ [90:54] ==> value-parameter argument: TypeArgumentBinding<*>? defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.print[ValueParameterDescriptorImpl]

'projection' @ [90:63] ==> public abstract val projection: TypeProjection defined in org.jetbrains.kotlin.resolve.typeBinding.TypeArgumentBinding[DeserializedPropertyDescriptor]

'type' @ [90:74] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'render' @ [90:79] ==> private final fun KotlinType.render(): String defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[SimpleFunctionDescriptorImpl]

'print' @ [91:13] ==> public final fun print(binding: TypeBinding<*>?): AbstractTypeBindingTest.MyPrinter defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[SimpleFunctionDescriptorImpl]

'argument' @ [91:19] ==> value-parameter argument: TypeArgumentBinding<*>? defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.print[ValueParameterDescriptorImpl]

'holder' @ [91:28] ==> public abstract val holder: TypeBinding<PsiElement> defined in org.jetbrains.kotlin.resolve.typeBinding.TypeArgumentBinding[DeserializedPropertyDescriptor]

'this' @ [92:20] ==> <this> defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[LazyClassReceiverParameterDescriptor]

'binding' @ [96:17] ==> value-parameter binding: TypeBinding<*>? defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.print[ValueParameterDescriptorImpl]

'println' @ [97:17] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[JavaMethodDescriptor]

'this' @ [98:24] ==> <this> defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[LazyClassReceiverParameterDescriptor]

'println' @ [101:13] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[JavaMethodDescriptor]

'binding' @ [101:29] ==> value-parameter binding: TypeBinding<*>? defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.print[ValueParameterDescriptorImpl]

'psiElement' @ [101:37] ==> public abstract val psiElement: PsiElement defined in org.jetbrains.kotlin.resolve.typeBinding.TypeBinding[DeserializedPropertyDescriptor]

'text' @ [101:48] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'println' @ [102:13] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[JavaMethodDescriptor]

'binding' @ [102:30] ==> value-parameter binding: TypeBinding<*>? defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.print[ValueParameterDescriptorImpl]

'type' @ [102:38] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.TypeBinding[DeserializedPropertyDescriptor]

'render' @ [102:43] ==> private final fun KotlinType.render(): String defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[SimpleFunctionDescriptorImpl]

'printCollection' @ [104:13] ==> private final fun <T> printCollection(list: Iterable<TypeArgumentBinding<PsiElement>?>, f: AbstractTypeBindingTest.MyPrinter.(TypeArgumentBinding<PsiElement>?) -> Unit): Unit defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> TypeArgumentBinding<PsiElement>?

'binding' @ [104:29] ==> value-parameter binding: TypeBinding<*>? defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.print[ValueParameterDescriptorImpl]

'arguments' @ [104:37] ==> public abstract val arguments: List<TypeArgumentBinding<PsiElement>?> defined in org.jetbrains.kotlin.resolve.typeBinding.TypeBinding[DeserializedPropertyDescriptor]

'print' @ [105:17] ==> public final fun print(argument: TypeArgumentBinding<*>?): AbstractTypeBindingTest.MyPrinter defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[SimpleFunctionDescriptorImpl]

'it' @ [105:23] ==> value-parameter it: TypeArgumentBinding<PsiElement>? defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.print.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [107:20] ==> <this> defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[LazyClassReceiverParameterDescriptor]

'pushIndent' @ [111:13] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[JavaMethodDescriptor]

'list' @ [113:29] ==> value-parameter list: Iterable<T> defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.printCollection[ValueParameterDescriptorImpl]

'if (first) first = false
                else println()' @ [114:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'first' @ [114:21] ==> var first: Boolean defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.printCollection[LocalVariableDescriptor]

'first' @ [114:28] ==> var first: Boolean defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.printCollection[LocalVariableDescriptor]

'println' @ [115:22] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[JavaMethodDescriptor]

'invoke' @ [117:17] ==> public abstract operator fun AbstractTypeBindingTest.MyPrinter.invoke(p2: T): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'element' @ [117:19] ==> val element: T defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter.printCollection[LocalVariableDescriptor]

'popIndent' @ [119:13] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[JavaMethodDescriptor]

'out' @ [122:43] ==> protected/*protected and package*/ final val out: (Appendable..Appendable?) defined in org.jetbrains.kotlin.types.AbstractTypeBindingTest.MyPrinter[JavaPropertyDescriptor]

'toString' @ [122:47] ==> public open fun toString(): String defined in java.lang.Appendable[DeserializedSimpleFunctionDescriptor]

