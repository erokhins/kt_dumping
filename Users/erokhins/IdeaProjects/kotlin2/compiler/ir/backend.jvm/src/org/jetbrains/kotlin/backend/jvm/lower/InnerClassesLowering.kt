'InnerClassTransformer' @ [39:9] ==> public constructor InnerClassTransformer(irClass: IrClass) defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[ClassConstructorDescriptorImpl]

'irClass' @ [39:31] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.lower[ValueParameterDescriptorImpl]

'lowerInnerClass' @ [39:40] ==> public final fun lowerInnerClass(): Unit defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[SimpleFunctionDescriptorImpl]

'irClass' @ [43:31] ==> public final val irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'descriptor' @ [43:39] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'HashMap' @ [47:44] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ValueDescriptor
    <V : (Any..Any?)> -> ValueDescriptor

'!' @ [50:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'irClass' @ [50:18] ==> public final val irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'descriptor' @ [50:26] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'isInner' @ [50:37] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'createOuterThisField' @ [52:13] ==> private final fun createOuterThisField(): Unit defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[SimpleFunctionDescriptorImpl]

'lowerConstructors' @ [53:13] ==> private final fun lowerConstructors(): Unit defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[SimpleFunctionDescriptorImpl]

'lowerConstructorParameterUsages' @ [54:13] ==> private final fun lowerConstructorParameterUsages(): Unit defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[SimpleFunctionDescriptorImpl]

'lowerOuterThisReferences' @ [55:13] ==> private final fun lowerOuterThisReferences(): Unit defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[SimpleFunctionDescriptorImpl]

'outerThisFieldDescriptor' @ [59:13] ==> public final lateinit var outerThisFieldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'context' @ [59:40] ==> public final val context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering[PropertyDescriptorImpl]

'specialDescriptorsFactory' @ [59:48] ==> public final val specialDescriptorsFactory: SpecialDescriptorsFactory defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[PropertyDescriptorImpl]

'getOuterThisFieldDescriptor' @ [59:74] ==> public final fun getOuterThisFieldDescriptor(innerClassDescriptor: ClassDescriptor): PropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory[SimpleFunctionDescriptorImpl]

'irClass' @ [59:102] ==> public final val irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'descriptor' @ [59:110] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'irClass' @ [61:13] ==> public final val irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'declarations' @ [61:21] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'add' @ [61:34] ==> public abstract fun add(element: IrDeclaration): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'IrFieldImpl' @ [61:38] ==> public constructor IrFieldImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: PropertyDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFieldImpl[DeserializedClassConstructorDescriptor]

'irClass' @ [62:21] ==> public final val irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'startOffset' @ [62:29] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'irClass' @ [62:42] ==> public final val irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'endOffset' @ [62:50] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'FIELD_FOR_OUTER_THIS' @ [63:49] ==> public object FIELD_FOR_OUTER_THIS : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.backend.jvm.JvmLoweredDeclarationOrigin[FakeCallableDescriptorForObject]

'outerThisFieldDescriptor' @ [64:21] ==> public final lateinit var outerThisFieldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'irClass' @ [69:13] ==> public final val irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'declarations' @ [69:21] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'transformFlat' @ [69:34] ==> public inline fun <T> MutableList<IrDeclaration>.transformFlat(transformation: (IrDeclaration) -> List<IrDeclaration>?): Unit defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'if (irMember is IrConstructor)
                    listOf(lowerConstructor(irMember))
                else
                    null' @ [70:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<IrDeclaration>?, elseBranch: List<IrDeclaration>?): List<IrDeclaration>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<IrDeclaration>?

'irMember' @ [70:21] ==> value-parameter irMember: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructors.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [71:21] ==> public fun <T> listOf(element: IrConstructor): List<IrConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrConstructor

'lowerConstructor' @ [71:28] ==> private final fun lowerConstructor(irConstructor: IrConstructor): IrConstructor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[SimpleFunctionDescriptorImpl]

'irMember' @ [71:45] ==> value-parameter irMember: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructors.<anonymous>[ValueParameterDescriptorImpl]

'irConstructor' @ [78:33] ==> value-parameter irConstructor: IrConstructor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[ValueParameterDescriptorImpl]

'descriptor' @ [78:47] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'irConstructor' @ [79:31] ==> value-parameter irConstructor: IrConstructor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[ValueParameterDescriptorImpl]

'startOffset' @ [79:45] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'irConstructor' @ [80:29] ==> value-parameter irConstructor: IrConstructor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[ValueParameterDescriptorImpl]

'endOffset' @ [80:43] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'context' @ [82:33] ==> public final val context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering[PropertyDescriptorImpl]

'specialDescriptorsFactory' @ [82:41] ==> public final val specialDescriptorsFactory: SpecialDescriptorsFactory defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[PropertyDescriptorImpl]

'getInnerClassConstructorWithOuterThisParameter' @ [82:67] ==> public final fun getInnerClassConstructorWithOuterThisParameter(innerClassConstructor: ClassConstructorDescriptor): ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [82:114] ==> val oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'newDescriptor' @ [83:43] ==> val newDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'valueParameters' @ [83:57] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'oldDescriptor' @ [85:13] ==> val oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'valueParameters' @ [85:27] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'forEach' @ [85:43] ==> @HidesMembers public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.forEach(action: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'oldConstructorParameterToNew' @ [86:17] ==> public final val oldConstructorParameterToNew: HashMap<ValueDescriptor, ValueDescriptor> defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'oldValueParameter' @ [86:46] ==> value-parameter oldValueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor.<anonymous>[ValueParameterDescriptorImpl]

'newDescriptor' @ [86:67] ==> val newDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'valueParameters' @ [86:81] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'oldValueParameter' @ [86:97] ==> value-parameter oldValueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [86:115] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'irConstructor' @ [89:29] ==> value-parameter irConstructor: IrConstructor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[ValueParameterDescriptorImpl]

'body' @ [89:43] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'AssertionError' @ [89:73] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'irConstructor' @ [89:120] ==> value-parameter irConstructor: IrConstructor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[ValueParameterDescriptorImpl]

'body' @ [89:134] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'blockBody' @ [91:44] ==> val blockBody: IrBlockBody defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'statements' @ [91:54] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlockBody[DeserializedPropertyDescriptor]

'indexOfFirst' @ [91:65] ==> public inline fun <T> List<IrStatement>.indexOfFirst(predicate: (IrStatement) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement

'it' @ [91:80] ==> value-parameter it: IrStatement defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor.<anonymous>[ValueParameterDescriptorImpl]

'if (instanceInitializerIndex >= 0) {
                // Initializing constructor: initialize 'this.this$0' with '$outer'
                blockBody.statements.add(
                        instanceInitializerIndex,
                        IrSetFieldImpl(
                                startOffset, endOffset, outerThisFieldDescriptor,
                                IrGetValueImpl(startOffset, endOffset, classDescriptor.thisAsReceiverParameter),
                                IrGetValueImpl(startOffset, endOffset, outerThisValueParameter)
                        )
                )
            }
            else {
                // Delegating constructor: invoke old constructor with dispatch receiver '$outer'
                val delegatingConstructorCall = (blockBody.statements.find { it is IrDelegatingConstructorCall } ?:
                                                 throw AssertionError("Delegating constructor call expected: ${irConstructor.dump()}")
                                                ) as IrDelegatingConstructorCall
                delegatingConstructorCall.dispatchReceiver = IrGetValueImpl(
                        delegatingConstructorCall.startOffset, delegatingConstructorCall.endOffset, outerThisValueParameter
                )
            }' @ [92:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'instanceInitializerIndex' @ [92:17] ==> val instanceInitializerIndex: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'blockBody' @ [94:17] ==> val blockBody: IrBlockBody defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'statements' @ [94:27] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlockBody[DeserializedPropertyDescriptor]

'add' @ [94:38] ==> public abstract fun add(index: Int, element: IrStatement): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'instanceInitializerIndex' @ [95:25] ==> val instanceInitializerIndex: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'IrSetFieldImpl' @ [96:25] ==> @Deprecated public constructor IrSetFieldImpl(startOffset: Int, endOffset: Int, propertyDescriptor: PropertyDescriptor, receiver: IrExpression?, value: IrExpression, origin: IrStatementOrigin? = ..., superQualifier: ClassDescriptor? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrSetFieldImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [97:33] ==> val startOffset: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'endOffset' @ [97:46] ==> val endOffset: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'outerThisFieldDescriptor' @ [97:57] ==> public final lateinit var outerThisFieldDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'IrGetValueImpl' @ [98:33] ==> @Deprecated public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, descriptor: ValueDescriptor, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [98:48] ==> val startOffset: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'endOffset' @ [98:61] ==> val endOffset: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'classDescriptor' @ [98:72] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'thisAsReceiverParameter' @ [98:88] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'IrGetValueImpl' @ [99:33] ==> @Deprecated public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, descriptor: ValueDescriptor, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [99:48] ==> val startOffset: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'endOffset' @ [99:61] ==> val endOffset: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'outerThisValueParameter' @ [99:72] ==> val outerThisValueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'blockBody' @ [105:50] ==> val blockBody: IrBlockBody defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'statements' @ [105:60] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlockBody[DeserializedPropertyDescriptor]

'find' @ [105:71] ==> @InlineOnly public inline fun <T> Iterable<IrStatement>.find(predicate: (IrStatement) -> Boolean): IrStatement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement

'it' @ [105:78] ==> value-parameter it: IrStatement defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [106:56] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'irConstructor' @ [106:112] ==> value-parameter irConstructor: IrConstructor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[ValueParameterDescriptorImpl]

'dump' @ [106:126] ==> public fun IrElement.dump(): String defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]

'delegatingConstructorCall' @ [108:17] ==> val delegatingConstructorCall: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'dispatchReceiver' @ [108:43] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedPropertyDescriptor]

'IrGetValueImpl' @ [108:62] ==> @Deprecated public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, descriptor: ValueDescriptor, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'delegatingConstructorCall' @ [109:25] ==> val delegatingConstructorCall: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'startOffset' @ [109:51] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedPropertyDescriptor]

