CREATE TABLE IF NOT EXISTS public.tickets(
                                           id bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
                                           user_id int REFERENCES public.users (id),
                                           reservation_code varchar NOT NULL,
                                           is_active bool DEFAULT false,
                                           is_closed bool DEFAULT false,
                                           issued_at timestamp
)