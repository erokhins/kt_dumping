'KtTreeVisitorVoid' @ [26:43] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'create' @ [30:79] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> create(): (LinkedHashMultimap<(Name..Name?), (AssignedVariablesSearcher.Writer..AssignedVariablesSearcher.Writer?)>..LinkedHashMultimap<(Name..Name?), (AssignedVariablesSearcher.Writer..AssignedVariablesSearcher.Writer?)>?) defined in com.google.common.collect.LinkedHashMultimap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.Writer..org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.Writer?)

'assignedNames' @ [32:84] ==> private final val assignedNames: SetMultimap<Name, AssignedVariablesSearcher.Writer> defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher[PropertyDescriptorImpl]

'variableDescriptor' @ [32:98] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.writers[ValueParameterDescriptorImpl]

'name' @ [32:117] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'writers' @ [34:62] ==> public open fun writers(variableDescriptor: VariableDescriptor): MutableSet<AssignedVariablesSearcher.Writer> defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [34:70] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.hasWriters[ValueParameterDescriptorImpl]

'isNotEmpty' @ [34:90] ==> @InlineOnly public inline fun <T> Collection<AssignedVariablesSearcher.Writer>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Writer

'currentDeclaration' @ [39:24] ==> private final var currentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher[PropertyDescriptorImpl]

'declaration' @ [40:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [40:53] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [40:87] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.visitDeclaration[ValueParameterDescriptorImpl]

'currentDeclaration' @ [41:13] ==> private final var currentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher[PropertyDescriptorImpl]

'declaration' @ [41:34] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.visitDeclaration[ValueParameterDescriptorImpl]

'super' @ [43:9] ==> <this> defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher[LazyClassReceiverParameterDescriptor]

'visitDeclaration' @ [43:15] ==> public open fun visitDeclaration(@NotNull dcl: KtDeclaration): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'declaration' @ [43:32] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.visitDeclaration[ValueParameterDescriptorImpl]

'currentDeclaration' @ [44:9] ==> private final var currentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher[PropertyDescriptorImpl]

'previous' @ [44:30] ==> val previous: KtDeclaration? defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.visitDeclaration[LocalVariableDescriptor]

'currentDeclaration' @ [48:24] ==> private final var currentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher[PropertyDescriptorImpl]

'currentDeclaration' @ [49:9] ==> private final var currentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher[PropertyDescriptorImpl]

'lambdaExpression' @ [49:30] ==> value-parameter lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.visitLambdaExpression[ValueParameterDescriptorImpl]

'functionLiteral' @ [49:47] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'super' @ [50:9] ==> <this> defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher[LazyClassReceiverParameterDescriptor]

'visitLambdaExpression' @ [50:15] ==> public open fun visitLambdaExpression(@NotNull lambdaExpression: KtLambdaExpression): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'lambdaExpression' @ [50:37] ==> value-parameter lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.visitLambdaExpression[ValueParameterDescriptorImpl]

'currentDeclaration' @ [51:9] ==> private final var currentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher[PropertyDescriptorImpl]

'previous' @ [51:30] ==> val previous: KtDeclaration? defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.visitLambdaExpression[LocalVariableDescriptor]

'binaryExpression' @ [55:13] ==> value-parameter binaryExpression: KtBinaryExpression defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.visitBinaryExpression[ValueParameterDescriptorImpl]

'operationToken' @ [55:30] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQ' @ [55:58] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'deparenthesize' @ [56:34] ==> @Nullable public open fun deparenthesize(@Nullable expression: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'binaryExpression' @ [56:49] ==> value-parameter binaryExpression: KtBinaryExpression defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.visitBinaryExpression[ValueParameterDescriptorImpl]

'left' @ [56:66] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'left' @ [57:17] ==> val left: KtExpression? defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.visitBinaryExpression[LocalVariableDescriptor]

'assignedNames' @ [58:17] ==> private final val assignedNames: SetMultimap<Name, AssignedVariablesSearcher.Writer> defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher[PropertyDescriptorImpl]

'put' @ [58:31] ==> @CanIgnoreReturnValue public abstract fun put(@Nullable p0: Name?, @Nullable p1: AssignedVariablesSearcher.Writer?): Boolean defined in com.google.common.collect.SetMultimap[JavaMethodDescriptor]

'left' @ [58:35] ==> val left: KtExpression? defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.visitBinaryExpression[LocalVariableDescriptor]

'getReferencedNameAsName' @ [58:40] ==> public open fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[SimpleFunctionDescriptorImpl]

'Writer' @ [58:67] ==> public constructor Writer(assignment: KtBinaryExpression, declaration: KtDeclaration?) defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.Writer[ClassConstructorDescriptorImpl]

'binaryExpression' @ [58:74] ==> value-parameter binaryExpression: KtBinaryExpression defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.visitBinaryExpression[ValueParameterDescriptorImpl]

'currentDeclaration' @ [58:92] ==> private final var currentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher[PropertyDescriptorImpl]

'super' @ [61:9] ==> <this> defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher[LazyClassReceiverParameterDescriptor]

'visitBinaryExpression' @ [61:15] ==> public open fun visitBinaryExpression(@NotNull expression: KtBinaryExpression): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'binaryExpression' @ [61:37] ==> value-parameter binaryExpression: KtBinaryExpression defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.visitBinaryExpression[ValueParameterDescriptorImpl]

