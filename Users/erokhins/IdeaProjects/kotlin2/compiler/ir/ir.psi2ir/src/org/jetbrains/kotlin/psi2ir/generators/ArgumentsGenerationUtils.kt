'receiver' @ [44:9] ==> value-parameter receiver: ReceiverValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiverOrNull[ValueParameterDescriptorImpl]

'let' @ [44:19] ==> @InlineOnly public inline fun <T, R> ReceiverValue.let(block: (ReceiverValue) -> IntermediateValue): IntermediateValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverValue
    <R> -> IntermediateValue

'generateReceiver' @ [44:25] ==> public fun StatementGenerator.generateReceiver(ktDefaultElement: KtElement, receiver: ReceiverValue): IntermediateValue defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'ktDefaultElement' @ [44:42] ==> value-parameter ktDefaultElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiverOrNull[ValueParameterDescriptorImpl]

'receiver' @ [44:60] ==> value-parameter receiver: ReceiverValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiverOrNull[ValueParameterDescriptorImpl]

'generateReceiver' @ [47:9] ==> public fun StatementGenerator.generateReceiver(defaultStartOffset: Int, defaultEndOffset: Int, receiver: ReceiverValue): IntermediateValue defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'ktDefaultElement' @ [47:26] ==> value-parameter ktDefaultElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'startOffset' @ [47:43] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDefaultElement' @ [47:56] ==> value-parameter ktDefaultElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'endOffset' @ [47:73] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'receiver' @ [47:84] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'if (receiver is TransientReceiver)
            TransientReceiverValue(receiver.type)
        else generateDelegatedValue(receiver.type) {
            val receiverExpression = when (receiver) {
                is ImplicitClassReceiver -> {
                    val receiverClassDescriptor = receiver.classDescriptor
                    if (shouldGenerateReceiverAsSingletonReference(receiverClassDescriptor))
                        generateSingletonReference(receiverClassDescriptor, defaultStartOffset, defaultEndOffset, receiver.type)
                    else
                        IrGetValueImpl(defaultStartOffset, defaultEndOffset,
                                       context.symbolTable.referenceValueParameter(receiverClassDescriptor.thisAsReceiverParameter))
                }
                is ThisClassReceiver ->
                    generateThisOrSuperReceiver(receiver, receiver.classDescriptor)
                is SuperCallReceiverValue ->
                    generateThisOrSuperReceiver(receiver, receiver.thisType.constructor.declarationDescriptor as ClassDescriptor)
                is ExpressionReceiver ->
                    generateExpression(receiver.expression)
                is ClassValueReceiver ->
                    IrGetObjectValueImpl(receiver.expression.startOffset, receiver.expression.endOffset, receiver.type,
                                         context.symbolTable.referenceClass(receiver.classQualifier.descriptor as ClassDescriptor))
                is ExtensionReceiver ->
                    IrGetValueImpl(defaultStartOffset, defaultStartOffset,
                                   context.symbolTable.referenceValueParameter(receiver.declarationDescriptor.extensionReceiverParameter!!))
                else ->
                    TODO("Receiver: ${receiver::class.java.simpleName}")
            }

            if (receiverExpression is IrExpressionWithCopy)
                RematerializableValue(receiverExpression)
            else
                OnceExpressionValue(receiverExpression)
        }' @ [50:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IntermediateValue, elseBranch: IntermediateValue): IntermediateValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IntermediateValue

'receiver' @ [50:13] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'TransientReceiverValue' @ [51:13] ==> public constructor TransientReceiverValue(type: KotlinType) defined in org.jetbrains.kotlin.psi2ir.intermediate.TransientReceiverValue[ClassConstructorDescriptorImpl]

'receiver' @ [51:36] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'type' @ [51:45] ==> public final val TransientReceiver.type: KotlinType[MyPropertyDescriptor]

'generateDelegatedValue' @ [52:14] ==> public inline fun generateDelegatedValue(type: KotlinType, crossinline generateValue: () -> IntermediateValue): ExpressionValue defined in org.jetbrains.kotlin.psi2ir.intermediate[SimpleFunctionDescriptorImpl]

'receiver' @ [52:37] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'type' @ [52:46] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'when (receiver) {
                is ImplicitClassReceiver -> {
                    val receiverClassDescriptor = receiver.classDescriptor
                    if (shouldGenerateReceiverAsSingletonReference(receiverClassDescriptor))
                        generateSingletonReference(receiverClassDescriptor, defaultStartOffset, defaultEndOffset, receiver.type)
                    else
                        IrGetValueImpl(defaultStartOffset, defaultEndOffset,
                                       context.symbolTable.referenceValueParameter(receiverClassDescriptor.thisAsReceiverParameter))
                }
                is ThisClassReceiver ->
                    generateThisOrSuperReceiver(receiver, receiver.classDescriptor)
                is SuperCallReceiverValue ->
                    generateThisOrSuperReceiver(receiver, receiver.thisType.constructor.declarationDescriptor as ClassDescriptor)
                is ExpressionReceiver ->
                    generateExpression(receiver.expression)
                is ClassValueReceiver ->
                    IrGetObjectValueImpl(receiver.expression.startOffset, receiver.expression.endOffset, receiver.type,
                                         context.symbolTable.referenceClass(receiver.classQualifier.descriptor as ClassDescriptor))
                is ExtensionReceiver ->
                    IrGetValueImpl(defaultStartOffset, defaultStartOffset,
                                   context.symbolTable.referenceValueParameter(receiver.declarationDescriptor.extensionReceiverParameter!!))
                else ->
                    TODO("Receiver: ${receiver::class.java.simpleName}")
            }' @ [53:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression, entry1: IrExpression, entry2: IrExpression, entry3: IrExpression, entry4: IrExpression, entry5: IrExpression, entry6: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression

'receiver' @ [53:44] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'receiver' @ [55:51] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'classDescriptor' @ [55:60] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitClassReceiver[DeserializedPropertyDescriptor]

'if (shouldGenerateReceiverAsSingletonReference(receiverClassDescriptor))
                        generateSingletonReference(receiverClassDescriptor, defaultStartOffset, defaultEndOffset, receiver.type)
                    else
                        IrGetValueImpl(defaultStartOffset, defaultEndOffset,
                                       context.symbolTable.referenceValueParameter(receiverClassDescriptor.thisAsReceiverParameter))' @ [56:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrDeclarationReference, elseBranch: IrDeclarationReference): IrDeclarationReference[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrDeclarationReference

'shouldGenerateReceiverAsSingletonReference' @ [56:25] ==> private fun StatementGenerator.shouldGenerateReceiverAsSingletonReference(receiverClassDescriptor: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'receiverClassDescriptor' @ [56:68] ==> val receiverClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver.<anonymous>[LocalVariableDescriptor]

'generateSingletonReference' @ [57:25] ==> public fun StatementGenerator.generateSingletonReference(descriptor: ClassDescriptor, startOffset: Int, endOffset: Int, type: KotlinType): IrDeclarationReference defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'receiverClassDescriptor' @ [57:52] ==> val receiverClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver.<anonymous>[LocalVariableDescriptor]

'defaultStartOffset' @ [57:77] ==> value-parameter defaultStartOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'defaultEndOffset' @ [57:97] ==> value-parameter defaultEndOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'receiver' @ [57:115] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'type' @ [57:124] ==> public final val ImplicitClassReceiver.type: SimpleType[MyPropertyDescriptor]

'IrGetValueImpl' @ [59:25] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'defaultStartOffset' @ [59:40] ==> value-parameter defaultStartOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'defaultEndOffset' @ [59:60] ==> value-parameter defaultEndOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'context' @ [60:40] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'symbolTable' @ [60:48] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceValueParameter' @ [60:60] ==> public final fun referenceValueParameter(descriptor: ParameterDescriptor): IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'receiverClassDescriptor' @ [60:84] ==> val receiverClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver.<anonymous>[LocalVariableDescriptor]

'thisAsReceiverParameter' @ [60:108] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'generateThisOrSuperReceiver' @ [63:21] ==> private fun StatementGenerator.generateThisOrSuperReceiver(receiver: ReceiverValue, classDescriptor: ClassDescriptor): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'receiver' @ [63:49] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'receiver' @ [63:59] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'classDescriptor' @ [63:68] ==> public abstract val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ThisClassReceiver[DeserializedPropertyDescriptor]

'generateThisOrSuperReceiver' @ [65:21] ==> private fun StatementGenerator.generateThisOrSuperReceiver(receiver: ReceiverValue, classDescriptor: ClassDescriptor): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'receiver' @ [65:49] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'receiver' @ [65:59] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'thisType' @ [65:68] ==> public abstract val thisType: KotlinType defined in org.jetbrains.kotlin.resolve.scopes.receivers.SuperCallReceiverValue[DeserializedPropertyDescriptor]

'constructor' @ [65:77] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [65:89] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'generateExpression' @ [67:21] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'receiver' @ [67:40] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'expression' @ [67:49] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[DeserializedPropertyDescriptor]

'IrGetObjectValueImpl' @ [69:21] ==> public constructor IrGetObjectValueImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrClassSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetObjectValueImpl[DeserializedClassConstructorDescriptor]

'receiver' @ [69:42] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'expression' @ [69:51] ==> public open val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ClassValueReceiver[DeserializedPropertyDescriptor]

'startOffset' @ [69:62] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'receiver' @ [69:75] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'expression' @ [69:84] ==> public open val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ClassValueReceiver[DeserializedPropertyDescriptor]

'endOffset' @ [69:95] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'receiver' @ [69:106] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'type' @ [69:115] ==> public final val ClassValueReceiver.type: KotlinType[MyPropertyDescriptor]

'context' @ [70:42] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'symbolTable' @ [70:50] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceClass' @ [70:62] ==> public final fun referenceClass(descriptor: ClassDescriptor): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'receiver' @ [70:77] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'classQualifier' @ [70:86] ==> public final val classQualifier: ClassifierQualifier defined in org.jetbrains.kotlin.resolve.scopes.receivers.ClassValueReceiver[DeserializedPropertyDescriptor]

'descriptor' @ [70:101] ==> public abstract val descriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.scopes.receivers.ClassifierQualifier[DeserializedPropertyDescriptor]

'IrGetValueImpl' @ [72:21] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'defaultStartOffset' @ [72:36] ==> value-parameter defaultStartOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'defaultStartOffset' @ [72:56] ==> value-parameter defaultStartOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'context' @ [73:36] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'symbolTable' @ [73:44] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceValueParameter' @ [73:56] ==> public final fun referenceValueParameter(descriptor: ParameterDescriptor): IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'receiver' @ [73:80] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [73:89] ==> public open val declarationDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExtensionReceiver[JavaPropertyDescriptor]

'extensionReceiverParameter' @ [73:111] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'TODO' @ [75:21] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'receiver' @ [75:39] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver[ValueParameterDescriptorImpl]

'java' @ [75:55] ==> public val <T> KClass<out ReceiverValue>.java: Class<out ReceiverValue> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ReceiverValue

'simpleName' @ [75:60] ==> public final val <T : (Any..Any?)> Class<out ReceiverValue>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ReceiverValue

'if (receiverExpression is IrExpressionWithCopy)
                RematerializableValue(receiverExpression)
            else
                OnceExpressionValue(receiverExpression)' @ [78:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IntermediateValue, elseBranch: IntermediateValue): IntermediateValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IntermediateValue

'receiverExpression' @ [78:17] ==> val receiverExpression: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver.<anonymous>[LocalVariableDescriptor]

'RematerializableValue' @ [79:17] ==> public constructor RematerializableValue(irExpression: IrExpressionWithCopy) defined in org.jetbrains.kotlin.psi2ir.intermediate.RematerializableValue[ClassConstructorDescriptorImpl]

'receiverExpression' @ [79:39] ==> val receiverExpression: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver.<anonymous>[LocalVariableDescriptor]

'OnceExpressionValue' @ [81:17] ==> public constructor OnceExpressionValue(irExpression: IrExpression) defined in org.jetbrains.kotlin.psi2ir.intermediate.OnceExpressionValue[ClassConstructorDescriptorImpl]

'receiverExpression' @ [81:37] ==> val receiverExpression: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiver.<anonymous>[LocalVariableDescriptor]

'when {
            DescriptorUtils.isObject(descriptor) ->
                IrGetObjectValueImpl(startOffset, endOffset, type,
                                     context.symbolTable.referenceClass(descriptor))
            DescriptorUtils.isEnumEntry(descriptor) ->
                IrGetEnumValueImpl(startOffset, endOffset, type,
                                   context.symbolTable.referenceEnumEntry(descriptor))
            else -> {
                val companionObjectDescriptor = descriptor.companionObjectDescriptor
                                                ?: throw java.lang.AssertionError("Class value without companion object: $descriptor")
                IrGetObjectValueImpl(startOffset, endOffset, type,
                                     context.symbolTable.referenceClass(companionObjectDescriptor))
            }
        }' @ [85:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrDeclarationReference, entry1: IrDeclarationReference, entry2: IrDeclarationReference): IrDeclarationReference[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrDeclarationReference

'isObject' @ [86:29] ==> public open fun isObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [86:38] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateSingletonReference[ValueParameterDescriptorImpl]

'IrGetObjectValueImpl' @ [87:17] ==> public constructor IrGetObjectValueImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrClassSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetObjectValueImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [87:38] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateSingletonReference[ValueParameterDescriptorImpl]

'endOffset' @ [87:51] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateSingletonReference[ValueParameterDescriptorImpl]

'type' @ [87:62] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.generateSingletonReference[ValueParameterDescriptorImpl]

'context' @ [88:38] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'symbolTable' @ [88:46] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceClass' @ [88:58] ==> public final fun referenceClass(descriptor: ClassDescriptor): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [88:73] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateSingletonReference[ValueParameterDescriptorImpl]

'isEnumEntry' @ [89:29] ==> public open fun isEnumEntry(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [89:41] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateSingletonReference[ValueParameterDescriptorImpl]

'IrGetEnumValueImpl' @ [90:17] ==> public constructor IrGetEnumValueImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrEnumEntrySymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetEnumValueImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [90:36] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateSingletonReference[ValueParameterDescriptorImpl]

'endOffset' @ [90:49] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateSingletonReference[ValueParameterDescriptorImpl]

'type' @ [90:60] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.generateSingletonReference[ValueParameterDescriptorImpl]

'context' @ [91:36] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'symbolTable' @ [91:44] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceEnumEntry' @ [91:56] ==> public final fun referenceEnumEntry(descriptor: ClassDescriptor): IrEnumEntrySymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [91:75] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateSingletonReference[ValueParameterDescriptorImpl]

'descriptor' @ [93:49] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateSingletonReference[ValueParameterDescriptorImpl]

'companionObjectDescriptor' @ [93:60] ==> public final val ClassDescriptor.companionObjectDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'AssertionError' @ [94:68] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'descriptor' @ [94:123] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateSingletonReference[ValueParameterDescriptorImpl]

'IrGetObjectValueImpl' @ [95:17] ==> public constructor IrGetObjectValueImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrClassSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetObjectValueImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [95:38] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateSingletonReference[ValueParameterDescriptorImpl]

'endOffset' @ [95:51] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateSingletonReference[ValueParameterDescriptorImpl]

'type' @ [95:62] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.generateSingletonReference[ValueParameterDescriptorImpl]

'context' @ [96:38] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'symbolTable' @ [96:46] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceClass' @ [96:58] ==> public final fun referenceClass(descriptor: ClassDescriptor): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'companionObjectDescriptor' @ [96:73] ==> val companionObjectDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateSingletonReference[LocalVariableDescriptor]

'receiverClassDescriptor' @ [101:12] ==> value-parameter receiverClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.shouldGenerateReceiverAsSingletonReference[ValueParameterDescriptorImpl]

'kind' @ [101:36] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'isSingleton' @ [101:41] ==> public final val ClassKind.isSingleton: Boolean[MyPropertyDescriptor]

'this' @ [102:12] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.shouldGenerateReceiverAsSingletonReference[ReceiverParameterDescriptorImpl]

'scopeOwner' @ [102:17] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'receiverClassDescriptor' @ [102:31] ==> value-parameter receiverClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.shouldGenerateReceiverAsSingletonReference[ValueParameterDescriptorImpl]

'this' @ [103:12] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.shouldGenerateReceiverAsSingletonReference[ReceiverParameterDescriptorImpl]

'scopeOwner' @ [103:17] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'containingDeclaration' @ [103:28] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'receiverClassDescriptor' @ [103:53] ==> value-parameter receiverClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.shouldGenerateReceiverAsSingletonReference[ValueParameterDescriptorImpl]

'receiver' @ [107:30] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateThisOrSuperReceiver[ValueParameterDescriptorImpl]

'AssertionError' @ [108:36] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'expressionReceiver' @ [109:22] ==> val expressionReceiver: ExpressionReceiver defined in org.jetbrains.kotlin.psi2ir.generators.generateThisOrSuperReceiver[LocalVariableDescriptor]

'expression' @ [109:41] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[DeserializedPropertyDescriptor]

'IrGetValueImpl' @ [110:12] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'ktReceiver' @ [110:27] ==> val ktReceiver: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.generateThisOrSuperReceiver[LocalVariableDescriptor]

'startOffset' @ [110:38] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktReceiver' @ [110:51] ==> val ktReceiver: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.generateThisOrSuperReceiver[LocalVariableDescriptor]

'endOffset' @ [110:62] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [111:27] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'symbolTable' @ [111:35] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceValueParameter' @ [111:47] ==> public final fun referenceValueParameter(descriptor: ParameterDescriptor): IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [111:71] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateThisOrSuperReceiver[ValueParameterDescriptorImpl]

'thisAsReceiverParameter' @ [111:87] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'resolvedCall' @ [120:20] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.psi2ir.generators.generateBackingFieldReceiver[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [120:34] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'fieldDescriptor' @ [120:54] ==> value-parameter fieldDescriptor: SyntheticFieldDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateBackingFieldReceiver[ValueParameterDescriptorImpl]

'getDispatchReceiverForBackend' @ [120:70] ==> public final fun getDispatchReceiverForBackend(): ReceiverValue? defined in org.jetbrains.kotlin.descriptors.impl.SyntheticFieldDescriptor[DeserializedSimpleFunctionDescriptor]

'this' @ [121:12] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.generateBackingFieldReceiver[ReceiverParameterDescriptorImpl]

'generateReceiver' @ [121:17] ==> public fun StatementGenerator.generateReceiver(defaultStartOffset: Int, defaultEndOffset: Int, receiver: ReceiverValue): IntermediateValue defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'startOffset' @ [121:34] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateBackingFieldReceiver[ValueParameterDescriptorImpl]

'endOffset' @ [121:47] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateBackingFieldReceiver[ValueParameterDescriptorImpl]

'receiver' @ [121:58] ==> val receiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.generateBackingFieldReceiver[LocalVariableDescriptor]

'when (calleeDescriptor) {
        is ImportedFromObjectCallableDescriptor<*> -> {
            assert(dispatchReceiver == null) {
                "Call for member imported from object $calleeDescriptor has non-null dispatch receiver $dispatchReceiver"
            }
            dispatchReceiverValue = generateReceiverForCalleeImportedFromObject(ktDefaultElement.startOffset, ktDefaultElement.endOffset, calleeDescriptor)
            extensionReceiverValue = generateReceiverOrNull(ktDefaultElement, extensionReceiver)
        }
        is TypeAliasConstructorDescriptor -> {
            assert(!(dispatchReceiver != null && extensionReceiver != null)) {
                "Type alias constructor call for $calleeDescriptor can't have both dispatch receiver and extension receiver: " +
                "$dispatchReceiver, $extensionReceiver"
            }
            dispatchReceiverValue = generateReceiverOrNull(ktDefaultElement, extensionReceiver ?: dispatchReceiver)
            extensionReceiverValue = null
        }
        else -> {
            dispatchReceiverValue = generateReceiverOrNull(ktDefaultElement, dispatchReceiver)
            extensionReceiverValue = generateReceiverOrNull(ktDefaultElement, extensionReceiver)
        }
    }' @ [134:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'calleeDescriptor' @ [134:11] ==> value-parameter calleeDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'assert' @ [136:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'dispatchReceiver' @ [136:20] ==> value-parameter dispatchReceiver: ReceiverValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'calleeDescriptor' @ [137:56] ==> value-parameter calleeDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [137:105] ==> value-parameter dispatchReceiver: ReceiverValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'dispatchReceiverValue' @ [139:13] ==> val dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[LocalVariableDescriptor]

'generateReceiverForCalleeImportedFromObject' @ [139:37] ==> private fun StatementGenerator.generateReceiverForCalleeImportedFromObject(startOffset: Int, endOffset: Int, calleeDescriptor: ImportedFromObjectCallableDescriptor<*>): ExpressionValue defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'ktDefaultElement' @ [139:81] ==> value-parameter ktDefaultElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'startOffset' @ [139:98] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDefaultElement' @ [139:111] ==> value-parameter ktDefaultElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'endOffset' @ [139:128] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'calleeDescriptor' @ [139:139] ==> value-parameter calleeDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'extensionReceiverValue' @ [140:13] ==> val extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[LocalVariableDescriptor]

'generateReceiverOrNull' @ [140:38] ==> public fun StatementGenerator.generateReceiverOrNull(ktDefaultElement: KtElement, receiver: ReceiverValue?): IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'ktDefaultElement' @ [140:61] ==> value-parameter ktDefaultElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'extensionReceiver' @ [140:79] ==> value-parameter extensionReceiver: ReceiverValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'assert' @ [143:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [143:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dispatchReceiver' @ [143:22] ==> value-parameter dispatchReceiver: ReceiverValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'extensionReceiver' @ [143:50] ==> value-parameter extensionReceiver: ReceiverValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'+' @ [144:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'calleeDescriptor' @ [144:51] ==> value-parameter calleeDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [145:19] ==> value-parameter dispatchReceiver: ReceiverValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'extensionReceiver' @ [145:38] ==> value-parameter extensionReceiver: ReceiverValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'dispatchReceiverValue' @ [147:13] ==> val dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[LocalVariableDescriptor]

'generateReceiverOrNull' @ [147:37] ==> public fun StatementGenerator.generateReceiverOrNull(ktDefaultElement: KtElement, receiver: ReceiverValue?): IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'ktDefaultElement' @ [147:60] ==> value-parameter ktDefaultElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'extensionReceiver' @ [147:78] ==> value-parameter extensionReceiver: ReceiverValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [147:99] ==> value-parameter dispatchReceiver: ReceiverValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'extensionReceiverValue' @ [148:13] ==> val extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[LocalVariableDescriptor]

'dispatchReceiverValue' @ [151:13] ==> val dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[LocalVariableDescriptor]

'generateReceiverOrNull' @ [151:37] ==> public fun StatementGenerator.generateReceiverOrNull(ktDefaultElement: KtElement, receiver: ReceiverValue?): IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'ktDefaultElement' @ [151:60] ==> value-parameter ktDefaultElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [151:78] ==> value-parameter dispatchReceiver: ReceiverValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'extensionReceiverValue' @ [152:13] ==> val extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[LocalVariableDescriptor]

'generateReceiverOrNull' @ [152:38] ==> public fun StatementGenerator.generateReceiverOrNull(ktDefaultElement: KtElement, receiver: ReceiverValue?): IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'ktDefaultElement' @ [152:61] ==> value-parameter ktDefaultElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'extensionReceiver' @ [152:79] ==> value-parameter extensionReceiver: ReceiverValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'when {
        !isSafe ->
            SimpleCallReceiver(dispatchReceiverValue, extensionReceiverValue)
        extensionReceiverValue != null  || dispatchReceiverValue != null->
            SafeCallReceiver(this, ktDefaultElement.startOffset, ktDefaultElement.endOffset,
                             extensionReceiverValue, dispatchReceiverValue, isAssignmentReceiver)
        else ->
            throw AssertionError("Safe call should have an explicit receiver: ${ktDefaultElement.text}")
    }' @ [156:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CallReceiver, entry1: CallReceiver, entry2: CallReceiver): CallReceiver[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CallReceiver

'!' @ [157:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSafe' @ [157:10] ==> value-parameter isSafe: Boolean defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'SimpleCallReceiver' @ [158:13] ==> public constructor SimpleCallReceiver(dispatchReceiverValue: IntermediateValue?, extensionReceiverValue: IntermediateValue?) defined in org.jetbrains.kotlin.psi2ir.intermediate.SimpleCallReceiver[ClassConstructorDescriptorImpl]

'dispatchReceiverValue' @ [158:32] ==> val dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[LocalVariableDescriptor]

'extensionReceiverValue' @ [158:55] ==> val extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[LocalVariableDescriptor]

'extensionReceiverValue' @ [159:9] ==> val extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[LocalVariableDescriptor]

'dispatchReceiverValue' @ [159:44] ==> val dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[LocalVariableDescriptor]

'SafeCallReceiver' @ [160:13] ==> public constructor SafeCallReceiver(generator: GeneratorWithScope, startOffset: Int, endOffset: Int, extensionReceiver: IntermediateValue?, dispatchReceiver: IntermediateValue?, isAssignmentReceiver: Boolean) defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver[ClassConstructorDescriptorImpl]

'this' @ [160:30] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ReceiverParameterDescriptorImpl]

'ktDefaultElement' @ [160:36] ==> value-parameter ktDefaultElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'startOffset' @ [160:53] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDefaultElement' @ [160:66] ==> value-parameter ktDefaultElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'endOffset' @ [160:83] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'extensionReceiverValue' @ [161:30] ==> val extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[LocalVariableDescriptor]

'dispatchReceiverValue' @ [161:54] ==> val dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[LocalVariableDescriptor]

'isAssignmentReceiver' @ [161:77] ==> value-parameter isAssignmentReceiver: Boolean = ... defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'AssertionError' @ [163:19] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'ktDefaultElement' @ [163:81] ==> value-parameter ktDefaultElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.generateCallReceiver[ValueParameterDescriptorImpl]

'text' @ [163:98] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'calleeDescriptor' @ [172:28] ==> value-parameter calleeDescriptor: ImportedFromObjectCallableDescriptor<*> defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiverForCalleeImportedFromObject[ValueParameterDescriptorImpl]

'containingObject' @ [172:45] ==> public final val containingObject: ClassDescriptor defined in org.jetbrains.kotlin.resolve.ImportedFromObjectCallableDescriptor[DeserializedPropertyDescriptor]

'objectDescriptor' @ [173:22] ==> val objectDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiverForCalleeImportedFromObject[LocalVariableDescriptor]

'defaultType' @ [173:39] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'generateExpressionValue' @ [174:12] ==> public inline fun generateExpressionValue(type: KotlinType, crossinline generate: () -> IrExpression): ExpressionValue defined in org.jetbrains.kotlin.psi2ir.intermediate[SimpleFunctionDescriptorImpl]

'objectType' @ [174:36] ==> val objectType: SimpleType defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiverForCalleeImportedFromObject[LocalVariableDescriptor]

'IrGetObjectValueImpl' @ [175:9] ==> public constructor IrGetObjectValueImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrClassSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetObjectValueImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [175:30] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiverForCalleeImportedFromObject[ValueParameterDescriptorImpl]

'endOffset' @ [175:43] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiverForCalleeImportedFromObject[ValueParameterDescriptorImpl]

'objectType' @ [175:54] ==> val objectType: SimpleType defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiverForCalleeImportedFromObject[LocalVariableDescriptor]

'context' @ [176:30] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'symbolTable' @ [176:38] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceClass' @ [176:50] ==> public final fun referenceClass(descriptor: ClassDescriptor): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'objectDescriptor' @ [176:65] ==> val objectDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateReceiverForCalleeImportedFromObject[LocalVariableDescriptor]

'varargArgument' @ [181:9] ==> value-parameter varargArgument: VarargValueArgument defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[ValueParameterDescriptorImpl]

'arguments' @ [181:24] ==> public final val VarargValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'isEmpty' @ [181:34] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'varargArgument' @ [185:29] ==> value-parameter varargArgument: VarargValueArgument defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[ValueParameterDescriptorImpl]

'arguments' @ [185:44] ==> public final val VarargValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'fold' @ [185:54] ==> public inline fun <T, R> Iterable<(ValueArgument..ValueArgument?)>.fold(initial: Int, operation: (Int, (ValueArgument..ValueArgument?)) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)
    <R> -> Int

'Int' @ [185:59] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [185:63] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'min' @ [186:14] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'minStartOffset' @ [186:18] ==> value-parameter minStartOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression.<anonymous>[ValueParameterDescriptorImpl]

'argument' @ [186:34] ==> value-parameter argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression.<anonymous>[ValueParameterDescriptorImpl]

'asElement' @ [186:43] ==> public abstract fun asElement(): KtElement defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'startOffset' @ [186:55] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'varargArgument' @ [188:27] ==> value-parameter varargArgument: VarargValueArgument defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[ValueParameterDescriptorImpl]

'arguments' @ [188:42] ==> public final val VarargValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'fold' @ [188:52] ==> public inline fun <T, R> Iterable<(ValueArgument..ValueArgument?)>.fold(initial: Int, operation: (Int, (ValueArgument..ValueArgument?)) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)
    <R> -> Int

'Int' @ [188:57] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [188:61] ==> public const final val MIN_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'max' @ [189:14] ==> public open fun max(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'maxEndOffset' @ [189:18] ==> value-parameter maxEndOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression.<anonymous>[ValueParameterDescriptorImpl]

'argument' @ [189:32] ==> value-parameter argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression.<anonymous>[ValueParameterDescriptorImpl]

'asElement' @ [189:41] ==> public abstract fun asElement(): KtElement defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'endOffset' @ [189:53] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'valueParameter' @ [192:29] ==> value-parameter valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[ValueParameterDescriptorImpl]

'varargElementType' @ [192:44] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'AssertionError' @ [193:35] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'valueParameter' @ [193:93] ==> value-parameter valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[ValueParameterDescriptorImpl]

'IrVarargImpl' @ [195:20] ==> public constructor IrVarargImpl(startOffset: Int, endOffset: Int, type: KotlinType, varargElementType: KotlinType) defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl[DeserializedClassConstructorDescriptor]

'varargStartOffset' @ [195:33] ==> val varargStartOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[LocalVariableDescriptor]

'varargEndOffset' @ [195:52] ==> val varargEndOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[LocalVariableDescriptor]

'valueParameter' @ [195:69] ==> value-parameter valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[ValueParameterDescriptorImpl]

'type' @ [195:84] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'varargElementType' @ [195:90] ==> val varargElementType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[LocalVariableDescriptor]

'varargArgument' @ [197:22] ==> value-parameter varargArgument: VarargValueArgument defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[ValueParameterDescriptorImpl]

'arguments' @ [197:37] ==> public final val VarargValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'argument' @ [198:36] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[LocalVariableDescriptor]

'getArgumentExpression' @ [198:45] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'AssertionError' @ [199:42] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'argument' @ [199:102] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[LocalVariableDescriptor]

'asElement' @ [199:111] ==> public abstract fun asElement(): KtElement defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'text' @ [199:123] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'if (argument.getSpreadElement() != null)
                    IrSpreadElementImpl(ktArgumentExpression.startOffset, ktArgumentExpression.endOffset,
                                                                            generateExpression(ktArgumentExpression))
                else
                    generateExpression(ktArgumentExpression)' @ [201:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrVarargElement, elseBranch: IrVarargElement): IrVarargElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrVarargElement

'argument' @ [201:21] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[LocalVariableDescriptor]

'getSpreadElement' @ [201:30] ==> public abstract fun getSpreadElement(): LeafPsiElement? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'IrSpreadElementImpl' @ [202:21] ==> public constructor IrSpreadElementImpl(startOffset: Int, endOffset: Int, expression: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl[DeserializedClassConstructorDescriptor]

'ktArgumentExpression' @ [202:41] ==> val ktArgumentExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[LocalVariableDescriptor]

'startOffset' @ [202:62] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktArgumentExpression' @ [202:75] ==> val ktArgumentExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[LocalVariableDescriptor]

'endOffset' @ [202:96] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'generateExpression' @ [203:77] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktArgumentExpression' @ [203:96] ==> val ktArgumentExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[LocalVariableDescriptor]

'generateExpression' @ [205:21] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktArgumentExpression' @ [205:40] ==> val ktArgumentExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[LocalVariableDescriptor]

'irVararg' @ [207:9] ==> val irVararg: IrVarargImpl defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[LocalVariableDescriptor]

'addElement' @ [207:18] ==> public final fun addElement(varargElement: IrVarargElement): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl[DeserializedSimpleFunctionDescriptor]

'irVarargElement' @ [207:29] ==> val irVarargElement: IrVarargElement defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[LocalVariableDescriptor]

'irVararg' @ [210:12] ==> val irVararg: IrVarargImpl defined in org.jetbrains.kotlin.psi2ir.generators.generateVarargExpression[LocalVariableDescriptor]

'when (valueArgument) {
            is DefaultValueArgument ->
                null
            is ExpressionValueArgument ->
                generateExpression(valueArgument.valueArgument!!.getArgumentExpression()!!)
            is VarargValueArgument ->
                generateVarargExpression(valueArgument, valueParameter)
            else ->
                TODO("Unexpected valueArgument: ${valueArgument::class.java.simpleName}")
        }' @ [214:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression?, entry1: IrExpression?, entry2: IrExpression?, entry3: IrExpression?): IrExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression?

'valueArgument' @ [214:15] ==> value-parameter valueArgument: ResolvedValueArgument defined in org.jetbrains.kotlin.psi2ir.generators.generateValueArgument[ValueParameterDescriptorImpl]

'generateExpression' @ [218:17] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'valueArgument' @ [218:36] ==> value-parameter valueArgument: ResolvedValueArgument defined in org.jetbrains.kotlin.psi2ir.generators.generateValueArgument[ValueParameterDescriptorImpl]

'valueArgument' @ [218:50] ==> public final val ExpressionValueArgument.valueArgument: ValueArgument?[MyPropertyDescriptor]

'getArgumentExpression' @ [218:66] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'generateVarargExpression' @ [220:17] ==> public fun StatementGenerator.generateVarargExpression(varargArgument: VarargValueArgument, valueParameter: ValueParameterDescriptor): IrExpression? defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'valueArgument' @ [220:42] ==> value-parameter valueArgument: ResolvedValueArgument defined in org.jetbrains.kotlin.psi2ir.generators.generateValueArgument[ValueParameterDescriptorImpl]

'valueParameter' @ [220:57] ==> value-parameter valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.generateValueArgument[ValueParameterDescriptorImpl]

'TODO' @ [222:17] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'valueArgument' @ [222:51] ==> value-parameter valueArgument: ResolvedValueArgument defined in org.jetbrains.kotlin.psi2ir.generators.generateValueArgument[ValueParameterDescriptorImpl]

'java' @ [222:72] ==> public val <T> KClass<out ResolvedValueArgument>.java: Class<out ResolvedValueArgument> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ResolvedValueArgument

'simpleName' @ [222:77] ==> public final val <T : (Any..Any?)> Class<out ResolvedValueArgument>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ResolvedValueArgument

'getSuperCallExpression' @ [226:31] ==> public fun getSuperCallExpression(call: Call): KtSuperExpression? defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [226:54] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.getSuperQualifier[ValueParameterDescriptorImpl]

'call' @ [226:67] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'getOrFail' @ [227:12] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>, key: (KtReferenceExpression..KtReferenceExpression?)): (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtReferenceExpression..org.jetbrains.kotlin.psi.KtReferenceExpression?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'REFERENCE_TARGET' @ [227:37] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'superCallExpression' @ [227:55] ==> val superCallExpression: KtSuperExpression defined in org.jetbrains.kotlin.psi2ir.generators.getSuperQualifier[LocalVariableDescriptor]

'instanceReference' @ [227:75] ==> public final val KtSuperExpression.instanceReference: KtReferenceExpression[MyPropertyDescriptor]

'resolvedCall' @ [231:9] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateCall[ValueParameterDescriptorImpl]

'isExtensionInvokeCall' @ [231:22] ==> private fun ResolvedCall<*>.isExtensionInvokeCall(): Boolean defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'pregenerateExtensionInvokeCall' @ [232:16] ==> public fun StatementGenerator.pregenerateExtensionInvokeCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [232:47] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateCall[ValueParameterDescriptorImpl]

'pregenerateCallReceivers' @ [235:16] ==> public fun StatementGenerator.pregenerateCallReceivers(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [235:41] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateCall[ValueParameterDescriptorImpl]

'pregenerateValueArguments' @ [236:5] ==> private fun StatementGenerator.pregenerateValueArguments(call: CallBuilder, resolvedCall: ResolvedCall<*>): Unit defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'call' @ [236:31] ==> val call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateCall[LocalVariableDescriptor]

'resolvedCall' @ [236:37] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateCall[ValueParameterDescriptorImpl]

'call' @ [237:12] ==> val call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateCall[LocalVariableDescriptor]

'resolvedCall' @ [241:27] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [241:40] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'extensionInvoke' @ [242:26] ==> val extensionInvoke: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'containingDeclaration' @ [242:42] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'AssertionError' @ [243:32] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'extensionInvoke' @ [243:84] ==> val extensionInvoke: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'functionNClass' @ [244:37] ==> val functionNClass: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'unsubstitutedMemberScope' @ [244:52] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getContributedFunctions' @ [244:77] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'extensionInvoke' @ [244:101] ==> val extensionInvoke: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'name' @ [244:117] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'FROM_BACKEND' @ [244:140] ==> enum entry FROM_BACKEND defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'unsubstitutedPlainInvokes' @ [245:36] ==> val unsubstitutedPlainInvokes: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'singleOrNull' @ [245:62] ==> public fun <T> Iterable<SimpleFunctionDescriptor>.singleOrNull(): SimpleFunctionDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'AssertionError' @ [246:42] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'unsubstitutedPlainInvokes' @ [246:113] ==> val unsubstitutedPlainInvokes: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'extensionInvoke' @ [248:40] ==> val extensionInvoke: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'valueParameters' @ [248:56] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [248:72] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'assert' @ [249:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'unsubstitutedPlainInvoke' @ [249:12] ==> val unsubstitutedPlainInvoke: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'valueParameters' @ [249:37] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [249:53] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'expectedValueParametersCount' @ [249:61] ==> val expectedValueParametersCount: Int defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'expectedValueParametersCount' @ [250:38] ==> val expectedValueParametersCount: Int defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'unsubstitutedPlainInvoke' @ [250:91] ==> val unsubstitutedPlainInvoke: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'valueParameters' @ [250:116] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'extensionInvoke' @ [253:25] ==> val extensionInvoke: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [253:41] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [253:69] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'unsubstitutedPlainInvoke' @ [254:23] ==> val unsubstitutedPlainInvoke: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'substitute' @ [254:48] ==> @Nullable public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor[JavaMethodDescriptor]

'create' @ [254:75] ==> @NotNull public open fun create(@NotNull p0: KotlinType): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'functionNType' @ [254:82] ==> val functionNType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'AssertionError' @ [255:29] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'unsubstitutedPlainInvoke' @ [255:70] ==> val unsubstitutedPlainInvoke: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'functionNType' @ [255:102] ==> val functionNType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'resolvedCall' @ [257:25] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[ValueParameterDescriptorImpl]

'call' @ [257:38] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'callElement' @ [257:43] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'CallBuilder' @ [259:16] ==> public constructor CallBuilder(original: ResolvedCall<*>, descriptor: CallableDescriptor, isExtensionInvokeCall: Boolean = ...) defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[ClassConstructorDescriptorImpl]

'resolvedCall' @ [259:28] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[ValueParameterDescriptorImpl]

'plainInvoke' @ [259:42] ==> val plainInvoke: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'run' @ [261:33] ==> @InlineOnly public inline fun <T, R> StatementGenerator.run(block: StatementGenerator.() -> IntermediateValue): IntermediateValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StatementGenerator
    <R> -> IntermediateValue

'resolvedCall' @ [262:32] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [262:45] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'AssertionError' @ [263:38] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'generateReceiver' @ [264:9] ==> public fun StatementGenerator.generateReceiver(ktDefaultElement: KtElement, receiver: ReceiverValue): IntermediateValue defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'ktCallElement' @ [264:26] ==> val ktCallElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'dispatchReceiver' @ [264:41] ==> val dispatchReceiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall.<anonymous>[LocalVariableDescriptor]

'run' @ [267:40] ==> @InlineOnly public inline fun <T, R> StatementGenerator.run(block: StatementGenerator.() -> IntermediateValue): IntermediateValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StatementGenerator
    <R> -> IntermediateValue

'resolvedCall' @ [268:33] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[ValueParameterDescriptorImpl]

'extensionReceiver' @ [268:46] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'AssertionError' @ [269:39] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'generateReceiver' @ [270:9] ==> public fun StatementGenerator.generateReceiver(ktDefaultElement: KtElement, receiver: ReceiverValue): IntermediateValue defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'ktCallElement' @ [270:26] ==> val ktCallElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'extensionReceiver' @ [270:41] ==> val extensionReceiver: ReceiverValue defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall.<anonymous>[LocalVariableDescriptor]

'call' @ [273:5] ==> val call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'callReceiver' @ [273:10] ==> public final lateinit var callReceiver: CallReceiver defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'if (resolvedCall.call.isSafeCall())
                SafeExtensionInvokeCallReceiver(this, ktCallElement.startOffset, ktCallElement.endOffset,
                                                call, functionReceiverValue, extensionInvokeReceiverValue)
            else
                ExtensionInvokeCallReceiver(call, functionReceiverValue, extensionInvokeReceiverValue)' @ [274:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallReceiver, elseBranch: CallReceiver): CallReceiver[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallReceiver

'resolvedCall' @ [274:17] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[ValueParameterDescriptorImpl]

'call' @ [274:30] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'isSafeCall' @ [274:35] ==> public fun Call.isSafeCall(): Boolean defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'SafeExtensionInvokeCallReceiver' @ [275:17] ==> public constructor SafeExtensionInvokeCallReceiver(generator: GeneratorWithScope, startOffset: Int, endOffset: Int, callBuilder: CallBuilder, functionReceiver: IntermediateValue, extensionInvokeReceiver: IntermediateValue) defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeExtensionInvokeCallReceiver[ClassConstructorDescriptorImpl]

'this' @ [275:49] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[ReceiverParameterDescriptorImpl]

'ktCallElement' @ [275:55] ==> val ktCallElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'startOffset' @ [275:69] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktCallElement' @ [275:82] ==> val ktCallElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'endOffset' @ [275:96] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'call' @ [276:49] ==> val call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'functionReceiverValue' @ [276:55] ==> val functionReceiverValue: IntermediateValue defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'extensionInvokeReceiverValue' @ [276:78] ==> val extensionInvokeReceiverValue: IntermediateValue defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'ExtensionInvokeCallReceiver' @ [278:17] ==> public constructor ExtensionInvokeCallReceiver(callBuilder: CallBuilder, functionReceiver: IntermediateValue, extensionInvokeReceiver: IntermediateValue) defined in org.jetbrains.kotlin.psi2ir.intermediate.ExtensionInvokeCallReceiver[ClassConstructorDescriptorImpl]

'call' @ [278:45] ==> val call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'functionReceiverValue' @ [278:51] ==> val functionReceiverValue: IntermediateValue defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'extensionInvokeReceiverValue' @ [278:74] ==> val extensionInvokeReceiverValue: IntermediateValue defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'call' @ [280:5] ==> val call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'irValueArgumentsByIndex' @ [280:10] ==> public final val irValueArgumentsByIndex: Array<IrExpression?> defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'resolvedCall' @ [281:5] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[ValueParameterDescriptorImpl]

'valueArgumentsByIndex' @ [281:18] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.valueArgumentsByIndex: (MutableList<(ResolvedValueArgument..ResolvedValueArgument?)>?..List<(ResolvedValueArgument..ResolvedValueArgument?)>?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'forEachIndexed' @ [281:42] ==> public inline fun <T> Iterable<(ResolvedValueArgument..ResolvedValueArgument?)>.forEachIndexed(action: (index: Int, (ResolvedValueArgument..ResolvedValueArgument?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)

'call' @ [282:30] ==> val call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'descriptor' @ [282:35] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'valueParameters' @ [282:46] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'index' @ [282:62] ==> value-parameter index: Int defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall.<anonymous>[ValueParameterDescriptorImpl]

'call' @ [283:9] ==> val call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'irValueArgumentsByIndex' @ [283:14] ==> public final val irValueArgumentsByIndex: Array<IrExpression?> defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'index' @ [283:38] ==> value-parameter index: Int defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall.<anonymous>[ValueParameterDescriptorImpl]

'generateValueArgument' @ [283:51] ==> public fun StatementGenerator.generateValueArgument(valueArgument: ResolvedValueArgument, valueParameter: ValueParameterDescriptor): IrExpression? defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'valueArgument' @ [283:73] ==> value-parameter valueArgument: (ResolvedValueArgument..ResolvedValueArgument?) defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall.<anonymous>[ValueParameterDescriptorImpl]

'valueParameter' @ [283:88] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall.<anonymous>[LocalVariableDescriptor]

'call' @ [286:12] ==> val call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateExtensionInvokeCall[LocalVariableDescriptor]

'resultingDescriptor' @ [290:18] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'callee' @ [291:9] ==> val callee: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.isExtensionInvokeCall[LocalVariableDescriptor]

'name' @ [291:16] ==> public final val SimpleFunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [291:21] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'callee' @ [292:32] ==> val callee: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.isExtensionInvokeCall[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [292:39] ==> public final val SimpleFunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [292:66] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'!' @ [293:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dispatchReceiverType' @ [293:10] ==> val dispatchReceiverType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.isExtensionInvokeCall[LocalVariableDescriptor]

'isBuiltinFunctionalType' @ [293:31] ==> public val KotlinType.isBuiltinFunctionalType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'extensionReceiver' @ [294:12] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resolvedCall' @ [298:9] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.psi2ir.generators.getTypeArguments[ValueParameterDescriptorImpl]

'resolvedCall' @ [300:22] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.psi2ir.generators.getTypeArguments[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [300:35] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'descriptor' @ [301:9] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.getTypeArguments[LocalVariableDescriptor]

'typeParameters' @ [301:20] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isEmpty' @ [301:35] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [303:12] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.psi2ir.generators.getTypeArguments[ValueParameterDescriptorImpl]

'typeArguments' @ [303:25] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.typeArguments: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resolvedCall' @ [307:5] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateValueArguments[ValueParameterDescriptorImpl]

'valueArgumentsByIndex' @ [307:18] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.valueArgumentsByIndex: (MutableList<(ResolvedValueArgument..ResolvedValueArgument?)>?..List<(ResolvedValueArgument..ResolvedValueArgument?)>?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'forEachIndexed' @ [307:42] ==> public inline fun <T> Iterable<(ResolvedValueArgument..ResolvedValueArgument?)>.forEachIndexed(action: (index: Int, (ResolvedValueArgument..ResolvedValueArgument?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)

'call' @ [308:30] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateValueArguments[ValueParameterDescriptorImpl]

'descriptor' @ [308:35] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'valueParameters' @ [308:46] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'index' @ [308:62] ==> value-parameter index: Int defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateValueArguments.<anonymous>[ValueParameterDescriptorImpl]

'call' @ [309:9] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateValueArguments[ValueParameterDescriptorImpl]

'irValueArgumentsByIndex' @ [309:14] ==> public final val irValueArgumentsByIndex: Array<IrExpression?> defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'index' @ [309:38] ==> value-parameter index: Int defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateValueArguments.<anonymous>[ValueParameterDescriptorImpl]

'generateValueArgument' @ [309:47] ==> public fun StatementGenerator.generateValueArgument(valueArgument: ResolvedValueArgument, valueParameter: ValueParameterDescriptor): IrExpression? defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'valueArgument' @ [309:69] ==> value-parameter valueArgument: (ResolvedValueArgument..ResolvedValueArgument?) defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateValueArguments.<anonymous>[ValueParameterDescriptorImpl]

'valueParameter' @ [309:84] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateValueArguments.<anonymous>[LocalVariableDescriptor]

'CallBuilder' @ [314:16] ==> public constructor CallBuilder(original: ResolvedCall<*>, descriptor: CallableDescriptor, isExtensionInvokeCall: Boolean = ...) defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[ClassConstructorDescriptorImpl]

'resolvedCall' @ [314:28] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateCallReceivers[ValueParameterDescriptorImpl]

'unwrapCallableDescriptor' @ [314:42] ==> public fun unwrapCallableDescriptor(resultingDescriptor: CallableDescriptor): CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [314:67] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateCallReceivers[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [314:80] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'call' @ [316:5] ==> val call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateCallReceivers[LocalVariableDescriptor]

'callReceiver' @ [316:10] ==> public final lateinit var callReceiver: CallReceiver defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'generateCallReceiver' @ [316:25] ==> public fun StatementGenerator.generateCallReceiver(ktDefaultElement: KtElement, calleeDescriptor: CallableDescriptor, dispatchReceiver: ReceiverValue?, extensionReceiver: ReceiverValue?, isSafe: Boolean, isAssignmentReceiver: Boolean = ...): CallReceiver defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [316:46] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateCallReceivers[ValueParameterDescriptorImpl]

'call' @ [316:59] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'callElement' @ [316:64] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'resolvedCall' @ [317:46] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateCallReceivers[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [317:59] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resolvedCall' @ [318:46] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateCallReceivers[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [318:59] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resolvedCall' @ [319:46] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateCallReceivers[ValueParameterDescriptorImpl]

'extensionReceiver' @ [319:59] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resolvedCall' @ [320:55] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateCallReceivers[ValueParameterDescriptorImpl]

'call' @ [320:68] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'isSafeCall' @ [320:73] ==> public fun Call.isSafeCall(): Boolean defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'call' @ [322:5] ==> val call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateCallReceivers[LocalVariableDescriptor]

'superQualifier' @ [322:10] ==> public final var superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'getSuperQualifier' @ [322:27] ==> public fun Generator.getSuperQualifier(resolvedCall: ResolvedCall<*>): ClassDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [322:45] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateCallReceivers[ValueParameterDescriptorImpl]

'call' @ [324:12] ==> val call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.pregenerateCallReceivers[LocalVariableDescriptor]

'when (resultingDescriptor) {
            is ImportedFromObjectCallableDescriptor<*> ->
                resultingDescriptor.callableFromObject
            is TypeAliasConstructorDescriptor ->
                resultingDescriptor.underlyingConstructorDescriptor
            else ->
                resultingDescriptor
        }' @ [328:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CallableDescriptor, entry1: CallableDescriptor, entry2: CallableDescriptor): CallableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CallableDescriptor

'resultingDescriptor' @ [328:15] ==> value-parameter resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.unwrapCallableDescriptor[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [330:17] ==> value-parameter resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.unwrapCallableDescriptor[ValueParameterDescriptorImpl]

'callableFromObject' @ [330:37] ==> public final val callableFromObject: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.ImportedFromObjectCallableDescriptor[DeserializedPropertyDescriptor]

'resultingDescriptor' @ [332:17] ==> value-parameter resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.unwrapCallableDescriptor[ValueParameterDescriptorImpl]

'underlyingConstructorDescriptor' @ [332:37] ==> public abstract val underlyingConstructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor[DeserializedPropertyDescriptor]

'resultingDescriptor' @ [334:17] ==> value-parameter resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.unwrapCallableDescriptor[ValueParameterDescriptorImpl]

