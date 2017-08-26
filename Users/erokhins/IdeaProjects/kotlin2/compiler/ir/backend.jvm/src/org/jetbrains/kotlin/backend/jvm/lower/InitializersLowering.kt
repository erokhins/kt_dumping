'ClassInitializersBuilder' @ [53:40] ==> public constructor ClassInitializersBuilder(irClass: IrClass) defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder[ClassConstructorDescriptorImpl]

'irClass' @ [53:65] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.lower[ValueParameterDescriptorImpl]

'irClass' @ [54:9] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.lower[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [54:17] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'classInitializersBuilder' @ [54:36] ==> val classInitializersBuilder: InitializersLowering.ClassInitializersBuilder defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.lower[LocalVariableDescriptor]

'classInitializersBuilder' @ [56:9] ==> val classInitializersBuilder: InitializersLowering.ClassInitializersBuilder defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.lower[LocalVariableDescriptor]

'transformInstanceInitializerCallsInConstructors' @ [56:34] ==> public final fun transformInstanceInitializerCallsInConstructors(irClass: IrClass): Unit defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder[SimpleFunctionDescriptorImpl]

'irClass' @ [56:82] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.lower[ValueParameterDescriptorImpl]

'classInitializersBuilder' @ [58:9] ==> val classInitializersBuilder: InitializersLowering.ClassInitializersBuilder defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.lower[LocalVariableDescriptor]

'createStaticInitializationMethod' @ [58:34] ==> public final fun createStaticInitializationMethod(irClass: IrClass): Unit defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder[SimpleFunctionDescriptorImpl]

'irClass' @ [58:67] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.lower[ValueParameterDescriptorImpl]

'ArrayList' @ [62:43] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrStatement

'ArrayList' @ [64:45] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrStatement

'declaration' @ [71:38] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.visitField[ValueParameterDescriptorImpl]

'initializer' @ [71:50] ==> public abstract var initializer: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'expression' @ [71:63] ==> public abstract var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpressionBody[DeserializedPropertyDescriptor]

'if (declaration.descriptor.dispatchReceiverParameter != null) // TODO isStaticField
                        IrGetValueImpl(irFieldInitializer.startOffset, irFieldInitializer.endOffset,
                                       irClass.descriptor.thisAsReceiverParameter)
                    else null' @ [74:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrGetValueImpl?, elseBranch: IrGetValueImpl?): IrGetValueImpl?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrGetValueImpl?

'declaration' @ [74:25] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.visitField[ValueParameterDescriptorImpl]

'descriptor' @ [74:37] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'dispatchReceiverParameter' @ [74:48] ==> public final val PropertyDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'IrGetValueImpl' @ [75:25] ==> @Deprecated public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, descriptor: ValueDescriptor, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'irFieldInitializer' @ [75:40] ==> val irFieldInitializer: IrExpression defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.visitField[LocalVariableDescriptor]

'startOffset' @ [75:59] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'irFieldInitializer' @ [75:72] ==> val irFieldInitializer: IrExpression defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.visitField[LocalVariableDescriptor]

'endOffset' @ [75:91] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'irClass' @ [76:40] ==> public final val irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder[PropertyDescriptorImpl]

'descriptor' @ [76:48] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'thisAsReceiverParameter' @ [76:59] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'IrSetFieldImpl' @ [78:30] ==> @Deprecated public constructor IrSetFieldImpl(startOffset: Int, endOffset: Int, propertyDescriptor: PropertyDescriptor, receiver: IrExpression?, value: IrExpression, origin: IrStatementOrigin? = ..., superQualifier: ClassDescriptor? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrSetFieldImpl[DeserializedClassConstructorDescriptor]

'irFieldInitializer' @ [79:21] ==> val irFieldInitializer: IrExpression defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.visitField[LocalVariableDescriptor]

'startOffset' @ [79:40] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'irFieldInitializer' @ [79:53] ==> val irFieldInitializer: IrExpression defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.visitField[LocalVariableDescriptor]

'endOffset' @ [79:72] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'declaration' @ [80:21] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.visitField[ValueParameterDescriptorImpl]

'descriptor' @ [80:33] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'receiver' @ [81:21] ==> val receiver: IrGetValueImpl? defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.visitField[LocalVariableDescriptor]

'irFieldInitializer' @ [82:21] ==> val irFieldInitializer: IrExpression defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.visitField[LocalVariableDescriptor]

'if (DescriptorUtils.isStaticDeclaration(declaration.descriptor)) {
                staticInitializerStatements.add(irSetField)
            }
            else {
                instanceInitializerStatements.add(irSetField)
            }' @ [86:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'isStaticDeclaration' @ [86:33] ==> public open fun isStaticDeclaration(@NotNull p0: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'declaration' @ [86:53] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.visitField[ValueParameterDescriptorImpl]

'descriptor' @ [86:65] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'staticInitializerStatements' @ [87:17] ==> public final val staticInitializerStatements: ArrayList<IrStatement> defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder[PropertyDescriptorImpl]

'add' @ [87:45] ==> public open fun add(element: IrStatement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'irSetField' @ [87:49] ==> val irSetField: IrSetFieldImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.visitField[LocalVariableDescriptor]

'instanceInitializerStatements' @ [90:17] ==> public final val instanceInitializerStatements: ArrayList<IrStatement> defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder[PropertyDescriptorImpl]

'add' @ [90:47] ==> public open fun add(element: IrStatement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'irSetField' @ [90:51] ==> val irSetField: IrSetFieldImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.visitField[LocalVariableDescriptor]

'instanceInitializerStatements' @ [95:13] ==> public final val instanceInitializerStatements: ArrayList<IrStatement> defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder[PropertyDescriptorImpl]

'addAll' @ [95:43] ==> public open fun addAll(elements: Collection<IrStatement>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'declaration' @ [95:50] ==> value-parameter declaration: IrAnonymousInitializer defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.visitAnonymousInitializer[ValueParameterDescriptorImpl]

'body' @ [95:62] ==> public abstract var body: IrBlockBody defined in org.jetbrains.kotlin.ir.declarations.IrAnonymousInitializer[DeserializedPropertyDescriptor]

'statements' @ [95:67] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlockBody[DeserializedPropertyDescriptor]

'irClass' @ [99:13] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.transformInstanceInitializerCallsInConstructors[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [99:21] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'IrElementTransformerVoid' @ [99:52] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'IrBlockImpl' @ [101:28] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin?, statements: List<IrStatement>) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedClassConstructorDescriptor]

'irClass' @ [101:40] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.transformInstanceInitializerCallsInConstructors[ValueParameterDescriptorImpl]

'startOffset' @ [101:48] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'irClass' @ [101:61] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.transformInstanceInitializerCallsInConstructors[ValueParameterDescriptorImpl]

'endOffset' @ [101:69] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'context' @ [101:80] ==> public final val context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering[PropertyDescriptorImpl]

'builtIns' @ [101:88] ==> public open val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[PropertyDescriptorImpl]

'unitType' @ [101:97] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'instanceInitializerStatements' @ [102:40] ==> public final val instanceInitializerStatements: ArrayList<IrStatement> defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder[PropertyDescriptorImpl]

'map' @ [102:70] ==> public inline fun <T, R> Iterable<IrStatement>.map(transform: (IrStatement) -> IrStatement): List<IrStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement
    <R> -> IrStatement

'it' @ [102:76] ==> value-parameter it: IrStatement defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.transformInstanceInitializerCallsInConstructors.<no name provided>.visitInstanceInitializerCall.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [102:79] ==> public final fun IrStatement.copy(): IrStatement defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.Companion[SimpleFunctionDescriptorImpl]

'create' @ [108:76] ==> @NotNull public open fun create(@NotNull p0: DeclarationDescriptor, @NotNull p1: Annotations, @NotNull p2: Name, @NotNull p3: CallableMemberDescriptor.Kind, @NotNull p4: SourceElement): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl[JavaMethodDescriptor]

'irClass' @ [109:21] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.createStaticInitializationMethod[ValueParameterDescriptorImpl]

'descriptor' @ [109:29] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'Annotations' @ [109:41] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [109:53] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'clinitName' @ [109:60] ==> public final val clinitName: Name defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.Companion[PropertyDescriptorImpl]

'SYNTHESIZED' @ [110:51] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'NO_SOURCE' @ [111:35] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'staticInitializerDescriptor' @ [113:13] ==> val staticInitializerDescriptor: SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.createStaticInitializationMethod[LocalVariableDescriptor]

'initialize' @ [113:41] ==> @NotNull public open fun initialize(@Nullable p0: KotlinType?, @Nullable p1: ReceiverParameterDescriptor?, @NotNull p2: (MutableList<out (TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>), @NotNull p3: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @Nullable p4: KotlinType?, @Nullable p5: Modality?, @NotNull p6: Visibility): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl[JavaMethodDescriptor]

'emptyList' @ [114:33] ==> public fun <T> emptyList(): List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'emptyList' @ [114:46] ==> public fun <T> emptyList(): List<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'irClass' @ [115:21] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.createStaticInitializationMethod[ValueParameterDescriptorImpl]

'descriptor' @ [115:29] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'builtIns' @ [115:40] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'unitType' @ [115:49] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'Modality' @ [116:21] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [116:30] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'PUBLIC' @ [116:50] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'irClass' @ [118:13] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.createStaticInitializationMethod[ValueParameterDescriptorImpl]

'declarations' @ [118:21] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'add' @ [118:34] ==> public abstract fun add(element: IrDeclaration): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'IrFunctionImpl' @ [119:21] ==> public constructor IrFunctionImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor, body: IrBody?) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedClassConstructorDescriptor]

'irClass' @ [119:36] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.createStaticInitializationMethod[ValueParameterDescriptorImpl]

'startOffset' @ [119:44] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'irClass' @ [119:57] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.createStaticInitializationMethod[ValueParameterDescriptorImpl]

'endOffset' @ [119:65] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'CLASS_STATIC_INITIALIZER' @ [119:104] ==> public object CLASS_STATIC_INITIALIZER : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.backend.jvm.JvmLoweredDeclarationOrigin[FakeCallableDescriptorForObject]

'staticInitializerDescriptor' @ [120:36] ==> val staticInitializerDescriptor: SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.createStaticInitializationMethod[LocalVariableDescriptor]

'IrBlockBodyImpl' @ [121:36] ==> public constructor IrBlockBodyImpl(startOffset: Int, endOffset: Int, statements: List<IrStatement>) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedClassConstructorDescriptor]

'irClass' @ [121:52] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.createStaticInitializationMethod[ValueParameterDescriptorImpl]

'startOffset' @ [121:60] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'irClass' @ [121:73] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.createStaticInitializationMethod[ValueParameterDescriptorImpl]

'endOffset' @ [121:81] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'staticInitializerStatements' @ [122:52] ==> public final val staticInitializerStatements: ArrayList<IrStatement> defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder[PropertyDescriptorImpl]

'map' @ [122:80] ==> public inline fun <T, R> Iterable<IrStatement>.map(transform: (IrStatement) -> IrStatement): List<IrStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement
    <R> -> IrStatement

'it' @ [122:86] ==> value-parameter it: IrStatement defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.ClassInitializersBuilder.createStaticInitializationMethod.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [122:89] ==> public final fun IrStatement.copy(): IrStatement defined in org.jetbrains.kotlin.backend.jvm.lower.InitializersLowering.Companion[SimpleFunctionDescriptorImpl]

'special' @ [128:31] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'deepCopyWithSymbols' @ [130:34] ==> public inline fun <reified T : IrElement> IrStatement.deepCopyWithSymbols(): IrStatement defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : IrElement> -> IrStatement

'deepCopyWithSymbols' @ [131:35] ==> public inline fun <reified T : IrElement> IrExpression.deepCopyWithSymbols(): IrExpression defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : IrElement> -> IrExpression

