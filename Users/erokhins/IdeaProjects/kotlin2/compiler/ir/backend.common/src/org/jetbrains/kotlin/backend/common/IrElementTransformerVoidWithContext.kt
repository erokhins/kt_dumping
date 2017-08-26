'IrElementTransformerVoid' @ [29:54] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'mutableListOf' @ [31:30] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<ScopeWithIr> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopeWithIr

'scopeStack' @ [34:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'push' @ [34:20] ==> public fun <E> MutableList<ScopeWithIr>.push(element: ScopeWithIr): Boolean defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'ScopeWithIr' @ [34:25] ==> public constructor ScopeWithIr(scope: Scope, irElement: IrElement) defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[ClassConstructorDescriptorImpl]

'Scope' @ [34:37] ==> public constructor Scope(scopeOwnerSymbol: IrSymbol) defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedClassConstructorDescriptor]

'declaration' @ [34:43] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitFile[ValueParameterDescriptorImpl]

'symbol' @ [34:55] ==> public abstract val symbol: IrFileSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFile[DeserializedPropertyDescriptor]

'declaration' @ [34:64] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitFile[ValueParameterDescriptorImpl]

'visitFileNew' @ [35:22] ==> public open fun visitFileNew(declaration: IrFile): IrFile defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[SimpleFunctionDescriptorImpl]

'declaration' @ [35:35] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitFile[ValueParameterDescriptorImpl]