'delegatingConstructorCall' @ [109:64] ==> val delegatingConstructorCall: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'endOffset' @ [109:90] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedPropertyDescriptor]

'outerThisValueParameter' @ [109:101] ==> val outerThisValueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'IrConstructorImpl' @ [113:20] ==> public constructor IrConstructorImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ClassConstructorDescriptor, body: IrBody) defined in org.jetbrains.kotlin.ir.declarations.impl.IrConstructorImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [114:21] ==> val startOffset: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'endOffset' @ [114:34] ==> val endOffset: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'irConstructor' @ [115:21] ==> value-parameter irConstructor: IrConstructor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[ValueParameterDescriptorImpl]

'origin' @ [115:35] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'newDescriptor' @ [116:21] ==> val newDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'blockBody' @ [117:21] ==> val blockBody: IrBlockBody defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerConstructor[LocalVariableDescriptor]

'irClass' @ [122:13] ==> public final val irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'transformChildrenVoid' @ [122:21] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'VariableRemapper' @ [122:43] ==> public constructor VariableRemapper(mapping: Map<ValueDescriptor, ValueDescriptor>) defined in org.jetbrains.kotlin.backend.jvm.lower.VariableRemapper[ClassConstructorDescriptorImpl]

'oldConstructorParameterToNew' @ [122:60] ==> public final val oldConstructorParameterToNew: HashMap<ValueDescriptor, ValueDescriptor> defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'irClass' @ [126:13] ==> public final val irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'transformChildrenVoid' @ [126:21] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'IrElementTransformerVoid' @ [126:52] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'expression' @ [128:21] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [128:32] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [128:54] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>[LazyClassReceiverParameterDescriptor]

