'linkedSetOf' @ [30:30] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<S> /* = LinkedHashSet<S> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> S

'get' @ [36:28] ==> protected abstract fun get(d: D): S? defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase[SimpleFunctionDescriptorImpl]

'd' @ [36:32] ==> value-parameter d: D defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase.declare[ValueParameterDescriptorImpl]

'if (existing == null) {
                val new = createSymbol()
                set(d, new)
                new
            }
            else {
                unboundSymbols.remove(existing)
                existing
            }' @ [37:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: S, elseBranch: S): S[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> S

'existing' @ [37:30] ==> val existing: S? defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase.declare[LocalVariableDescriptor]

'invoke' @ [38:27] ==> public abstract operator fun invoke(): S defined in kotlin.Function0[FunctionInvokeDescriptor]

'set' @ [39:17] ==> protected abstract fun set(d: D, s: S): Unit defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase[SimpleFunctionDescriptorImpl]

'd' @ [39:21] ==> value-parameter d: D defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase.declare[ValueParameterDescriptorImpl]

'new' @ [39:24] ==> val new: S defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase.declare[LocalVariableDescriptor]

'new' @ [40:17] ==> val new: S defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase.declare[LocalVariableDescriptor]

'unboundSymbols' @ [43:17] ==> public final val unboundSymbols: LinkedHashSet<S> /* = LinkedHashSet<S> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase[PropertyDescriptorImpl]

'remove' @ [43:32] ==> public open fun remove(element: S): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'existing' @ [43:39] ==> val existing: S? defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase.declare[LocalVariableDescriptor]

'existing' @ [44:17] ==> val existing: S? defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase.declare[LocalVariableDescriptor]

'invoke' @ [46:20] ==> public abstract operator fun invoke(p1: S): B defined in kotlin.Function1[FunctionInvokeDescriptor]

'symbol' @ [46:32] ==> val symbol: S defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase.declare[LocalVariableDescriptor]

'get' @ [50:21] ==> protected abstract fun get(d: D): S? defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase[SimpleFunctionDescriptorImpl]

'd' @ [50:25] ==> value-parameter d: D defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase.referenced[ValueParameterDescriptorImpl]

's' @ [51:17] ==> val s: S? defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase.referenced[LocalVariableDescriptor]

'invoke' @ [52:27] ==> public abstract operator fun invoke(): S defined in kotlin.Function0[FunctionInvokeDescriptor]

'assert' @ [53:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'unboundSymbols' @ [53:24] ==> public final val unboundSymbols: LinkedHashSet<S> /* = LinkedHashSet<S> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase[PropertyDescriptorImpl]

'add' @ [53:39] ==> public open fun add(element: S): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'new' @ [53:43] ==> val new: S defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase.referenced[LocalVariableDescriptor]

'new' @ [54:35] ==> val new: S defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase.referenced[LocalVariableDescriptor]

'descriptor' @ [54:39] ==> public abstract val descriptor: D defined in org.jetbrains.kotlin.ir.symbols.IrBindableSymbol[PropertyDescriptorImpl]

'set' @ [56:17] ==> protected abstract fun set(d: D, s: S): Unit defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase[SimpleFunctionDescriptorImpl]

'd' @ [56:21] ==> value-parameter d: D defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase.referenced[ValueParameterDescriptorImpl]

'new' @ [56:24] ==> val new: S defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase.referenced[LocalVariableDescriptor]

'new' @ [57:24] ==> val new: S defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase.referenced[LocalVariableDescriptor]

's' @ [59:20] ==> val s: S? defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase.referenced[LocalVariableDescriptor]

'SymbolTableBase<D, B, S>' @ [64:11] ==> public constructor SymbolTableBase<D : DeclarationDescriptor, B : IrSymbolOwner, S : IrBindableSymbol<D, B>>() defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase[ClassConstructorDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> D
    <B : IrSymbolOwner> -> B
    <S : IrBindableSymbol<D, B>> -> S

'linkedMapOf' @ [66:34] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<D, S> /* = LinkedHashMap<D, S> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> D
    <V> -> S

'descriptorToSymbol' @ [68:38] ==> public final val descriptorToSymbol: LinkedHashMap<D, S> /* = LinkedHashMap<D, S> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[PropertyDescriptorImpl]

'd' @ [68:57] ==> value-parameter d: D defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable.get[ValueParameterDescriptorImpl]

'descriptorToSymbol' @ [71:13] ==> public final val descriptorToSymbol: LinkedHashMap<D, S> /* = LinkedHashMap<D, S> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[PropertyDescriptorImpl]

'd' @ [71:32] ==> value-parameter d: D defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable.set[ValueParameterDescriptorImpl]

's' @ [71:37] ==> value-parameter s: S defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable.set[ValueParameterDescriptorImpl]

'SymbolTableBase<D, B, S>' @ [76:11] ==> public constructor SymbolTableBase<D : DeclarationDescriptor, B : IrSymbolOwner, S : IrBindableSymbol<D, B>>() defined in org.jetbrains.kotlin.ir.util.SymbolTable.SymbolTableBase[ClassConstructorDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> D
    <B : IrSymbolOwner> -> B
    <S : IrBindableSymbol<D, B>> -> S

'linkedMapOf' @ [79:46] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<D, S> /* = LinkedHashMap<D, S> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> D
    <V> -> S

'descriptorToSymbol' @ [82:21] ==> private final val descriptorToSymbol: LinkedHashMap<D, S> /* = LinkedHashMap<D, S> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope[PropertyDescriptorImpl]

'd' @ [82:40] ==> value-parameter d: D defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope.get[ValueParameterDescriptorImpl]

'parent' @ [82:46] ==> public final val parent: SymbolTable.ScopedSymbolTable<D, B, S>.Scope? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope[PropertyDescriptorImpl]

'get' @ [82:54] ==> public final operator fun get(d: D): S? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope[SimpleFunctionDescriptorImpl]

'd' @ [82:58] ==> value-parameter d: D defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope.get[ValueParameterDescriptorImpl]

'descriptorToSymbol' @ [84:34] ==> private final val descriptorToSymbol: LinkedHashMap<D, S> /* = LinkedHashMap<D, S> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope[PropertyDescriptorImpl]

'd' @ [84:53] ==> value-parameter d: D defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope.getLocal[ValueParameterDescriptorImpl]

'descriptorToSymbol' @ [87:17] ==> private final val descriptorToSymbol: LinkedHashMap<D, S> /* = LinkedHashMap<D, S> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope[PropertyDescriptorImpl]

'd' @ [87:36] ==> value-parameter d: D defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope.set[ValueParameterDescriptorImpl]

's' @ [87:41] ==> value-parameter s: S defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope.set[ValueParameterDescriptorImpl]

'stringBuilder' @ [91:21] ==> value-parameter stringBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope.dumpTo[ValueParameterDescriptorImpl]

'also' @ [91:35] ==> @InlineOnly @SinceKotlin public inline fun <T> StringBuilder /* = StringBuilder */.also(block: (StringBuilder /* = StringBuilder */) -> Unit): StringBuilder /* = StringBuilder */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringBuilder

