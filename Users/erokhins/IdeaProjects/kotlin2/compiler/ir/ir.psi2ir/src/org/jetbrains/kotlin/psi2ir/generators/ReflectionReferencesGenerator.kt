'StatementGeneratorExtension' @ [34:79] ==> public constructor StatementGeneratorExtension(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension[ClassConstructorDescriptorImpl]

'statementGenerator' @ [34:107] ==> value-parameter statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.<init>[ValueParameterDescriptorImpl]

'ktClassLiteral' @ [36:26] ==> value-parameter ktClassLiteral: KtClassLiteralExpression defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateClassLiteral[ValueParameterDescriptorImpl]

'receiverExpression' @ [36:41] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtClassLiteralExpression[DeserializedPropertyDescriptor]

'getOrFail' @ [37:19] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>, key: (KtExpression..KtExpression?)): (DoubleColonLHS..DoubleColonLHS?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : Any> -> (org.jetbrains.kotlin.types.expressions.DoubleColonLHS..org.jetbrains.kotlin.types.expressions.DoubleColonLHS?)

'DOUBLE_COLON_LHS' @ [37:44] ==> public final val DOUBLE_COLON_LHS: (WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktArgument' @ [37:62] ==> val ktArgument: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateClassLiteral[LocalVariableDescriptor]

'getInferredTypeWithImplicitCastsOrFail' @ [38:26] ==> public fun Generator.getInferredTypeWithImplicitCastsOrFail(key: KtExpression): KotlinType defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'ktClassLiteral' @ [38:65] ==> value-parameter ktClassLiteral: KtClassLiteralExpression defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateClassLiteral[ValueParameterDescriptorImpl]

'if (lhs is DoubleColonLHS.Expression && !lhs.isObjectQualifier) {
            IrGetClassImpl(ktClassLiteral.startOffset, ktClassLiteral.endOffset, resultType,
                           statementGenerator.generateExpression(ktArgument))
        }
        else {
            val typeConstructorDeclaration = lhs.type.constructor.declarationDescriptor
            val typeClass = typeConstructorDeclaration ?:
                            throw AssertionError("Unexpected type constructor for ${lhs.type}: $typeConstructorDeclaration")
            IrClassReferenceImpl(ktClassLiteral.startOffset, ktClassLiteral.endOffset, resultType,
                                 context.symbolTable.referenceClassifier(typeClass))
        }' @ [40:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression, elseBranch: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression

'lhs' @ [40:20] ==> val lhs: (DoubleColonLHS..DoubleColonLHS?) defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateClassLiteral[LocalVariableDescriptor]

'!' @ [40:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'lhs' @ [40:57] ==> val lhs: (DoubleColonLHS..DoubleColonLHS?) defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateClassLiteral[LocalVariableDescriptor]

'isObjectQualifier' @ [40:61] ==> public final val isObjectQualifier: Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Expression[DeserializedPropertyDescriptor]

'IrGetClassImpl' @ [41:13] ==> public constructor IrGetClassImpl(startOffset: Int, endOffset: Int, type: KotlinType, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetClassImpl[DeserializedClassConstructorDescriptor]

'ktClassLiteral' @ [41:28] ==> value-parameter ktClassLiteral: KtClassLiteralExpression defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateClassLiteral[ValueParameterDescriptorImpl]

'startOffset' @ [41:43] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktClassLiteral' @ [41:56] ==> value-parameter ktClassLiteral: KtClassLiteralExpression defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateClassLiteral[ValueParameterDescriptorImpl]

'endOffset' @ [41:71] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'resultType' @ [41:82] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateClassLiteral[LocalVariableDescriptor]

'statementGenerator' @ [42:28] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[PropertyDescriptorImpl]

'generateExpression' @ [42:47] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktArgument' @ [42:66] ==> val ktArgument: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateClassLiteral[LocalVariableDescriptor]

'lhs' @ [45:46] ==> val lhs: (DoubleColonLHS..DoubleColonLHS?) defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateClassLiteral[LocalVariableDescriptor]

'type' @ [45:50] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS[DeserializedPropertyDescriptor]

'constructor' @ [45:55] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [45:67] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'typeConstructorDeclaration' @ [46:29] ==> val typeConstructorDeclaration: ClassifierDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateClassLiteral[LocalVariableDescriptor]

'AssertionError' @ [47:35] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'lhs' @ [47:85] ==> val lhs: (DoubleColonLHS..DoubleColonLHS?) defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateClassLiteral[LocalVariableDescriptor]

'type' @ [47:89] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS[DeserializedPropertyDescriptor]

'typeConstructorDeclaration' @ [47:97] ==> val typeConstructorDeclaration: ClassifierDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateClassLiteral[LocalVariableDescriptor]

'IrClassReferenceImpl' @ [48:13] ==> public constructor IrClassReferenceImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrClassifierSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrClassReferenceImpl[DeserializedClassConstructorDescriptor]

'ktClassLiteral' @ [48:34] ==> value-parameter ktClassLiteral: KtClassLiteralExpression defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateClassLiteral[ValueParameterDescriptorImpl]

'startOffset' @ [48:49] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktClassLiteral' @ [48:62] ==> value-parameter ktClassLiteral: KtClassLiteralExpression defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateClassLiteral[ValueParameterDescriptorImpl]

'endOffset' @ [48:77] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'resultType' @ [48:88] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateClassLiteral[LocalVariableDescriptor]

'context' @ [49:34] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[PropertyDescriptorImpl]

'symbolTable' @ [49:42] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceClassifier' @ [49:54] ==> public final fun referenceClassifier(classifier: ClassifierDescriptor): IrClassifierSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'typeClass' @ [49:74] ==> val typeClass: ClassifierDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateClassLiteral[LocalVariableDescriptor]

'getResolvedCall' @ [54:28] ==> public fun Generator.getResolvedCall(key: KtElement): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'ktCallableReference' @ [54:44] ==> value-parameter ktCallableReference: KtCallableReferenceExpression defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'callableReference' @ [54:64] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'resolvedCall' @ [56:35] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[LocalVariableDescriptor]

'resultingDescriptor' @ [56:48] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'resultingDescriptor' @ [57:44] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[LocalVariableDescriptor]

'descriptorImportedFromObject' @ [58:36] ==> val descriptorImportedFromObject: ImportedFromObjectCallableDescriptor<*>? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[LocalVariableDescriptor]

'callableFromObject' @ [58:66] ==> public final val callableFromObject: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.ImportedFromObjectCallableDescriptor[DeserializedPropertyDescriptor]

'resultingDescriptor' @ [58:88] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[LocalVariableDescriptor]

'ktCallableReference' @ [60:27] ==> value-parameter ktCallableReference: KtCallableReferenceExpression defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'startOffset' @ [60:47] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktCallableReference' @ [61:25] ==> value-parameter ktCallableReference: KtCallableReferenceExpression defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'endOffset' @ [61:45] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'statementGenerator' @ [63:16] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[PropertyDescriptorImpl]

'generateCallReceiver' @ [63:35] ==> public fun StatementGenerator.generateCallReceiver(ktDefaultElement: KtElement, calleeDescriptor: CallableDescriptor, dispatchReceiver: ReceiverValue?, extensionReceiver: ReceiverValue?, isSafe: Boolean, isAssignmentReceiver: Boolean = ...): CallReceiver defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'ktCallableReference' @ [64:17] ==> value-parameter ktCallableReference: KtCallableReferenceExpression defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [65:17] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[LocalVariableDescriptor]

'resolvedCall' @ [66:17] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[LocalVariableDescriptor]

'dispatchReceiver' @ [66:30] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'resolvedCall' @ [66:48] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[LocalVariableDescriptor]

'extensionReceiver' @ [66:61] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'call' @ [68:11] ==> public abstract fun call(withDispatchAndExtensionReceivers: (IntermediateValue?, IntermediateValue?) -> IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.CallReceiver[SimpleFunctionDescriptorImpl]

'generateCallableReference' @ [69:13] ==> public final fun generateCallableReference(startOffset: Int, endOffset: Int, type: KotlinType, callableDescriptor: CallableDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, origin: IrStatementOrigin? = ...): IrCallableReference defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[SimpleFunctionDescriptorImpl]

'startOffset' @ [70:21] ==> val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[LocalVariableDescriptor]

'endOffset' @ [70:34] ==> val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[LocalVariableDescriptor]

'getInferredTypeWithImplicitCastsOrFail' @ [71:21] ==> public fun Generator.getInferredTypeWithImplicitCastsOrFail(key: KtExpression): KotlinType defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'ktCallableReference' @ [71:60] ==> value-parameter ktCallableReference: KtCallableReferenceExpression defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'referencedDescriptor' @ [72:21] ==> val referencedDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[LocalVariableDescriptor]

'also' @ [74:15] ==> @InlineOnly @SinceKotlin public inline fun <T> IrCallableReference.also(block: (IrCallableReference) -> Unit): IrCallableReference defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCallableReference

'irCallableReference' @ [75:17] ==> value-parameter irCallableReference: IrCallableReference defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [75:37] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCallableReference[DeserializedPropertyDescriptor]

'dispatchReceiverValue' @ [75:56] ==> value-parameter dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference.<anonymous>[ValueParameterDescriptorImpl]

'loadIfExists' @ [75:79] ==> public open fun loadIfExists(): IrExpression? defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'irCallableReference' @ [76:17] ==> value-parameter irCallableReference: IrCallableReference defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'extensionReceiver' @ [76:37] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCallableReference[DeserializedPropertyDescriptor]

'extensionReceiverValue' @ [76:57] ==> value-parameter extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference.<anonymous>[ValueParameterDescriptorImpl]

'loadIfExists' @ [76:81] ==> public open fun loadIfExists(): IrExpression? defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'when (callableDescriptor) {
                is FunctionDescriptor ->
                    generateFunctionReference(
                            startOffset, endOffset, type,
                            context.symbolTable.referenceFunction(callableDescriptor.original),
                            callableDescriptor,
                            typeArguments,
                            origin
                    )
                is PropertyDescriptor ->
                    generatePropertyReference(startOffset, endOffset, type, callableDescriptor, typeArguments, origin)
                else ->
                    throw AssertionError("Unexpected callable reference: $callableDescriptor")
            }' @ [89:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrCallableReference, entry1: IrCallableReference, entry2: IrCallableReference): IrCallableReference[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrCallableReference

'callableDescriptor' @ [89:19] ==> value-parameter callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'generateFunctionReference' @ [91:21] ==> public final fun generateFunctionReference(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrFunctionSymbol, descriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, origin: IrStatementOrigin?): IrFunctionReference defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[SimpleFunctionDescriptorImpl]

'startOffset' @ [92:29] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'endOffset' @ [92:42] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'type' @ [92:53] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'context' @ [93:29] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[PropertyDescriptorImpl]

'symbolTable' @ [93:37] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceFunction' @ [93:49] ==> public final fun referenceFunction(callable: CallableDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'callableDescriptor' @ [93:67] ==> value-parameter callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'original' @ [93:86] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'callableDescriptor' @ [94:29] ==> value-parameter callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'typeArguments' @ [95:29] ==> value-parameter typeArguments: Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'origin' @ [96:29] ==> value-parameter origin: IrStatementOrigin? = ... defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'generatePropertyReference' @ [99:21] ==> private final fun generatePropertyReference(startOffset: Int, endOffset: Int, type: KotlinType, propertyDescriptor: PropertyDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, origin: IrStatementOrigin?): IrPropertyReference defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[SimpleFunctionDescriptorImpl]

'startOffset' @ [99:47] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'endOffset' @ [99:60] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'type' @ [99:71] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'callableDescriptor' @ [99:77] ==> value-parameter callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'typeArguments' @ [99:97] ==> value-parameter typeArguments: Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'origin' @ [99:112] ==> value-parameter origin: IrStatementOrigin? = ... defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'AssertionError' @ [101:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'callableDescriptor' @ [101:75] ==> value-parameter callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference[ValueParameterDescriptorImpl]

'variableDescriptor' @ [112:32] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'getter' @ [112:51] ==> public abstract val getter: VariableAccessorDescriptor? defined in org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors[DeserializedPropertyDescriptor]

'AssertionError' @ [113:38] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'variableDescriptor' @ [113:102] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'variableDescriptor' @ [114:32] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'setter' @ [114:51] ==> public abstract val setter: VariableAccessorDescriptor? defined in org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors[DeserializedPropertyDescriptor]

'context' @ [116:28] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[PropertyDescriptorImpl]

'symbolTable' @ [116:36] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceFunction' @ [116:48] ==> public final fun referenceFunction(callable: CallableDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'getterDescriptor' @ [116:66] ==> val getterDescriptor: VariableAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateLocalDelegatedPropertyReference[LocalVariableDescriptor]

'setterDescriptor' @ [117:28] ==> val setterDescriptor: VariableAccessorDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateLocalDelegatedPropertyReference[LocalVariableDescriptor]

'let' @ [117:46] ==> @InlineOnly public inline fun <T, R> VariableAccessorDescriptor.let(block: (VariableAccessorDescriptor) -> IrFunctionSymbol): IrFunctionSymbol defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableAccessorDescriptor
    <R> -> IrFunctionSymbol

'context' @ [117:52] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[PropertyDescriptorImpl]

'symbolTable' @ [117:60] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceFunction' @ [117:72] ==> public final fun referenceFunction(callable: CallableDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'it' @ [117:90] ==> value-parameter it: VariableAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateLocalDelegatedPropertyReference.<anonymous>[ValueParameterDescriptorImpl]

'IrLocalDelegatedPropertyReferenceImpl' @ [119:16] ==> public constructor IrLocalDelegatedPropertyReferenceImpl(startOffset: Int, endOffset: Int, type: KotlinType, descriptor: VariableDescriptorWithAccessors, delegate: IrVariableSymbol, getter: IrFunctionSymbol, setter: IrFunctionSymbol?, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrLocalDelegatedPropertyReferenceImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [120:17] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'endOffset' @ [120:30] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'type' @ [120:41] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'variableDescriptor' @ [121:17] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'irDelegateSymbol' @ [122:17] ==> value-parameter irDelegateSymbol: IrVariableSymbol defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'getterSymbol' @ [122:35] ==> val getterSymbol: IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateLocalDelegatedPropertyReference[LocalVariableDescriptor]

'setterSymbol' @ [122:49] ==> val setterSymbol: IrFunctionSymbol? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateLocalDelegatedPropertyReference[LocalVariableDescriptor]

'origin' @ [123:17] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [135:32] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generatePropertyReference[ValueParameterDescriptorImpl]

'getter' @ [135:51] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'propertyDescriptor' @ [136:32] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generatePropertyReference[ValueParameterDescriptorImpl]

'setter' @ [136:51] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'if (getterDescriptor == null) context.symbolTable.referenceField(propertyDescriptor) else null' @ [138:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrFieldSymbol?, elseBranch: IrFieldSymbol?): IrFieldSymbol?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrFieldSymbol?

'getterDescriptor' @ [138:31] ==> val getterDescriptor: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generatePropertyReference[LocalVariableDescriptor]

'context' @ [138:57] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[PropertyDescriptorImpl]

'symbolTable' @ [138:65] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceField' @ [138:77] ==> public final fun referenceField(descriptor: PropertyDescriptor): IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'propertyDescriptor' @ [138:92] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generatePropertyReference[ValueParameterDescriptorImpl]

'getterDescriptor' @ [139:28] ==> val getterDescriptor: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generatePropertyReference[LocalVariableDescriptor]

'let' @ [139:46] ==> @InlineOnly public inline fun <T, R> PropertyGetterDescriptor.let(block: (PropertyGetterDescriptor) -> IrFunctionSymbol): IrFunctionSymbol defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyGetterDescriptor
    <R> -> IrFunctionSymbol

'context' @ [139:52] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[PropertyDescriptorImpl]

'symbolTable' @ [139:60] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceFunction' @ [139:72] ==> public final fun referenceFunction(callable: CallableDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'it' @ [139:90] ==> value-parameter it: PropertyGetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generatePropertyReference.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [139:93] ==> public final val PropertyGetterDescriptor.original: PropertyGetterDescriptor[MyPropertyDescriptor]

'setterDescriptor' @ [140:28] ==> val setterDescriptor: PropertySetterDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generatePropertyReference[LocalVariableDescriptor]

'let' @ [140:46] ==> @InlineOnly public inline fun <T, R> PropertySetterDescriptor.let(block: (PropertySetterDescriptor) -> IrFunctionSymbol): IrFunctionSymbol defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertySetterDescriptor
    <R> -> IrFunctionSymbol

'context' @ [140:52] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[PropertyDescriptorImpl]

'symbolTable' @ [140:60] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceFunction' @ [140:72] ==> public final fun referenceFunction(callable: CallableDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'it' @ [140:90] ==> value-parameter it: PropertySetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generatePropertyReference.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [140:93] ==> public final val PropertySetterDescriptor.original: PropertySetterDescriptor[MyPropertyDescriptor]

'IrPropertyReferenceImpl' @ [142:16] ==> public constructor IrPropertyReferenceImpl(startOffset: Int, endOffset: Int, type: KotlinType, descriptor: PropertyDescriptor, field: IrFieldSymbol?, getter: IrFunctionSymbol?, setter: IrFunctionSymbol?, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrPropertyReferenceImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [143:17] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generatePropertyReference[ValueParameterDescriptorImpl]

'endOffset' @ [143:30] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generatePropertyReference[ValueParameterDescriptorImpl]

'type' @ [143:41] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generatePropertyReference[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [144:17] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generatePropertyReference[ValueParameterDescriptorImpl]

'fieldSymbol' @ [145:17] ==> val fieldSymbol: IrFieldSymbol? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generatePropertyReference[LocalVariableDescriptor]

'getterSymbol' @ [145:30] ==> val getterSymbol: IrFunctionSymbol? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generatePropertyReference[LocalVariableDescriptor]

'setterSymbol' @ [145:44] ==> val setterSymbol: IrFunctionSymbol? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generatePropertyReference[LocalVariableDescriptor]

'typeArguments' @ [146:17] ==> value-parameter typeArguments: Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generatePropertyReference[ValueParameterDescriptorImpl]

'origin' @ [147:17] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generatePropertyReference[ValueParameterDescriptorImpl]

'IrFunctionReferenceImpl' @ [160:13] ==> public constructor IrFunctionReferenceImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrFunctionSymbol, descriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrFunctionReferenceImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [161:21] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateFunctionReference[ValueParameterDescriptorImpl]

'endOffset' @ [161:34] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateFunctionReference[ValueParameterDescriptorImpl]

'type' @ [161:45] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateFunctionReference[ValueParameterDescriptorImpl]

'symbol' @ [162:21] ==> value-parameter symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateFunctionReference[ValueParameterDescriptorImpl]

'descriptor' @ [162:29] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateFunctionReference[ValueParameterDescriptorImpl]

'typeArguments' @ [163:21] ==> value-parameter typeArguments: Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateFunctionReference[ValueParameterDescriptorImpl]

'origin' @ [164:21] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateFunctionReference[ValueParameterDescriptorImpl]