'expression' @ [130:45] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'descriptor' @ [130:56] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'getClassDescriptorForImplicitThis' @ [130:67] ==> private final fun ValueDescriptor.getClassDescriptorForImplicitThis(): ClassDescriptor? defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[SimpleFunctionDescriptorImpl]

'expression' @ [131:52] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'implicitThisClass' @ [133:25] ==> val implicitThisClass: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'classDescriptor' @ [133:46] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'expression' @ [133:70] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'expression' @ [135:39] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'startOffset' @ [135:50] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'expression' @ [136:37] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'endOffset' @ [136:48] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'expression' @ [137:34] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'origin' @ [137:45] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'IrGetValueImpl' @ [139:48] ==> @Deprecated public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, descriptor: ValueDescriptor, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [139:63] ==> val startOffset: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'endOffset' @ [139:76] ==> val endOffset: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'classDescriptor' @ [139:87] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'thisAsReceiverParameter' @ [139:103] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'origin' @ [139:128] ==> val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'classDescriptor' @ [140:38] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'innerClass' @ [142:28] ==> var innerClass: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'implicitThisClass' @ [142:42] ==> val implicitThisClass: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'!' @ [143:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'innerClass' @ [143:30] ==> var innerClass: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'isInner' @ [143:41] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'expression' @ [146:36] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'context' @ [149:46] ==> public final val context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering[PropertyDescriptorImpl]

'specialDescriptorsFactory' @ [149:54] ==> public final val specialDescriptorsFactory: SpecialDescriptorsFactory defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[PropertyDescriptorImpl]

'getOuterThisFieldDescriptor' @ [149:80] ==> public final fun getOuterThisFieldDescriptor(innerClassDescriptor: ClassDescriptor): PropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory[SimpleFunctionDescriptorImpl]

'innerClass' @ [149:108] ==> var innerClass: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'irThis' @ [150:25] ==> var irThis: IrExpression defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'IrGetFieldImpl' @ [150:34] ==> @Deprecated public constructor IrGetFieldImpl(startOffset: Int, endOffset: Int, propertyDescriptor: PropertyDescriptor, receiver: IrExpression?, origin: IrStatementOrigin? = ..., superQualifier: ClassDescriptor? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetFieldImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [150:49] ==> val startOffset: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'endOffset' @ [150:62] ==> val endOffset: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'outerThisField' @ [150:73] ==> val outerThisField: PropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'irThis' @ [150:89] ==> var irThis: IrExpression defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'origin' @ [150:97] ==> val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'classDescriptor' @ [152:37] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer[PropertyDescriptorImpl]

'containingDeclaration' @ [152:53] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'innerClass' @ [153:25] ==> var innerClass: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'outer' @ [153:38] ==> val outer: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'AssertionError' @ [154:44] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'innerClass' @ [154:111] ==> var innerClass: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'outer' @ [154:124] ==> val outer: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'irThis' @ [157:28] ==> var irThis: IrExpression defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.lowerOuterThisReferences.<no name provided>.visitGetValue[LocalVariableDescriptor]

'this' @ [163:17] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.getClassDescriptorForImplicitThis[ReceiverParameterDescriptorImpl]

'value' @ [164:37] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'receiverValue' @ [165:21] ==> val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.getClassDescriptorForImplicitThis[LocalVariableDescriptor]

'receiverValue' @ [166:28] ==> val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassesLowering.InnerClassTransformer.getClassDescriptorForImplicitThis[LocalVariableDescriptor]

'classDescriptor' @ [166:42] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitClassReceiver[DeserializedPropertyDescriptor]

'irBody' @ [176:9] ==> value-parameter irBody: IrBody defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [176:16] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'IrElementTransformerVoid' @ [176:47] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'expression' @ [178:17] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [178:28] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [178:50] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>[LazyClassReceiverParameterDescriptor]

'expression' @ [180:40] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [180:51] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [180:78] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'expression' @ [181:30] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'descriptor' @ [181:41] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [181:93] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'!' @ [182:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callee' @ [182:22] ==> val callee: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'constructedClass' @ [182:29] ==> public final val ClassConstructorDescriptor.constructedClass: ClassDescriptor[MyPropertyDescriptor]

'isInner' @ [182:46] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'expression' @ [182:62] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'context' @ [184:33] ==> public final val context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering[PropertyDescriptorImpl]

'specialDescriptorsFactory' @ [184:41] ==> public final val specialDescriptorsFactory: SpecialDescriptorsFactory defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[PropertyDescriptorImpl]

'getInnerClassConstructorWithOuterThisParameter' @ [184:67] ==> public final fun getInnerClassConstructorWithOuterThisParameter(innerClassConstructor: ClassConstructorDescriptor): ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory[SimpleFunctionDescriptorImpl]

'callee' @ [184:114] ==> val callee: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'IrCallImpl' @ [185:31] ==> @Deprecated public constructor IrCallImpl(startOffset: Int, endOffset: Int, calleeDescriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ..., origin: IrStatementOrigin? = ..., superQualifierDescriptor: ClassDescriptor? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedClassConstructorDescriptor]

'expression' @ [186:25] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'startOffset' @ [186:36] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [186:49] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'endOffset' @ [186:60] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'newCallee' @ [186:71] ==> val newCallee: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'expression' @ [188:25] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'origin' @ [188:36] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'newCall' @ [191:17] ==> val newCall: IrCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'putValueArgument' @ [191:25] ==> public open fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedSimpleFunctionDescriptor]

'dispatchReceiver' @ [191:45] ==> val dispatchReceiver: IrExpression defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'..' @ [192:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'newCallee' @ [192:32] ==> val newCallee: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'valueParameters' @ [192:42] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'lastIndex' @ [192:58] ==> public val <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'newCall' @ [193:21] ==> val newCall: IrCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'putValueArgument' @ [193:29] ==> public open fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedSimpleFunctionDescriptor]

'i' @ [193:46] ==> val i: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'expression' @ [193:49] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'getValueArgument' @ [193:60] ==> public abstract fun getValueArgument(index: Int): IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'i' @ [193:77] ==> val i: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'newCall' @ [196:24] ==> val newCall: IrCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'expression' @ [200:17] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [200:28] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [200:50] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>[LazyClassReceiverParameterDescriptor]

'expression' @ [202:40] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [202:51] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedPropertyDescriptor]

'expression' @ [202:78] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'expression' @ [203:30] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'descriptor' @ [203:41] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedPropertyDescriptor]

