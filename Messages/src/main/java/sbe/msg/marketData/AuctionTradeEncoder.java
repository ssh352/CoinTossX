/* Generated SBE (Simple Binary Encoding) message codec */
package sbe.msg.marketData;

import uk.co.real_logic.agrona.MutableDirectBuffer;
import uk.co.real_logic.sbe.codec.java.CodecUtil;

@SuppressWarnings("all")
public class AuctionTradeEncoder
{
    public static final int BLOCK_LENGTH = 29;
    public static final int TEMPLATE_ID = 25;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;

    private final AuctionTradeEncoder parentMessage = this;
    private MutableDirectBuffer buffer;
    protected int offset;
    protected int limit;
    protected int actingBlockLength;
    protected int actingVersion;

    public int sbeBlockLength()
    {
        return BLOCK_LENGTH;
    }

    public int sbeTemplateId()
    {
        return TEMPLATE_ID;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public String sbeSemanticType()
    {
        return "";
    }

    public int offset()
    {
        return offset;
    }

    public AuctionTradeEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        this.buffer = buffer;
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);
        return this;
    }

    public int encodedLength()
    {
        return limit - offset;
    }

    public int limit()
    {
        return limit;
    }

    public void limit(final int limit)
    {
        buffer.checkLimit(limit);
        this.limit = limit;
    }
    public AuctionTradeEncoder messageType(final MessageTypeEnum value)
    {
        CodecUtil.charPut(buffer, offset + 0, value.value());
        return this;
    }

    public static long nanosecondNullValue()
    {
        return 4294967294L;
    }

    public static long nanosecondMinValue()
    {
        return 0L;
    }

    public static long nanosecondMaxValue()
    {
        return 4294967293L;
    }
    public AuctionTradeEncoder nanosecond(final long value)
    {
        CodecUtil.uint32Put(buffer, offset + 1, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static long executedQuantityNullValue()
    {
        return 4294967294L;
    }

    public static long executedQuantityMinValue()
    {
        return 0L;
    }

    public static long executedQuantityMaxValue()
    {
        return 4294967293L;
    }
    public AuctionTradeEncoder executedQuantity(final long value)
    {
        CodecUtil.uint32Put(buffer, offset + 5, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static long instrumentIdNullValue()
    {
        return 4294967294L;
    }

    public static long instrumentIdMinValue()
    {
        return 0L;
    }

    public static long instrumentIdMaxValue()
    {
        return 4294967293L;
    }
    public AuctionTradeEncoder instrumentId(final long value)
    {
        CodecUtil.uint32Put(buffer, offset + 9, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    private final PriceEncoder price = new PriceEncoder();

    public PriceEncoder price()
    {
        price.wrap(buffer, offset + 13);
        return price;
    }

    public static long tradeIdNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long tradeIdMinValue()
    {
        return 0x0L;
    }

    public static long tradeIdMaxValue()
    {
        return 0xfffffffffffffffeL;
    }
    public AuctionTradeEncoder tradeId(final long value)
    {
        CodecUtil.uint64Put(buffer, offset + 21, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
