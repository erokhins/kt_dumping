'IrElementTransformerVoid' @ [32:28] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'irFile' @ [34:9] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering.lower[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [34:16] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [34:38] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering[LazyClassReceiverParameterDescriptor]

'declaration' @ [38:9] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering.visitFile[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [38:21] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [38:43] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering[LazyClassReceiverParameterDescriptor]

'declaration' @ [39:9] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering.visitFile[ValueParameterDescriptorImpl]

'declarations' @ [39:21] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrFile[DeserializedPropertyDescriptor]

'transformFlat' @ [39:34] ==> public inline fun <T> MutableList<IrDeclaration>.transformFlat(transformation: (IrDeclaration) -> List<IrDeclaration>?): Unit defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'lowerProperty' @ [39:50] ==> private final fun lowerProperty(declaration: IrDeclaration): List<IrDeclaration>? defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering[SimpleFunctionDescriptorImpl]

'it' @ [39:64] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering.visitFile.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [40:16] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering.visitFile[ValueParameterDescriptorImpl]

'declaration' @ [44:9] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering.visitClass[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [44:21] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [44:43] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering[LazyClassReceiverParameterDescriptor]

'declaration' @ [45:9] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering.visitClass[ValueParameterDescriptorImpl]

'declarations' @ [45:21] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'transformFlat' @ [45:34] ==> public inline fun <T> MutableList<IrDeclaration>.transformFlat(transformation: (IrDeclaration) -> List<IrDeclaration>?): Unit defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'lowerProperty' @ [45:50] ==> private final fun lowerProperty(declaration: IrDeclaration): List<IrDeclaration>? defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering[SimpleFunctionDescriptorImpl]

'it' @ [45:64] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering.visitClass.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [46:16] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering.visitClass[ValueParameterDescriptorImpl]

'if (declaration is IrProperty)
                ArrayList<IrDeclaration>(3).apply {
                    if (!DescriptorUtils.isAnnotationClass(declaration.descriptor.containingDeclaration)) {
                        addIfNotNull(declaration.backingField)
                    }
                    addIfNotNull(declaration.getter)
                    addIfNotNull(declaration.setter)
                }
            else
                null' @ [50:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<IrDeclaration>?, elseBranch: List<IrDeclaration>?): List<IrDeclaration>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<IrDeclaration>?

'declaration' @ [50:17] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering.lowerProperty[ValueParameterDescriptorImpl]

'ArrayList' @ [51:17] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrDeclaration

'apply' @ [51:45] ==> @InlineOnly public inline fun <T> ArrayList<IrDeclaration>.apply(block: ArrayList<IrDeclaration>.() -> Unit): ArrayList<IrDeclaration> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<IrDeclaration>

'!' @ [52:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAnnotationClass' @ [52:42] ==> public open fun isAnnotationClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'declaration' @ [52:60] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering.lowerProperty[ValueParameterDescriptorImpl]

'descriptor' @ [52:72] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrProperty[DeserializedPropertyDescriptor]

'containingDeclaration' @ [52:83] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'addIfNotNull' @ [53:25] ==> public fun <T : Any> MutableCollection<IrDeclaration>.addIfNotNull(t: IrDeclaration?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> IrDeclaration

'declaration' @ [53:38] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering.lowerProperty[ValueParameterDescriptorImpl]

'backingField' @ [53:50] ==> public abstract var backingField: IrField? defined in org.jetbrains.kotlin.ir.declarations.IrProperty[DeserializedPropertyDescriptor]

'addIfNotNull' @ [55:21] ==> public fun <T : Any> MutableCollection<IrDeclaration>.addIfNotNull(t: IrDeclaration?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> IrDeclaration

'declaration' @ [55:34] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering.lowerProperty[ValueParameterDescriptorImpl]

'getter' @ [55:46] ==> public abstract var getter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.IrProperty[DeserializedPropertyDescriptor]

'addIfNotNull' @ [56:21] ==> public fun <T : Any> MutableCollection<IrDeclaration>.addIfNotNull(t: IrDeclaration?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> IrDeclaration

'declaration' @ [56:34] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.lower.PropertiesLowering.lowerProperty[ValueParameterDescriptorImpl]

'setter' @ [56:46] ==> public abstract var setter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.IrProperty[DeserializedPropertyDescriptor]

