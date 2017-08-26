'IrTerminalDeclarationReferenceBase<IrClassifierSymbol, ClassifierDescriptor>' @ [35:9] ==> public constructor IrTerminalDeclarationReferenceBase<out S : IrSymbol, out D : DeclarationDescriptor>(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrClassifierSymbol, descriptor: ClassifierDescriptor) defined in org.jetbrains.kotlin.ir.expressions.impl.IrTerminalDeclarationReferenceBase[ClassConstructorDescriptorImpl]
Inferred types:
    <out S : IrSymbol> -> IrClassifierSymbol
    <out D : DeclarationDescriptor> -> ClassifierDescriptor

'startOffset' @ [36:17] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrClassReferenceImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [36:30] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrClassReferenceImpl.<init>[ValueParameterDescriptorImpl]

'type' @ [36:41] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrClassReferenceImpl.<init>[ValueParameterDescriptorImpl]

'symbol' @ [37:17] ==> value-parameter symbol: IrClassifierSymbol defined in org.jetbrains.kotlin.ir.expressions.impl.IrClassReferenceImpl.<init>[ValueParameterDescriptorImpl]

'symbol' @ [37:25] ==> value-parameter symbol: IrClassifierSymbol defined in org.jetbrains.kotlin.ir.expressions.impl.IrClassReferenceImpl.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [37:32] ==> public abstract val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrClassifierSymbol[PropertyDescriptorImpl]

'Deprecated' @ [40:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'this' @ [46:9] ==> public constructor IrClassReferenceImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrClassifierSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrClassReferenceImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [46:14] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrClassReferenceImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [46:27] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrClassReferenceImpl.<init>[ValueParameterDescriptorImpl]

'type' @ [46:38] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrClassReferenceImpl.<init>[ValueParameterDescriptorImpl]

'createClassifierSymbolForClassReference' @ [46:44] ==> internal fun createClassifierSymbolForClassReference(descriptor: ClassifierDescriptor): IrClassifierSymbol defined in org.jetbrains.kotlin.ir.expressions.impl in file IrClassReferenceImpl.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [46:84] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.ir.expressions.impl.IrClassReferenceImpl.<init>[ValueParameterDescriptorImpl]

'symbol' @ [48:59] ==> public open val symbol: IrClassifierSymbol defined in org.jetbrains.kotlin.ir.expressions.impl.IrClassReferenceImpl[PropertyDescriptorImpl]

'descriptor' @ [48:66] ==> public abstract val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrClassifierSymbol[PropertyDescriptorImpl]

'visitor' @ [51:13] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrClassReferenceImpl.accept[ValueParameterDescriptorImpl]

'visitClassReference' @ [51:21] ==> public open fun visitClassReference(expression: IrClassReference, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [51:41] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrClassReferenceImpl[LazyClassReceiverParameterDescriptor]

'data' @ [51:47] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrClassReferenceImpl.accept[ValueParameterDescriptorImpl]

'when (descriptor) {
            is ClassDescriptor -> IrClassSymbolImpl(descriptor)
            is TypeParameterDescriptor -> IrTypeParameterSymbolImpl(descriptor)
            else -> throw IllegalArgumentException("Unexpected referenced classifier: $descriptor")
        }' @ [55:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrClassifierSymbol, entry1: IrClassifierSymbol, entry2: IrClassifierSymbol): IrClassifierSymbol[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrClassifierSymbol

'descriptor' @ [55:15] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.ir.expressions.impl.createClassifierSymbolForClassReference[ValueParameterDescriptorImpl]

'IrClassSymbolImpl' @ [56:35] ==> public constructor IrClassSymbolImpl(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrClassSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [56:53] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.ir.expressions.impl.createClassifierSymbolForClassReference[ValueParameterDescriptorImpl]

'IrTypeParameterSymbolImpl' @ [57:43] ==> public constructor IrTypeParameterSymbolImpl(descriptor: TypeParameterDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrTypeParameterSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [57:69] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.ir.expressions.impl.createClassifierSymbolForClassReference[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [58:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [58:88] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.ir.expressions.impl.createClassifierSymbolForClassReference[ValueParameterDescriptorImpl]