'!' @ [204:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callee' @ [204:22] ==> val callee: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[LocalVariableDescriptor]

'constructedClass' @ [204:29] ==> public final val ClassConstructorDescriptor.constructedClass: ClassDescriptor[MyPropertyDescriptor]

'isInner' @ [204:46] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'expression' @ [204:62] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'context' @ [206:33] ==> public final val context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering[PropertyDescriptorImpl]

'specialDescriptorsFactory' @ [206:41] ==> public final val specialDescriptorsFactory: SpecialDescriptorsFactory defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[PropertyDescriptorImpl]

'getInnerClassConstructorWithOuterThisParameter' @ [206:67] ==> public final fun getInnerClassConstructorWithOuterThisParameter(innerClassConstructor: ClassConstructorDescriptor): ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory[SimpleFunctionDescriptorImpl]

'callee' @ [206:114] ==> val callee: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[LocalVariableDescriptor]

'IrDelegatingConstructorCallImpl' @ [207:31] ==> @Deprecated public constructor IrDelegatingConstructorCallImpl(startOffset: Int, endOffset: Int, constructorDescriptor: ClassConstructorDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedClassConstructorDescriptor]

'expression' @ [208:25] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'startOffset' @ [208:36] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedPropertyDescriptor]

'expression' @ [208:49] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'endOffset' @ [208:60] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedPropertyDescriptor]

