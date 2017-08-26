'CodeFragmentFactory' @ [62:34] ==> public constructor CodeFragmentFactory() defined in com.intellij.debugger.engine.evaluation.CodeFragmentFactory[JavaClassConstructorDescriptor]

'getInstance' @ [63:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'this' @ [63:42] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory[LazyClassReceiverParameterDescriptor]

'java' @ [63:54] ==> public val <T> KClass<out KotlinCodeFragmentFactory>.java: Class<out KotlinCodeFragmentFactory> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out KotlinCodeFragmentFactory)

'getWrappedContextElement' @ [66:30] ==> private final fun getWrappedContextElement(project: Project, context: PsiElement?): PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory[SimpleFunctionDescriptorImpl]

'project' @ [66:55] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[ValueParameterDescriptorImpl]

'context' @ [66:64] ==> value-parameter context: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[ValueParameterDescriptorImpl]

'contextElement' @ [67:13] ==> val contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[LocalVariableDescriptor]

'LOG' @ [68:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory[PropertyDescriptorImpl]

'warn' @ [68:17] ==> public open fun warn(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'context' @ [68:84] ==> value-parameter context: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [68:93] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'if (item.kind == CodeFragmentKind.EXPRESSION) {
            KtExpressionCodeFragment(
                    project,
                    "fragment.kt",
                    item.text,
                    initImports(item.imports),
                    contextElement
            )
        }
        else {
            KtBlockCodeFragment(
                    project,
                    "fragment.kt",
                    item.text,
                    initImports(item.imports),
                    contextElement
            )
        }' @ [70:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtCodeFragment, elseBranch: KtCodeFragment): KtCodeFragment[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtCodeFragment

'item' @ [70:32] ==> value-parameter item: TextWithImports defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[ValueParameterDescriptorImpl]

'kind' @ [70:37] ==> public final val TextWithImports.kind: (CodeFragmentKind..CodeFragmentKind?)[MyPropertyDescriptor]

'EXPRESSION' @ [70:62] ==> enum entry EXPRESSION defined in com.intellij.debugger.engine.evaluation.CodeFragmentKind[FakeCallableDescriptorForObject]

'KtExpressionCodeFragment' @ [71:13] ==> public constructor KtExpressionCodeFragment(project: Project, name: String, text: CharSequence, imports: String?, context: PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpressionCodeFragment[DeserializedClassConstructorDescriptor]

'project' @ [72:21] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[ValueParameterDescriptorImpl]

'item' @ [74:21] ==> value-parameter item: TextWithImports defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[ValueParameterDescriptorImpl]

'text' @ [74:26] ==> public final var TextWithImports.text: (String..String?)[MyPropertyDescriptor]

'initImports' @ [75:21] ==> private final fun initImports(imports: String?): String? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory[SimpleFunctionDescriptorImpl]

'item' @ [75:33] ==> value-parameter item: TextWithImports defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[ValueParameterDescriptorImpl]

'imports' @ [75:38] ==> public final val TextWithImports.imports: String[MyPropertyDescriptor]

'contextElement' @ [76:21] ==> val contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[LocalVariableDescriptor]

'KtBlockCodeFragment' @ [80:13] ==> public constructor KtBlockCodeFragment(project: Project, name: String, text: CharSequence, imports: String?, context: PsiElement?) defined in org.jetbrains.kotlin.psi.KtBlockCodeFragment[DeserializedClassConstructorDescriptor]

'project' @ [81:21] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[ValueParameterDescriptorImpl]

'item' @ [83:21] ==> value-parameter item: TextWithImports defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[ValueParameterDescriptorImpl]

'text' @ [83:26] ==> public final var TextWithImports.text: (String..String?)[MyPropertyDescriptor]

'initImports' @ [84:21] ==> private final fun initImports(imports: String?): String? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory[SimpleFunctionDescriptorImpl]

'item' @ [84:33] ==> value-parameter item: TextWithImports defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[ValueParameterDescriptorImpl]

'imports' @ [84:38] ==> public final val TextWithImports.imports: String[MyPropertyDescriptor]

'contextElement' @ [85:21] ==> val contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[LocalVariableDescriptor]

'codeFragment' @ [89:9] ==> val codeFragment: KtCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[LocalVariableDescriptor]

'putCopyableUserData' @ [89:22] ==> public open fun <T : (Any..Any?)> putCopyableUserData(@NotNull p0: Key<((KtExpression) -> KotlinType?..((KtExpression) -> KotlinType?)?)>, p1: ((KtExpression) -> KotlinType?)?): Unit defined in org.jetbrains.kotlin.psi.KtCodeFragment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ((org.jetbrains.kotlin.psi.KtExpression) -> org.jetbrains.kotlin.types.KotlinType?..((org.jetbrains.kotlin.psi.KtExpression) -> org.jetbrains.kotlin.types.KotlinType?)?)

'RUNTIME_TYPE_EVALUATOR' @ [89:57] ==> public final val RUNTIME_TYPE_EVALUATOR: Key<(KtExpression) -> KotlinType?> defined in org.jetbrains.kotlin.psi.KtCodeFragment.Companion[DeserializedPropertyDescriptor]

'getInstanceEx' @ [92:53] ==> public open fun getInstanceEx(p0: (Project..Project?)): (DebuggerManagerEx..DebuggerManagerEx?) defined in com.intellij.debugger.DebuggerManagerEx[JavaMethodDescriptor]

'project' @ [92:67] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[ValueParameterDescriptorImpl]

'context' @ [92:76] ==> public final val DebuggerManagerEx.context: DebuggerContextImpl[MyPropertyDescriptor]

'debuggerContext' @ [93:35] ==> val debuggerContext: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'debuggerSession' @ [93:51] ==> public final val DebuggerContextImpl.debuggerSession: DebuggerSession?[MyPropertyDescriptor]

'if (debuggerSession == null ||  debuggerContext.suspendContext == null) {
                null
            }
            else {
                val semaphore = Semaphore()
                semaphore.down()
                val nameRef = AtomicReference<KotlinType>()
                val worker = object : KotlinRuntimeTypeEvaluator(null, expression, debuggerContext, ProgressManager.getInstance().progressIndicator) {
                    override fun typeCalculationFinished(type: KotlinType?) {
                        nameRef.set(type)
                        semaphore.up()
                    }
                }

                debuggerContext.debugProcess?.managerThread?.invoke(worker)

                for (i in 0..50) {
                    ProgressManager.checkCanceled()
                    if (semaphore.waitFor(20)) break
                }

                nameRef.get()
            }' @ [94:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'debuggerSession' @ [94:17] ==> val debuggerSession: DebuggerSession? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'debuggerContext' @ [94:45] ==> val debuggerContext: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'suspendContext' @ [94:61] ==> public final val DebuggerContextImpl.suspendContext: SuspendContextImpl?[MyPropertyDescriptor]

'Semaphore' @ [98:33] ==> public constructor Semaphore() defined in com.intellij.util.concurrency.Semaphore[JavaClassConstructorDescriptor]

'semaphore' @ [99:17] ==> val semaphore: Semaphore defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'down' @ [99:27] ==> public open fun down(): Unit defined in com.intellij.util.concurrency.Semaphore[JavaMethodDescriptor]

'AtomicReference' @ [100:31] ==> public constructor AtomicReference<V : (Any..Any?)>() defined in java.util.concurrent.atomic.AtomicReference[JavaClassConstructorDescriptor]
Inferred types:
    <V : (Any..Any?)> -> KotlinType

'KotlinRuntimeTypeEvaluator' @ [101:39] ==> public constructor KotlinRuntimeTypeEvaluator(editor: Editor?, expression: KtExpression, context: DebuggerContextImpl, indicator: ProgressIndicator) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator[ClassConstructorDescriptorImpl]

'expression' @ [101:72] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[ValueParameterDescriptorImpl]

'debuggerContext' @ [101:84] ==> val debuggerContext: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'getInstance' @ [101:117] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'progressIndicator' @ [101:131] ==> public final val ProgressManager.progressIndicator: (ProgressIndicator..ProgressIndicator?)[MyPropertyDescriptor]

'nameRef' @ [103:25] ==> val nameRef: AtomicReference<KotlinType> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'set' @ [103:33] ==> public final fun set(p0: (KotlinType..KotlinType?)): Unit defined in java.util.concurrent.atomic.AtomicReference[JavaMethodDescriptor]

'type' @ [103:37] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>.<no name provided>.typeCalculationFinished[ValueParameterDescriptorImpl]

'semaphore' @ [104:25] ==> val semaphore: Semaphore defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'up' @ [104:35] ==> public open fun up(): Unit defined in com.intellij.util.concurrency.Semaphore[JavaMethodDescriptor]

'debuggerContext' @ [108:17] ==> val debuggerContext: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'debugProcess' @ [108:33] ==> public final val DebuggerContextImpl.debugProcess: DebugProcessImpl?[MyPropertyDescriptor]

'managerThread' @ [108:47] ==> public final val DebugProcessImpl.managerThread: (DebuggerManagerThreadImpl..DebuggerManagerThreadImpl?)[MyPropertyDescriptor]

'invoke' @ [108:62] ==> public open operator fun invoke(p0: (DebuggerCommandImpl..DebuggerCommandImpl?)): Unit defined in com.intellij.debugger.engine.DebuggerManagerThreadImpl[JavaMethodDescriptor]

'worker' @ [108:69] ==> val worker: <no name provided> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'..' @ [110:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'checkCanceled' @ [111:37] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'semaphore' @ [112:25] ==> val semaphore: Semaphore defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'waitFor' @ [112:35] ==> public open fun waitFor(p0: Long): Boolean defined in com.intellij.util.concurrency.Semaphore[JavaMethodDescriptor]

'nameRef' @ [115:17] ==> val nameRef: AtomicReference<KotlinType> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'get' @ [115:25] ==> public final fun get(): (KotlinType..KotlinType?) defined in java.util.concurrent.atomic.AtomicReference[JavaMethodDescriptor]

'contextElement' @ [119:13] ==> val contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[LocalVariableDescriptor]

'contextElement' @ [119:39] ==> val contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[LocalVariableDescriptor]

'codeFragment' @ [120:13] ==> val codeFragment: KtCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[LocalVariableDescriptor]

'putCopyableUserData' @ [120:26] ==> public open fun <T : (Any..Any?)> putCopyableUserData(@NotNull p0: Key<(() -> KtElement..(() -> KtElement)?)>, p1: (() -> KtElement)?): Unit defined in org.jetbrains.kotlin.psi.KtCodeFragment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (() -> org.jetbrains.kotlin.psi.KtElement..(() -> org.jetbrains.kotlin.psi.KtElement)?)

'FAKE_CONTEXT_FOR_JAVA_FILE' @ [120:61] ==> public final val FAKE_CONTEXT_FOR_JAVA_FILE: Key<() -> KtElement> defined in org.jetbrains.kotlin.psi.KtCodeFragment.Companion[DeserializedPropertyDescriptor]

'createFakeFileWithJavaContextElement' @ [121:33] ==> private final fun createFakeFileWithJavaContextElement(funWithLocalVariables: String, javaContext: PsiElement): KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory[SimpleFunctionDescriptorImpl]

'contextElement' @ [121:74] ==> val contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[LocalVariableDescriptor]

'getInstanceEx' @ [123:57] ==> public open fun getInstanceEx(p0: (Project..Project?)): (DebuggerManagerEx..DebuggerManagerEx?) defined in com.intellij.debugger.DebuggerManagerEx[JavaMethodDescriptor]

'project' @ [123:71] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[ValueParameterDescriptorImpl]

'context' @ [123:80] ==> public final val DebuggerManagerEx.context: DebuggerContextImpl[MyPropertyDescriptor]

'debuggerContext' @ [124:39] ==> val debuggerContext: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'debuggerSession' @ [124:55] ==> public final val DebuggerContextImpl.debuggerSession: DebuggerSession?[MyPropertyDescriptor]

'debuggerSession' @ [125:22] ==> val debuggerSession: DebuggerSession? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'debuggerContext' @ [125:49] ==> val debuggerContext: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'suspendContext' @ [125:65] ==> public final val DebuggerContextImpl.suspendContext: SuspendContextImpl?[MyPropertyDescriptor]

'!' @ [125:92] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [125:112] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [125:129] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'LOG' @ [126:21] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory[PropertyDescriptorImpl]

'warn' @ [126:25] ==> public open fun warn(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'emptyFile' @ [127:48] ==> val emptyFile: KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'getFrameInfo' @ [130:39] ==> private final fun getFrameInfo(contextElement: PsiElement?, debuggerContext: DebuggerContextImpl): KotlinCodeFragmentFactory.FrameInfo? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory[SimpleFunctionDescriptorImpl]

'contextElement' @ [130:52] ==> val contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[LocalVariableDescriptor]

'debuggerContext' @ [130:68] ==> val debuggerContext: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'frameDescriptor' @ [131:21] ==> val frameDescriptor: KotlinCodeFragmentFactory.FrameInfo? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'LOG' @ [132:21] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory[PropertyDescriptorImpl]

'warn' @ [132:25] ==> public open fun warn(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'debuggerContext' @ [132:88] ==> val debuggerContext: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'sourcePosition' @ [132:104] ==> public final val DebuggerContextImpl.sourcePosition: (SourcePosition..SourcePosition?)[MyPropertyDescriptor]

'file' @ [132:119] ==> public final val SourcePosition.file: PsiFile[MyPropertyDescriptor]

'name' @ [132:124] ==> public final var PsiFile.name: String[MyPropertyDescriptor]

'debuggerContext' @ [132:132] ==> val debuggerContext: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'sourcePosition' @ [132:148] ==> public final val DebuggerContextImpl.sourcePosition: (SourcePosition..SourcePosition?)[MyPropertyDescriptor]

'line' @ [132:163] ==> public final val SourcePosition.line: Int[MyPropertyDescriptor]

'emptyFile' @ [133:48] ==> val emptyFile: KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'frameDescriptor' @ [136:45] ==> val frameDescriptor: KotlinCodeFragmentFactory.FrameInfo? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'thisObject' @ [136:61] ==> public final val thisObject: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.FrameInfo[PropertyDescriptorImpl]

'let' @ [136:73] ==> @InlineOnly public inline fun <T, R> Value.let(block: (Value) -> KtProperty?): KtProperty? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Value
    <R> -> KtProperty?

'createKotlinProperty' @ [136:79] ==> private final fun createKotlinProperty(project: Project, variableName: String, variableTypeName: String, value: Value): KtProperty? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion[SimpleFunctionDescriptorImpl]

'project' @ [136:100] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[ValueParameterDescriptorImpl]

'it' @ [136:119] ==> value-parameter it: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [136:122] ==> public abstract fun type(): (Type..Type?) defined in com.sun.jdi.Value[JavaMethodDescriptor]

'name' @ [136:129] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.Type[JavaMethodDescriptor]

'it' @ [136:137] ==> value-parameter it: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [136:144] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'receiverTypeReference' @ [137:40] ==> val receiverTypeReference: KtTypeReference? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'let' @ [137:63] ==> @InlineOnly public inline fun <T, R> KtTypeReference.let(block: (KtTypeReference) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> String

'it' @ [137:72] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [137:75] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'frameDescriptor' @ [139:43] ==> val frameDescriptor: KotlinCodeFragmentFactory.FrameInfo? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'visibleVariables' @ [139:59] ==> public final val visibleVariables: Map<LocalVariable, Value> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.FrameInfo[PropertyDescriptorImpl]

'entries' @ [139:76] ==> public abstract val entries: Set<Map.Entry<LocalVariable, Value>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'associate' @ [139:84] ==> public inline fun <T, K, V> Iterable<Map.Entry<LocalVariable, Value>>.associate(transform: (Map.Entry<LocalVariable, Value>) -> Pair<(String..String?), Value>): Map<(String..String?), Value> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<LocalVariable, Value>
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> Value

'it' @ [139:96] ==> value-parameter it: Map.Entry<LocalVariable, Value> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [139:99] ==> public abstract val key: LocalVariable defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'name' @ [139:103] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.LocalVariable[JavaMethodDescriptor]

'it' @ [139:113] ==> value-parameter it: Map.Entry<LocalVariable, Value> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [139:116] ==> public abstract val value: Value defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'kotlinVariablesAsText' @ [139:124] ==> private final fun Map<String, Value>.kotlinVariablesAsText(project: Project): String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion[SimpleFunctionDescriptorImpl]

'project' @ [139:146] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[ValueParameterDescriptorImpl]

'receiverTypeText' @ [141:47] ==> val receiverTypeText: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'kotlinVariablesText' @ [141:94] ==> val kotlinVariablesText: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'createFakeFileWithJavaContextElement' @ [143:32] ==> private final fun createFakeFileWithJavaContextElement(funWithLocalVariables: String, javaContext: PsiElement): KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory[SimpleFunctionDescriptorImpl]

'fakeFunctionText' @ [143:69] ==> val fakeFunctionText: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'contextElement' @ [143:87] ==> val contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[LocalVariableDescriptor]

'fakeFile' @ [144:36] ==> val fakeFile: KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'declarations' @ [144:45] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'firstOrNull' @ [144:58] ==> public fun <T> List<(KtDeclaration..KtDeclaration?)>.firstOrNull(): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'fakeFunction' @ [145:36] ==> val fakeFunction: KtFunction? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'bodyExpression' @ [145:50] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'statements' @ [145:89] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'lastOrNull' @ [145:101] ==> public fun <T> List<(KtExpression..KtExpression?)>.lastOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'wrapContextIfNeeded' @ [147:44] ==> private final fun wrapContextIfNeeded(project: Project, originalContext: PsiElement?, newContext: KtElement?): KtElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory[SimpleFunctionDescriptorImpl]

'project' @ [147:64] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[ValueParameterDescriptorImpl]

'contextElement' @ [147:73] ==> val contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[LocalVariableDescriptor]

'fakeContext' @ [147:89] ==> val fakeContext: KtExpression? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'emptyFile' @ [147:105] ==> val emptyFile: KtFile defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment.<anonymous>[LocalVariableDescriptor]

'codeFragment' @ [152:16] ==> val codeFragment: KtCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createCodeFragment[LocalVariableDescriptor]

'Semaphore' @ [156:25] ==> public constructor Semaphore() defined in com.intellij.util.concurrency.Semaphore[JavaClassConstructorDescriptor]

'semaphore' @ [157:9] ==> val semaphore: Semaphore defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getFrameInfo[LocalVariableDescriptor]

'down' @ [157:19] ==> public open fun down(): Unit defined in com.intellij.util.concurrency.Semaphore[JavaMethodDescriptor]

'DebuggerCommandImpl' @ [161:31] ==> public constructor DebuggerCommandImpl() defined in com.intellij.debugger.engine.events.DebuggerCommandImpl[JavaClassConstructorDescriptor]

'if (ApplicationManager.getApplication().isUnitTestMode)
                        contextElement?.getCopyableUserData(DEBUG_CONTEXT_FOR_TESTS)?.frameProxy?.stackFrame
                    else
                        debuggerContext.frameProxy?.stackFrame' @ [164:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StackFrame?, elseBranch: StackFrame?): StackFrame?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StackFrame?

'getApplication' @ [164:56] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [164:73] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'contextElement' @ [165:25] ==> value-parameter contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getFrameInfo[ValueParameterDescriptorImpl]

'getCopyableUserData' @ [165:41] ==> @Nullable @Contract public abstract fun <T : (Any..Any?)> getCopyableUserData(p0: (Key<(DebuggerContextImpl..DebuggerContextImpl?)>..Key<(DebuggerContextImpl..DebuggerContextImpl?)>?)): DebuggerContextImpl? defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.debugger.impl.DebuggerContextImpl..com.intellij.debugger.impl.DebuggerContextImpl?)

'DEBUG_CONTEXT_FOR_TESTS' @ [165:61] ==> @TestOnly public final val DEBUG_CONTEXT_FOR_TESTS: Key<DebuggerContextImpl> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion[PropertyDescriptorImpl]

'frameProxy' @ [165:87] ==> public final val DebuggerContextImpl.frameProxy: StackFrameProxyImpl?[MyPropertyDescriptor]

'stackFrame' @ [165:99] ==> public final val StackFrameProxyImpl.stackFrame: (StackFrame..StackFrame?)[MyPropertyDescriptor]

'debuggerContext' @ [167:25] ==> value-parameter debuggerContext: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getFrameInfo[ValueParameterDescriptorImpl]

'frameProxy' @ [167:41] ==> public final val DebuggerContextImpl.frameProxy: StackFrameProxyImpl?[MyPropertyDescriptor]

'stackFrame' @ [167:53] ==> public final val StackFrameProxyImpl.stackFrame: (StackFrame..StackFrame?)[MyPropertyDescriptor]

'frame' @ [169:44] ==> val frame: StackFrame? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getFrameInfo.<no name provided>.action[LocalVariableDescriptor]

'let' @ [169:51] ==> @InlineOnly public inline fun <T, R> StackFrame.let(block: (StackFrame) -> Map<(LocalVariable..LocalVariable?), (Value..Value?)>): Map<(LocalVariable..LocalVariable?), (Value..Value?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StackFrame
    <R> -> Map<(com.sun.jdi.LocalVariable..com.sun.jdi.LocalVariable?), (com.sun.jdi.Value..com.sun.jdi.Value?)>

'it' @ [170:38] ==> value-parameter it: StackFrame defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getFrameInfo.<no name provided>.action.<anonymous>[ValueParameterDescriptorImpl]

'getValues' @ [170:41] ==> public abstract fun getValues(p0: (MutableList<out (LocalVariable..LocalVariable?)>..List<(LocalVariable..LocalVariable?)>?)): (MutableMap<(LocalVariable..LocalVariable?), (Value..Value?)>..Map<(LocalVariable..LocalVariable?), (Value..Value?)>?) defined in com.sun.jdi.StackFrame[JavaMethodDescriptor]

'it' @ [170:51] ==> value-parameter it: StackFrame defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getFrameInfo.<no name provided>.action.<anonymous>[ValueParameterDescriptorImpl]

'visibleVariables' @ [170:54] ==> public abstract fun visibleVariables(): (MutableList<(LocalVariable..LocalVariable?)>..List<(LocalVariable..LocalVariable?)>?) defined in com.sun.jdi.StackFrame[JavaMethodDescriptor]

'values' @ [171:25] ==> val values: (MutableMap<(LocalVariable..LocalVariable?), (Value..Value?)>..Map<(LocalVariable..LocalVariable?), (Value..Value?)>?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getFrameInfo.<no name provided>.action.<anonymous>[LocalVariableDescriptor]

'filterValues' @ [171:32] ==> public inline fun <K, V> Map<out (LocalVariable..LocalVariable?), (Value..Value?)>.filterValues(predicate: ((Value..Value?)) -> Boolean): Map<(LocalVariable..LocalVariable?), (Value..Value?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.sun.jdi.LocalVariable..com.sun.jdi.LocalVariable?)
    <V> -> (com.sun.jdi.Value..com.sun.jdi.Value?)

'it' @ [171:47] ==> value-parameter it: (Value..Value?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getFrameInfo.<no name provided>.action.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'emptyMap' @ [172:26] ==> public fun <K, V> emptyMap(): Map<(LocalVariable..LocalVariable?), (Value..Value?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.sun.jdi.LocalVariable..com.sun.jdi.LocalVariable?)
    <V> -> (com.sun.jdi.Value..com.sun.jdi.Value?)

'frameInfo' @ [174:21] ==> var frameInfo: KotlinCodeFragmentFactory.FrameInfo? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getFrameInfo[LocalVariableDescriptor]

'FrameInfo' @ [174:33] ==> public constructor FrameInfo(thisObject: Value?, visibleVariables: Map<LocalVariable, Value>) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.FrameInfo[ClassConstructorDescriptorImpl]

'frame' @ [174:43] ==> val frame: StackFrame? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getFrameInfo.<no name provided>.action[LocalVariableDescriptor]

'thisObject' @ [174:50] ==> public abstract fun thisObject(): (ObjectReference..ObjectReference?) defined in com.sun.jdi.StackFrame[JavaMethodDescriptor]

'visibleVariables' @ [174:64] ==> val visibleVariables: Map<(LocalVariable..LocalVariable?), (Value..Value?)> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getFrameInfo.<no name provided>.action[LocalVariableDescriptor]

'semaphore' @ [180:21] ==> val semaphore: Semaphore defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getFrameInfo[LocalVariableDescriptor]

'up' @ [180:31] ==> public open fun up(): Unit defined in com.intellij.util.concurrency.Semaphore[JavaMethodDescriptor]

'debuggerContext' @ [185:9] ==> value-parameter debuggerContext: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getFrameInfo[ValueParameterDescriptorImpl]

'debugProcess' @ [185:25] ==> public final val DebuggerContextImpl.debugProcess: DebugProcessImpl?[MyPropertyDescriptor]

'managerThread' @ [185:39] ==> public final val DebugProcessImpl.managerThread: (DebuggerManagerThreadImpl..DebuggerManagerThreadImpl?)[MyPropertyDescriptor]

'invoke' @ [185:54] ==> public open operator fun invoke(p0: (DebuggerCommandImpl..DebuggerCommandImpl?)): Unit defined in com.intellij.debugger.engine.DebuggerManagerThreadImpl[JavaMethodDescriptor]

'worker' @ [185:61] ==> val worker: <no name provided> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getFrameInfo[LocalVariableDescriptor]

'..' @ [187:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'semaphore' @ [188:17] ==> val semaphore: Semaphore defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getFrameInfo[LocalVariableDescriptor]

'waitFor' @ [188:27] ==> public open fun waitFor(p0: Long): Boolean defined in com.intellij.util.concurrency.Semaphore[JavaMethodDescriptor]

'frameInfo' @ [191:16] ==> var frameInfo: KotlinCodeFragmentFactory.FrameInfo? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getFrameInfo[LocalVariableDescriptor]

'imports' @ [197:13] ==> value-parameter imports: String? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.initImports[ValueParameterDescriptorImpl]

'!' @ [197:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'imports' @ [197:33] ==> value-parameter imports: String? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.initImports[ValueParameterDescriptorImpl]

'isEmpty' @ [197:41] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'imports' @ [198:20] ==> value-parameter imports: String? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.initImports[ValueParameterDescriptorImpl]

'split' @ [198:28] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'IMPORT_SEPARATOR' @ [198:49] ==> public final val IMPORT_SEPARATOR: String defined in org.jetbrains.kotlin.psi.KtCodeFragment.Companion[DeserializedPropertyDescriptor]

'mapNotNull' @ [199:22] ==> public inline fun <T, R : Any> Iterable<String>.mapNotNull(transform: (String) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Any> -> String

'fixImportIfNeeded' @ [199:35] ==> private final fun fixImportIfNeeded(import: String): String? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory[SimpleFunctionDescriptorImpl]

'it' @ [199:53] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.initImports.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [200:22] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'IMPORT_SEPARATOR' @ [200:50] ==> public final val IMPORT_SEPARATOR: String defined in org.jetbrains.kotlin.psi.KtCodeFragment.Companion[DeserializedPropertyDescriptor]

'import' @ [207:13] ==> value-parameter import: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.fixImportIfNeeded[ValueParameterDescriptorImpl]

'endsWith' @ [207:20] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fixImportIfNeeded' @ [208:20] ==> private final fun fixImportIfNeeded(import: String): String? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory[SimpleFunctionDescriptorImpl]

'import' @ [208:38] ==> value-parameter import: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.fixImportIfNeeded[ValueParameterDescriptorImpl]

'removeSuffix' @ [208:45] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trim' @ [208:64] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!=' @ [212:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'boxIfPossible' @ [212:26] ==> @Contract @Nullable public open fun boxIfPossible(p0: (String..String?)): String? defined in com.intellij.psi.util.PsiTypesUtil[JavaMethodDescriptor]

'import' @ [212:40] ==> value-parameter import: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.fixImportIfNeeded[ValueParameterDescriptorImpl]

'import' @ [212:51] ==> value-parameter import: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.fixImportIfNeeded[ValueParameterDescriptorImpl]

'import' @ [215:16] ==> value-parameter import: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.fixImportIfNeeded[ValueParameterDescriptorImpl]

'getContextElement' @ [219:26] ==> public final fun getContextElement(elementAt: PsiElement?): PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion[SimpleFunctionDescriptorImpl]

'context' @ [219:44] ==> value-parameter context: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getWrappedContextElement[ValueParameterDescriptorImpl]

'newContext' @ [220:13] ==> val newContext: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getWrappedContextElement[LocalVariableDescriptor]

'newContext' @ [220:46] ==> val newContext: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getWrappedContextElement[LocalVariableDescriptor]

'wrapContextIfNeeded' @ [221:16] ==> private final fun wrapContextIfNeeded(project: Project, originalContext: PsiElement?, newContext: KtElement?): KtElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory[SimpleFunctionDescriptorImpl]

'project' @ [221:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getWrappedContextElement[ValueParameterDescriptorImpl]

'context' @ [221:45] ==> value-parameter context: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getWrappedContextElement[ValueParameterDescriptorImpl]

'newContext' @ [221:54] ==> val newContext: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.getWrappedContextElement[LocalVariableDescriptor]

'createCodeFragment' @ [225:34] ==> public open fun createCodeFragment(item: TextWithImports, context: PsiElement?, project: Project): JavaCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory[SimpleFunctionDescriptorImpl]

'item' @ [225:53] ==> value-parameter item: TextWithImports defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[ValueParameterDescriptorImpl]

'context' @ [225:59] ==> value-parameter context: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[ValueParameterDescriptorImpl]

'project' @ [225:68] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[ValueParameterDescriptorImpl]

'hasErrorElements' @ [226:25] ==> public open fun hasErrorElements(@NotNull p0: PsiElement): Boolean defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'kotlinCodeFragment' @ [226:42] ==> val kotlinCodeFragment: JavaCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[LocalVariableDescriptor]

'kotlinCodeFragment' @ [226:65] ==> val kotlinCodeFragment: JavaCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[LocalVariableDescriptor]

'getInstance' @ [228:43] ==> public open fun getInstance(p0: (Project..Project?)): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.PsiElementFactory.SERVICE[JavaMethodDescriptor]

'project' @ [228:55] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[ValueParameterDescriptorImpl]

'createExpressionFromText' @ [228:64] ==> @NotNull public abstract fun createExpressionFromText(@NotNull p0: String, @Nullable p1: PsiElement?): PsiExpression defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'item' @ [228:89] ==> value-parameter item: TextWithImports defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[ValueParameterDescriptorImpl]

'text' @ [228:94] ==> public final var TextWithImports.text: (String..String?)[MyPropertyDescriptor]

'context' @ [228:100] ==> value-parameter context: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[ValueParameterDescriptorImpl]

'kotlinCodeFragment' @ [235:17] ==> val kotlinCodeFragment: JavaCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[LocalVariableDescriptor]

'importsAsImportList' @ [235:36] ==> public final fun importsAsImportList(): KtImportList? defined in org.jetbrains.kotlin.psi.KtExpressionCodeFragment[DeserializedSimpleFunctionDescriptor]

'let' @ [235:59] ==> @InlineOnly public inline fun <T, R> KtImportList.let(block: (KtImportList) -> PsiImportList?): PsiImportList? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtImportList
    <R> -> PsiImportList?

'getInstance' @ [236:37] ==> public open fun getInstance(p0: (Project..Project?)): (PsiFileFactory..PsiFileFactory?) defined in com.intellij.psi.PsiFileFactory[JavaMethodDescriptor]

'project' @ [236:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[ValueParameterDescriptorImpl]

'createFileFromText' @ [236:58] ==> @NotNull public abstract fun createFileFromText(@NonNls @NotNull p0: String, @NotNull p1: FileType, @NotNull p2: CharSequence): PsiFile defined in com.intellij.psi.PsiFileFactory[JavaMethodDescriptor]

'INSTANCE' @ [237:56] ==> public final val INSTANCE: (JavaFileType..JavaFileType?) defined in com.intellij.ide.highlighter.JavaFileType[JavaPropertyDescriptor]

'it' @ [237:66] ==> value-parameter it: KtImportList defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [237:69] ==> public final val KtImportList.text: (String..String?)[MyPropertyDescriptor]

'importList' @ [238:41] ==> public final val PsiJavaFile.importList: PsiImportList?[MyPropertyDescriptor]

'javaExpression' @ [245:17] ==> val javaExpression: PsiExpression? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[LocalVariableDescriptor]

'project' @ [247:17] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[ValueParameterDescriptorImpl]

'executeWriteCommand' @ [247:25] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'javaExpression' @ [248:35] ==> val javaExpression: PsiExpression? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[LocalVariableDescriptor]

'j2kText' @ [248:50] ==> public fun PsiElement.j2kText(): String? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'importList' @ [249:38] ==> val importList: PsiImportList? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[LocalVariableDescriptor]

'j2kText' @ [249:50] ==> public fun PsiElement.j2kText(): String? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'newText' @ [250:25] ==> val newText: String? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment.<anonymous>[LocalVariableDescriptor]

'convertedFragment' @ [251:25] ==> var convertedFragment: KtExpressionCodeFragment? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[LocalVariableDescriptor]

'KtExpressionCodeFragment' @ [251:45] ==> public constructor KtExpressionCodeFragment(project: Project, name: String, text: CharSequence, imports: String?, context: PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpressionCodeFragment[DeserializedClassConstructorDescriptor]

'project' @ [252:33] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[ValueParameterDescriptorImpl]

'kotlinCodeFragment' @ [253:33] ==> val kotlinCodeFragment: JavaCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[LocalVariableDescriptor]

'name' @ [253:52] ==> public final var KtExpressionCodeFragment.name: String[MyPropertyDescriptor]

'newText' @ [254:33] ==> val newText: String? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment.<anonymous>[LocalVariableDescriptor]

'newImports' @ [255:33] ==> val newImports: String? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment.<anonymous>[LocalVariableDescriptor]

'kotlinCodeFragment' @ [256:33] ==> val kotlinCodeFragment: JavaCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[LocalVariableDescriptor]

'context' @ [256:52] ==> public final val KtExpressionCodeFragment.context: PsiElement?[MyPropertyDescriptor]

'AfterConversionPass' @ [259:25] ==> public constructor AfterConversionPass(project: Project, postProcessor: PostProcessor) defined in org.jetbrains.kotlin.j2k.AfterConversionPass[DeserializedClassConstructorDescriptor]

'project' @ [259:45] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[ValueParameterDescriptorImpl]

'J2kPostProcessor' @ [259:54] ==> public constructor J2kPostProcessor(formatCode: Boolean) defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor[ClassConstructorDescriptorImpl]

'run' @ [259:92] ==> public final fun run(kotlinFile: KtFile, range: TextRange?): Unit defined in org.jetbrains.kotlin.j2k.AfterConversionPass[DeserializedSimpleFunctionDescriptor]

'convertedFragment' @ [259:96] ==> var convertedFragment: KtExpressionCodeFragment? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[LocalVariableDescriptor]

'convertedFragment' @ [262:24] ==> var convertedFragment: KtExpressionCodeFragment? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[LocalVariableDescriptor]

'kotlinCodeFragment' @ [262:45] ==> val kotlinCodeFragment: JavaCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[LocalVariableDescriptor]

'kotlinCodeFragment' @ [265:16] ==> val kotlinCodeFragment: JavaCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createPresentationCodeFragment[LocalVariableDescriptor]

'when {
        // PsiCodeBlock -> DummyHolder -> originalElement
            contextElement is PsiCodeBlock -> isContextAccepted(contextElement.context?.context)
            contextElement == null -> false
            contextElement.language == KotlinFileType.INSTANCE.language -> true
            contextElement.language == JavaFileType.INSTANCE.language -> {
                getKotlinJvmRuntimeMarkerClass(contextElement.project, contextElement.resolveScope) != null
            }
            else -> false
        }' @ [269:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'contextElement' @ [271:13] ==> value-parameter contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.isContextAccepted[ValueParameterDescriptorImpl]

'isContextAccepted' @ [271:47] ==> public open fun isContextAccepted(contextElement: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory[SimpleFunctionDescriptorImpl]

'contextElement' @ [271:65] ==> value-parameter contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.isContextAccepted[ValueParameterDescriptorImpl]

'context' @ [271:80] ==> public final val PsiCodeBlock.context: PsiElement?[MyPropertyDescriptor]

'context' @ [271:89] ==> public final val PsiElement.context: PsiElement?[MyPropertyDescriptor]

'contextElement' @ [272:13] ==> value-parameter contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.isContextAccepted[ValueParameterDescriptorImpl]

'contextElement' @ [273:13] ==> value-parameter contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.isContextAccepted[ValueParameterDescriptorImpl]

'language' @ [273:28] ==> public final val PsiElement.language: Language[MyPropertyDescriptor]

'INSTANCE' @ [273:55] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'language' @ [273:64] ==> public final val KotlinFileType.language: Language[MyPropertyDescriptor]

'contextElement' @ [274:13] ==> value-parameter contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.isContextAccepted[ValueParameterDescriptorImpl]

'language' @ [274:28] ==> public final val PsiElement.language: Language[MyPropertyDescriptor]

'INSTANCE' @ [274:53] ==> public final val INSTANCE: (JavaFileType..JavaFileType?) defined in com.intellij.ide.highlighter.JavaFileType[JavaPropertyDescriptor]

'language' @ [274:62] ==> public final val JavaFileType.language: Language[MyPropertyDescriptor]

'getKotlinJvmRuntimeMarkerClass' @ [275:17] ==> public fun getKotlinJvmRuntimeMarkerClass(project: Project, scope: GlobalSearchScope): PsiClass? defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'contextElement' @ [275:48] ==> value-parameter contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.isContextAccepted[ValueParameterDescriptorImpl]

'project' @ [275:63] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'contextElement' @ [275:72] ==> value-parameter contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.isContextAccepted[ValueParameterDescriptorImpl]

'resolveScope' @ [275:87] ==> public final val PsiElement.resolveScope: GlobalSearchScope[MyPropertyDescriptor]

'INSTANCE' @ [281:49] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'KotlinEvaluationBuilder' @ [283:42] ==> public object KotlinEvaluationBuilder : EvaluatorBuilder defined in org.jetbrains.kotlin.idea.debugger.evaluate in file KotlinEvaluationBuilder.kt[FakeCallableDescriptorForObject]

'create' @ [286:56] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(Value..Value?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Value

'TestOnly' @ [288:9] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'create' @ [288:79] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(DebuggerContextImpl..DebuggerContextImpl?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.debugger.impl.DebuggerContextImpl..com.intellij.debugger.impl.DebuggerContextImpl?)

'elementAt' @ [291:17] ==> value-parameter elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[ValueParameterDescriptorImpl]

'elementAt' @ [293:17] ==> value-parameter elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[ValueParameterDescriptorImpl]

'getContextElement' @ [294:24] ==> public final fun getContextElement(elementAt: PsiElement?): PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion[SimpleFunctionDescriptorImpl]

'elementAt' @ [294:42] ==> value-parameter elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[ValueParameterDescriptorImpl]

'context' @ [294:52] ==> public final val PsiCodeBlock.context: PsiElement?[MyPropertyDescriptor]

'context' @ [294:61] ==> public final val PsiElement.context: PsiElement?[MyPropertyDescriptor]

'elementAt' @ [297:17] ==> value-parameter elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[ValueParameterDescriptorImpl]

'getContextElement' @ [298:24] ==> public final fun getContextElement(elementAt: PsiElement?): PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion[SimpleFunctionDescriptorImpl]

'elementAt' @ [298:42] ==> value-parameter elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [298:52] ==> public abstract val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[DeserializedPropertyDescriptor]

'elementAt' @ [301:34] ==> value-parameter elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[ValueParameterDescriptorImpl]

'containingFile' @ [301:44] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'containingFile' @ [302:17] ==> val containingFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[LocalVariableDescriptor]

'elementAt' @ [302:55] ==> value-parameter elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[ValueParameterDescriptorImpl]

'containingFile' @ [303:17] ==> val containingFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[LocalVariableDescriptor]

'if (elementAt is PsiWhiteSpace || elementAt is PsiComment) {
                PsiTreeUtil.skipSiblingsForward(elementAt, PsiWhiteSpace::class.java, PsiComment::class.java)?.textOffset ?: elementAt.textOffset
            } else {
                elementAt.textOffset
            }' @ [306:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'elementAt' @ [306:39] ==> value-parameter elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[ValueParameterDescriptorImpl]

'elementAt' @ [306:69] ==> value-parameter elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[ValueParameterDescriptorImpl]

'?:' @ [307:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Int?, right: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Int

'skipSiblingsForward' @ [307:29] ==> @Nullable @Contract public open fun skipSiblingsForward(@Nullable p0: PsiElement?, @NotNull vararg p1: raw (Class<(Any..Any?)>..Class<*>?)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'elementAt' @ [307:49] ==> value-parameter elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[ValueParameterDescriptorImpl]

'java' @ [307:81] ==> public val <T> KClass<PsiWhiteSpace>.java: Class<PsiWhiteSpace> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiWhiteSpace

'java' @ [307:105] ==> public val <T> KClass<PsiComment>.java: Class<PsiComment> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiComment

'textOffset' @ [307:112] ==> public final val PsiElement.textOffset: Int[MyPropertyDescriptor]

'elementAt' @ [307:126] ==> value-parameter elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[ValueParameterDescriptorImpl]

'textOffset' @ [307:136] ==> public final val PsiElement.textOffset: Int[MyPropertyDescriptor]

'elementAt' @ [309:17] ==> value-parameter elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[ValueParameterDescriptorImpl]

'textOffset' @ [309:27] ==> public final val PsiElement.textOffset: Int[MyPropertyDescriptor]

'takeIf' @ [312:67] ==> @InlineOnly @SinceKotlin public inline fun <T> KtElement.takeIf(predicate: (KtElement) -> Boolean): KtElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'KotlinEditorTextProvider' @ [312:76] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.KotlinEditorTextProvider[FakeCallableDescriptorForObject]

'isAcceptedAsCodeFragmentContext' @ [312:101] ==> public final fun isAcceptedAsCodeFragmentContext(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.debugger.KotlinEditorTextProvider.Companion[SimpleFunctionDescriptorImpl]

'it' @ [312:133] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement.takeIfAcceptedAsCodeFragmentContext.<anonymous>[ValueParameterDescriptorImpl]

'findElementOfClassAtOffset' @ [314:25] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> findElementOfClassAtOffset(@NotNull p0: PsiFile, p1: Int, @NotNull p2: Class<(KtExpression..KtExpression?)>, p3: Boolean): KtExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'containingFile' @ [314:52] ==> val containingFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[LocalVariableDescriptor]

'lineStartOffset' @ [314:68] ==> val lineStartOffset: Int defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[LocalVariableDescriptor]

'java' @ [314:105] ==> public val <T> KClass<KtExpression>.java: Class<KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'takeIfAcceptedAsCodeFragmentContext' @ [315:23] ==> local final fun KtElement.takeIfAcceptedAsCodeFragmentContext(): KtElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[SimpleFunctionDescriptorImpl]

'let' @ [316:23] ==> @InlineOnly public inline fun <T, R> KtElement.let(block: (KtElement) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> Nothing

'getTopmostElementAtOffset' @ [316:53] ==> @Nullable public open fun <T : (Any..Any?)> getTopmostElementAtOffset(@NotNull element: PsiElement, offset: Int, @NotNull klass: Class<(KtExpression..KtExpression?)>): KtExpression? defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'it' @ [316:79] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement.<anonymous>[ValueParameterDescriptorImpl]

'lineStartOffset' @ [316:83] ==> val lineStartOffset: Int defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[LocalVariableDescriptor]

'java' @ [316:120] ==> public val <T> KClass<KtExpression>.java: Class<KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'KotlinEditorTextProvider' @ [318:13] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.KotlinEditorTextProvider[FakeCallableDescriptorForObject]

'findExpressionInner' @ [318:38] ==> public final fun findExpressionInner(element: PsiElement, allowMethodCalls: Boolean): KtExpression? defined in org.jetbrains.kotlin.idea.debugger.KotlinEditorTextProvider.Companion[SimpleFunctionDescriptorImpl]

'elementAt' @ [318:58] ==> value-parameter elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[ValueParameterDescriptorImpl]

'takeIfAcceptedAsCodeFragmentContext' @ [319:23] ==> local final fun KtElement.takeIfAcceptedAsCodeFragmentContext(): KtElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[SimpleFunctionDescriptorImpl]

'let' @ [320:23] ==> @InlineOnly public inline fun <T, R> KtElement.let(block: (KtElement) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> Nothing

'it' @ [320:36] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement.<anonymous>[ValueParameterDescriptorImpl]

'containingFile' @ [322:20] ==> val containingFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.getContextElement[LocalVariableDescriptor]

'Suppress' @ [327:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'markupMap' @ [328:29] ==> value-parameter markupMap: Map<*, ValueMarkup> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createCodeFragmentForLabeledObjects[ValueParameterDescriptorImpl]

'entries' @ [328:39] ==> public abstract val entries: Set<Map.Entry<Any?, ValueMarkup>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'associate' @ [328:47] ==> public inline fun <T, K, V> Iterable<Map.Entry<Any?, ValueMarkup>>.associate(transform: (Map.Entry<Any?, ValueMarkup>) -> Pair<String, Value?>): Map<String, Value?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<Any?, ValueMarkup>
    <K> -> String
    <V> -> Value?

'component1' @ [329:22] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Any?, ValueMarkup>.component1(): Any? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any?
    <V> -> ValueMarkup

'component2' @ [329:29] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Any?, ValueMarkup>.component2(): ValueMarkup defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any?
    <V> -> ValueMarkup

'it' @ [329:39] ==> value-parameter it: Map.Entry<Any?, ValueMarkup> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createCodeFragmentForLabeledObjects.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [330:17] ==> public infix fun <A, B> String.to(that: Value?): Pair<String, Value?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Value?

'markup' @ [330:20] ==> val markup: ValueMarkup defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createCodeFragmentForLabeledObjects.<anonymous>[LocalVariableDescriptor]

'text' @ [330:27] ==> public final val ValueMarkup.text: String[MyPropertyDescriptor]

'DEBUG_LABEL_SUFFIX' @ [330:33] ==> public final val DEBUG_LABEL_SUFFIX: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion[PropertyDescriptorImpl]

'value' @ [330:56] ==> val value: Any? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createCodeFragmentForLabeledObjects.<anonymous>[LocalVariableDescriptor]

'filterValues' @ [331:15] ==> public inline fun <K, V> Map<out String, Value?>.filterValues(predicate: (Value?) -> Boolean): Map<String, Value?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Value?

'it' @ [331:30] ==> value-parameter it: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createCodeFragmentForLabeledObjects.<anonymous>[ValueParameterDescriptorImpl]

'variables' @ [333:20] ==> val variables: Map<String, Value> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createCodeFragmentForLabeledObjects[LocalVariableDescriptor]

'kotlinVariablesAsText' @ [333:30] ==> private final fun Map<String, Value>.kotlinVariablesAsText(project: Project): String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion[SimpleFunctionDescriptorImpl]

'project' @ [333:52] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createCodeFragmentForLabeledObjects[ValueParameterDescriptorImpl]

'variables' @ [333:64] ==> val variables: Map<String, Value> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createCodeFragmentForLabeledObjects[LocalVariableDescriptor]

'StringBuilder' @ [337:22] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'getInstance' @ [339:47] ==> public open fun getInstance(p0: (Project..Project?)): (PsiNameHelper..PsiNameHelper?) defined in com.intellij.psi.PsiNameHelper[JavaMethodDescriptor]

'project' @ [339:59] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.kotlinVariablesAsText[ValueParameterDescriptorImpl]

'component1' @ [340:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, Value>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Value

'component2' @ [340:33] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, Value>.component2(): Value defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Value

'entries' @ [340:51] ==> public abstract val entries: Set<Map.Entry<String, Value>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'!' @ [341:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'psiNameHelper' @ [341:22] ==> val psiNameHelper: (PsiNameHelper..PsiNameHelper?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.kotlinVariablesAsText[LocalVariableDescriptor]

'isIdentifier' @ [341:36] ==> public abstract fun isIdentifier(@Nullable p0: String?): Boolean defined in com.intellij.psi.PsiNameHelper[JavaMethodDescriptor]

'variableName' @ [341:49] ==> val variableName: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.kotlinVariablesAsText[LocalVariableDescriptor]

'variableValue' @ [343:40] ==> val variableValue: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.kotlinVariablesAsText[LocalVariableDescriptor]

'type' @ [343:54] ==> public abstract fun type(): (Type..Type?) defined in com.sun.jdi.Value[JavaMethodDescriptor]

'name' @ [343:62] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.Type[JavaMethodDescriptor]

'createKotlinProperty' @ [345:38] ==> private final fun createKotlinProperty(project: Project, variableName: String, variableTypeName: String, value: Value): KtProperty? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion[SimpleFunctionDescriptorImpl]

'project' @ [345:59] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.kotlinVariablesAsText[ValueParameterDescriptorImpl]

'variableName' @ [345:68] ==> val variableName: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.kotlinVariablesAsText[LocalVariableDescriptor]

'variableTypeName' @ [345:82] ==> val variableTypeName: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.kotlinVariablesAsText[LocalVariableDescriptor]

'variableValue' @ [345:100] ==> val variableValue: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.kotlinVariablesAsText[LocalVariableDescriptor]

'sb' @ [347:17] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.kotlinVariablesAsText[LocalVariableDescriptor]

'append' @ [347:20] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'kotlinProperty' @ [347:30] ==> val kotlinProperty: KtProperty defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.kotlinVariablesAsText[LocalVariableDescriptor]

'text' @ [347:45] ==> public final val KtProperty.text: (String..String?)[MyPropertyDescriptor]

'sb' @ [350:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.kotlinVariablesAsText[LocalVariableDescriptor]

'append' @ [350:16] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'sb' @ [352:20] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.kotlinVariablesAsText[LocalVariableDescriptor]

'toString' @ [352:23] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'value' @ [356:41] ==> value-parameter value: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[ValueParameterDescriptorImpl]

'asValue' @ [356:47] ==> public fun Value?.asValue(): Value defined in org.jetbrains.eval4j.jdi[DeserializedSimpleFunctionDescriptor]

'asmType' @ [356:57] ==> public abstract val asmType: Type defined in org.jetbrains.eval4j.Value[DeserializedPropertyDescriptor]

'getClassDescriptor' @ [356:65] ==> public fun Type.getClassDescriptor(scope: GlobalSearchScope): ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate in file KotlinEvaluationBuilder.kt[SimpleFunctionDescriptorImpl]

'allScope' @ [356:102] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [356:111] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[ValueParameterDescriptorImpl]

'actualClassDescriptor' @ [357:17] ==> val actualClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[LocalVariableDescriptor]

'actualClassDescriptor' @ [357:50] ==> val actualClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[LocalVariableDescriptor]

'defaultType' @ [357:72] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'arguments' @ [357:84] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'isEmpty' @ [357:94] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'IdeDescriptorRenderers' @ [358:36] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [358:59] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [358:71] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'actualClassDescriptor' @ [358:82] ==> val actualClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[LocalVariableDescriptor]

'defaultType' @ [358:104] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'makeNullable' @ [358:116] ==> public fun KotlinType.makeNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [359:24] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [359:37] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[ValueParameterDescriptorImpl]

'createProperty' @ [359:46] ==> public final fun createProperty(name: String, type: String?, isVar: Boolean): KtProperty defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'variableName' @ [359:61] ==> value-parameter variableName: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[ValueParameterDescriptorImpl]

'quoteIfNeeded' @ [359:74] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'renderedType' @ [359:91] ==> val renderedType: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[LocalVariableDescriptor]

'if (value is ArrayReference) this + "[]" else this' @ [362:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'value' @ [362:47] ==> value-parameter value: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[ValueParameterDescriptorImpl]

'this' @ [362:72] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty.addArraySuffix[ReceiverParameterDescriptorImpl]

'this' @ [362:89] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty.addArraySuffix[ReceiverParameterDescriptorImpl]

'variableTypeName' @ [364:29] ==> value-parameter variableTypeName: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[ValueParameterDescriptorImpl]

'replace' @ [364:46] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substringBefore' @ [364:64] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getTypeByName' @ [365:37] ==> public open fun getTypeByName(p0: (String..String?), p1: (Project..Project?), p2: (GlobalSearchScope..GlobalSearchScope?)): (PsiClassType..PsiClassType?) defined in com.intellij.psi.PsiType[JavaMethodDescriptor]

'className' @ [365:51] ==> val className: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[LocalVariableDescriptor]

'project' @ [365:62] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[ValueParameterDescriptorImpl]

'allScope' @ [365:89] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [365:98] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[ValueParameterDescriptorImpl]

'if (value !is PrimitiveValue && classType.resolve() == null)
                CommonClassNames.JAVA_LANG_OBJECT
            else
                className' @ [366:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'value' @ [366:29] ==> value-parameter value: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[ValueParameterDescriptorImpl]

'classType' @ [366:57] ==> val classType: (PsiClassType..PsiClassType?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[LocalVariableDescriptor]

'resolve' @ [366:67] ==> @Nullable public abstract fun resolve(): PsiClass? defined in com.intellij.psi.PsiClassType[JavaMethodDescriptor]

'JAVA_LANG_OBJECT' @ [367:34] ==> @NonNls public const final val JAVA_LANG_OBJECT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'className' @ [369:17] ==> val className: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[LocalVariableDescriptor]

'addArraySuffix' @ [369:28] ==> local final fun String.addArraySuffix(): String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[SimpleFunctionDescriptorImpl]

'getInstance' @ [371:51] ==> public open fun getInstance(p0: (Project..Project?)): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.PsiElementFactory.SERVICE[JavaMethodDescriptor]

'project' @ [371:63] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[ValueParameterDescriptorImpl]

'createField' @ [371:72] ==> @NotNull public abstract fun createField(@NotNull @NonNls p0: String, @NotNull p1: PsiType): PsiField defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'variableName' @ [371:84] ==> value-parameter variableName: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[ValueParameterDescriptorImpl]

'getTypeByName' @ [371:106] ==> public open fun getTypeByName(p0: (String..String?), p1: (Project..Project?), p2: (GlobalSearchScope..GlobalSearchScope?)): (PsiClassType..PsiClassType?) defined in com.intellij.psi.PsiType[JavaMethodDescriptor]

'type' @ [371:120] ==> val type: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[LocalVariableDescriptor]

'project' @ [371:126] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[ValueParameterDescriptorImpl]

'allScope' @ [371:153] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [371:162] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[ValueParameterDescriptorImpl]

'field' @ [372:27] ==> val field: PsiField defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[LocalVariableDescriptor]

'j2k' @ [372:33] ==> public fun PsiMember.j2k(): KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'ktField' @ [373:13] ==> val ktField: KtProperty? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[LocalVariableDescriptor]

'modifierList' @ [373:22] ==> public final val KtProperty.modifierList: KtModifierList?[MyPropertyDescriptor]

'delete' @ [373:36] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'ktField' @ [374:20] ==> val ktField: KtProperty? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion.createKotlinProperty[LocalVariableDescriptor]

'if (ApplicationManager.getApplication().isUnitTestMode)
                    NodeDescriptorImpl.getMarkupMap(originalContext?.getCopyableUserData(DEBUG_CONTEXT_FOR_TESTS)?.debugProcess)
                else
                    (XDebuggerManager.getInstance(project).currentSession as? XDebugSessionImpl)?.valueMarkers?.allMarkers' @ [380:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Map<*, ValueMarkup>?, elseBranch: Map<*, ValueMarkup>?): Map<*, ValueMarkup>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Map<*, ValueMarkup>?

'getApplication' @ [380:40] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [380:57] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'getMarkupMap' @ [381:40] ==> @Nullable public open fun getMarkupMap(p0: (DebugProcess..DebugProcess?)): (MutableMap<(ObjectReference..ObjectReference?), (ValueMarkup..ValueMarkup?)>?..Map<(ObjectReference..ObjectReference?), (ValueMarkup..ValueMarkup?)>?) defined in com.intellij.debugger.ui.impl.watch.NodeDescriptorImpl[JavaMethodDescriptor]

'originalContext' @ [381:53] ==> value-parameter originalContext: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.wrapContextIfNeeded[ValueParameterDescriptorImpl]

'getCopyableUserData' @ [381:70] ==> @Nullable @Contract public abstract fun <T : (Any..Any?)> getCopyableUserData(p0: (Key<(DebuggerContextImpl..DebuggerContextImpl?)>..Key<(DebuggerContextImpl..DebuggerContextImpl?)>?)): DebuggerContextImpl? defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.debugger.impl.DebuggerContextImpl..com.intellij.debugger.impl.DebuggerContextImpl?)

'DEBUG_CONTEXT_FOR_TESTS' @ [381:90] ==> @TestOnly public final val DEBUG_CONTEXT_FOR_TESTS: Key<DebuggerContextImpl> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion[PropertyDescriptorImpl]

'debugProcess' @ [381:116] ==> public final val DebuggerContextImpl.debugProcess: DebugProcessImpl?[MyPropertyDescriptor]

'getInstance' @ [383:39] ==> public open fun getInstance(@NotNull p0: Project): (XDebuggerManager..XDebuggerManager?) defined in com.intellij.xdebugger.XDebuggerManager[JavaMethodDescriptor]

'project' @ [383:51] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.wrapContextIfNeeded[ValueParameterDescriptorImpl]

'currentSession' @ [383:60] ==> public final val XDebuggerManager.currentSession: XDebugSession?[MyPropertyDescriptor]

'valueMarkers' @ [383:99] ==> public final val XDebugSessionImpl.valueMarkers: XValueMarkers<*, *>?[MyPropertyDescriptor]

'allMarkers' @ [383:113] ==> public final val <V : (XValue..XValue?), M : (Any..Any?)> XValueMarkers<out (XValue..XValue?), out (Any..Any?)>.allMarkers: (MutableMap<out (Any..Any?), (ValueMarkup..ValueMarkup?)>..Map<out (Any..Any?), (ValueMarkup..ValueMarkup?)>?)[MyPropertyDescriptor]
Inferred types:
    <V : (XValue..XValue?)> -> Captured(*)
    <M : (Any..Any?)> -> Captured(*)

'markupMap' @ [385:13] ==> val markupMap: Map<*, ValueMarkup>? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.wrapContextIfNeeded[LocalVariableDescriptor]

'markupMap' @ [385:34] ==> val markupMap: Map<*, ValueMarkup>? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.wrapContextIfNeeded[LocalVariableDescriptor]

'isEmpty' @ [385:44] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'newContext' @ [385:62] ==> value-parameter newContext: KtElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.wrapContextIfNeeded[ValueParameterDescriptorImpl]

'component1' @ [387:14] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [387:20] ==> public final operator fun component2(): Map<String, Value> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'createCodeFragmentForLabeledObjects' @ [387:30] ==> public final fun createCodeFragmentForLabeledObjects(project: Project, markupMap: Map<*, ValueMarkup>): Pair<String, Map<String, Value>> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion[SimpleFunctionDescriptorImpl]

'project' @ [387:66] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.wrapContextIfNeeded[ValueParameterDescriptorImpl]

'markupMap' @ [387:75] ==> val markupMap: Map<*, ValueMarkup>? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.wrapContextIfNeeded[LocalVariableDescriptor]

'text' @ [388:13] ==> val text: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.wrapContextIfNeeded[LocalVariableDescriptor]

'isEmpty' @ [388:18] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'newContext' @ [388:36] ==> value-parameter newContext: KtElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.wrapContextIfNeeded[ValueParameterDescriptorImpl]

'createWrappingContext' @ [390:16] ==> public final fun createWrappingContext(newFragmentText: String, labels: Map<String, Value>, originalContext: KtElement?, project: Project): KtElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory[SimpleFunctionDescriptorImpl]

'text' @ [390:38] ==> val text: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.wrapContextIfNeeded[LocalVariableDescriptor]

'labels' @ [390:44] ==> val labels: Map<String, Value> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.wrapContextIfNeeded[LocalVariableDescriptor]

'newContext' @ [390:52] ==> value-parameter newContext: KtElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.wrapContextIfNeeded[ValueParameterDescriptorImpl]

'project' @ [390:64] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.wrapContextIfNeeded[ValueParameterDescriptorImpl]

'javaContext' @ [394:24] ==> value-parameter javaContext: PsiElement defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createFakeFileWithJavaContextElement[ValueParameterDescriptorImpl]

'containingFile' @ [394:36] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'StringBuilder' @ [396:18] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'javaFile' @ [398:9] ==> val javaFile: PsiJavaFile? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createFakeFileWithJavaContextElement[LocalVariableDescriptor]

'packageName' @ [398:19] ==> public final var PsiJavaFile.packageName: String[MyPropertyDescriptor]

'takeUnless' @ [398:32] ==> @InlineOnly @SinceKotlin public inline fun <T> String.takeUnless(predicate: (String) -> Boolean): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [398:45] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createFakeFileWithJavaContextElement.<anonymous>[ValueParameterDescriptorImpl]

'isBlank' @ [398:48] ==> public fun CharSequence.isBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'let' @ [398:61] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'sb' @ [399:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createFakeFileWithJavaContextElement[LocalVariableDescriptor]

'append' @ [399:16] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [399:35] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [399:42] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createFakeFileWithJavaContextElement.<anonymous>[ValueParameterDescriptorImpl]

'quoteIfNeeded' @ [399:45] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'append' @ [399:62] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'javaFile' @ [402:9] ==> val javaFile: PsiJavaFile? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createFakeFileWithJavaContextElement[LocalVariableDescriptor]

'importList' @ [402:19] ==> public final val PsiJavaFile.importList: PsiImportList?[MyPropertyDescriptor]

'let' @ [402:31] ==> @InlineOnly public inline fun <T, R> PsiImportList.let(block: (PsiImportList) -> (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiImportList
    <R> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'sb' @ [402:37] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createFakeFileWithJavaContextElement[LocalVariableDescriptor]

'append' @ [402:40] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [402:47] ==> value-parameter it: PsiImportList defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createFakeFileWithJavaContextElement.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [402:50] ==> public final val PsiImportList.text: (String..String?)[MyPropertyDescriptor]

'append' @ [402:56] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'sb' @ [404:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createFakeFileWithJavaContextElement[LocalVariableDescriptor]

'append' @ [404:12] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'funWithLocalVariables' @ [404:19] ==> value-parameter funWithLocalVariables: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createFakeFileWithJavaContextElement[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [406:16] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'javaContext' @ [406:29] ==> value-parameter javaContext: PsiElement defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createFakeFileWithJavaContextElement[ValueParameterDescriptorImpl]

'project' @ [406:41] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'createAnalyzableFile' @ [406:50] ==> public final fun createAnalyzableFile(fileName: String, text: String, contextToAnalyzeIn: PsiElement): KtFile defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'sb' @ [406:110] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createFakeFileWithJavaContextElement[LocalVariableDescriptor]

'toString' @ [406:113] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'javaContext' @ [406:125] ==> value-parameter javaContext: PsiElement defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createFakeFileWithJavaContextElement[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [416:28] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [416:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createWrappingContext[ValueParameterDescriptorImpl]

'createBlockCodeFragment' @ [416:50] ==> public final fun createBlockCodeFragment(text: String, context: PsiElement?): KtBlockCodeFragment defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newFragmentText' @ [416:74] ==> value-parameter newFragmentText: String defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createWrappingContext[ValueParameterDescriptorImpl]

'originalContext' @ [416:91] ==> value-parameter originalContext: KtElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createWrappingContext[ValueParameterDescriptorImpl]

'codeFragment' @ [418:9] ==> val codeFragment: KtBlockCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createWrappingContext[LocalVariableDescriptor]

'accept' @ [418:22] ==> public open fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtBlockCodeFragment[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [418:38] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'labels' @ [420:33] ==> value-parameter labels: Map<String, Value> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createWrappingContext[ValueParameterDescriptorImpl]

'get' @ [420:40] ==> @InlineOnly public operator inline fun <@OnlyInputTypes K, V> Map<out String?, Value>.get(key: String?): Value? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes K> -> String?
    <V> -> Value

'property' @ [420:44] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createWrappingContext.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'name' @ [420:53] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'reference' @ [421:21] ==> val reference: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createWrappingContext.<no name provided>.visitProperty[LocalVariableDescriptor]

'property' @ [422:21] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createWrappingContext.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'putUserData' @ [422:30] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Value..Value?)>, @Nullable p1: Value?): Unit defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.sun.jdi.Value..com.sun.jdi.Value?)

'LABEL_VARIABLE_VALUE_KEY' @ [422:42] ==> public final val LABEL_VARIABLE_VALUE_KEY: Key<Value> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion[PropertyDescriptorImpl]

'reference' @ [422:68] ==> val reference: Value? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createWrappingContext.<no name provided>.visitProperty[LocalVariableDescriptor]

'codeFragment' @ [427:16] ==> val codeFragment: KtBlockCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.createWrappingContext[LocalVariableDescriptor]

'getContentElement' @ [427:29] ==> public open fun getContentElement(): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtBlockCodeFragment[DeserializedSimpleFunctionDescriptor]

'statements' @ [427:49] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'lastOrNull' @ [427:60] ==> public fun <T> List<(KtExpression..KtExpression?)>.lastOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

