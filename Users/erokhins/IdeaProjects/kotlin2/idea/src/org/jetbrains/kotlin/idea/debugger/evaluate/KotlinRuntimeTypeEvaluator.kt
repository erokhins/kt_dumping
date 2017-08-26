'EditorEvaluationCommand<KotlinType>' @ [47:5] ==> public constructor EditorEvaluationCommand<T : (Any..Any?)>(@Nullable p0: Editor?, p1: (PsiElement..PsiElement?), p2: (DebuggerContextImpl..DebuggerContextImpl?), p3: (ProgressIndicator..ProgressIndicator?)) defined in com.intellij.debugger.ui.EditorEvaluationCommand[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinType

'editor' @ [47:41] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.<init>[ValueParameterDescriptorImpl]

'expression' @ [47:49] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.<init>[ValueParameterDescriptorImpl]

'context' @ [47:61] ==> value-parameter context: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.<init>[ValueParameterDescriptorImpl]

'indicator' @ [47:70] ==> value-parameter indicator: ProgressIndicator defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.<init>[ValueParameterDescriptorImpl]

'type' @ [52:13] ==> var type: KotlinType? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.threadAction[LocalVariableDescriptor]

'evaluate' @ [52:20] ==> public open fun evaluate(): (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator[JavaMethodDescriptor]

'typeCalculationFinished' @ [59:13] ==> protected abstract fun typeCalculationFinished(type: KotlinType?): Unit defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator[SimpleFunctionDescriptorImpl]

'type' @ [59:37] ==> var type: KotlinType? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.threadAction[LocalVariableDescriptor]

'evaluationContext' @ [66:23] ==> value-parameter evaluationContext: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.evaluate[ValueParameterDescriptorImpl]

'project' @ [66:41] ==> public final val EvaluationContextImpl.project: (Project..Project?)[MyPropertyDescriptor]

'commitAndRunReadAction' @ [68:48] ==> public open fun <T : (Any..Any?)> commitAndRunReadAction(p0: (Project..Project?), p1: (EvaluatingComputable<(ExpressionEvaluator..ExpressionEvaluator?)>..EvaluatingComputable<(ExpressionEvaluator..ExpressionEvaluator?)>?)): (ExpressionEvaluator..ExpressionEvaluator?) defined in com.intellij.debugger.DebuggerInvocationUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ExpressionEvaluator

'project' @ [68:92] ==> val project: (Project..Project?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.evaluate[LocalVariableDescriptor]

'EvaluatingComputable' @ [68:101] ==> public fun <T : (Any..Any?)> EvaluatingComputable(function: () -> (ExpressionEvaluator..ExpressionEvaluator?)): EvaluatingComputable<ExpressionEvaluator> defined in com.intellij.debugger[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> ExpressionEvaluator

'KtPsiFactory' @ [69:36] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'myElement' @ [69:49] ==> protected/*protected and package*/ final val myElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator[JavaPropertyDescriptor]

'project' @ [69:59] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'createExpressionCodeFragment' @ [69:68] ==> public final fun createExpressionCodeFragment(text: String, context: PsiElement?): KtExpressionCodeFragment defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'myElement' @ [70:25] ==> protected/*protected and package*/ final val myElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator[JavaPropertyDescriptor]

'text' @ [70:35] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'myElement' @ [70:41] ==> protected/*protected and package*/ final val myElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator[JavaPropertyDescriptor]

'containingFile' @ [70:51] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'context' @ [70:66] ==> public final val PsiFile.context: PsiElement?[MyPropertyDescriptor]

'KotlinEvaluationBuilder' @ [71:17] ==> public object KotlinEvaluationBuilder : EvaluatorBuilder defined in org.jetbrains.kotlin.idea.debugger.evaluate in file KotlinEvaluationBuilder.kt[FakeCallableDescriptorForObject]

'build' @ [71:41] ==> public open fun build(codeFragment: PsiElement, position: SourcePosition?): ExpressionEvaluator defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinEvaluationBuilder[SimpleFunctionDescriptorImpl]

'codeFragment' @ [71:47] ==> val codeFragment: KtExpressionCodeFragment defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.evaluate.<anonymous>[LocalVariableDescriptor]

'getSourcePosition' @ [71:73] ==> @Nullable public open fun getSourcePosition(@Nullable p0: StackFrameContext?): SourcePosition? defined in com.intellij.debugger.engine.ContextUtil[JavaMethodDescriptor]

'evaluationContext' @ [71:91] ==> value-parameter evaluationContext: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.evaluate[ValueParameterDescriptorImpl]

'evaluator' @ [74:21] ==> val evaluator: (ExpressionEvaluator..ExpressionEvaluator?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.evaluate[LocalVariableDescriptor]

'evaluate' @ [74:31] ==> public abstract fun evaluate(p0: (EvaluationContext..EvaluationContext?)): (Value..Value?) defined in com.intellij.debugger.engine.evaluation.expression.ExpressionEvaluator[JavaMethodDescriptor]

'evaluationContext' @ [74:40] ==> value-parameter evaluationContext: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.evaluate[ValueParameterDescriptorImpl]

'value' @ [75:13] ==> val value: (Value..Value?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.evaluate[LocalVariableDescriptor]

'getCastableRuntimeType' @ [76:20] ==> private final fun getCastableRuntimeType(scope: GlobalSearchScope, value: Value): KotlinType? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion[SimpleFunctionDescriptorImpl]

'evaluationContext' @ [76:43] ==> value-parameter evaluationContext: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.evaluate[ValueParameterDescriptorImpl]

'debugProcess' @ [76:61] ==> public final val EvaluationContextImpl.debugProcess: DebugProcessImpl[MyPropertyDescriptor]

'searchScope' @ [76:74] ==> public final val DebugProcessImpl.searchScope: GlobalSearchScope[MyPropertyDescriptor]

'value' @ [76:87] ==> val value: (Value..Value?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.evaluate[LocalVariableDescriptor]

'createEvaluateException' @ [79:37] ==> public open fun createEvaluateException(p0: (String..String?)): (EvaluateException..EvaluateException?) defined in com.intellij.debugger.engine.evaluation.EvaluateExceptionUtil[JavaMethodDescriptor]

'message' @ [79:76] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.debugger.DebuggerBundle[JavaMethodDescriptor]

'value' @ [84:27] ==> value-parameter value: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[ValueParameterDescriptorImpl]

'asValue' @ [84:33] ==> public fun Value?.asValue(): Value defined in org.jetbrains.eval4j.jdi[DeserializedSimpleFunctionDescriptor]

'myValue' @ [85:28] ==> val myValue: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[LocalVariableDescriptor]

'asmType' @ [85:36] ==> public abstract val asmType: Type defined in org.jetbrains.eval4j.Value[DeserializedPropertyDescriptor]

'getClassDescriptor' @ [85:44] ==> public fun Type.getClassDescriptor(scope: GlobalSearchScope): ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate in file KotlinEvaluationBuilder.kt[SimpleFunctionDescriptorImpl]

'scope' @ [85:63] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[ValueParameterDescriptorImpl]

'psiClass' @ [86:17] ==> var psiClass: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[LocalVariableDescriptor]

'psiClass' @ [87:24] ==> var psiClass: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[LocalVariableDescriptor]

'defaultType' @ [87:33] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'value' @ [90:24] ==> value-parameter value: Value defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[ValueParameterDescriptorImpl]

'type' @ [90:30] ==> public abstract fun type(): (Type..Type?) defined in com.sun.jdi.Value[JavaMethodDescriptor]

'type' @ [91:17] ==> val type: (Type..Type?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[LocalVariableDescriptor]

'type' @ [92:34] ==> val type: (Type..Type?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[LocalVariableDescriptor]

'superclass' @ [92:39] ==> public abstract fun superclass(): (ClassType..ClassType?) defined in com.sun.jdi.ClassType[JavaMethodDescriptor]

'superclass' @ [93:21] ==> val superclass: (ClassType..ClassType?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[LocalVariableDescriptor]

'!=' @ [93:43] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'JAVA_LANG_OBJECT' @ [93:60] ==> @NonNls public const final val JAVA_LANG_OBJECT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'superclass' @ [93:80] ==> val superclass: (ClassType..ClassType?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[LocalVariableDescriptor]

'name' @ [93:91] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.ClassType[JavaMethodDescriptor]

'psiClass' @ [94:21] ==> var psiClass: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[LocalVariableDescriptor]

'getType' @ [94:40] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'superclass' @ [94:48] ==> val superclass: (ClassType..ClassType?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[LocalVariableDescriptor]

'signature' @ [94:59] ==> public abstract fun signature(): (String..String?) defined in com.sun.jdi.ClassType[JavaMethodDescriptor]

'getClassDescriptor' @ [94:72] ==> public fun Type.getClassDescriptor(scope: GlobalSearchScope): ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate in file KotlinEvaluationBuilder.kt[SimpleFunctionDescriptorImpl]

'scope' @ [94:91] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[ValueParameterDescriptorImpl]

'psiClass' @ [95:25] ==> var psiClass: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[LocalVariableDescriptor]

'psiClass' @ [96:32] ==> var psiClass: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[LocalVariableDescriptor]

'defaultType' @ [96:41] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'type' @ [100:39] ==> val type: (Type..Type?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[LocalVariableDescriptor]

'interfaces' @ [100:44] ==> public abstract fun interfaces(): (MutableList<(InterfaceType..InterfaceType?)>..List<(InterfaceType..InterfaceType?)>?) defined in com.sun.jdi.ClassType[JavaMethodDescriptor]

'psiClass' @ [101:21] ==> var psiClass: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[LocalVariableDescriptor]

'getType' @ [101:40] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'interfaceType' @ [101:48] ==> val interfaceType: (InterfaceType..InterfaceType?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[LocalVariableDescriptor]

'signature' @ [101:62] ==> public abstract fun signature(): (String..String?) defined in com.sun.jdi.InterfaceType[JavaMethodDescriptor]

'getClassDescriptor' @ [101:75] ==> public fun Type.getClassDescriptor(scope: GlobalSearchScope): ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate in file KotlinEvaluationBuilder.kt[SimpleFunctionDescriptorImpl]

'scope' @ [101:94] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[ValueParameterDescriptorImpl]

'psiClass' @ [102:25] ==> var psiClass: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[LocalVariableDescriptor]

'psiClass' @ [103:32] ==> var psiClass: ClassDescriptor? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinRuntimeTypeEvaluator.Companion.getCastableRuntimeType[LocalVariableDescriptor]

'defaultType' @ [103:41] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