'newCallee' @ [208:71] ==> val newCallee: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[LocalVariableDescriptor]

'newCall' @ [212:17] ==> val newCall: IrDelegatingConstructorCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[LocalVariableDescriptor]

'putValueArgument' @ [212:25] ==> public open fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedSimpleFunctionDescriptor]

'dispatchReceiver' @ [212:45] ==> val dispatchReceiver: IrExpression defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[LocalVariableDescriptor]

'..' @ [213:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'newCallee' @ [213:32] ==> val newCallee: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[LocalVariableDescriptor]

'valueParameters' @ [213:42] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'lastIndex' @ [213:58] ==> public val <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'newCall' @ [214:21] ==> val newCall: IrDelegatingConstructorCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[LocalVariableDescriptor]

'putValueArgument' @ [214:29] ==> public open fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedSimpleFunctionDescriptor]

'i' @ [214:46] ==> val i: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[LocalVariableDescriptor]

'expression' @ [214:49] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'getValueArgument' @ [214:60] ==> public abstract fun getValueArgument(index: Int): IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedSimpleFunctionDescriptor]

'i' @ [214:77] ==> val i: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[LocalVariableDescriptor]

'newCall' @ [217:24] ==> val newCall: IrDelegatingConstructorCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InnerClassConstructorCallsLowering.lower.<no name provided>.visitDelegatingConstructorCall[LocalVariableDescriptor]

