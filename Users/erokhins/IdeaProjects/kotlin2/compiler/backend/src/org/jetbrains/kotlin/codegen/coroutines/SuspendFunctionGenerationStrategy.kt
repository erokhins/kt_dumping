'FunctionGenerationStrategy.CodegenBased' @ [37:5] ==> public constructor CodegenBased(@NotNull state: GenerationState) defined in org.jetbrains.kotlin.codegen.FunctionGenerationStrategy.CodegenBased[JavaClassConstructorDescriptor]

'state' @ [37:45] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy.<init>[ValueParameterDescriptorImpl]

'getValue' @ [42:50] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'state' @ [43:9] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy.<init>[ValueParameterDescriptorImpl]

'factory' @ [43:15] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'newVisitor' @ [43:23] ==> @NotNull public open fun newVisitor(@NotNull origin: JvmDeclarationOrigin, @NotNull asmType: Type, @NotNull sourceFile: PsiFile): ClassBuilder defined in org.jetbrains.kotlin.codegen.ClassFileFactory[JavaMethodDescriptor]

'OtherOrigin' @ [44:13] ==> @JvmOverloads public fun OtherOrigin(element: PsiElement?, descriptor: DeclarationDescriptor? = ...): JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics[DeserializedSimpleFunctionDescriptor]

'declaration' @ [44:25] ==> private final val declaration: KtFunction defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[PropertyDescriptorImpl]

'originalSuspendDescriptor' @ [44:38] ==> private final val originalSuspendDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[PropertyDescriptorImpl]

'asmTypeForAnonymousClass' @ [45:28] ==> @NotNull public open fun asmTypeForAnonymousClass(@NotNull bindingContext: BindingContext, @NotNull descriptor: CallableDescriptor): Type defined in org.jetbrains.kotlin.codegen.binding.CodegenBinding[JavaMethodDescriptor]

'state' @ [45:53] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy.<init>[ValueParameterDescriptorImpl]

'bindingContext' @ [45:59] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'originalSuspendDescriptor' @ [45:75] ==> private final val originalSuspendDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[PropertyDescriptorImpl]

'declaration' @ [46:13] ==> private final val declaration: KtFunction defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[PropertyDescriptorImpl]

'containingFile' @ [46:25] ==> public final val KtFunction.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'also' @ [47:11] ==> @InlineOnly @SinceKotlin public inline fun <T> ClassBuilder.also(block: (ClassBuilder) -> Unit): ClassBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassBuilder

'CoroutineCodegenForNamedFunction' @ [49:21] ==> public companion object defined in org.jetbrains.kotlin.codegen.coroutines.CoroutineCodegenForNamedFunction[FakeCallableDescriptorForObject]

'create' @ [49:54] ==> public final fun create(cv: ClassBuilder, expressionCodegen: ExpressionCodegen, originalSuspendDescriptor: FunctionDescriptor, declaration: KtFunction): CoroutineCodegenForNamedFunction defined in org.jetbrains.kotlin.codegen.coroutines.CoroutineCodegenForNamedFunction.Companion[SimpleFunctionDescriptorImpl]

'it' @ [49:61] ==> value-parameter it: ClassBuilder defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy.classBuilderForCoroutineState.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'codegen' @ [49:65] ==> private final lateinit var codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[PropertyDescriptorImpl]

'originalSuspendDescriptor' @ [49:74] ==> private final val originalSuspendDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[PropertyDescriptorImpl]

'declaration' @ [49:101] ==> private final val declaration: KtFunction defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[PropertyDescriptorImpl]

'coroutineCodegen' @ [50:13] ==> val coroutineCodegen: CoroutineCodegenForNamedFunction defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy.classBuilderForCoroutineState.<anonymous>.<anonymous>[LocalVariableDescriptor]

'generate' @ [50:30] ==> public open fun generate(): Unit defined in org.jetbrains.kotlin.codegen.coroutines.CoroutineCodegenForNamedFunction[JavaMethodDescriptor]

'access' @ [55:13] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy.wrapMethodVisitor[ValueParameterDescriptorImpl]