'it' @ [92:25] ==> value-parameter it: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope.dumpTo.<anonymous>[ValueParameterDescriptorImpl]

'append' @ [92:28] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [93:25] ==> value-parameter it: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope.dumpTo.<anonymous>[ValueParameterDescriptorImpl]

'append' @ [93:28] ==> public open fun append(p0: (Any..Any?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'owner' @ [93:35] ==> public final val owner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope[PropertyDescriptorImpl]

'it' @ [94:25] ==> value-parameter it: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope.dumpTo.<anonymous>[ValueParameterDescriptorImpl]

'append' @ [94:28] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'descriptorToSymbol' @ [95:25] ==> private final val descriptorToSymbol: LinkedHashMap<D, S> /* = LinkedHashMap<D, S> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope[PropertyDescriptorImpl]

'keys' @ [95:44] ==> public open val keys: MutableSet<D> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'joinTo' @ [95:49] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<D>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((D) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> D
    <A : Appendable /* = Appendable */> -> StringBuilder

'it' @ [95:94] ==> value-parameter it: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope.dumpTo.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [96:25] ==> value-parameter it: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope.dumpTo.<anonymous>[ValueParameterDescriptorImpl]

'append' @ [96:28] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'parent' @ [97:25] ==> public final val parent: SymbolTable.ScopedSymbolTable<D, B, S>.Scope? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope[PropertyDescriptorImpl]

'dumpTo' @ [97:33] ==> public final fun dumpTo(stringBuilder: StringBuilder /* = StringBuilder */): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope[SimpleFunctionDescriptorImpl]

'it' @ [97:40] ==> value-parameter it: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope.dumpTo.<anonymous>[ValueParameterDescriptorImpl]

'dumpTo' @ [100:34] ==> public final fun dumpTo(stringBuilder: StringBuilder /* = StringBuilder */): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope[SimpleFunctionDescriptorImpl]

'StringBuilder' @ [100:41] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'toString' @ [100:58] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'currentScope' @ [106:25] ==> private final var currentScope: SymbolTable.ScopedSymbolTable<D, B, S>.Scope? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[PropertyDescriptorImpl]

'AssertionError' @ [106:47] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'scope' @ [107:20] ==> val scope: SymbolTable.ScopedSymbolTable<D, B, S>.Scope defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.get[LocalVariableDescriptor]

'd' @ [107:26] ==> value-parameter d: D defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.get[ValueParameterDescriptorImpl]

'currentScope' @ [110:25] ==> private final var currentScope: SymbolTable.ScopedSymbolTable<D, B, S>.Scope? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[PropertyDescriptorImpl]

'AssertionError' @ [110:47] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'scope' @ [111:13] ==> val scope: SymbolTable.ScopedSymbolTable<D, B, S>.Scope defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.set[LocalVariableDescriptor]

'd' @ [111:19] ==> value-parameter d: D defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.set[ValueParameterDescriptorImpl]

's' @ [111:24] ==> value-parameter s: S defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.set[ValueParameterDescriptorImpl]

'currentScope' @ [115:25] ==> private final var currentScope: SymbolTable.ScopedSymbolTable<D, B, S>.Scope? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[PropertyDescriptorImpl]

'AssertionError' @ [115:47] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'scope' @ [116:26] ==> val scope: SymbolTable.ScopedSymbolTable<D, B, S>.Scope defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.declareLocal[LocalVariableDescriptor]

'getLocal' @ [116:32] ==> public final fun getLocal(d: D): S? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope[SimpleFunctionDescriptorImpl]

'd' @ [116:41] ==> value-parameter d: D defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.declareLocal[ValueParameterDescriptorImpl]

'invoke' @ [116:47] ==> public abstract operator fun invoke(): S defined in kotlin.Function0[FunctionInvokeDescriptor]

'also' @ [116:62] ==> @InlineOnly @SinceKotlin public inline fun <T> S.also(block: (S) -> Unit): S defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> S

'scope' @ [116:69] ==> val scope: SymbolTable.ScopedSymbolTable<D, B, S>.Scope defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.declareLocal[LocalVariableDescriptor]

'd' @ [116:75] ==> value-parameter d: D defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.declareLocal[ValueParameterDescriptorImpl]

'it' @ [116:80] ==> value-parameter it: S defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.declareLocal.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [117:20] ==> public abstract operator fun invoke(p1: S): B defined in kotlin.Function1[FunctionInvokeDescriptor]

'symbol' @ [117:32] ==> val symbol: S defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.declareLocal[LocalVariableDescriptor]

'currentScope' @ [121:25] ==> private final var currentScope: SymbolTable.ScopedSymbolTable<D, B, S>.Scope? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[PropertyDescriptorImpl]

'AssertionError' @ [121:47] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'scope' @ [122:13] ==> val scope: SymbolTable.ScopedSymbolTable<D, B, S>.Scope defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.introduceLocal[LocalVariableDescriptor]

'descriptor' @ [122:19] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.introduceLocal[ValueParameterDescriptorImpl]

'let' @ [122:32] ==> @InlineOnly public inline fun <T, R> S.let(block: (S) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> S
    <R> -> Nothing

'AssertionError' @ [123:23] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [123:40] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.introduceLocal[ValueParameterDescriptorImpl]

'it' @ [123:72] ==> value-parameter it: S defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.introduceLocal.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [125:13] ==> val scope: SymbolTable.ScopedSymbolTable<D, B, S>.Scope defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.introduceLocal[LocalVariableDescriptor]

'descriptor' @ [125:19] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.introduceLocal[ValueParameterDescriptorImpl]

'symbol' @ [125:33] ==> value-parameter symbol: S defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.introduceLocal[ValueParameterDescriptorImpl]

'currentScope' @ [129:13] ==> private final var currentScope: SymbolTable.ScopedSymbolTable<D, B, S>.Scope? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[PropertyDescriptorImpl]

'Scope' @ [129:28] ==> public constructor Scope(owner: DeclarationDescriptor, parent: SymbolTable.ScopedSymbolTable<D, B, S>.Scope?) defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope[ClassConstructorDescriptorImpl]

'owner' @ [129:34] ==> value-parameter owner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.enterScope[ValueParameterDescriptorImpl]

'currentScope' @ [129:41] ==> private final var currentScope: SymbolTable.ScopedSymbolTable<D, B, S>.Scope? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[PropertyDescriptorImpl]

'currentScope' @ [133:13] ==> private final var currentScope: SymbolTable.ScopedSymbolTable<D, B, S>.Scope? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[PropertyDescriptorImpl]

'owner' @ [133:27] ==> public final val owner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope[PropertyDescriptorImpl]

'let' @ [133:33] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor?.let(block: (DeclarationDescriptor?) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor?
    <R> -> Unit

'assert' @ [134:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'it' @ [134:24] ==> value-parameter it: DeclarationDescriptor? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.leaveScope.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [134:30] ==> value-parameter owner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.leaveScope[ValueParameterDescriptorImpl]

'owner' @ [134:70] ==> value-parameter owner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.leaveScope[ValueParameterDescriptorImpl]

'it' @ [134:97] ==> value-parameter it: DeclarationDescriptor? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.leaveScope.<anonymous>[ValueParameterDescriptorImpl]

'currentScope' @ [137:13] ==> private final var currentScope: SymbolTable.ScopedSymbolTable<D, B, S>.Scope? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[PropertyDescriptorImpl]

'currentScope' @ [137:28] ==> private final var currentScope: SymbolTable.ScopedSymbolTable<D, B, S>.Scope? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[PropertyDescriptorImpl]

'parent' @ [137:42] ==> public final val parent: SymbolTable.ScopedSymbolTable<D, B, S>.Scope? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope[PropertyDescriptorImpl]

'currentScope' @ [139:17] ==> private final var currentScope: SymbolTable.ScopedSymbolTable<D, B, S>.Scope? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[PropertyDescriptorImpl]

'unboundSymbols' @ [139:41] ==> public final val unboundSymbols: LinkedHashSet<S> /* = LinkedHashSet<S> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[PropertyDescriptorImpl]

'isNotEmpty' @ [139:56] ==> @InlineOnly public inline fun <T> Collection<S>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> S

'AssertionError' @ [140:23] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'unboundSymbols' @ [140:79] ==> public final val unboundSymbols: LinkedHashSet<S> /* = LinkedHashSet<S> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[PropertyDescriptorImpl]

'joinToString' @ [140:94] ==> public fun <T> Iterable<S>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((S) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> S

'it' @ [140:109] ==> value-parameter it: S defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.leaveScope.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [140:112] ==> public abstract val descriptor: D defined in org.jetbrains.kotlin.ir.symbols.IrBindableSymbol[PropertyDescriptorImpl]

'toString' @ [140:123] ==> public open fun toString(): String defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedSimpleFunctionDescriptor]

'currentScope' @ [145:17] ==> private final var currentScope: SymbolTable.ScopedSymbolTable<D, B, S>.Scope? defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[PropertyDescriptorImpl]

'dump' @ [145:31] ==> public final fun dump(): String defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable.Scope[SimpleFunctionDescriptorImpl]

'FlatSymbolTable' @ [148:36] ==> public constructor FlatSymbolTable<D : DeclarationDescriptor, B : IrSymbolOwner, S : IrBindableSymbol<ClassDescriptor, IrClass>>() defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[ClassConstructorDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> ClassDescriptor
    <B : IrSymbolOwner> -> IrClass
    <S : IrBindableSymbol<D, B>> -> IrClassSymbol

'FlatSymbolTable' @ [149:42] ==> public constructor FlatSymbolTable<D : DeclarationDescriptor, B : IrSymbolOwner, S : IrBindableSymbol<ClassConstructorDescriptor, IrConstructor>>() defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[ClassConstructorDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> ClassConstructorDescriptor
    <B : IrSymbolOwner> -> IrConstructor
    <S : IrBindableSymbol<D, B>> -> IrConstructorSymbol

'FlatSymbolTable' @ [150:40] ==> public constructor FlatSymbolTable<D : DeclarationDescriptor, B : IrSymbolOwner, S : IrBindableSymbol<ClassDescriptor, IrEnumEntry>>() defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[ClassConstructorDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> ClassDescriptor
    <B : IrSymbolOwner> -> IrEnumEntry
    <S : IrBindableSymbol<D, B>> -> IrEnumEntrySymbol

'FlatSymbolTable' @ [151:36] ==> public constructor FlatSymbolTable<D : DeclarationDescriptor, B : IrSymbolOwner, S : IrBindableSymbol<PropertyDescriptor, IrField>>() defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[ClassConstructorDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> PropertyDescriptor
    <B : IrSymbolOwner> -> IrField
    <S : IrBindableSymbol<D, B>> -> IrFieldSymbol

'FlatSymbolTable' @ [152:45] ==> public constructor FlatSymbolTable<D : DeclarationDescriptor, B : IrSymbolOwner, S : IrBindableSymbol<FunctionDescriptor, IrSimpleFunction>>() defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[ClassConstructorDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> FunctionDescriptor
    <B : IrSymbolOwner> -> IrSimpleFunction
    <S : IrBindableSymbol<D, B>> -> IrSimpleFunctionSymbol

'ScopedSymbolTable' @ [154:44] ==> public constructor ScopedSymbolTable<D : DeclarationDescriptor, B : IrSymbolOwner, S : IrBindableSymbol<TypeParameterDescriptor, IrTypeParameter>>() defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[ClassConstructorDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> TypeParameterDescriptor
    <B : IrSymbolOwner> -> IrTypeParameter
    <S : IrBindableSymbol<D, B>> -> IrTypeParameterSymbol

'ScopedSymbolTable' @ [155:45] ==> public constructor ScopedSymbolTable<D : DeclarationDescriptor, B : IrSymbolOwner, S : IrBindableSymbol<ParameterDescriptor, IrValueParameter>>() defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[ClassConstructorDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> ParameterDescriptor
    <B : IrSymbolOwner> -> IrValueParameter
    <S : IrBindableSymbol<D, B>> -> IrValueParameterSymbol

'ScopedSymbolTable' @ [156:39] ==> public constructor ScopedSymbolTable<D : DeclarationDescriptor, B : IrSymbolOwner, S : IrBindableSymbol<VariableDescriptor, IrVariable>>() defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[ClassConstructorDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> VariableDescriptor
    <B : IrSymbolOwner> -> IrVariable
    <S : IrBindableSymbol<D, B>> -> IrVariableSymbol

'listOf' @ [157:38] ==> public fun <T> listOf(vararg elements: SymbolTable.ScopedSymbolTable<out DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<*, *>>>>>>, out IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<*>>>>>>>): List<SymbolTable.ScopedSymbolTable<out DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<*, *>>>>>>, out IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<*>>>>>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopedSymbolTable<out DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<*, *>>>>>>, out IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<*>>>>>>>

'typeParameterSymbolTable' @ [157:45] ==> private final val typeParameterSymbolTable: SymbolTable.ScopedSymbolTable<TypeParameterDescriptor, IrTypeParameter, IrTypeParameterSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'valueParameterSymbolTable' @ [157:71] ==> private final val valueParameterSymbolTable: SymbolTable.ScopedSymbolTable<ParameterDescriptor, IrValueParameter, IrValueParameterSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'variableSymbolTable' @ [157:98] ==> private final val variableSymbolTable: SymbolTable.ScopedSymbolTable<VariableDescriptor, IrVariable, IrVariableSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'IrFileImpl' @ [160:13] ==> public constructor IrFileImpl(fileEntry: SourceManager.FileEntry, symbol: IrFileSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[ClassConstructorDescriptorImpl]

'fileEntry' @ [160:24] ==> value-parameter fileEntry: SourceManager.FileEntry defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareFile[ValueParameterDescriptorImpl]

'IrFileSymbolImpl' @ [160:35] ==> public constructor IrFileSymbolImpl(descriptor: PackageFragmentDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrFileSymbolImpl[ClassConstructorDescriptorImpl]

'packageFragmentDescriptor' @ [160:52] ==> value-parameter packageFragmentDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareFile[ValueParameterDescriptorImpl]

'IrExternalPackageFragmentImpl' @ [163:13] ==> public constructor IrExternalPackageFragmentImpl(symbol: IrExternalPackageFragmentSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl[ClassConstructorDescriptorImpl]

'IrExternalPackageFragmentSymbolImpl' @ [163:43] ==> public constructor IrExternalPackageFragmentSymbolImpl(descriptor: PackageFragmentDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrExternalPackageFragmentSymbolImpl[ClassConstructorDescriptorImpl]

'packageFragmentDescriptor' @ [163:79] ==> value-parameter packageFragmentDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareExternalPackageFragment[ValueParameterDescriptorImpl]

'IrAnonymousInitializerImpl' @ [166:13] ==> public constructor IrAnonymousInitializerImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrAnonymousInitializerSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrAnonymousInitializerImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [167:21] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareAnonymousInitializer[ValueParameterDescriptorImpl]

'endOffset' @ [167:34] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareAnonymousInitializer[ValueParameterDescriptorImpl]

'origin' @ [167:45] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareAnonymousInitializer[ValueParameterDescriptorImpl]

'IrAnonymousInitializerSymbolImpl' @ [168:21] ==> public constructor IrAnonymousInitializerSymbolImpl(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrAnonymousInitializerSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [168:54] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareAnonymousInitializer[ValueParameterDescriptorImpl]

'classSymbolTable' @ [172:13] ==> private final val classSymbolTable: SymbolTable.FlatSymbolTable<ClassDescriptor, IrClass, IrClassSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'declare' @ [172:30] ==> public final inline fun declare(d: ClassDescriptor, createSymbol: () -> IrClassSymbol, createOwner: (IrClassSymbol) -> IrClass): IrClass defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [173:21] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareClass[ValueParameterDescriptorImpl]

'IrClassSymbolImpl' @ [174:23] ==> public constructor IrClassSymbolImpl(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrClassSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [174:41] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareClass[ValueParameterDescriptorImpl]

'IrClassImpl' @ [175:23] ==> public constructor IrClassImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrClassSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [175:35] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareClass[ValueParameterDescriptorImpl]

'endOffset' @ [175:48] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareClass[ValueParameterDescriptorImpl]

'origin' @ [175:59] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareClass[ValueParameterDescriptorImpl]

'it' @ [175:67] ==> value-parameter it: IrClassSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareClass.<anonymous>[ValueParameterDescriptorImpl]

'classSymbolTable' @ [179:13] ==> private final val classSymbolTable: SymbolTable.FlatSymbolTable<ClassDescriptor, IrClass, IrClassSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'referenced' @ [179:30] ==> public final inline fun referenced(d: ClassDescriptor, createSymbol: () -> IrClassSymbol): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [179:41] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceClass[ValueParameterDescriptorImpl]

'IrClassSymbolImpl' @ [179:55] ==> public constructor IrClassSymbolImpl(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrClassSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [179:73] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceClass[ValueParameterDescriptorImpl]

'classSymbolTable' @ [181:52] ==> private final val classSymbolTable: SymbolTable.FlatSymbolTable<ClassDescriptor, IrClass, IrClassSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'unboundSymbols' @ [181:69] ==> public final val unboundSymbols: LinkedHashSet<IrClassSymbol> /* = LinkedHashSet<IrClassSymbol> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[PropertyDescriptorImpl]

'constructorSymbolTable' @ [184:13] ==> private final val constructorSymbolTable: SymbolTable.FlatSymbolTable<ClassConstructorDescriptor, IrConstructor, IrConstructorSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'declare' @ [184:36] ==> public final inline fun declare(d: ClassConstructorDescriptor, createSymbol: () -> IrConstructorSymbol, createOwner: (IrConstructorSymbol) -> IrConstructor): IrConstructor defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [185:21] ==> value-parameter descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareConstructor[ValueParameterDescriptorImpl]

'IrConstructorSymbolImpl' @ [186:23] ==> public constructor IrConstructorSymbolImpl(descriptor: ClassConstructorDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrConstructorSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [186:47] ==> value-parameter descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareConstructor[ValueParameterDescriptorImpl]

'IrConstructorImpl' @ [187:23] ==> public constructor IrConstructorImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrConstructorSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrConstructorImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [187:41] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareConstructor[ValueParameterDescriptorImpl]

'endOffset' @ [187:54] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareConstructor[ValueParameterDescriptorImpl]

'origin' @ [187:65] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareConstructor[ValueParameterDescriptorImpl]

'it' @ [187:73] ==> value-parameter it: IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareConstructor.<anonymous>[ValueParameterDescriptorImpl]

'constructorSymbolTable' @ [191:13] ==> private final val constructorSymbolTable: SymbolTable.FlatSymbolTable<ClassConstructorDescriptor, IrConstructor, IrConstructorSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'referenced' @ [191:36] ==> public final inline fun referenced(d: ClassConstructorDescriptor, createSymbol: () -> IrConstructorSymbol): IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [191:47] ==> value-parameter descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceConstructor[ValueParameterDescriptorImpl]

'IrConstructorSymbolImpl' @ [191:61] ==> public constructor IrConstructorSymbolImpl(descriptor: ClassConstructorDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrConstructorSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [191:85] ==> value-parameter descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceConstructor[ValueParameterDescriptorImpl]

'constructorSymbolTable' @ [193:63] ==> private final val constructorSymbolTable: SymbolTable.FlatSymbolTable<ClassConstructorDescriptor, IrConstructor, IrConstructorSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'unboundSymbols' @ [193:86] ==> public final val unboundSymbols: LinkedHashSet<IrConstructorSymbol> /* = LinkedHashSet<IrConstructorSymbol> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[PropertyDescriptorImpl]

'enumEntrySymbolTable' @ [196:13] ==> private final val enumEntrySymbolTable: SymbolTable.FlatSymbolTable<ClassDescriptor, IrEnumEntry, IrEnumEntrySymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'declare' @ [196:34] ==> public final inline fun declare(d: ClassDescriptor, createSymbol: () -> IrEnumEntrySymbol, createOwner: (IrEnumEntrySymbol) -> IrEnumEntry): IrEnumEntry defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [197:21] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareEnumEntry[ValueParameterDescriptorImpl]

'IrEnumEntrySymbolImpl' @ [198:23] ==> public constructor IrEnumEntrySymbolImpl(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrEnumEntrySymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [198:45] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareEnumEntry[ValueParameterDescriptorImpl]

'IrEnumEntryImpl' @ [199:23] ==> public constructor IrEnumEntryImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrEnumEntrySymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrEnumEntryImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [199:39] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareEnumEntry[ValueParameterDescriptorImpl]

'endOffset' @ [199:52] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareEnumEntry[ValueParameterDescriptorImpl]

'origin' @ [199:63] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareEnumEntry[ValueParameterDescriptorImpl]

'it' @ [199:71] ==> value-parameter it: IrEnumEntrySymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareEnumEntry.<anonymous>[ValueParameterDescriptorImpl]

'enumEntrySymbolTable' @ [203:13] ==> private final val enumEntrySymbolTable: SymbolTable.FlatSymbolTable<ClassDescriptor, IrEnumEntry, IrEnumEntrySymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'referenced' @ [203:34] ==> public final inline fun referenced(d: ClassDescriptor, createSymbol: () -> IrEnumEntrySymbol): IrEnumEntrySymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [203:45] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceEnumEntry[ValueParameterDescriptorImpl]

'IrEnumEntrySymbolImpl' @ [203:59] ==> public constructor IrEnumEntrySymbolImpl(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrEnumEntrySymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [203:81] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceEnumEntry[ValueParameterDescriptorImpl]

'enumEntrySymbolTable' @ [205:60] ==> private final val enumEntrySymbolTable: SymbolTable.FlatSymbolTable<ClassDescriptor, IrEnumEntry, IrEnumEntrySymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'unboundSymbols' @ [205:81] ==> public final val unboundSymbols: LinkedHashSet<IrEnumEntrySymbol> /* = LinkedHashSet<IrEnumEntrySymbol> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[PropertyDescriptorImpl]

'fieldSymbolTable' @ [208:13] ==> private final val fieldSymbolTable: SymbolTable.FlatSymbolTable<PropertyDescriptor, IrField, IrFieldSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'declare' @ [208:30] ==> public final inline fun declare(d: PropertyDescriptor, createSymbol: () -> IrFieldSymbol, createOwner: (IrFieldSymbol) -> IrField): IrField defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [209:21] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareField[ValueParameterDescriptorImpl]

'IrFieldSymbolImpl' @ [210:23] ==> public constructor IrFieldSymbolImpl(descriptor: PropertyDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrFieldSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [210:41] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareField[ValueParameterDescriptorImpl]

'IrFieldImpl' @ [211:23] ==> public constructor IrFieldImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrFieldSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFieldImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [211:35] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareField[ValueParameterDescriptorImpl]

'endOffset' @ [211:48] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareField[ValueParameterDescriptorImpl]

'origin' @ [211:59] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareField[ValueParameterDescriptorImpl]

'it' @ [211:67] ==> value-parameter it: IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareField.<anonymous>[ValueParameterDescriptorImpl]

'declareField' @ [216:13] ==> public final fun declareField(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: PropertyDescriptor): IrField defined in org.jetbrains.kotlin.ir.util.SymbolTable[SimpleFunctionDescriptorImpl]

'startOffset' @ [216:26] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareField[ValueParameterDescriptorImpl]

'endOffset' @ [216:39] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareField[ValueParameterDescriptorImpl]

'origin' @ [216:50] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareField[ValueParameterDescriptorImpl]

'descriptor' @ [216:58] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareField[ValueParameterDescriptorImpl]

'apply' @ [216:70] ==> @InlineOnly public inline fun <T> IrField.apply(block: IrField.() -> Unit): IrField defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrField

'initializer' @ [216:78] ==> public abstract var initializer: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.IrField[PropertyDescriptorImpl]

'irInitializer' @ [216:92] ==> value-parameter irInitializer: IrExpressionBody? defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareField[ValueParameterDescriptorImpl]

'fieldSymbolTable' @ [219:13] ==> private final val fieldSymbolTable: SymbolTable.FlatSymbolTable<PropertyDescriptor, IrField, IrFieldSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'referenced' @ [219:30] ==> public final inline fun referenced(d: PropertyDescriptor, createSymbol: () -> IrFieldSymbol): IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [219:41] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceField[ValueParameterDescriptorImpl]

'IrFieldSymbolImpl' @ [219:55] ==> public constructor IrFieldSymbolImpl(descriptor: PropertyDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrFieldSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [219:73] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceField[ValueParameterDescriptorImpl]

'fieldSymbolTable' @ [221:51] ==> private final val fieldSymbolTable: SymbolTable.FlatSymbolTable<PropertyDescriptor, IrField, IrFieldSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'unboundSymbols' @ [221:68] ==> public final val unboundSymbols: LinkedHashSet<IrFieldSymbol> /* = LinkedHashSet<IrFieldSymbol> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[PropertyDescriptorImpl]

'simpleFunctionSymbolTable' @ [224:13] ==> private final val simpleFunctionSymbolTable: SymbolTable.FlatSymbolTable<FunctionDescriptor, IrSimpleFunction, IrSimpleFunctionSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'declare' @ [224:39] ==> public final inline fun declare(d: FunctionDescriptor, createSymbol: () -> IrSimpleFunctionSymbol, createOwner: (IrSimpleFunctionSymbol) -> IrSimpleFunction): IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [225:21] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareSimpleFunction[ValueParameterDescriptorImpl]

'IrSimpleFunctionSymbolImpl' @ [226:23] ==> public constructor IrSimpleFunctionSymbolImpl(descriptor: FunctionDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrSimpleFunctionSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [226:50] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareSimpleFunction[ValueParameterDescriptorImpl]

'IrFunctionImpl' @ [227:23] ==> public constructor IrFunctionImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrSimpleFunctionSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [227:38] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareSimpleFunction[ValueParameterDescriptorImpl]

'endOffset' @ [227:51] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareSimpleFunction[ValueParameterDescriptorImpl]

'origin' @ [227:62] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareSimpleFunction[ValueParameterDescriptorImpl]

'it' @ [227:70] ==> value-parameter it: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareSimpleFunction.<anonymous>[ValueParameterDescriptorImpl]

'simpleFunctionSymbolTable' @ [231:13] ==> private final val simpleFunctionSymbolTable: SymbolTable.FlatSymbolTable<FunctionDescriptor, IrSimpleFunction, IrSimpleFunctionSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'referenced' @ [231:39] ==> public final inline fun referenced(d: FunctionDescriptor, createSymbol: () -> IrSimpleFunctionSymbol): IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [231:50] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceSimpleFunction[ValueParameterDescriptorImpl]

'IrSimpleFunctionSymbolImpl' @ [231:64] ==> public constructor IrSimpleFunctionSymbolImpl(descriptor: FunctionDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrSimpleFunctionSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [231:91] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceSimpleFunction[ValueParameterDescriptorImpl]

'simpleFunctionSymbolTable' @ [234:13] ==> private final val simpleFunctionSymbolTable: SymbolTable.FlatSymbolTable<FunctionDescriptor, IrSimpleFunction, IrSimpleFunctionSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'referenced' @ [234:39] ==> public final inline fun referenced(d: FunctionDescriptor, createSymbol: () -> IrSimpleFunctionSymbol): IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [234:50] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceDeclaredFunction[ValueParameterDescriptorImpl]

'AssertionError' @ [234:70] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [234:113] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceDeclaredFunction[ValueParameterDescriptorImpl]

'simpleFunctionSymbolTable' @ [236:69] ==> private final val simpleFunctionSymbolTable: SymbolTable.FlatSymbolTable<FunctionDescriptor, IrSimpleFunction, IrSimpleFunctionSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'unboundSymbols' @ [236:95] ==> public final val unboundSymbols: LinkedHashSet<IrSimpleFunctionSymbol> /* = LinkedHashSet<IrSimpleFunctionSymbol> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[PropertyDescriptorImpl]

'typeParameterSymbolTable' @ [239:13] ==> private final val typeParameterSymbolTable: SymbolTable.ScopedSymbolTable<TypeParameterDescriptor, IrTypeParameter, IrTypeParameterSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'declareLocal' @ [239:38] ==> public final inline fun declareLocal(d: TypeParameterDescriptor, createSymbol: () -> IrTypeParameterSymbol, createOwner: (IrTypeParameterSymbol) -> IrTypeParameter): IrTypeParameter defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [240:21] ==> value-parameter descriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareTypeParameter[ValueParameterDescriptorImpl]

'IrTypeParameterSymbolImpl' @ [241:23] ==> public constructor IrTypeParameterSymbolImpl(descriptor: TypeParameterDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrTypeParameterSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [241:49] ==> value-parameter descriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareTypeParameter[ValueParameterDescriptorImpl]

'IrTypeParameterImpl' @ [242:23] ==> public constructor IrTypeParameterImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrTypeParameterSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrTypeParameterImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [242:43] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareTypeParameter[ValueParameterDescriptorImpl]

'endOffset' @ [242:56] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareTypeParameter[ValueParameterDescriptorImpl]

'origin' @ [242:67] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareTypeParameter[ValueParameterDescriptorImpl]

'it' @ [242:75] ==> value-parameter it: IrTypeParameterSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareTypeParameter.<anonymous>[ValueParameterDescriptorImpl]

'typeParameterSymbolTable' @ [246:13] ==> private final val typeParameterSymbolTable: SymbolTable.ScopedSymbolTable<TypeParameterDescriptor, IrTypeParameter, IrTypeParameterSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'referenced' @ [246:38] ==> public final inline fun referenced(d: TypeParameterDescriptor, createSymbol: () -> IrTypeParameterSymbol): IrTypeParameterSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [246:49] ==> value-parameter descriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceTypeParameter[ValueParameterDescriptorImpl]

'AssertionError' @ [246:69] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [246:123] ==> value-parameter descriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceTypeParameter[ValueParameterDescriptorImpl]

'typeParameterSymbolTable' @ [248:67] ==> private final val typeParameterSymbolTable: SymbolTable.ScopedSymbolTable<TypeParameterDescriptor, IrTypeParameter, IrTypeParameterSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'unboundSymbols' @ [248:92] ==> public final val unboundSymbols: LinkedHashSet<IrTypeParameterSymbol> /* = LinkedHashSet<IrTypeParameterSymbol> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[PropertyDescriptorImpl]

'valueParameterSymbolTable' @ [251:13] ==> private final val valueParameterSymbolTable: SymbolTable.ScopedSymbolTable<ParameterDescriptor, IrValueParameter, IrValueParameterSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'declareLocal' @ [251:39] ==> public final inline fun declareLocal(d: ParameterDescriptor, createSymbol: () -> IrValueParameterSymbol, createOwner: (IrValueParameterSymbol) -> IrValueParameter): IrValueParameter defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [252:21] ==> value-parameter descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareValueParameter[ValueParameterDescriptorImpl]

'IrValueParameterSymbolImpl' @ [253:23] ==> public constructor IrValueParameterSymbolImpl(descriptor: ParameterDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrValueParameterSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [253:50] ==> value-parameter descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareValueParameter[ValueParameterDescriptorImpl]

'IrValueParameterImpl' @ [254:23] ==> public constructor IrValueParameterImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrValueParameterSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [254:44] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareValueParameter[ValueParameterDescriptorImpl]

'endOffset' @ [254:57] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareValueParameter[ValueParameterDescriptorImpl]

'origin' @ [254:68] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareValueParameter[ValueParameterDescriptorImpl]

'it' @ [254:76] ==> value-parameter it: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareValueParameter.<anonymous>[ValueParameterDescriptorImpl]

'valueParameterSymbolTable' @ [258:9] ==> private final val valueParameterSymbolTable: SymbolTable.ScopedSymbolTable<ParameterDescriptor, IrValueParameter, IrValueParameterSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'introduceLocal' @ [258:35] ==> public final fun introduceLocal(descriptor: ParameterDescriptor, symbol: IrValueParameterSymbol): Unit defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[SimpleFunctionDescriptorImpl]

'irValueParameter' @ [258:50] ==> value-parameter irValueParameter: IrValueParameter defined in org.jetbrains.kotlin.ir.util.SymbolTable.introduceValueParameter[ValueParameterDescriptorImpl]

'descriptor' @ [258:67] ==> public abstract val descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[PropertyDescriptorImpl]

'irValueParameter' @ [258:79] ==> value-parameter irValueParameter: IrValueParameter defined in org.jetbrains.kotlin.ir.util.SymbolTable.introduceValueParameter[ValueParameterDescriptorImpl]

'symbol' @ [258:96] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[PropertyDescriptorImpl]

'valueParameterSymbolTable' @ [262:13] ==> private final val valueParameterSymbolTable: SymbolTable.ScopedSymbolTable<ParameterDescriptor, IrValueParameter, IrValueParameterSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'referenced' @ [262:39] ==> public final inline fun referenced(d: ParameterDescriptor, createSymbol: () -> IrValueParameterSymbol): IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [262:50] ==> value-parameter descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceValueParameter[ValueParameterDescriptorImpl]

'AssertionError' @ [263:23] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [263:72] ==> value-parameter descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceValueParameter[ValueParameterDescriptorImpl]

'valueParameterSymbolTable' @ [263:86] ==> private final val valueParameterSymbolTable: SymbolTable.ScopedSymbolTable<ParameterDescriptor, IrValueParameter, IrValueParameterSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'dump' @ [263:112] ==> public final fun dump(): String defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[SimpleFunctionDescriptorImpl]

'valueParameterSymbolTable' @ [266:69] ==> private final val valueParameterSymbolTable: SymbolTable.ScopedSymbolTable<ParameterDescriptor, IrValueParameter, IrValueParameterSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'unboundSymbols' @ [266:95] ==> public final val unboundSymbols: LinkedHashSet<IrValueParameterSymbol> /* = LinkedHashSet<IrValueParameterSymbol> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[PropertyDescriptorImpl]

'variableSymbolTable' @ [269:13] ==> private final val variableSymbolTable: SymbolTable.ScopedSymbolTable<VariableDescriptor, IrVariable, IrVariableSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'declareLocal' @ [269:33] ==> public final inline fun declareLocal(d: VariableDescriptor, createSymbol: () -> IrVariableSymbol, createOwner: (IrVariableSymbol) -> IrVariable): IrVariable defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [270:21] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareVariable[ValueParameterDescriptorImpl]

'IrVariableSymbolImpl' @ [271:23] ==> public constructor IrVariableSymbolImpl(descriptor: VariableDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrVariableSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [271:44] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareVariable[ValueParameterDescriptorImpl]

'IrVariableImpl' @ [272:23] ==> public constructor IrVariableImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrVariableSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [272:38] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareVariable[ValueParameterDescriptorImpl]

'endOffset' @ [272:51] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareVariable[ValueParameterDescriptorImpl]

'origin' @ [272:62] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareVariable[ValueParameterDescriptorImpl]

'it' @ [272:70] ==> value-parameter it: IrVariableSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareVariable.<anonymous>[ValueParameterDescriptorImpl]

'declareVariable' @ [280:13] ==> public final fun declareVariable(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: VariableDescriptor): IrVariable defined in org.jetbrains.kotlin.ir.util.SymbolTable[SimpleFunctionDescriptorImpl]

'startOffset' @ [280:29] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareVariable[ValueParameterDescriptorImpl]

'endOffset' @ [280:42] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareVariable[ValueParameterDescriptorImpl]

'origin' @ [280:53] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareVariable[ValueParameterDescriptorImpl]

'descriptor' @ [280:61] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareVariable[ValueParameterDescriptorImpl]

'apply' @ [280:73] ==> @InlineOnly public inline fun <T> IrVariable.apply(block: IrVariable.() -> Unit): IrVariable defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVariable

'initializer' @ [281:17] ==> public abstract var initializer: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.IrVariable[PropertyDescriptorImpl]

'irInitializerExpression' @ [281:31] ==> value-parameter irInitializerExpression: IrExpression? defined in org.jetbrains.kotlin.ir.util.SymbolTable.declareVariable[ValueParameterDescriptorImpl]

'variableSymbolTable' @ [285:13] ==> private final val variableSymbolTable: SymbolTable.ScopedSymbolTable<VariableDescriptor, IrVariable, IrVariableSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'referenced' @ [285:33] ==> public final inline fun referenced(d: VariableDescriptor, createSymbol: () -> IrVariableSymbol): IrVariableSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [285:44] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceVariable[ValueParameterDescriptorImpl]

'AssertionError' @ [285:64] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [285:112] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceVariable[ValueParameterDescriptorImpl]

'variableSymbolTable' @ [287:57] ==> private final val variableSymbolTable: SymbolTable.ScopedSymbolTable<VariableDescriptor, IrVariable, IrVariableSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'unboundSymbols' @ [287:77] ==> public final val unboundSymbols: LinkedHashSet<IrVariableSymbol> /* = LinkedHashSet<IrVariableSymbol> */ defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[PropertyDescriptorImpl]

'scopedSymbolTables' @ [290:9] ==> private final val scopedSymbolTables: List<SymbolTable.ScopedSymbolTable<out DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<*, *>>>>>>, out IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<*>>>>>>>> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'forEach' @ [290:28] ==> @HidesMembers public inline fun <T> Iterable<SymbolTable.ScopedSymbolTable<out DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<*, *>>>>>>, out IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<*>>>>>>>>.forEach(action: (SymbolTable.ScopedSymbolTable<out DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<*, *>>>>>>, out IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<*>>>>>>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopedSymbolTable<out DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<*, *>>>>>>, out IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<*>>>>>>>

'it' @ [290:38] ==> value-parameter it: SymbolTable.ScopedSymbolTable<out DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<*, *>>>>>>, out IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<*>>>>>>> defined in org.jetbrains.kotlin.ir.util.SymbolTable.enterScope.<anonymous>[ValueParameterDescriptorImpl]

'enterScope' @ [290:41] ==> public final fun enterScope(owner: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[SimpleFunctionDescriptorImpl]

'owner' @ [290:52] ==> value-parameter owner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.enterScope[ValueParameterDescriptorImpl]

'scopedSymbolTables' @ [294:9] ==> private final val scopedSymbolTables: List<SymbolTable.ScopedSymbolTable<out DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<*, *>>>>>>, out IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<*>>>>>>>> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'forEach' @ [294:28] ==> @HidesMembers public inline fun <T> Iterable<SymbolTable.ScopedSymbolTable<out DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<*, *>>>>>>, out IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<*>>>>>>>>.forEach(action: (SymbolTable.ScopedSymbolTable<out DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<*, *>>>>>>, out IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<*>>>>>>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopedSymbolTable<out DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<*, *>>>>>>, out IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<*>>>>>>>

'it' @ [294:38] ==> value-parameter it: SymbolTable.ScopedSymbolTable<out DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<*, *>>>>>>, out IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<IrBindableSymbol<DeclarationDescriptorNonRoot, out IrSymbolDeclaration<*>>>>>>> defined in org.jetbrains.kotlin.ir.util.SymbolTable.leaveScope.<anonymous>[ValueParameterDescriptorImpl]

'leaveScope' @ [294:41] ==> public final fun leaveScope(owner: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[SimpleFunctionDescriptorImpl]

'owner' @ [294:52] ==> value-parameter owner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.leaveScope[ValueParameterDescriptorImpl]

'when (callable) {
                is ClassConstructorDescriptor ->
                    constructorSymbolTable.referenced(callable) { IrConstructorSymbolImpl(callable) }
                is FunctionDescriptor ->
                    simpleFunctionSymbolTable.referenced(callable) { IrSimpleFunctionSymbolImpl(callable) }
                else ->
                    throw IllegalArgumentException("Unexpected callable descriptor: $callable")
            }' @ [298:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrFunctionSymbol, entry1: IrFunctionSymbol, entry2: IrFunctionSymbol): IrFunctionSymbol[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrFunctionSymbol

'callable' @ [298:19] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceFunction[ValueParameterDescriptorImpl]

'constructorSymbolTable' @ [300:21] ==> private final val constructorSymbolTable: SymbolTable.FlatSymbolTable<ClassConstructorDescriptor, IrConstructor, IrConstructorSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'referenced' @ [300:44] ==> public final inline fun referenced(d: ClassConstructorDescriptor, createSymbol: () -> IrConstructorSymbol): IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[SimpleFunctionDescriptorImpl]

'callable' @ [300:55] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceFunction[ValueParameterDescriptorImpl]

'IrConstructorSymbolImpl' @ [300:67] ==> public constructor IrConstructorSymbolImpl(descriptor: ClassConstructorDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrConstructorSymbolImpl[ClassConstructorDescriptorImpl]

'callable' @ [300:91] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceFunction[ValueParameterDescriptorImpl]

'simpleFunctionSymbolTable' @ [302:21] ==> private final val simpleFunctionSymbolTable: SymbolTable.FlatSymbolTable<FunctionDescriptor, IrSimpleFunction, IrSimpleFunctionSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'referenced' @ [302:47] ==> public final inline fun referenced(d: FunctionDescriptor, createSymbol: () -> IrSimpleFunctionSymbol): IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[SimpleFunctionDescriptorImpl]

'callable' @ [302:58] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceFunction[ValueParameterDescriptorImpl]

'IrSimpleFunctionSymbolImpl' @ [302:70] ==> public constructor IrSimpleFunctionSymbolImpl(descriptor: FunctionDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrSimpleFunctionSymbolImpl[ClassConstructorDescriptorImpl]

'callable' @ [302:97] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceFunction[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [304:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'callable' @ [304:86] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceFunction[ValueParameterDescriptorImpl]

'when (value) {
                is ParameterDescriptor ->
                    valueParameterSymbolTable.referenced(value) { throw AssertionError("Undefined parameter referenced: $value") }
                is VariableDescriptor ->
                    variableSymbolTable.referenced(value) { throw AssertionError("Undefined variable referenced: $value") }
                else ->
                    throw IllegalArgumentException("Unexpected value descriptor: $value")
            }' @ [308:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrValueSymbol, entry1: IrValueSymbol, entry2: IrValueSymbol): IrValueSymbol[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrValueSymbol

'value' @ [308:19] ==> value-parameter value: ValueDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceValue[ValueParameterDescriptorImpl]

'valueParameterSymbolTable' @ [310:21] ==> private final val valueParameterSymbolTable: SymbolTable.ScopedSymbolTable<ParameterDescriptor, IrValueParameter, IrValueParameterSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'referenced' @ [310:47] ==> public final inline fun referenced(d: ParameterDescriptor, createSymbol: () -> IrValueParameterSymbol): IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[SimpleFunctionDescriptorImpl]

'value' @ [310:58] ==> value-parameter value: ValueDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceValue[ValueParameterDescriptorImpl]

'AssertionError' @ [310:73] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'value' @ [310:122] ==> value-parameter value: ValueDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceValue[ValueParameterDescriptorImpl]

'variableSymbolTable' @ [312:21] ==> private final val variableSymbolTable: SymbolTable.ScopedSymbolTable<VariableDescriptor, IrVariable, IrVariableSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'referenced' @ [312:41] ==> public final inline fun referenced(d: VariableDescriptor, createSymbol: () -> IrVariableSymbol): IrVariableSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[SimpleFunctionDescriptorImpl]

'value' @ [312:52] ==> value-parameter value: ValueDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceValue[ValueParameterDescriptorImpl]

'AssertionError' @ [312:67] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'value' @ [312:115] ==> value-parameter value: ValueDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceValue[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [314:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'value' @ [314:83] ==> value-parameter value: ValueDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceValue[ValueParameterDescriptorImpl]

'when (classifier) {
                is TypeParameterDescriptor ->
                    typeParameterSymbolTable.referenced(classifier) { throw AssertionError("Undefined type parameter referenced: $classifier") }
                is ClassDescriptor ->
                    classSymbolTable.referenced(classifier) { IrClassSymbolImpl(classifier) }
                else ->
                    throw IllegalArgumentException("Unexpected classifier descriptor: $classifier")
            }' @ [318:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrClassifierSymbol, entry1: IrClassifierSymbol, entry2: IrClassifierSymbol): IrClassifierSymbol[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrClassifierSymbol

'classifier' @ [318:19] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceClassifier[ValueParameterDescriptorImpl]

'typeParameterSymbolTable' @ [320:21] ==> private final val typeParameterSymbolTable: SymbolTable.ScopedSymbolTable<TypeParameterDescriptor, IrTypeParameter, IrTypeParameterSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'referenced' @ [320:46] ==> public final inline fun referenced(d: TypeParameterDescriptor, createSymbol: () -> IrTypeParameterSymbol): IrTypeParameterSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.ScopedSymbolTable[SimpleFunctionDescriptorImpl]

'classifier' @ [320:57] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceClassifier[ValueParameterDescriptorImpl]

'AssertionError' @ [320:77] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'classifier' @ [320:131] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceClassifier[ValueParameterDescriptorImpl]

'classSymbolTable' @ [322:21] ==> private final val classSymbolTable: SymbolTable.FlatSymbolTable<ClassDescriptor, IrClass, IrClassSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'referenced' @ [322:38] ==> public final inline fun referenced(d: ClassDescriptor, createSymbol: () -> IrClassSymbol): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable.FlatSymbolTable[SimpleFunctionDescriptorImpl]

'classifier' @ [322:49] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceClassifier[ValueParameterDescriptorImpl]

'IrClassSymbolImpl' @ [322:63] ==> public constructor IrClassSymbolImpl(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrClassSymbolImpl[ClassConstructorDescriptorImpl]

'classifier' @ [322:81] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceClassifier[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [324:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'classifier' @ [324:88] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.ir.util.SymbolTable.referenceClassifier[ValueParameterDescriptorImpl]

'enterScope' @ [329:5] ==> public final fun enterScope(owner: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.ir.util.SymbolTable[SimpleFunctionDescriptorImpl]

'owner' @ [329:16] ==> value-parameter owner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.withScope[ValueParameterDescriptorImpl]

'invoke' @ [330:18] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'leaveScope' @ [331:5] ==> public final fun leaveScope(owner: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.ir.util.SymbolTable[SimpleFunctionDescriptorImpl]

'owner' @ [331:16] ==> value-parameter owner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.withScope[ValueParameterDescriptorImpl]

'result' @ [332:12] ==> val result: T defined in org.jetbrains.kotlin.ir.util.withScope[LocalVariableDescriptor]

