'scopeOwnerSymbol' @ [37:51] ==> public final val scopeOwnerSymbol: IrSymbol defined in org.jetbrains.kotlin.ir.builders.Scope[PropertyDescriptorImpl]

'descriptor' @ [37:68] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrSymbol[PropertyDescriptorImpl]

'Deprecated' @ [39:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'this' @ [40:53] ==> public constructor Scope(scopeOwnerSymbol: IrSymbol) defined in org.jetbrains.kotlin.ir.builders.Scope[ClassConstructorDescriptorImpl]

'createSymbolForScopeOwner' @ [40:58] ==> @Suppress @Deprecated public fun createSymbolForScopeOwner(descriptor: DeclarationDescriptor): IrSymbol defined in org.jetbrains.kotlin.ir.builders in file Scope.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [40:84] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope.<init>[ValueParameterDescriptorImpl]

'lastTemporaryIndex' @ [43:45] ==> private final var lastTemporaryIndex: Int defined in org.jetbrains.kotlin.ir.builders.Scope[PropertyDescriptorImpl]

'IrTemporaryVariableDescriptorImpl' @ [46:13] ==> public constructor IrTemporaryVariableDescriptorImpl(containingDeclaration: DeclarationDescriptor, name: Name, outType: KotlinType, isMutable: Boolean = ...) defined in org.jetbrains.kotlin.ir.descriptors.IrTemporaryVariableDescriptorImpl[ClassConstructorDescriptorImpl]

'scopeOwner' @ [46:47] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope[PropertyDescriptorImpl]

'identifier' @ [46:64] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'getNameForTemporary' @ [46:75] ==> private final fun getNameForTemporary(nameHint: String?): String defined in org.jetbrains.kotlin.ir.builders.Scope[SimpleFunctionDescriptorImpl]

'nameHint' @ [46:95] ==> value-parameter nameHint: String? = ... defined in org.jetbrains.kotlin.ir.builders.Scope.createDescriptorForTemporaryVariable[ValueParameterDescriptorImpl]

'type' @ [46:107] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.builders.Scope.createDescriptorForTemporaryVariable[ValueParameterDescriptorImpl]

'isMutable' @ [46:113] ==> value-parameter isMutable: Boolean = ... defined in org.jetbrains.kotlin.ir.builders.Scope.createDescriptorForTemporaryVariable[ValueParameterDescriptorImpl]

'nextTemporaryIndex' @ [49:21] ==> private final fun nextTemporaryIndex(): Int defined in org.jetbrains.kotlin.ir.builders.Scope[SimpleFunctionDescriptorImpl]

'if (nameHint != null) "tmp${index}_$nameHint" else "tmp$index"' @ [50:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'nameHint' @ [50:20] ==> value-parameter nameHint: String? defined in org.jetbrains.kotlin.ir.builders.Scope.getNameForTemporary[ValueParameterDescriptorImpl]

'index' @ [50:44] ==> val index: Int defined in org.jetbrains.kotlin.ir.builders.Scope.getNameForTemporary[LocalVariableDescriptor]

'nameHint' @ [50:52] ==> value-parameter nameHint: String? defined in org.jetbrains.kotlin.ir.builders.Scope.getNameForTemporary[ValueParameterDescriptorImpl]

'index' @ [50:72] ==> val index: Int defined in org.jetbrains.kotlin.ir.builders.Scope.getNameForTemporary[LocalVariableDescriptor]

'IR_TEMPORARY_VARIABLE' @ [57:63] ==> public object IR_TEMPORARY_VARIABLE : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'IrVariableImpl' @ [59:13] ==> public constructor IrVariableImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: VariableDescriptor, initializer: IrExpression?) defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl[ClassConstructorDescriptorImpl]

'irExpression' @ [60:21] ==> value-parameter irExpression: IrExpression defined in org.jetbrains.kotlin.ir.builders.Scope.createTemporaryVariable[ValueParameterDescriptorImpl]

'startOffset' @ [60:34] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[PropertyDescriptorImpl]

'irExpression' @ [60:47] ==> value-parameter irExpression: IrExpression defined in org.jetbrains.kotlin.ir.builders.Scope.createTemporaryVariable[ValueParameterDescriptorImpl]

'endOffset' @ [60:60] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[PropertyDescriptorImpl]

'origin' @ [60:71] ==> value-parameter origin: IrDeclarationOrigin = ... defined in org.jetbrains.kotlin.ir.builders.Scope.createTemporaryVariable[ValueParameterDescriptorImpl]

'createDescriptorForTemporaryVariable' @ [61:21] ==> public final fun createDescriptorForTemporaryVariable(type: KotlinType, nameHint: String? = ..., isMutable: Boolean = ...): IrTemporaryVariableDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope[SimpleFunctionDescriptorImpl]

'irExpression' @ [61:58] ==> value-parameter irExpression: IrExpression defined in org.jetbrains.kotlin.ir.builders.Scope.createTemporaryVariable[ValueParameterDescriptorImpl]

'type' @ [61:71] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[PropertyDescriptorImpl]

'nameHint' @ [61:77] ==> value-parameter nameHint: String? = ... defined in org.jetbrains.kotlin.ir.builders.Scope.createTemporaryVariable[ValueParameterDescriptorImpl]

'isMutable' @ [61:87] ==> value-parameter isMutable: Boolean = ... defined in org.jetbrains.kotlin.ir.builders.Scope.createTemporaryVariable[ValueParameterDescriptorImpl]

'irExpression' @ [62:21] ==> value-parameter irExpression: IrExpression defined in org.jetbrains.kotlin.ir.builders.Scope.createTemporaryVariable[ValueParameterDescriptorImpl]

'Suppress' @ [66:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Deprecated' @ [67:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'when (descriptor) {
            is ClassDescriptor -> IrClassSymbolImpl(descriptor)
            is FunctionDescriptor -> createFunctionSymbol(descriptor)
            is PropertyDescriptor -> IrFieldSymbolImpl(descriptor)
            else -> throw AssertionError("Unexpected scopeOwner descriptor: $descriptor")
        }' @ [69:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrSymbol, entry1: IrSymbol, entry2: IrSymbol, entry3: IrSymbol): IrSymbol[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrSymbol

'descriptor' @ [69:15] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.createSymbolForScopeOwner[ValueParameterDescriptorImpl]

'IrClassSymbolImpl' @ [70:35] ==> public constructor IrClassSymbolImpl(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrClassSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [70:53] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.createSymbolForScopeOwner[ValueParameterDescriptorImpl]

'createFunctionSymbol' @ [71:38] ==> public fun createFunctionSymbol(descriptor: CallableMemberDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.symbols.impl in file IrSymbolBase.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [71:59] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.createSymbolForScopeOwner[ValueParameterDescriptorImpl]

'IrFieldSymbolImpl' @ [72:38] ==> public constructor IrFieldSymbolImpl(descriptor: PropertyDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrFieldSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [72:56] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.createSymbolForScopeOwner[ValueParameterDescriptorImpl]

'AssertionError' @ [73:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [73:78] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.createSymbolForScopeOwner[ValueParameterDescriptorImpl]