'ACC_ABSTRACT' @ [55:32] ==> public const final val ACC_ABSTRACT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'mv' @ [55:58] ==> value-parameter mv: MethodVisitor defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy.wrapMethodVisitor[ValueParameterDescriptorImpl]

'CoroutineTransformerMethodVisitor' @ [57:16] ==> public constructor CoroutineTransformerMethodVisitor(delegate: MethodVisitor, access: Int, name: String, desc: String, signature: String?, exceptions: Array<out String>?, containingClassInternalName: String, obtainClassBuilderForCoroutineState: () -> ClassBuilder, isForNamedFunction: Boolean, element: KtElement, needDispatchReceiver: Boolean = ..., internalNameForDispatchReceiver: String? = ...) defined in org.jetbrains.kotlin.codegen.coroutines.CoroutineTransformerMethodVisitor[ClassConstructorDescriptorImpl]

'mv' @ [58:17] ==> value-parameter mv: MethodVisitor defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy.wrapMethodVisitor[ValueParameterDescriptorImpl]

'access' @ [58:21] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy.wrapMethodVisitor[ValueParameterDescriptorImpl]

'name' @ [58:29] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy.wrapMethodVisitor[ValueParameterDescriptorImpl]

'desc' @ [58:35] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy.wrapMethodVisitor[ValueParameterDescriptorImpl]

'containingClassInternalName' @ [58:53] ==> private final val containingClassInternalName: String defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[PropertyDescriptorImpl]

'this' @ [58:82] ==> <this> defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[LazyClassReceiverParameterDescriptor]

'classBuilderForCoroutineState' @ [58:88] ==> private final val classBuilderForCoroutineState: ClassBuilder defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[PropertyDescriptorImpl]

'declaration' @ [60:27] ==> private final val declaration: KtFunction defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[PropertyDescriptorImpl]

'originalSuspendDescriptor' @ [61:40] ==> private final val originalSuspendDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[PropertyDescriptorImpl]

'dispatchReceiverParameter' @ [61:66] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'containingClassInternalNameOrNull' @ [62:51] ==> private final fun containingClassInternalNameOrNull(): String? defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[SimpleFunctionDescriptorImpl]

'also' @ [63:11] ==> @InlineOnly @SinceKotlin public inline fun <T> CoroutineTransformerMethodVisitor.also(block: (CoroutineTransformerMethodVisitor) -> Unit): CoroutineTransformerMethodVisitor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineTransformerMethodVisitor

'transformer' @ [64:13] ==> private final lateinit var transformer: CoroutineTransformerMethodVisitor defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[PropertyDescriptorImpl]

'it' @ [64:27] ==> value-parameter it: CoroutineTransformerMethodVisitor defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy.wrapMethodVisitor.<anonymous>[ValueParameterDescriptorImpl]

'originalSuspendDescriptor' @ [69:13] ==> private final val originalSuspendDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[PropertyDescriptorImpl]

'containingDeclaration' @ [69:39] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'safeAs' @ [69:61] ==> public inline fun <reified T : Any> Any?.safeAs(): ClassDescriptor? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ClassDescriptor

'let' @ [69:88] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> Type): Type defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> Type

'state' @ [69:92] ==> protected/*protected and package*/ final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[JavaPropertyDescriptor]

'typeMapper' @ [69:98] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'mapClass' @ [69:110] ==> @NotNull public open fun mapClass(@NotNull classifier: ClassifierDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'internalName' @ [69:121] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'this' @ [72:9] ==> <this> defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[LazyClassReceiverParameterDescriptor]

'codegen' @ [72:14] ==> private final lateinit var codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[PropertyDescriptorImpl]

'codegen' @ [72:24] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy.doGenerateBody[ValueParameterDescriptorImpl]

'codegen' @ [73:9] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy.doGenerateBody[ValueParameterDescriptorImpl]

'returnExpression' @ [73:17] ==> public open fun returnExpression(expr: (KtExpression..KtExpression?)): Unit defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'declaration' @ [73:34] ==> private final val declaration: KtFunction defined in org.jetbrains.kotlin.codegen.coroutines.SuspendFunctionGenerationStrategy[PropertyDescriptorImpl]

'bodyExpression' @ [73:46] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