'scopeStack' @ [36:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'pop' @ [36:20] ==> public fun <E> MutableList<ScopeWithIr>.pop(): ScopeWithIr defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'result' @ [37:16] ==> val result: IrFile defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitFile[LocalVariableDescriptor]

'scopeStack' @ [41:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'push' @ [41:20] ==> public fun <E> MutableList<ScopeWithIr>.push(element: ScopeWithIr): Boolean defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'ScopeWithIr' @ [41:25] ==> public constructor ScopeWithIr(scope: Scope, irElement: IrElement) defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[ClassConstructorDescriptorImpl]

'Scope' @ [41:37] ==> public constructor Scope(scopeOwnerSymbol: IrSymbol) defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedClassConstructorDescriptor]

'declaration' @ [41:43] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitClass[ValueParameterDescriptorImpl]

'symbol' @ [41:55] ==> public abstract val symbol: IrClassSymbol defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'declaration' @ [41:64] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitClass[ValueParameterDescriptorImpl]

'visitClassNew' @ [42:22] ==> public open fun visitClassNew(declaration: IrClass): IrStatement defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[SimpleFunctionDescriptorImpl]

'declaration' @ [42:36] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitClass[ValueParameterDescriptorImpl]

'scopeStack' @ [43:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'pop' @ [43:20] ==> public fun <E> MutableList<ScopeWithIr>.pop(): ScopeWithIr defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'result' @ [44:16] ==> val result: IrStatement defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitClass[LocalVariableDescriptor]

'scopeStack' @ [48:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'push' @ [48:20] ==> public fun <E> MutableList<ScopeWithIr>.push(element: ScopeWithIr): Boolean defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'ScopeWithIr' @ [48:25] ==> public constructor ScopeWithIr(scope: Scope, irElement: IrElement) defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[ClassConstructorDescriptorImpl]

'Scope' @ [48:37] ==> @Deprecated public constructor Scope(descriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedClassConstructorDescriptor]

'declaration' @ [48:43] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitProperty[ValueParameterDescriptorImpl]

'descriptor' @ [48:55] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrProperty[DeserializedPropertyDescriptor]

'declaration' @ [48:68] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitProperty[ValueParameterDescriptorImpl]

'visitPropertyNew' @ [49:22] ==> public open fun visitPropertyNew(declaration: IrProperty): IrStatement defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[SimpleFunctionDescriptorImpl]

'declaration' @ [49:39] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitProperty[ValueParameterDescriptorImpl]

'scopeStack' @ [50:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'pop' @ [50:20] ==> public fun <E> MutableList<ScopeWithIr>.pop(): ScopeWithIr defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'result' @ [51:16] ==> val result: IrStatement defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitProperty[LocalVariableDescriptor]

'scopeStack' @ [55:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'push' @ [55:20] ==> public fun <E> MutableList<ScopeWithIr>.push(element: ScopeWithIr): Boolean defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'ScopeWithIr' @ [55:25] ==> public constructor ScopeWithIr(scope: Scope, irElement: IrElement) defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[ClassConstructorDescriptorImpl]

'Scope' @ [55:37] ==> public constructor Scope(scopeOwnerSymbol: IrSymbol) defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedClassConstructorDescriptor]

'declaration' @ [55:43] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitField[ValueParameterDescriptorImpl]

'symbol' @ [55:55] ==> public abstract val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'declaration' @ [55:64] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitField[ValueParameterDescriptorImpl]

'visitFieldNew' @ [56:22] ==> public open fun visitFieldNew(declaration: IrField): IrStatement defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[SimpleFunctionDescriptorImpl]

'declaration' @ [56:36] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitField[ValueParameterDescriptorImpl]

'scopeStack' @ [57:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'pop' @ [57:20] ==> public fun <E> MutableList<ScopeWithIr>.pop(): ScopeWithIr defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'result' @ [58:16] ==> val result: IrStatement defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitField[LocalVariableDescriptor]

'scopeStack' @ [62:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'push' @ [62:20] ==> public fun <E> MutableList<ScopeWithIr>.push(element: ScopeWithIr): Boolean defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'ScopeWithIr' @ [62:25] ==> public constructor ScopeWithIr(scope: Scope, irElement: IrElement) defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[ClassConstructorDescriptorImpl]

'Scope' @ [62:37] ==> public constructor Scope(scopeOwnerSymbol: IrSymbol) defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedClassConstructorDescriptor]

'declaration' @ [62:43] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitFunction[ValueParameterDescriptorImpl]

'symbol' @ [62:55] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'declaration' @ [62:64] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitFunction[ValueParameterDescriptorImpl]

'visitFunctionNew' @ [63:22] ==> public open fun visitFunctionNew(declaration: IrFunction): IrStatement defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[SimpleFunctionDescriptorImpl]

'declaration' @ [63:39] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitFunction[ValueParameterDescriptorImpl]

'scopeStack' @ [64:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'pop' @ [64:20] ==> public fun <E> MutableList<ScopeWithIr>.pop(): ScopeWithIr defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'result' @ [65:16] ==> val result: IrStatement defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitFunction[LocalVariableDescriptor]

'scopeStack' @ [68:39] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'lastOrNull' @ [68:50] ==> public inline fun <T> List<ScopeWithIr>.lastOrNull(predicate: (ScopeWithIr) -> Boolean): ScopeWithIr? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopeWithIr

'it' @ [68:63] ==> value-parameter it: ScopeWithIr defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.<get-currentFile>.<anonymous>[ValueParameterDescriptorImpl]

'irElement' @ [68:66] ==> public final val irElement: IrElement defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[PropertyDescriptorImpl]

'irElement' @ [68:90] ==> public final val irElement: IrElement defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[PropertyDescriptorImpl]

'scopeStack' @ [69:40] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'lastOrNull' @ [69:51] ==> public inline fun <T> List<ScopeWithIr>.lastOrNull(predicate: (ScopeWithIr) -> Boolean): ScopeWithIr? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopeWithIr

'it' @ [69:64] ==> value-parameter it: ScopeWithIr defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.<get-currentClass>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [69:67] ==> public final val scope: Scope defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[PropertyDescriptorImpl]

'scopeOwner' @ [69:73] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedPropertyDescriptor]

'scopeStack' @ [70:43] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'lastOrNull' @ [70:54] ==> public inline fun <T> List<ScopeWithIr>.lastOrNull(predicate: (ScopeWithIr) -> Boolean): ScopeWithIr? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopeWithIr

'it' @ [70:67] ==> value-parameter it: ScopeWithIr defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.<get-currentFunction>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [70:70] ==> public final val scope: Scope defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[PropertyDescriptorImpl]

'scopeOwner' @ [70:76] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedPropertyDescriptor]

'scopeStack' @ [71:43] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'lastOrNull' @ [71:54] ==> public inline fun <T> List<ScopeWithIr>.lastOrNull(predicate: (ScopeWithIr) -> Boolean): ScopeWithIr? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopeWithIr

'it' @ [71:67] ==> value-parameter it: ScopeWithIr defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.<get-currentProperty>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [71:70] ==> public final val scope: Scope defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[PropertyDescriptorImpl]

'scopeOwner' @ [71:76] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedPropertyDescriptor]

'scopeStack' @ [72:40] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'peek' @ [72:51] ==> public fun <E> MutableList<ScopeWithIr>.peek(): ScopeWithIr? defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'if (scopeStack.size < 2) null else scopeStack[scopeStack.size - 2]' @ [73:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ScopeWithIr?, elseBranch: ScopeWithIr?): ScopeWithIr?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ScopeWithIr?

'scopeStack' @ [73:43] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'size' @ [73:54] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'scopeStack' @ [73:74] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'scopeStack' @ [73:85] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'size' @ [73:96] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'scopeStack' @ [74:37] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'scopeStack' @ [77:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[PropertyDescriptorImpl]

'forEach' @ [77:20] ==> @HidesMembers public inline fun <T> Iterable<ScopeWithIr>.forEach(action: (ScopeWithIr) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopeWithIr

'println' @ [77:30] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [77:38] ==> value-parameter it: ScopeWithIr defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.printScopeStack.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [77:41] ==> public final val scope: Scope defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[PropertyDescriptorImpl]

'scopeOwner' @ [77:47] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedPropertyDescriptor]

'super' @ [81:16] ==> <this> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[LazyClassReceiverParameterDescriptor]

'visitFile' @ [81:22] ==> public open fun visitFile(declaration: IrFile): IrFile defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [81:32] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitFileNew[ValueParameterDescriptorImpl]

'super' @ [85:16] ==> <this> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[LazyClassReceiverParameterDescriptor]

'visitClass' @ [85:22] ==> public open fun visitClass(declaration: IrClass): IrStatement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [85:33] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitClassNew[ValueParameterDescriptorImpl]

'super' @ [89:16] ==> <this> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[LazyClassReceiverParameterDescriptor]

'visitFunction' @ [89:22] ==> public open fun visitFunction(declaration: IrFunction): IrStatement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [89:36] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitFunctionNew[ValueParameterDescriptorImpl]

'super' @ [93:16] ==> <this> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[LazyClassReceiverParameterDescriptor]

'visitProperty' @ [93:22] ==> public open fun visitProperty(declaration: IrProperty): IrStatement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [93:36] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitPropertyNew[ValueParameterDescriptorImpl]

'super' @ [97:16] ==> <this> defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext[LazyClassReceiverParameterDescriptor]

'visitField' @ [97:22] ==> public open fun visitField(declaration: IrField): IrStatement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [97:33] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext.visitFieldNew[ValueParameterDescriptorImpl]

'mutableListOf' @ [103:30] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<ScopeWithIr> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopeWithIr

'scopeStack' @ [106:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'push' @ [106:20] ==> public fun <E> MutableList<ScopeWithIr>.push(element: ScopeWithIr): Boolean defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'ScopeWithIr' @ [106:25] ==> public constructor ScopeWithIr(scope: Scope, irElement: IrElement) defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[ClassConstructorDescriptorImpl]

'Scope' @ [106:37] ==> public constructor Scope(scopeOwnerSymbol: IrSymbol) defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedClassConstructorDescriptor]

'declaration' @ [106:43] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitFile[ValueParameterDescriptorImpl]

'symbol' @ [106:55] ==> public abstract val symbol: IrFileSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFile[DeserializedPropertyDescriptor]

'declaration' @ [106:64] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitFile[ValueParameterDescriptorImpl]

'visitFileNew' @ [107:9] ==> public open fun visitFileNew(declaration: IrFile): Unit defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[SimpleFunctionDescriptorImpl]

'declaration' @ [107:22] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitFile[ValueParameterDescriptorImpl]

'scopeStack' @ [108:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'pop' @ [108:20] ==> public fun <E> MutableList<ScopeWithIr>.pop(): ScopeWithIr defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'scopeStack' @ [112:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'push' @ [112:20] ==> public fun <E> MutableList<ScopeWithIr>.push(element: ScopeWithIr): Boolean defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'ScopeWithIr' @ [112:25] ==> public constructor ScopeWithIr(scope: Scope, irElement: IrElement) defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[ClassConstructorDescriptorImpl]

'Scope' @ [112:37] ==> public constructor Scope(scopeOwnerSymbol: IrSymbol) defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedClassConstructorDescriptor]

'declaration' @ [112:43] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitClass[ValueParameterDescriptorImpl]

'symbol' @ [112:55] ==> public abstract val symbol: IrClassSymbol defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'declaration' @ [112:64] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitClass[ValueParameterDescriptorImpl]

'visitClassNew' @ [113:9] ==> public open fun visitClassNew(declaration: IrClass): Unit defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[SimpleFunctionDescriptorImpl]

'declaration' @ [113:23] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitClass[ValueParameterDescriptorImpl]

'scopeStack' @ [114:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'pop' @ [114:20] ==> public fun <E> MutableList<ScopeWithIr>.pop(): ScopeWithIr defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'scopeStack' @ [118:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'push' @ [118:20] ==> public fun <E> MutableList<ScopeWithIr>.push(element: ScopeWithIr): Boolean defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'ScopeWithIr' @ [118:25] ==> public constructor ScopeWithIr(scope: Scope, irElement: IrElement) defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[ClassConstructorDescriptorImpl]

'Scope' @ [118:37] ==> @Deprecated public constructor Scope(descriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedClassConstructorDescriptor]

'declaration' @ [118:43] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitProperty[ValueParameterDescriptorImpl]

'descriptor' @ [118:55] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrProperty[DeserializedPropertyDescriptor]

'declaration' @ [118:68] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitProperty[ValueParameterDescriptorImpl]

'visitPropertyNew' @ [119:9] ==> public open fun visitPropertyNew(declaration: IrProperty): Unit defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[SimpleFunctionDescriptorImpl]

'declaration' @ [119:26] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitProperty[ValueParameterDescriptorImpl]

'scopeStack' @ [120:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'pop' @ [120:20] ==> public fun <E> MutableList<ScopeWithIr>.pop(): ScopeWithIr defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'declaration' @ [124:27] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitField[ValueParameterDescriptorImpl]

'descriptor' @ [124:39] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'isDelegated' @ [124:50] ==> @Deprecated public abstract val isDelegated: Boolean defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[DeserializedPropertyDescriptor]

'isDelegated' @ [125:13] ==> val isDelegated: Boolean defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitField[LocalVariableDescriptor]

'scopeStack' @ [125:26] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'push' @ [125:37] ==> public fun <E> MutableList<ScopeWithIr>.push(element: ScopeWithIr): Boolean defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'ScopeWithIr' @ [125:42] ==> public constructor ScopeWithIr(scope: Scope, irElement: IrElement) defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[ClassConstructorDescriptorImpl]

'Scope' @ [125:54] ==> public constructor Scope(scopeOwnerSymbol: IrSymbol) defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedClassConstructorDescriptor]

'declaration' @ [125:60] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitField[ValueParameterDescriptorImpl]

'symbol' @ [125:72] ==> public abstract val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'declaration' @ [125:81] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitField[ValueParameterDescriptorImpl]

'visitFieldNew' @ [126:9] ==> public open fun visitFieldNew(declaration: IrField): Unit defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[SimpleFunctionDescriptorImpl]

'declaration' @ [126:23] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitField[ValueParameterDescriptorImpl]

'isDelegated' @ [127:13] ==> val isDelegated: Boolean defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitField[LocalVariableDescriptor]

'scopeStack' @ [127:26] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'pop' @ [127:37] ==> public fun <E> MutableList<ScopeWithIr>.pop(): ScopeWithIr defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'scopeStack' @ [131:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'push' @ [131:20] ==> public fun <E> MutableList<ScopeWithIr>.push(element: ScopeWithIr): Boolean defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'ScopeWithIr' @ [131:25] ==> public constructor ScopeWithIr(scope: Scope, irElement: IrElement) defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[ClassConstructorDescriptorImpl]

'Scope' @ [131:37] ==> @Deprecated public constructor Scope(descriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedClassConstructorDescriptor]

'declaration' @ [131:43] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitFunction[ValueParameterDescriptorImpl]

'descriptor' @ [131:55] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'declaration' @ [131:68] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitFunction[ValueParameterDescriptorImpl]

'visitFunctionNew' @ [132:9] ==> public open fun visitFunctionNew(declaration: IrFunction): Unit defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[SimpleFunctionDescriptorImpl]

'declaration' @ [132:26] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitFunction[ValueParameterDescriptorImpl]

'scopeStack' @ [133:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'pop' @ [133:20] ==> public fun <E> MutableList<ScopeWithIr>.pop(): ScopeWithIr defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'scopeStack' @ [136:39] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'lastOrNull' @ [136:50] ==> public inline fun <T> List<ScopeWithIr>.lastOrNull(predicate: (ScopeWithIr) -> Boolean): ScopeWithIr? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopeWithIr

'it' @ [136:63] ==> value-parameter it: ScopeWithIr defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.<get-currentFile>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [136:66] ==> public final val scope: Scope defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[PropertyDescriptorImpl]

'scopeOwner' @ [136:72] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedPropertyDescriptor]

'scopeStack' @ [137:40] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'lastOrNull' @ [137:51] ==> public inline fun <T> List<ScopeWithIr>.lastOrNull(predicate: (ScopeWithIr) -> Boolean): ScopeWithIr? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopeWithIr

'it' @ [137:64] ==> value-parameter it: ScopeWithIr defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.<get-currentClass>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [137:67] ==> public final val scope: Scope defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[PropertyDescriptorImpl]

'scopeOwner' @ [137:73] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedPropertyDescriptor]

'scopeStack' @ [138:43] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'lastOrNull' @ [138:54] ==> public inline fun <T> List<ScopeWithIr>.lastOrNull(predicate: (ScopeWithIr) -> Boolean): ScopeWithIr? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopeWithIr

'it' @ [138:67] ==> value-parameter it: ScopeWithIr defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.<get-currentFunction>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [138:70] ==> public final val scope: Scope defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[PropertyDescriptorImpl]

'scopeOwner' @ [138:76] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedPropertyDescriptor]

'scopeStack' @ [139:43] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'lastOrNull' @ [139:54] ==> public inline fun <T> List<ScopeWithIr>.lastOrNull(predicate: (ScopeWithIr) -> Boolean): ScopeWithIr? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopeWithIr

'it' @ [139:67] ==> value-parameter it: ScopeWithIr defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.<get-currentProperty>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [139:70] ==> public final val scope: Scope defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[PropertyDescriptorImpl]

'scopeOwner' @ [139:76] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedPropertyDescriptor]

'scopeStack' @ [140:40] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'peek' @ [140:51] ==> public fun <E> MutableList<ScopeWithIr>.peek(): ScopeWithIr? defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ScopeWithIr

'if (scopeStack.size < 2) null else scopeStack[scopeStack.size - 2]' @ [141:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ScopeWithIr?, elseBranch: ScopeWithIr?): ScopeWithIr?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ScopeWithIr?

'scopeStack' @ [141:43] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'size' @ [141:54] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'scopeStack' @ [141:74] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'scopeStack' @ [141:85] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'size' @ [141:96] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'scopeStack' @ [144:9] ==> private final val scopeStack: MutableList<ScopeWithIr> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[PropertyDescriptorImpl]

'forEach' @ [144:20] ==> @HidesMembers public inline fun <T> Iterable<ScopeWithIr>.forEach(action: (ScopeWithIr) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopeWithIr

'println' @ [144:30] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [144:38] ==> value-parameter it: ScopeWithIr defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.printScopeStack.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [144:41] ==> public final val scope: Scope defined in org.jetbrains.kotlin.backend.common.ScopeWithIr[PropertyDescriptorImpl]

'scopeOwner' @ [144:47] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedPropertyDescriptor]

'super' @ [148:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[LazyClassReceiverParameterDescriptor]

'visitFile' @ [148:15] ==> public open fun visitFile(declaration: IrFile): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [148:25] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitFileNew[ValueParameterDescriptorImpl]

'super' @ [152:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[LazyClassReceiverParameterDescriptor]

'visitClass' @ [152:15] ==> public open fun visitClass(declaration: IrClass): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [152:26] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitClassNew[ValueParameterDescriptorImpl]

'super' @ [156:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[LazyClassReceiverParameterDescriptor]

'visitFunction' @ [156:15] ==> public open fun visitFunction(declaration: IrFunction): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [156:29] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitFunctionNew[ValueParameterDescriptorImpl]

'super' @ [160:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[LazyClassReceiverParameterDescriptor]

'visitProperty' @ [160:15] ==> public open fun visitProperty(declaration: IrProperty): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [160:29] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitPropertyNew[ValueParameterDescriptorImpl]

'super' @ [164:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext[LazyClassReceiverParameterDescriptor]

'visitField' @ [164:15] ==> public open fun visitField(declaration: IrField): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [164:26] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.backend.common.IrElementVisitorVoidWithContext.visitFieldNew[ValueParameterDescriptorImpl]

